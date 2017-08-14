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
public class Unit42 {
    public static void main(String [] args) {
        String  blog = "StudyAndShare";
        System.out.println(blog);
        System.out.println(blog.charAt(6));
        System.out.println(blog.indexOf("Share"));
        System.out.println(blog.substring(5));
        System.out.println(blog.substring(5, 8));
        System.out.println(blog);
        
        String name = "Study And Share ";
        System.out.println(name.trim());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        
        String [] arr = name.trim().split(" ");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
