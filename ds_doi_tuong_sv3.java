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
public class ds_doi_tuong_sv3 {
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
        Collections.sort(L, new Comparator<Student>(){
            @Override
            public int compare(Student s1, Student s2){
                return (int) ((int) 100*(s2.getGPA()-s1.getGPA()));
            }
        });
        
        for(Student s : L){
            s.Show();
        }
        sc.close();
    }
}
class Student{
    private String code, name, birth, lop;
    private Double GPA;

    public Student() {
    }

    public Student(String code, String name, String birth, String lop, Double GPA) {
        
        this.name = name;
        this.birth = birth;
        this.lop = lop;
        this.GPA = GPA;
    }
    public void setCode(int cnt){
        String s = "B20DCCN"+cnt;
        while(s.length()<10){
            s = s.substring(0, 7)+"0"+s.substring(7);
        }
        this.code=s;
    }
    public double getGPA(){
        return GPA;
    }
    public void chuanhoa(String s){
        if(s.charAt(1)=='/') s = "0"+s;
        if(s.charAt(4)=='/') s = s.substring(0, 3)+"0"+s.substring(3);
        this.birth = s;
    }
    public void chuanhoaTen(String s){
        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        s = s.toLowerCase();
        String []m = s.split(" ");
        String tmp = "";
        for (String k : m){
            String first = k.substring(0, 1).toUpperCase();
            String second = k.substring(1);
            tmp += first+second+" ";
        }
        this.name = tmp;
    }
    public static Student nextStudent(Scanner sc, int cnt) {
        Student s = new Student();
        s.setCode(cnt);
        s.name= sc.nextLine();
        s.chuanhoaTen(s.name);
        s.lop = sc.nextLine();
        s.birth=sc.nextLine();
        s.chuanhoa(s.birth);
        s.GPA = Double.valueOf(sc.nextLine());
        return s;
    }
    public void Show(){
        System.out.print(this.code + " " + this.name + this.lop + " " + this.birth + " ");
        System.out.format("%.2f\n", (double)this.GPA);
    }
}