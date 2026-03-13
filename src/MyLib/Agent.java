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
    
    public Agent(String role, String username, String password) {
        super(role, username, password);
    }
    
    public boolean setStatus() {
        return true;
    }
}
