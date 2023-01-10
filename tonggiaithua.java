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
public class tonggiaithua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum1 = 1;
        long sum2 = 0;
        for(int i = 1; i <= n; i++){
            sum1 = sum1 * i;
            sum2 = sum2 + sum1;
        }
        System.out.println(sum2);
    }
}
