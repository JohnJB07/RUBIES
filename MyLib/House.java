/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author Jayvee
 */
public class House {
    private String type;
    private int blockNumber;
    private int years;
    private boolean nearAmenities;
    
    public House(String type1, int blockNumber1, int years1, boolean nearAmenities1) {
        this.type = type1;
        this.blockNumber = blockNumber1;
        this.years = years1;
        this.nearAmenities = nearAmenities1;
    }

    public String getType() {
        return type;
    }

    public int getBlockNumber() {
        return blockNumber;
    }

    public int getYears() {
        return years;
    }

    public boolean isNearAmenities() {
        return nearAmenities;
    }
    
    public String checkRecent() {
        if (years > 1) {
            return "OLD";
        } else {
            return "NEW";
        }
    }
}
