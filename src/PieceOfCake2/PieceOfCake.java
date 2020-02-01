package PieceOfCake2;

import java.util.Scanner;

public class PieceOfCake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dimension = sc.nextInt();

        int x = sc.nextInt();
        int y = sc.nextInt();

        x = (x > (dimension - x)) ? x : (dimension - x);
        y = (y > (dimension - y)) ? y : (dimension - y);

        System.out.println(x*y*4);
    }
}
