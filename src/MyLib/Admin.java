/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;
import MyApp.ManageAgent;

/**
 *
 * @author Jayvee
 */
public class Admin extends Stakeholders {
    private double propertyPrice;
    private double reservationFee;
    private double downpaymentFee;
    private String propertyStatus;
    public Admin() {
        super("Admin", "admin2026", "admin@2026");
    }

    // Manage agents (placeholder for now)
    // TODO:
    public String[] manageAgent(String agentName) {
        System.out.println("[UPDATE]: Managing agents: " + agentName);
        // Could open a GUI window or update agent records
        
        String[] agentList = {"123", "1234"};
        return agentList;
    }

    // Manage property details
    public void manageProp(double price, double reserveFee, double downpay) {
        this.propertyPrice = price;
        this.reservationFee = reserveFee;
        this.downpaymentFee = downpay;
    }

    // Set property status
    public void setStatus(String status) {
        this.propertyStatus = status;
    }

    // Getters
    public double getPrice() {
        return propertyPrice;
    }

    public double getReserveFee() {
        return reservationFee;
    }

    public double getDownpay() {
        return downpaymentFee;
    }

    public String getStatus() {
        return propertyStatus;
    }
}
