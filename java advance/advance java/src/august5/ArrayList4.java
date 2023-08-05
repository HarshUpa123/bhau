/*
in this programm we are using the add all remove all and retyain all functions 
add all ads the new Array List in the existing ArrayList 
remove all removes the AraayList which is made by two ArrayList 
Retain all use for retrain the elements from an ArrayList 
*/
package august5;

import java.util.ArrayList;

public class ArrayList4 {
    public static void main(String[] args) {
        ArrayList<Integer> al4=new ArrayList <Integer> ();
        ArrayList<Integer> al5 = new ArrayList<Integer>();
        ArrayList<Integer> al6 = new ArrayList<Integer>();
        al4.add(14);
        al4.add(12);
        al4.add(13);
        al4.add(16);
        System.out.println(al4);
        al5.add(23);
        al5.add(25);
        al5.add(29);
        al5.add(21);
        System.out.println(al5);
        al6.add(34);
        al6.add(32);
        al6.add(35);
        al6.add(30);
        System.out.println(al6);
        al4.addAll(al5);
        System.out.println(al4);
        al4.addAll(al6);
        System.out.println(al4);
        al4.removeAll(al5);
        System.out.println(al4);
        al4.retainAll(al6);
        System.out.println(al4);
        al4.addAll(al5);
       Integer ob =  al6.set(0, 14);
        al6.set(1, 12);
        al6.set(2, 13);
        al6.set(3, 16);
        al4.addAll(al6);
        System.out.println(al4);
        System.out.println(ob);     
        
    }
    
}
