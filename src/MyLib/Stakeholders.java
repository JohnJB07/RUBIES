/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author Jayvee
 */
public class Stakeholders {
    protected String role;
    protected String username;
    protected String password;
    
    public Stakeholders(String role, String username, String password) {
        this.role = role;
        this.username = username;
        this.password = password;
    }
    
    public String getRole() {
        return role;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
