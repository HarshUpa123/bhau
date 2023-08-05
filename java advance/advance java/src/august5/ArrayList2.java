package august5;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList <Integer> a= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        a.add(14);
        a.add(17);
        a.add(16);
        a.add(44);
        a.add(36);
        ArrayList<String> s= new ArrayList<> ();
        s.add("shyam");
        s.add("ram");
        s.add("varah");
        s.add("kachhap");
        s.add("vaman");
        /*System.out.println("enter any number ");
        int e = sc.nextInt();
        if (a.contains(e)) {
            System.out.println("element is found");
        }
        else{
             System.out.println("element is not found");
    }*/
        System.out.println(a);
        System.out.println(s);
        Integer obj = a.set(3, 99);
        String ob = s.set(3, "narsimha");
        System.out.println(a);
        System.out.println("removed element is "+obj+" and replaced by "+99);
        System.out.println(s);
        System.out.println(ob);
    }
}