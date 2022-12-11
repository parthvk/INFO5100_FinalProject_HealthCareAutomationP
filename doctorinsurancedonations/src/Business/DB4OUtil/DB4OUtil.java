package Business.DB4OUtil;

import Business.SystemConfiguration;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Networks.Networks;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;

/**
 *
 * @author Pratik
 */
public class DB4OUtil {

    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();// path to the data store
    private static DB4OUtil dB4OUtil;
    
    public synchronized static DB4OUtil getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer connection) {
        if (connection != null) {
            connection.close();
        }
    }

    private ObjectContainer createConnection() {
        try {
            System.out.println("Hello createConnection");
            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
             ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            config.common().add(new TransparentPersistenceSupport());
            //No of objects in the memory is controlled
            config.common().activationDepth(Integer.MAX_VALUE);
            //depth level of updation of objects is controlled
            config.common().updateDepth(Integer.MAX_VALUE);

            //top most class is registered here
            config.common().objectClass(EcoSystem.class).cascadeOnUpdate(true); // Change to the object you want to save

           
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(EcoSystem ecosystem) {

        ObjectContainer connection = createConnection();            
        connection.store(ecosystem);
        connection.commit();
        System.out.println("EcoSystem="+connection.query(EcoSystem.class));
        connection.close();
        
    }
    
    public EcoSystem retrieveSystem(){

        ObjectContainer connection = createConnection();
        ObjectSet<EcoSystem> ecosystems = connection.query(EcoSystem.class); // Change to the object you want to save
        EcoSystem ecosystem;

        if (ecosystems.isEmpty()){
            ecosystem = SystemConfiguration.configure();  // New record is created if no record is present
        }
        else{
            ecosystem = ecosystems.get(ecosystems.size() - 1);
        }
        connection.close();
        return ecosystem;
    }
}
