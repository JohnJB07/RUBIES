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
    private double totalOwed = 0;
    private double GMI = 0;
    
    public Customer(String role, String username, String password) {
        super(role, username, password);
    }
    
    public void buyProperty(Lot lot) {
        if (lot.getTotalValue() > accountBalance) {
            System.out.println("[CHECK]: Could not buy property, Insufficient Balance");
        } else {
            accountBalance -= lot.getTotalValue();
        }
    }
    
    public void payTotalOwed() {
        if (totalOwed > accountBalance) {
            System.out.println("[CHECK]: Insufficient Balance");
        } else {
            System.out.println("[CHECK]: Subtracting Balance");
            accountBalance -= totalOwed;
        }
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
