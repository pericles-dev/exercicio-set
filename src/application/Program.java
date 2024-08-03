package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.println("How many students for course A: ");
        int n1 = sc.nextInt();

        for (int i = 0; i < n1; i++) {
            System.out.print("Number: ");
            int number = sc.nextInt();
            a.add(number);
        }

        System.out.println("How many students for course B: ");
        int n2 = sc.nextInt();

        for (int i = 0; i < n2; i++) {
            System.out.print("Number: ");
            int number = sc.nextInt();
            b.add(number);
        }

        System.out.println("How many students for course C: ");
        int n3 = sc.nextInt();

        for (int i = 0; i < n3; i++) {
            System.out.print("Number: ");
            int number = sc.nextInt();
            c.add(number);
        }

        Set<Integer> total = new HashSet<>();
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total students: " + total.size());
        sc.close();
    }
}
