package Sibice;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Sibice {
    public static void main(String[] args) throws FileNotFoundException {
        //File file = new File(Paths.get("").toAbsolutePath() + "\\input\\Sibice.txt");
        //Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);
        sc.nextInt();

        int width = sc.nextInt();
        int height = sc.nextInt();

        double hypotenuse = Math.hypot(width, height);

        while (sc.hasNextInt()) {
            if (sc.nextInt() <= hypotenuse) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}
