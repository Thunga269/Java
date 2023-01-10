/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author ASUS
 */import java.util.*;
public class bang_luong_theo_phong_ban {

    public static class Department{
        String id, name;
        public Department(String a){
            id = a.substring(0,2);
            name = a.substring(3);
        }
    }
    public static class Employee{
        String id,name,department  ;
        int wage , total_word_day;
        public Employee(String a, String b , int c,int d){
            id = a;
            name = b;
            wage = c;
            total_word_day = d;
        }
        public int factor(){
            Character x = id.charAt(0);
            int y = Integer.valueOf(id.substring(1,3));
            if (x=='A'){
                if (y<=3) return 10;
                if (y<=8) return 12;
                if (y<=15) return 14;
                return 20;
            }
            if (x=='B'){
                if (y<=3) return 10;
                if (y<=8) return 11;
                if (y<=15) return 13;
                return 16;
            }
            if (x=='C'){
                if (y<=3) return 9;
                if (y<=8) return 10;
                if (y<=15) return 12;
                return 14;
            }
            if (y<=3) return 8;
            if (y<=8) return 9;
            if (y<=15) return 11;
            return 13;
        }
        public int salary(){
            return factor()*wage*total_word_day*1000;
        }
        @Override
        public String toString(){
            return id+" "+name+" "+salary();
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Department> dep_arr = new ArrayList<>();
        List<Employee> e_arr = new ArrayList<>();
        while (t-- >0) dep_arr.add(new Department(sc.nextLine()));
        t = sc.nextInt();
        while (t-->0){
            sc.nextLine();
            e_arr.add(new Employee(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        String s = sc.next();
        for (Employee x : e_arr) for (Department y : dep_arr) if (x.id.substring(3).equals(y.id))    x.department=y.name;
        String str = "";
        for (Department x : dep_arr) if (x.id.equals(s)) str = x.name;
        System.out.println("Bang luong phong "+str+":");
        for (Employee x : e_arr) if(x.id.substring(3).equals(s)) System.out.println(x);
    }
}
