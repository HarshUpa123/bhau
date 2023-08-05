/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package august3;

import java.util.Scanner;

public class namevalidation {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        boolean f = false;
        System.out.println("enter your name ");
        String nm = sc.nextLine();
        nm.trim();
//        System.out.println("name after trim "+nm);
        for (int i = 0; i < nm.length(); i++) {
          Character ch = nm.charAt(i);
            if (!Character.isAlphabetic(ch)  && !Character.isWhitespace(ch)) {
                f=true;
                break;
            }
        }
        if (f) {
            System.out.println("enter a valid name ");
        } else {
            System.out.println("name is valid");
            System.out.println("your name is  "+nm);
        }
    }
 }
