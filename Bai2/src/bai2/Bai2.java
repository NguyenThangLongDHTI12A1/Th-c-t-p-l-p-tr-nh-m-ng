/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c,max,min;
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap so nguyen a:");
    a = sc.nextInt();
    System.out.println("Nhap so nguyen b:");
    b = sc.nextInt();
    System.out.println("Nhap so nguyen c:");
    c = sc.nextInt();
    max = (a>b)?a:(b>c?b:c);
    min = (a>b)?b:(a>c?c:a);
    System.out.println("Max la:"+max);
    System.out.println("Min la:"+min);
    }
    
}
