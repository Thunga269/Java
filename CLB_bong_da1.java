/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author ASUS
 */import java.util.*;
public class CLB_bong_da1 {

    public static class FootballClub{
        String id ,name ;
        int price;
        public FootballClub(String a, String b ,int c){
            id = a;
            name = b;
            price = c;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        List<FootballClub> ds = new ArrayList<>();
        while (t-- >0) {
            sc.nextLine();
            ds . add(new FootballClub(sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }
        int loop = sc.nextInt();
        while (loop -- >0){
            String s = sc.next();
            int quantity = sc.nextInt();
            for (FootballClub x : ds) if (s.substring(1,3).equals(x.id)) {
                System.out.println(s+" "+x.name+" "+quantity*x.price);
            }
        }
    }
}
