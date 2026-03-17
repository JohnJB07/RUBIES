/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author Jayvee
 */
public class RealEstate implements ICalculate, ISearch {
    private double price;
    private double taxes;
    private Lot[] lot;
    
    // Report
    public Lot[] showAllLots() {
        Lot[] x = lot;
        for (int i = 0; i < lot.length; i++) {
            System.out.println("Lot");
        }
        
        return x;
    }
    
    public double reserveLot() {
        return 1;
    }
    
    public void showReport() {
        
    }

    // TODO: add features below
    @Override
    public double calculateGMI(String a, double b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double calculateAmortization(double a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double calculateTotalPrice(double a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void filter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
