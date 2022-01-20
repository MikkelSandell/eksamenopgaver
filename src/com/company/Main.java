package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        JuleGave gave = new JuleGave();
        System.out.println(gave);
        gave.couldBeLego();
    }
}

class JuleGave{
    private boolean isSoft;
    private boolean isRectangular;
    private boolean doesRettle;

    public JuleGave (){
        Random r = new Random();
        int random = r.nextInt(2)+1;
        if (random==1){
            this.isSoft = false;
        }else{
            this.isSoft = true;
        }
        random = r.nextInt(2)+1;
        if (random==1){
            this.isRectangular = false;
        }else{
            this.isRectangular = true;
        }
        random = r.nextInt(2)+1;
        if (random==1){
            this.doesRettle = false;
        }else{
            this.doesRettle = true;
        }
        /*this.isSoft =false;
        this.isRectangular =true;
        this.doesRettle = true;*/
    }

    @Override
    public String toString() {
        return "JuleGave" +
                "isSoft=" + isSoft +"\n"+ "isRectangular=" + isRectangular +"\n"+ "doesRettle=" + doesRettle+"\n";
    }

    public void couldBeLego(){
        if(this.isSoft == false && this.isRectangular==true && this.doesRettle==true){
            System.out.println("could be LEGO");
        }else {
            System.out.println("Could not be lego");
        }

    }


}
