package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class opgave12 {
    public static void main(String[] args) {
        Dream a = new Dream(23,4,"wet");
        Dream b = new Dream(11,6,"wet");
        Dream c = new Dream(31,4,"dry");
        Dream d = new Dream(3,11,"dry");
        Dream e = new Dream(17,4,"nightmare");
        System.out.println(a.isPleasant());
        System.out.println(b.isPleasant());
        System.out.println(c.isPleasant());
        System.out.println(d.isPleasant());
        System.out.println(e.isPleasant());
        ArrayList<Dream> dreams = new ArrayList<>();
        dreams.add(a);
        dreams.add(b);
        dreams.add(c);
        dreams.add(d);
        dreams.add(e);
        for (Dream dream : dreams) {
            System.out.println(dream);
        }
        System.out.println("\n" +"sorted"+"\n");
        Collections.sort(dreams);
        for (Dream dream : dreams) {
            System.out.println(dream);
        }
    }

}
class Dream implements Comparable<Dream>{
    private int date;
    private int duration;
    private String type;

    public Dream(int date, int duration, String type){
        this.date = date;
        this.duration = duration;
        this.type = type;
    }

    public int getDate() {
        return date;
    }

    public boolean isPleasant(){
        if(this.type.equals("nightmare")){
            return false;
        }else if (this.type.equals("wet")&& this.duration<5){
            return true;
        }else if (this.type.equals("dry")&& this.duration>10){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return  "Date " + date +" " +"duration " + duration + " " + "type " + type;
    }

    @Override
    public int compareTo(Dream o) {
        return Integer.compare(getDate(), o.getDate());
    }
}


