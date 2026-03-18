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
    
    public RealEstate() {
        this.populateLots();
    }
    
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

            int lotNumber = ((i - 1) % lotsPerBlock) + 1;
            double squareMeters = 40 + (rand.nextDouble() * 60); // 40–100 sqm

            int positionInBlock = ((i - 1) % lotsPerBlock) + 1;
            boolean isInner = !(positionInBlock % 5 == 1 || positionInBlock % 5 == 0);

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

            double totalValue = calculateTotalPrice(basePrice * multiplier, squareMeters);

            String status = "Available";

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

    public double calculateTotalPrice(double a, double squareMeters) {
        double landValue     = squareMeters * 12_500;
        double construction  = 1_096_500;                          
        double developerCost = (landValue + construction) * 0.09;  
        double baseTCP       = landValue + construction + developerCost;

        double multiplier = a / 1_096_500;
        double tcp = baseTCP * multiplier;

        double MAX_PRICE = 5_500_500;
        return Math.min(tcp, MAX_PRICE);
    }

    @Override
    public void filter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Lot[] getLot() {
        return lot;
    }
}
