/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author ASUS
 */import java.util.*;
public class ma_hoa_DRM {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int t = Integer.valueOf(x);
        x.isEmpty();
        while(t-- > 0){
            String s = sc.nextLine();
            int l = s.length(), sum1 = 0, sum2 = 0;
//            chu cai: -65; so: -49
            System.out.println(s.charAt(0)-65);
            Character [] s1 = new Character[20005], s2 = new Character[20005];
            int j = 0, k = 0;
            for(int i = 0; i < l / 2; ++i){
                s1[j] = s.charAt(i);
                j++;
                sum1 += s.charAt(i) - 65;
            }

            for(int i = l / 2; i < l; ++i){
                s2[k] = s.charAt(i);
                k++;
                sum2 += s.charAt(i) - 65;
            }

            for(int i = 0; i < j; i++){
                s1[i] = (char) (((s1[i] - 65 + sum1) % 26) + 65);
            }
            for(int i = 0; i < k; i++){
                s2[i] = (char) (((s2[i] - 65 + sum2) % 26 ) + 65);
            }
            for(int i = 0; i < j; i++){
                s1[i] = (char) (((s1[i] - 65 + s2[i] - 65) % 26) + 65);
            }
            for(int i = 0; i < j; i++) System.out.print(s1[i]);
            System.out.println();
        }
        sc.close();
    }
}
