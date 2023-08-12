/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MUHAMMET MUSTAFA
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbControl {

    private String userName = "root";
    private String password = "";
    private String dbUrl = "jdbc:mysql://localhost:3306/carsdb";
    
    public Connection getConnection()throws SQLException{
        return DriverManager.getConnection(dbUrl,userName,password);
    }
    
    public void showErrorMessage(SQLException exception){
        System.out.println("Error: "+ exception.getMessage());
        System.out.println("Error Code: "+ exception.getErrorCode());
    }
}
