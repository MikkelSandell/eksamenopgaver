package com.company;


import java.util.ArrayList;
import java.util.Arrays;

public class opgave13 {
    public static void main(String[] args) {
        ArrayList<DataObject> objects = new ArrayList<>();
        objects.add(new Student("23","hans","hans@"));
        objects.add(new User("24","knud","knud123"));
        String[] data = objects.get(0).getData(objects.get(0));
        System.out.println(Arrays.toString(data));

    }
}
interface DataObject{
    public default int getId(){
      return 0;
    }

    public default String[] getData(Object o){
        String[] data = new String[3];
        if (o instanceof User){
            data[0] = ((User) o).getd();
            data[1] = ((User) o).getName();
            data[2] = ((User) o).getUserName();
        }else if (o instanceof Student){
            data[0] = ((Student) o).getd();
            data[1] = ((Student) o).getName();
            data[2] = ((Student) o).getEmail();
        }

        return data;
    }


}
class User implements DataObject{
    private String id;
    private String name;
    private String userName;

    public User(String id, String name, String userName){
        this.id = id;
        this.name = name;
        this.userName = userName;
    }

    public String getd() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }
}
class Student implements DataObject{
    private String id;
    private String name;
    private String email;

    public Student(String id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }


    public String getd() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
