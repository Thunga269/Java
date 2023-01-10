/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author ASUS
 */
import java.util.*;
import java.math.*;
public class ma_tran_nhi_phan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n+1][4];
        int cnt = 0;
        for(int i = 0; i < n; i++){
            int dem1 = 0;
            for(int j = 0; j < 3; j++){
                a[i][j]=sc.nextInt();
                if(a[i][j]==1) dem1++;
                
            }
            if(dem1 > (3-dem1)) cnt++;
        }
        System.out.println(cnt);
    }
}
