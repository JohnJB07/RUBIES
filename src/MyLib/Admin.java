/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author Jayvee
 */
public class Admin extends Stakeholders {
    public Admin() {
        String role = "Admin";
        String username = "admin2026";
        String password = "admin@2026";
        super(role, username, password);
    }
    
    public void manageAgent() {
        
    }
    
    public void manageProp() {
        
    }
    
    public void setStatus() {
        
    }
    
    public double setPrice() {
        return 1000;
    }
    
    public double setReserveFee() {
        return 1000;
    }
    
    public double setDownpay() {
        return 1000;
    }
}
