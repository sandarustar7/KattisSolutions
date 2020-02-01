package Pot;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Pot {
    public static void main(String[] args) throws FileNotFoundException {
        //File file = new File(Paths.get("").toAbsolutePath() + "\\input\\Pot.txt");
        //Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        int sum = 0;
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            sum += (int)Math.pow(num / 10, num % 10);
        }
        System.out.println(sum);
    }
}
