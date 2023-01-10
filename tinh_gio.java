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

public class tinh_gio {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String m = sc.nextLine();
        int n = Integer.valueOf(m);
        m.isEmpty();
        List<Game> L = new ArrayList<Game>();
        for(int i = 0; i < n; i++){
            L.add(Game.nexGame(sc, n));
        }
        Collections.sort(L, new Comparator<Game>(){
            @Override
            public int compare(Game g1, Game g2){
                if(g1.getGio()!=g2.getGio())
                    return (int) (g2.getGio()-g1.getGio());      
                return (int) (g2.getPhut()-g1.getPhut());
            }
        });
        for(Game x:L) x.Show();
        sc.close();
    }
}
class Game{
    private String code, name, giovao, giora;
    private int gio, phut;

    public Game() {
    }

    public Game(String code, String name, String giovao, String giora) {
        this.code = code;
        this.name = name;
        this.giovao = giovao;
        this.giora = giora;
    }
    public String getCode(){
        return code;
    }
    public int getGio(){
        return gio;
    }
    public int getPhut(){
        return phut;
    }
    public static Game nexGame(Scanner sc, int cnt) {
        Game g = new  Game();
        g.code=sc.nextLine();
        g.name = sc.nextLine();
        g.giovao=sc.nextLine();
        g.giora = sc.nextLine();
        g.gio = Integer.valueOf(g.giora.substring(0, 2))-Integer.valueOf(g.giovao.substring(0, 2));
        g.phut = Integer.valueOf(g.giora.substring(3))-Integer.valueOf(g.giovao.substring(3));
        return g;
        
    }
    public void Show(){
        int hour = 0, minute = 0;
        minute = 60*this.gio+this.phut;
        while(minute>=60){
            hour = minute/60;
            minute -= hour*60; 
        }
        System.out.println(this.code+" "+this.name+" "+ hour + " gio " + minute + " phut");
    }
}