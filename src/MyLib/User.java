/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author Jayvee
 */
public class User {
    private Customer[] customer = new Customer[1000];
    private Agent[] agent = new Agent[1000];
    private Admin admin = new Admin();
    private static int customerCnt = 0; // length and indexing GMI
    private static int agentCnt = 0;
    private int loggedIn;

    public void register(int role, String username, String password) {
        switch (role) {
            case 1:
            {
                System.out.println("[SUCCESS]: Created new user " + agentCnt + " : " + username + " - " + password);
                agent[agentCnt] = new Agent("Agent", username, password);
                agentCnt++;
                break;
            }
            case 2:
            {
                System.out.println("[SUCCESS]: Created new user " + customerCnt + " : " + username + " - " + password);
                customer[customerCnt] = new Customer("Customer", username, password);
                customerCnt++;
                break;
            }
        }
    }
    
    public void login() {
        
    }
    
    public void logout() {
        
    }
}
