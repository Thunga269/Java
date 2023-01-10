/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */import java.util.*;
public class dau_tu_chung_khoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -->0){
            int n = sc.nextInt();
            int [] a = new int[n];
            int []r = new int[n];
            r[0]=1; 
            for(int i = 0; i < n; ++i) a[i] = sc.nextInt();
            Stack <Integer> st = new Stack <>();
            st.push(0);

            for(int i = 1; i < n; i++){
                while(!st.empty() && a[st.peek()]<=a[i]) st.pop();
                if(st.empty()) r[i] = i+1;
                else r[i] = i-st.peek();
//                if(i == 4) System.out.println(st.peek());
                st.push(i);
                
            }
            for(int i = 0; i < n; i++) System.out.print(r[i]+" ");
            System.out.println("");
        }
    }
}
