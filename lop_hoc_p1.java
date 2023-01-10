/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author ASUS
 */import java.util.*;
public class lop_hoc_p1 {

    public static class Subject{
        String id , teacher_name, name, group;
        public Subject(String a,String b , String c, String d){
            id = a;
            name = b;
            group = c;
            teacher_name = d;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List < Subject> ds=  new ArrayList<>();
        while (t-- >0)  ds.add(new Subject(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        t = sc.nextInt();
        Collections.sort(ds, (Subject a , Subject b) -> a.group.compareTo(b.group));
        while (t-- >0){
            String s = sc.next();
            String str = "";
            for (Subject x : ds) if (x.id.equals(s)) str = x.name;
            System.out.println("Danh sach nhom lop mon "+str+":");
            for (Subject x : ds) if (x.id.equals(s)) System.out.println(x.group+" "+x.teacher_name);
        }
    }
}
