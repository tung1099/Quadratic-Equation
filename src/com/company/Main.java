package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Giải phương trình bậc hai ax^2 + bx + c = 0");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();
        System.out.println("Phương trình bậc hai bạn vừa nhập có dạng: "+a+"x^2 + "+b+"x + "+c+" = 0");

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        if(quadraticEquation.getDiscriminant() < 0)
            System.out.println("Phương trình vô nghiệm!");
        else if(quadraticEquation.getDiscriminant() == 0)
            System.out.println("Phương trình có 1 nghiệm duy nhất là " + quadraticEquation.getRoot1());
        else {
            System.out.println("Phương trình có 2 nghiệm:");
            System.out.println("Nghiệm thứ nhất là " + quadraticEquation.getRoot1());
            System.out.println("Nghiệm thứ hai là " + quadraticEquation.getRoot2());
        }
    }
}
