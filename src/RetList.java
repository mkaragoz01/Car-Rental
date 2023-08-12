/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MUHAMMET MUSTAFA
 */
public class RetList {
    private int ReturnId;
    private String CarReg;
    private String CustName;
    private String ReturnDate;
    private int Delay;
    private int Fine;
    
    public RetList(int ReturnId, String CarReg, String CustName, String ReturnDate, int Delay, int Fine){
        this.ReturnId = ReturnId;
        this.CarReg = CarReg;
        this.CustName = CustName;
        this.ReturnDate = ReturnDate;
        this.Delay = Delay;
        this.Fine = Fine;
    }
   
    public int getReturnId() {
        return ReturnId;
    }

    public void setReturnId(int ReturnId) {
        this.ReturnId = ReturnId;
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
    
    public String getReturnDate(){
        return ReturnDate;
    }
    
    public void setReturnDate(String ReturnDate){
        this.ReturnDate = ReturnDate;
    }
    
    public int getDelay() {
        return Delay;
    }

    public void setDelay(int Delay) {
        this.Delay = Delay;
    }
    
    public int getFine(){
        return Fine;
    }
    
    public void setFine(int Fine){
        this.Fine = Fine;
    }
}
