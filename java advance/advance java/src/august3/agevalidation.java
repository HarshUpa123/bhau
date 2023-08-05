package august3;

import java.util.Scanner;

public class agevalidation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age ");
        String s = sc.next();
        int age = Integer.parseInt(s);
        if (age >= 18) {
            System.out.println("age is vlid ");
        } else {
            System.out.println("please enter the valid age ");
        }
    }
}
