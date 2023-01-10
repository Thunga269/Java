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
public class tich_ma_tran_chuyen_vi {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        int dem = 1;
        while(t -- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int a[][] = new int[n+1][m+1];
            int b[][] = new int[m+1][n+1];
            int c[][] = new int[n+1][n+1];
            for(int i = 0; i < n; i++)
                for(int j = 0; j < m; j++)
                    a[i][j]=sc.nextInt();
            for(int i = 0; i < m; i++)
                for(int j = 0; j < n; j++)
                    b[i][j] = a[j][i];
            System.out.println("Test "+dem+":");
            dem++;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    for(int k = 0; k < m; k++){
                        c[i][j]+=a[i][k]*b[k][j];
                    }
                    System.out.print(c[i][j]+" ");
                }
                System.out.println("");
            }
                    
        }
     }
}
