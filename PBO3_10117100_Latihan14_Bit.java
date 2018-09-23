/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117100_latihan14_bit;

/**
 * Yogie Alfin Salim
 * 10117100
 * IF-3
 */
public class PBO3_10117100_Latihan14_Bit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 60;/* 60 = 0011 1100 */
        int b = 13;/* 13 = 0000 1101 */
        int c = 0;
        c = a & b;
        /* 12 = 000 1100 */
        System.out.println("a & b = " + c);
        c = a | b;
        /* 61 = 0011 1101 */
        System.out.println("a | b = " + c);
        c = a ^ b;
        
        System.out.println("a ^ b = " + c);
        c = ~a;
        
        System.out.println("~a = " + c);
        c = a << 2;
        
        System.out.println("a << 2 = " + c);
        c = a >> 2;
        
        System.out.println("a >> 2 = " + c);
    }
    
}
