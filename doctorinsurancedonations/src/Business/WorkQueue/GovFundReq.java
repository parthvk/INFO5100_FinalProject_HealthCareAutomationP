
package Business.WorkQueue;

/**
 *
 * @author Parth
 */
public class GovFundReq extends WorkReq {

    private String loc; // Location
    private int population; 
    private double amountRequested; //Amount Requested

    public GovFundReq(String location, int pop, double requestAmount) {
        this.loc = location;
        this.population = pop;
        this.amountRequested = requestAmount;

    }
    //Getters and Setters
    @Override
    public String toString() {
        return loc;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String location) {
        this.loc = location;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int pop) {
        this.population = pop;
    }

    public double getAmountRequested() {
        return amountRequested;
    }

    public void setAmountRequested(double reqAmt) {
        this.amountRequested = reqAmt;
    }

}
