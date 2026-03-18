/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author Jayvee
 */
public class Customer extends Stakeholders {
    private double accountBalance = 0;
    private double totalOwed;
    private double GMI = 0;
    
    public Customer(String role, String username, String password) {
        super(role, username, password);
    }
    
    public void buyProperty() {
        
    }
    
    public void payTotalOwed() {
        
    }
    
    public void addBalance(double amount) {
        accountBalance += amount;
    }
    
    public double getBalance() {
        return accountBalance;
    }

    public String balanceString() {
        return "Balance: " + accountBalance;
    }
    
    public double getGMI() {
        return GMI;
    }
    
    public String gmiString() {
        return "Gross Monthly Income: " + GMI;
    }

    public void setGMI(double GMI) {
        this.GMI = GMI;
    }
}
