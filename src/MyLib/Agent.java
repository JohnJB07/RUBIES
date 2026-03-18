/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author Jayvee
 */
public class Agent extends Stakeholders {
    private String licenseNo;
    private String status;

    public Agent(String role, String username, String password) {
        super(role, username, password);
        this.licenseNo = generateLicenseNo();
        this.status = "Available";
    }

    private String generateLicenseNo() {
        return "LIC-" + Math.round(Math.random() * 10000);
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public String getStatus() {
        return status;
    }
}