package project.geometry;

import java.util.Scanner;

public class Curcumferinta {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("baga nr: ");
        int raza = scan.nextInt();
        double circumferinta = 0;
        if (circumferinta == 0) {
            circumferinta = 2 * Math.PI * raza;
            System.out.println(circumferinta);
        }

    }
}
