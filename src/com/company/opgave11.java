package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class opgave11 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Media> medias = new ArrayList<>();
        medias.add(new Audio("hans",2));
        medias.add(new Video("gnome",3));
        File file = new File("data/" + "mediainfo.txt");
        PrintStream ps = new PrintStream(new FileOutputStream(file,true));
            for (Media media : medias) {
                ps.println(media);

        }
    }
}
abstract class Media{
    String name;
    int duration;
    public Media(String name, int duration){
        this.name = name;
        this.duration = duration;
    }
}
class Audio extends Media{
    double loudness = 10.4;

    public Audio(String name, int duration) {
        super(name, duration);
    }

    @Override
    public String toString() {
        return name + ";" + duration + ";" + loudness;
    }
}
class Video extends Media{
    double aspectRatio = 16.9;

    public Video(String name, int duration) {
        super(name, duration);
    }

    @Override
    public String toString() {
        return name + ";" + duration + ";" + aspectRatio;
    }
}
