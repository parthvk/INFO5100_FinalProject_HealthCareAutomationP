
package Business.WorkQueue;

/**
 *
 * @author Parth
 */
public class NgoDonorReq extends WorkReq{
    private String nameOfDonor; //Name of Donor
    private String addressOfDonor; //Address of Donor
    private int donation; //Donation
    
    public NgoDonorReq(String nameOfDonor, String addressOfDonor, int donation){
        this.nameOfDonor = nameOfDonor;
        this.addressOfDonor = addressOfDonor;
        this.donation = donation;
    }
    //Getters and Setters
    @Override
    public String toString() {
        return nameOfDonor;
    }
    
    public String getNameOfDonor() {
        return nameOfDonor;
    }

    public void setNameOfDonor(String nameOfDonor) {
        this.nameOfDonor = nameOfDonor;
    }

    public String getAddressOfDonor() {
        return addressOfDonor;
    }

    public void setAddressOfDonor(String addressOfDonor) {
        this.addressOfDonor = addressOfDonor;
    }

    public int getDonation() {
        return donation;
    }

    public void setDonation(int donation) {
        this.donation = donation;
    }

}

