public class RentList {
    private int RentId;
    private String CarReg;
    private String CustName;
    private String RentDate;
    private String ReturnDate;
    private int Fees;
    
    public RentList(int RentId, String CarReg,String CustName, String RentDate, String ReturnDate,
            int Fees){
        this.RentId = RentId;
        this.CarReg = CarReg;
        this.CustName = CustName;
        this.RentDate = RentDate;
        this.ReturnDate = ReturnDate;
        this.Fees = Fees;
    }
    
    public int getRentId() {
        return RentId;
    }

    public void setRentId(int RentId) {
        this.RentId = RentId;
    }
    
    public String getCarReg(){
        return CarReg;
    }
    
    public void setCarReg(String CarReg){
        this.CarReg = CarReg;
    }
    
    public String getCustName() {
        return CustName;
    }

    public void setCustName(String CustName) {
        this.CustName = CustName;
    }
    
    public String getRentDate(){
        return RentDate;
    }
    
    public void setRentDate(String RentDate){
        this.RentDate = RentDate;
    }
    
    public String getReturnDate(){
        return ReturnDate;
    }
    
    public void setReturnDate(String ReturnDate){
        this.ReturnDate = ReturnDate;
    }
    
    public int getFees(){
        return Fees;
    }
    
    public void setFees(int Fees){
        this.Fees = Fees;
    }
} 

