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
public class songuyento {
    public static boolean ngto(long n) {
        if(n < 2) return false;
        else{
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n%i==0) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            if(ngto(n)== true)
                System.out.println("YES");
            else 
                System.out.println("NO");
        }
    }
}
