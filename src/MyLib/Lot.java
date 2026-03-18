/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author Jayvee
 */
public class Lot {
    private House house;
    private int lotNumber;
    private double squareMeters;
    private boolean isInner;
    private double totalValue;
    private static int userLoginIndex = -1;
    private String status;
    
    public Lot(House house1, int lotNumber1, double squareMeters1, boolean inner, double totalValue1, String status) {
        this.house = house1;
        this.lotNumber = lotNumber1;
        this.squareMeters = squareMeters1;
        this.isInner = inner;
        this.totalValue = totalValue1;
        this.status = status;
    }
    
    public String returnLotNumbers() {
        return "Lot " + lotNumber;
    }

    // GETTERS
    public House getHouse() {
        return house;
    }

    public int getLotNumber() {
        return lotNumber;
    }

    public double getSquareMeters() {
        return squareMeters;
    }

    public boolean isIsInner() {
        return isInner;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static int getUserLoginIndex() {
        return userLoginIndex;
    }

    public static void setUserLoginIndex(int userLoginIndex) {
        Lot.userLoginIndex = userLoginIndex;
    }
}
