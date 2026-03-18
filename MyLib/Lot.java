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
    private double totalValue; // Price of lot
    private static int userLoginIndex = -1;
    private double reservationFee = 10_000;
    private double downpaymentFee = 20000;
    private String status;
    
    public Lot(House house1, int lotNumber1, double squareMeters1, boolean inner, double totalValue1, String status) {
        this.house = house1;
        this.lotNumber = lotNumber1;
        this.squareMeters = squareMeters1;
        this.isInner = inner;
        this.totalValue = totalValue1;
        this.status = status;
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

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
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
    
    public double getReservationFee() {
        return reservationFee; 
    }
    
    public double getDownpaymentFee() {
        return downpaymentFee; 
    }

    public static void setUserLoginIndex(int userLoginIndex) {
        Lot.userLoginIndex = userLoginIndex;
    }
    
    public void setReservationFee(double reservationFee) {
        this.reservationFee = reservationFee; 
    }
    
    public void setDownpaymentFee(double downpaymentFee) {
        this.downpaymentFee = downpaymentFee; 
    }
    
    @Override
    public String toString() {
        return "Lot " + lotNumber +
               " | Price: ₱" + totalValue +
               " | Reservation: ₱" + reservationFee +
               " | Downpayment: ₱" + downpaymentFee +
               " | Status: " + status;
    }
}
