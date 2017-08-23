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
public class Unit57 {
    
    {
        System.out.println("Block code 1");
    }    
    static {
        System.out.println("Static block code 1");
    }
    
    public Unit57() {
            System.out.println("Constructor");
}
    public static void main(String[] args) {
        Unit57 unit = new Unit57(   );
    }
    
    {
        System.out.println("Block code 2");
    }
    static {
        System.out.println("Static block code 2");
    }
}
