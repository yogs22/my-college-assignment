package com.company;
import java.util.ArrayList;

public class ArrayList_3 {
    public static void main(String args[]) {
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("Dhisya");
        obj.add("Harry");
        obj.add("Dinda");
        obj.add("Budi");
        obj.add("Aini");
        obj.add("NIM = 191110236");
        obj.add("Nama = Yogi Prasetyawan Hadi");

        System.out.println("Currently the array list has following elements:"+obj);

        obj.add(0, "Rahul");
        obj.add(1, "Justin");
        obj.remove("Dinda");
        obj.remove("Aini");
        System.out.println("Current array list is:"+obj);
        obj.remove(1);
        System.out.println("Current array list is:"+obj);
    }
}