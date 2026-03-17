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
    private static int loginType;
    private static int loginIndx;
    private static int lotIdx;

    public void register(int role, String username, String password) {
        switch (role) {
            case 1:
            {
                System.out.println("[SUCCESS]: Created new AGENT " + (agentCnt + 1) + " : " + username + " - " + password);
                agent[agentCnt] = new Agent("Agent", username, password);
                agentCnt++;
                break;
            }
            case 2:
            {
                System.out.println("[SUCCESS]: Created new CUSTOMER " + (customerCnt + 1) + " : " + username + " - " + password);
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

    public Customer[] getCustomer() {
        return customer;
    }

    public Agent[] getAgent() {
        return agent;
    }

    public static int getCustomerCnt() {
        return customerCnt;
    }

    public static int getAgentCnt() {
        return agentCnt;
    }

    public static int getLoginType() {
        return loginType;
    }

    public static void setLoginType(int loginType) {
        User.loginType = loginType;
    }

    public static int getLoginIndx() {
        return loginIndx;
    }

    public static void setLoginIndx(int loginIndx) {
        User.loginIndx = loginIndx;
    }

    public static int getLotIdx() {
        return lotIdx;
    }

    public static void setLotIdx(int lotIdx) {
        User.lotIdx = lotIdx;
    }
    
    
}
