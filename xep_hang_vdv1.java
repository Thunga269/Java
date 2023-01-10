/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author ASUS
 */import java.util.*;
public class xep_hang_vdv1 {
    public static int cnt = 1;
    public static class Athletes{
        String id,name , birth ,start , end ;
        int rank;
        public Athletes(String a, String b , String c, String d){
            name  =a ;
            birth = b;
            start = c;
            end = d;
            id = "VDV" + "00".substring(Integer.toString(cnt).length()) + Integer.toString(cnt++);
        }
        public String priorityTime(){
            String []str = birth.split("/");
            int age = 2021 - Integer.valueOf(str[2]);
            if (age <18) return "00:00:00";
            if (age <25) return "00:00:01";
            if (age<32) return "00:00:02";
            return "00:00:03";
        }
        public int time(String s) {
            String [] str = s.split(":");
            return 3600*Integer.valueOf(str[0]) + 60*Integer.valueOf(str[1])+Integer.valueOf(str[2]);
        }
        public String convertTimeToString(int time){
            int hour = time/3600;
            int minute = (time - 3600*hour)/60;
            int second = time - 3600*hour - 60*minute;
            return String.format("%02d:%02d:%02d", hour,minute,second);
        }
        public String realAchievement(){
            return convertTimeToString(time(end)-time(start));
        }
        public String rankAchievement(){
            return convertTimeToString(time(realAchievement())-time(priorityTime()));
        }
        @Override
        public String toString(){
            return id +" "+name+" "+realAchievement()+" "+priorityTime()+" "+rankAchievement()+" "+rank;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        List<Athletes> ds = new ArrayList<>();
        while (t-- >0){
            sc.nextLine();
            Athletes a =new Athletes(sc.nextLine(), sc.next(), sc.next(), sc.next());
            ds.add(a);
        }
        Collections.sort(ds,(Athletes a , Athletes b) -> a.rankAchievement().compareTo(b.rankAchievement()));
        ds.get(0).rank= 1;
        for (int i = 1 ; i < ds.size();++i){
            if(ds.get(i).rankAchievement().equals(ds.get(i-1).rankAchievement())) ds.get(i).rank = ds.get(i-1).rank;
            else ds.get(i).rank = i+1;
        }
        Collections.sort(ds,(Athletes a,Athletes b) -> a.id.compareTo(b.id));
        for (Athletes x : ds ) System.out.println(x);
    }
}

