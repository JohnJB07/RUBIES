/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package MyLib;

/**
 *
 * @author Jayvee
 */
public interface ISearch {
    boolean[] filter(boolean fInner, boolean fOuter,
        boolean fSingle, boolean fDuplex, boolean fTownhouse,
        boolean fAvail, boolean fReserved, boolean fSold,
        boolean f1m, boolean f2m, boolean f3m, boolean f4m, boolean f5m);
}
