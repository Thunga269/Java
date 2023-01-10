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
public class ktra_day_ngoac_dung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -->0){
            sc.nextLine();
            String s = sc.next();
            Stack <Character> st = new Stack<>();
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
		if(c == '(' || c == '[' || c == '{') st.push(c);
		else {
			if(!st.empty() && c==']' && st.peek() == '[') st.pop();
			else if(!st.empty() && c=='}' && st.peek() == '{') st.pop();
			else if(!st.empty() && c==')' && st.peek()== '(') st.pop();
			//return 0;
		}
            }
            if(st.size()==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
