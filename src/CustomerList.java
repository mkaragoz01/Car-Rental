/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MUHAMMET MUSTAFA
 */
public class CustomerList {
    private int CustId;
    private String CustName;
    private String CustAdd;
    private String CustPhone;
    
    public CustomerList(int CustId, String CustName,String CustAdd, String CustPhone){
        this.CustId = CustId;
        this.CustName = CustName;
        this.CustAdd = CustAdd;
        this.CustPhone = CustPhone;
    }
    
    public int getCustId() {
        return CustId;
    }

    public void setCustId(int CustId) {
        this.CustId = CustId;
    }
    
    public String getCustName(){
        return CustName;
    }
    
    public void setCustName(String CustName){
        this.CustName = CustName;
    }
    
    public String getCustAdd(){
        return CustAdd;
    }
    
    public void setCustAdd(String CustAdd){
        this.CustAdd = CustAdd;
    }
    
    public String getCustPhone(){
        return CustPhone;
    }
    
    public void setCustPhone(String CustPhone){
        this.CustPhone = CustPhone;
    }
    
}