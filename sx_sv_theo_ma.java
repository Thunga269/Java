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
public class sx_sv_theo_ma {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        while(sc.hasNextLine()){
            list.add(Student.nextStudent(sc));
        }
        Collections.sort(list, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2){
                return o1.getCode().compareTo(o2.getCode());

            }
        });
        for (Student student : list) {
            student.Show();
        }
        sc.close();
    }
}
class Student{
    private String code, name, classes, email;

    public Student(){
        this.code = this.name = this.classes = this.email = "";
    }
    public Student(String code, String name, String classes, String email){
        this.code = code;
        this.name = name;
        this.classes = classes;
        this.email = email;
    }

    public String getClasses(){
        return classes;
    }
    public String getCode(){
        return code;
    }

    public static Student nextStudent(Scanner sc){
        Student a = new Student();
        a.code = sc.nextLine();
        a.name = sc.nextLine();
        a.classes = sc.nextLine();
        a.email = sc.nextLine();
        return a;
    }

    public void Show(){
        System.out.println(this.code + " " + this.name + " " + this.classes + " " + this.email);
    }
}