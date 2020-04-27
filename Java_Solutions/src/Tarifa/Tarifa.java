package Tarifa;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(Paths.get("").toAbsolutePath() + "\\input\\Tarifa.txt");
        //Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt() * (sc.nextInt() + 1);
        while (sc.hasNextInt()) {
            total -= sc.nextInt();
        }
        System.out.println(total);
    }


}
