/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MUHAMMET MUSTAFA
 */
public class CarsList {
    private String RegNum;
    private String Brand;
    private String Model;
    private String Status;
    private int Price;
    
    public CarsList(String RegNum, String Brand,String Model, String Status, int Price){
        this.RegNum = RegNum;
        this.Brand = Brand;
        this.Model = Model;
        this.Status = Status;
        this.Price = Price;
    }
    
    public String getRegNum() {
        return RegNum;
    }

    public void setRegNum(String RegNum) {
        this.RegNum = RegNum;
    }
    
    public String getBrand(){
        return Brand;
    }
    
    public void setBrand(String Brand){
        this.Brand = Brand;
    }
    
    public String getStatus(){
        return Status;
    }
    
    public void setStatus(String Status){
        this.Status = Status;
    }
    
    public int getPrice(){
        return Price;
    }
    
    public void setPrice(int Price){
        this.Price = Price;
    }
    
    public String getModel(){
        return Model;
    }
    
    public void setModel(String Model){
        this.Model = Model;
    }
    
}
