/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.*;

/**
 *
 * @author ASUS
 */
public class phan_tu_ben_phai_dau_tien_lon_hon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -->0){
            int m = 0;
            int n = sc.nextInt();
            List <Integer> L = new ArrayList<>();
            List <Integer> B = new ArrayList<>();
            Stack <Integer> st = new Stack<>();
            for(int i = 0; i <n; i++){
                B.add(-1);
                L.add(sc.nextInt());
            }
                
            for(int i = 0; i < n; i++){
                while(st.size()!=0 && L.get(i)>L.get(st.peek())){
                    B.set(st.peek(), i); //thay the boi cac vi tri lon hon
                    st.pop();
                }
                st.push(i);//luu lai cac vi tri lon hon
            }
            for(int i = 0; i < n; i++){
                if(B.get(i)==-1) System.out.print("-1 ");
                else System.out.print(L.get(B.get(i))+" ");
            }
            System.out.println("");
        }
    }
                
}
