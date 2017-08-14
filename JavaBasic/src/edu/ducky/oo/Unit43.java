/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.oo;

/**
 *
 * @author Admin
 */
public class Unit43 {
    public static void main(String[] args) {
        String myCountry = "Beautyful land1 land2 land3";
        System.out.println(myCountry.length());
        System.out.println(myCountry.replace("land", "Viet Nam"));
        System.out.println(myCountry.replaceFirst("land", "Viet Nam"));
        System.out.println(myCountry.replaceAll("land", "Viet Nam"));
        
        String name = "Ducky";
//        if(name == "Ducky") {
//            System.out.println("Ducky");
//        }
        if(name.equals("Ducky")) {
            System.out.println("Ducky");
        }
    }
}
