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
public class xep_hang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t[] = new int[n +1];
        int d[] = new int[n +1];
        for(int i = 0; i < n; i++){
            t[i]= sc.nextInt();
            d[i]= sc.nextInt();
        }
//      sắp xếp theo thời điểm check-in   
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(t[i]> t[j]){
                    int tmp = t[i];
                    t[i]=t[j];
                    t[j]=tmp;
                    int tmp2=d[i];
                    d[i]=d[j];
                    d[j]=tmp2;
                }
            }
        }
        int sum = t[0]+d[0];
        for(int i = 1; i < n; i++){
            if(sum < t[i]) sum = t[i]+d[i];
            else sum += d[i];
        }
        System.out.println(sum);
    }
    
}
