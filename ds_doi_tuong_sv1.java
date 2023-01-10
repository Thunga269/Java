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

public class ds_doi_tuong_sv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.nextLine();
//        sc.nextLine();
        int n = Integer.valueOf(m);
        m.isEmpty();
        List<Student> L = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            L.add(Student.nextStudent(sc, i));
        }
        for(Student s : L){
            s.Show();
        }
        sc.close();
    }
}
class Student{
    private String code, name, classes, date;
    double gpa;

    public Student(){
        this.code = this.name = this.classes = this.date = "";
        this.gpa = 0;
    }
    public Student(String name, String classes, String date, double gpa){
        this.name = name;
        this.classes = classes;
        this.date = date;
        this.gpa = gpa;
    }
    public void trueDate(){
        String s = this.date;
        if(s.charAt(1) == '/') s = "0" + s;
        if(s.charAt(4) == '/') s = s.substring(0, 3) + "0" + s.substring(3, s.length());
        this.date = s;
    }

    public void setCode(int cnt){
        String s = "B20DCCN" + cnt;
        while(s.length() < 10) s = s.substring(0, 7) + "0" + s.substring(7);
        this.code = s;
    }

    public static Student nextStudent(Scanner sc, int cnt){
        Student a = new Student();
        a.setCode(cnt);
        a.name = sc.nextLine();
        a.classes = sc.nextLine();
        a.date = sc.nextLine();
        a.trueDate();
        a.gpa = Double.valueOf(sc.nextLine());
        
        return a;
    }

    public void Show(){
        System.out.print(this.code + " " + this.name + " " + this.classes + " " + this.date + " ");
        System.out.format("%.2f\n", (double)this.gpa);
    }
}