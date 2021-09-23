/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int tiendien = 0, sodien;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dien:");
        sodien = sc.nextInt();
        if(sodien <= 50){
            tiendien = sodien*5000;
        }
        else{
            int sodienthua = (sodien - 50)*6200;
            tiendien = (sodienthua + 50*5000);
        } 
        
        System.out.println("So dien la: " + tiendien);
    }
    }
    

