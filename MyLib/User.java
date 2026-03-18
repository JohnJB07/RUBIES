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

    public int register(int userType, String username, String password, String confirmPass) {
        // No input from user
        if (username.equals("") || password.equals("") || confirmPass.equals("")) {
            return -1;
        }
        
        for (int i = 0; i < agentCnt; i++) {
            if (username.equals(agent[i].getUsername())) {
                return 1;
            }
        }
        
        // Check customers
        for (int i = 0; i < customerCnt; i++) {
            if (username.equals(customer[i].getUsername())) {
                return 1;
            }
        }
        
        if (password.equals(confirmPass)) {
            switch(userType) {
                case 1:
                    System.out.println("[SUCCESS]: Created new AGENT " + (agentCnt + 1) + " : " + username + " - " + password);
                    agent[agentCnt] = new Agent("Agent", username, password);
                    agentCnt++;
                    return 2; // Agent
                case 2:
                    System.out.println("[SUCCESS]: Created new CUSTOMER " + (customerCnt + 1) + " : " + username + " - " + password);
                    customer[customerCnt] = new Customer("Customer", username, password);
                    customerCnt++;
                    return 3; // Customer
                default:
                    System.out.println("[ERROR]: No role selected");
                    return -2;                  
            }
        } else {
            return -3;
        }
    }
    
    public int login(String username, String password) {
        if (username.equals("") || password.equals("")) {
            System.out.println("[CHECK]: Input field is incomplete");
            return 3;
        }
        if (agentCnt == 0) {
            System.out.println("[CHECK]: No agent accounts exists");
        } else {
            for (int i = 0; i < agentCnt; i++) {
                Agent currentAgent = agent[i];
                if (username.equals(currentAgent.getUsername())) {
                    if (password.equals(currentAgent.getPassword())) {
                        loginType = 1;
                        loginIndx = i;
                        return 0;
                    } else {
                        return 2;
                    }
                }
            }
        }
        if (customerCnt == 0) {
            System.out.println("[CHECK]: No customer accounts exist");
        } else {
            for (int i = 0; i < customerCnt; i++) {
                Customer currentCustomer = customer[i];
                if (username.equals(currentCustomer.getUsername())) {
                    if (password.equals(currentCustomer.getPassword())) {
                        loginType = 2;
                        loginIndx = i;
                        return 0;
                    } else {
                        return 2;
                    }
                }
            }
        }
        
        if (username.equals(admin.getUsername()) && password.equals(admin.getPassword())) {
            return 1;
        }
        
        return -1; // Account does not exist
    }
    
    // REMOVED LOGOUT METHOD

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
