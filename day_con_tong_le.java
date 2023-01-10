/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author ASUS
 */import java.util.*;
import java.math.*;
public class day_con_tong_le {
   public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t--> 0){
            int n = ip.nextInt();
            ArrayList<Integer>  a = new ArrayList<Integer>();
            int [] c = new int[n];
            for(int i = 0; i < n; ++i) {
                int x = ip.nextInt();
                a.add(x);
                c[i]=0;
                
            }
            a.sort((o1, o2) -> o2 - o1);
            
            ArrayList<ArrayList<Integer> > vs = new ArrayList<ArrayList<Integer> >();
            Try(0, n, c, a, vs);

            for(int i = 0; i < vs.size(); ++i){
                for(int j = 0; j < vs.get(i).size(); ++j){
                    System.out.print(vs.get(i).get(j) + " ");
                }
                System.out.println();
            }
        }
        ip.close();
    }
    public static void Try(int t, int n, int c[], ArrayList<Integer> a, ArrayList<ArrayList<Integer> > vs){
        for(int i = 0; i <= 1; i++){
            c[t]=i;
            if(t==n-1){
                int sum = 0;
                ArrayList<Integer> ar = new ArrayList<Integer>();
                for(int k = 0; k < n; k++){
                    if(c[k] == 1){
                        ar.add((Integer) a.get(k));
                        sum += (Integer) a.get(k);
                    }
                }
                if(sum % 2 == 1)
                    vs.add(ar);
            }else Try(t+1, n, c, a, vs);
        }
    }
}
