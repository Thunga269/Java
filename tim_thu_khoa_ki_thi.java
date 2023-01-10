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
public class tim_thu_khoa_ki_thi {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String m = sc.nextLine();
        int n = Integer.valueOf(m);
        m.isEmpty();
        List<Student> L = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            L.add(Student.nexStudent(sc, i));
        }
        Collections.sort(L, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2){
                if(o1.getSum()!= o2.getSum()){
                    return (int) ((int)10 * (o1.getSum()- o2.getSum()));
                }
                return o1.getCode().compareTo(o2.getCode());
            }
        });
        Student x = L.get(n - 1);//lay thi sinh co sum LN
        for(Student s: L){
            if(s.getSum()== x.getSum()){
                s.Show();
            }
        }
        sc.close();
    }
}
class Student{
    private String name, birth, code;
    private double d1, d2, d3, sum;
    

    public Student() {
        this.code = "";
        this.name = this.birth = "";
        this.d1 = this.d2 = this.d3 = this.sum=0;
    }

    public Student(String name, String birth, double d1, double d2, double d3) {
        this.name = name;
        this.birth = birth;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    public void setCode(int cnt){
        String s = ""+cnt;
        this.code = s;
        
    }
    public double getSum(){
        return sum;
    }
    public String getCode(){
        return code;
    }
    public static Student nexStudent(Scanner sc, int cnt){
        Student s = new Student();
        s.setCode(cnt);
        s.name = sc.nextLine();
        s.birth = sc.nextLine();
        s.d1 = Double.valueOf(sc.nextLine());
        s.d2 = Double.valueOf(sc.nextLine());
        s.d3 = Double.valueOf(sc.nextLine());
        s.sum = s.d1+s.d2+s.d3;
        return s;
    }
    public void Show(){
        System.out.print(this.code + " " + this.name + " " + this.birth + " ");
        System.out.format("%.1f", (double) (this.d1 + this.d2 + this.d3));
        System.out.println();
    }
}