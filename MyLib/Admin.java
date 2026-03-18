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
    private String propertyStatus;
    public Admin() {
        super("Admin", "admin2026", "admin@2026");
    }

    // Setter
    public void setStatus(String status) {
        this.propertyStatus = status;
    }

    // Getters
    public double getPrice() {
        return propertyPrice;
    }

    public String getStatus() {
        return propertyStatus;
    }
}
