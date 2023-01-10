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
public class thu_gon_day_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n+1];
        for(int i = 0; i < n; i++){
            a[i]=sc.nextInt();
        }
        Stack<Integer> st = new Stack<Integer>();
        for(int i = 0; i < n; i++){
            if(st.isEmpty()){
                st.push(a[i]);
            }else if((a[i]+st.peek())%2!=0)
                st.push(a[i]);
            else st.pop();
        }
        
        System.out.println(st.size());
    }
}
