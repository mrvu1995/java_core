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
public class Unit44 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("StudyAndShare");
        StringBuffer buffer = new StringBuffer("Ducky");
        
        builder.append("2017");
        System.out.println(builder);
        
        builder.deleteCharAt(13);
        System.out.println(builder);
        builder.delete(13, 16);
        System.out.println(builder);
        
        builder.insert(5, "2017");
        System.out.println(builder);
        
        buffer.reverse();
        System.out.println(buffer);
    }
}
