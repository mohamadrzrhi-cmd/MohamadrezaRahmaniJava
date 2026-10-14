/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rahmaniswitch;

/**
 *
 * @author Mohamadreza
 */

public class RahmaniSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("MohamadrezaRahmani:");
        
        int year = 5;
        switch(year){
            case 1:
                System.out.println("(Bahar)--> Farvardin-Ordibehesht-Khordad");
                break;
                
            case 2:
                System.out.println("(Tabestan)--> Tir-Mordad-Shahrivar");
                break;
                
            case 3:
                System.out.println("(Paeez)--> Mehr-Aban-Azar");
                break;
                
            case 4:
                System.out.println("(Zemestan)--> Dey-Bahman-Esfand");
                break;
                
            default:
                System.out.println("Invalid selection-Please select 1-4");
        }
    }
    
}
