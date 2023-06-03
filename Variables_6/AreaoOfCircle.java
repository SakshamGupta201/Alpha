package Variables_6;

import java.util.Scanner;

public class AreaoOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextInt();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area = " + area);
        sc.close();
    }
}

