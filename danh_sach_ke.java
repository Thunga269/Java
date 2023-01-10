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
import javax.swing.plaf.basic.BasicScrollPaneUI;
public class danh_sach_ke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
//        sc.nextLine();
        while(t -- > 0){
            int n = sc.nextInt();
            int [][]a = new int[n][n];
            for(int i = 0; i < n; i++)
                for(int j = 0; j < n; j++)
                   a[i][j] = sc.nextInt();
            ArrayList<ArrayList<Integer>> v = new ArrayList<ArrayList<Integer>> (n);
            for(int i = 0; i < n; i++) v.add(new ArrayList<Integer>());
            for(int i = 0; i < n; i++)
                for(int j = 0; j < n; j++){
                    if(a[i][j]==1)
                        v.get(i).add(j);
                }
            for(int i = 0; i < v.size(); i++){
                System.out.print("List("+(i+1)+") = ");
                for(int j = 0; j < v.get(i).size(); j++)
                    System.out.print(v.get(i).get(j)+1+" ");
                System.out.println("");
            }
        }
    }
}
