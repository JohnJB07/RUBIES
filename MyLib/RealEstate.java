/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;
import java.util.Random;

/**
 *
 * @author Jayvee
 */
public class RealEstate implements ICalculate, ISearch {
    private double price;
    private double taxes;
    private Lot[] lot = new Lot[100];
    
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
    
    public Lot showReport(String buttonId) {
        return lot[Integer.parseInt(buttonId) - 1];
    }
    
    public void populateLots() {
        String[] houseTypes = {"Single", "Duplex", "Townhouse"};
        Random rand = new Random();
        int lotsPerBlock = 20;

        for (int i = 1; i <= 100; i++) {
            String type = houseTypes[rand.nextInt(houseTypes.length)];
            int blockNumber = ((i - 1) / lotsPerBlock) + 1;
            int years = rand.nextInt(30) + 1;
            boolean nearAmenities = rand.nextBoolean();

            House house = new House(type, blockNumber, years, nearAmenities);

            int lotNumber = i;
            double squareMeters = 40 + (rand.nextDouble() * 60);

            int positionInBlock = ((i - 1) % lotsPerBlock) + 1;
            boolean isInner = !(positionInBlock == 1 || positionInBlock == lotsPerBlock);

            double basePrice = 1_096_500;
            double multiplier = 1.0;

            if (!isInner) {
                multiplier *= (1.10 + (rand.nextDouble() * 0.05)); 
            }

            switch (type) {
                case "Single":    multiplier *= 1.20; break;
                case "Duplex":    multiplier *= 1.10; break;
                case "Townhouse": multiplier *= 1.05; break;
            }

            if (years <= 5) {
                multiplier *= 1.15;
            } else if (years <= 15) {
                multiplier *= 1.05;
            } else {
                multiplier *= 0.90;
            }

            if (nearAmenities) {
                multiplier *= 1.08;
            }

            double totalValue = basePrice * multiplier;

            double MAX_PRICE = 2_500_000;
            totalValue = Math.min(totalValue, MAX_PRICE);

            boolean status = rand.nextBoolean();

            Lot lots = new Lot(house, lotNumber, squareMeters, isInner, totalValue, status);
            lot[i - 1] = lots;
        }
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

    public Lot[] getLot() {
        return lot;
    }

    public void setLot(Lot[] lot) {
        this.lot = lot;
    }
}
