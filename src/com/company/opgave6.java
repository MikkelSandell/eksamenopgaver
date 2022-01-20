package com.company;

public class opgave6 {

    public static void main(String[] args) {
        Image i = new Image("erewfa.jpg",1,23);
        i.isLandscape();
        i.isPortrai();
        i.isKonwFileType();
    }
}
class Image {
    private String fileName;
    private double width;
    private double height;

    public Image(String fileName, double width, double height) {
        this.fileName = fileName;
        this.width = width;
        this.height = height;
    }

    public void isPortrai() {
        if (this.height > this.width) {
            System.out.println("the image is portrai");
        } else {
            System.out.println("the image is not portrai");
        }
    }

    public void isLandscape () {
        if (this.height < this.width) {
            System.out.println("the image is landscape");
        } else {
            System.out.println("the image is not landscape");
        }
    }

    public void isKonwFileType(){
        int dont = this.fileName.indexOf(".");
        String fileType = this.fileName.substring(dont);
        System.out.println(fileType);
        if (fileType.equals(".gif") || fileType.equals(".jpg") || fileType.equals(".jpeg") || fileType.equals(".png") ||
                fileType.equals(".webp") || fileType.equals(".bmp")){
            System.out.println("is a known file type");
        }else {
            System.out.println("is not a known file type");
        }
    }
}