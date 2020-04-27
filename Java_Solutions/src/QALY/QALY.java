package QALY;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;

public class QALY {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(Paths.get("").toAbsolutePath() + "\\input\\QALY.txt");
        //Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        double QALY = 0;
        while (sc.hasNextDouble()) {
            QALY += sc.nextDouble() * sc.nextDouble();
        }
        System.out.println(QALY);
    }
}
