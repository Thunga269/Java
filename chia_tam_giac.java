/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
import java.math.*;
public class chia_tam_giac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t -- > 0){
            int N = sc.nextInt();
            int H = sc.nextInt();
            for(int i = 1; i < N; i++){
                System.out.format("%.6f", H*Math.sqrt((double)i/N));
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
