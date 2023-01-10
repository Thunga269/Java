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
public class so_0_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -->0){
            int n = sc.nextInt();
            LinkedList <Integer> L = new LinkedList<>();
            L.add(9);
            while(L.size()!=0){
                int top = L.peek();
                L.remove(0);
                if(top % n==0){
                    System.out.println(top);
                    break;
                }else{
                    L.addLast(top*10);
                    L.addLast(top*10+9);
                }

            }
        }
        
    }
}
