package com.company;

import java.io.FileNotFoundException;
import java.time.DayOfWeek;

public class opgave8 {
    public static void main(String[] args) {
        Day d = new Day();
        d.addDays(5);
        d.nextDay(7);
        System.out.println(d);
    }
}
class Day {
    int date = 0;
    DayOfWeek dayOfWeek = DayOfWeek.of(1);


    public Day() {

    }

    public void nextDay(int times) {
        try {
            int counter = 0;
            for (int i = 0; i < times; i++) {
                date++;
                counter++;
                System.out.print(date + " ");
                dayOfWeek = DayOfWeek.of(counter);
                System.out.println(dayOfWeek + "\n");
                if (counter > 6) {
                    counter = 0;
                }
                if (date > 30) {
                    throw new IllegalArgumentException();
                }
            }

        } catch (Exception e) {
            System.out.println("date out of bounds");
        }
    }

        public void addDays ( int add){
        try {
            date = date + add;
            if (date > 30) {
                throw new IllegalArgumentException();
            }
        }catch (Exception e) {
            System.out.println("date out of bounds");
        }
        }

    @Override
    public String toString() {
        return dayOfWeek + " the " + date + "nd";
    }
}
