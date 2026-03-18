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
    private Lot[] lot = new Lot[100];
    
    public RealEstate() {
        this.populateLots();
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
    
    public boolean[] filter(boolean fInner, boolean fOuter,
            boolean fSingle, boolean fDuplex, boolean fTownhouse,
            boolean fAvail, boolean fReserved, boolean fSold,
            boolean f2m, boolean f2_5m, boolean f3m, boolean f3_5m, boolean f4m) {
        
        boolean[] isVisible = new boolean[100];
        for (int i = 0; i < lot.length; i++) {
            if (lot[i] == null) continue; // Skip if lot isn't initialized
            
            // 1. Position Filter
            boolean noPosFilter = !fInner && !fOuter;
            boolean matchesPos = noPosFilter || 
                                 (fInner && lot[i].isIsInner()) || 
                                 (fOuter && !lot[i].isIsInner());

            // 2. Type Filter
            boolean noTypeFilter = !fSingle && !fDuplex && !fTownhouse;
            String type = lot[i].getHouse().getType();
            boolean matchesType = noTypeFilter || 
                                  (fSingle && type.equalsIgnoreCase("Single")) ||
                                  (fDuplex && type.equalsIgnoreCase("Duplex")) ||
                                  (fTownhouse && type.equalsIgnoreCase("Townhouse"));

            // 3. Status Filter
            boolean noStatusFilter = !fAvail && !fReserved && !fSold;
            String status = lot[i].getStatus();
            boolean matchesStatus = noStatusFilter || 
                                    (fAvail && status.equalsIgnoreCase("Available")) ||
                                    (fReserved && status.equalsIgnoreCase("Reserved")) ||
                                    (fSold && status.equalsIgnoreCase("Sold"));

            // 4. Price Range Filter ( < )
            boolean noPriceFilter = !f2m && !f2_5m && !f3m && !f3_5m && !f4m;
            double price = lot[i].getTotalValue();
            boolean matchesPrice = noPriceFilter ||
                                   (f2m && price <= 2_000_000) ||
                                   (f2_5m && price <= 2_500_000) ||
                                   (f3m && price <= 3_000_000) ||
                                   (f3_5m && price <= 3_500_000) ||
                                   (f4m && price <= 4_000_000);

            // If ALL categories match, the lot is visible
            isVisible[i] = matchesPos && matchesType && matchesStatus && matchesPrice;
        }
        
        return isVisible;
    }

    public Lot[] getLot() {
        return lot;
    }
}
