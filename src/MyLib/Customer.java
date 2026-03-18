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
    
    public int buyProperty(Lot lot) {
        if (lot.getTotalValue() > accountBalance) {
            System.out.println("[CHECK]: Could not buy property, Insufficient Balance");
            return -1;
        } else {
            accountBalance -= lot.getTotalValue();
            System.out.println("[UPDATE]: Balance is now " + accountBalance);
            return 0;
        }
    }
    
    public void reserveLot() {
        totalOwed += 10000;
    }
    
    public void addTotalOwed(double amt) {
        totalOwed += amt;
    }
    
    public void changeTotalOwed(double amt) {
        totalOwed = amt;
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
    
    public double getGMI() {
        return GMI;
    }

    public void setGMI(double GMI) {
        this.GMI = GMI;
    }

    public double getTotalOwed() {
        return totalOwed;
    }
}
