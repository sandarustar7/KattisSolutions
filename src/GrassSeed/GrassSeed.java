package GrassSeed;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;

public class GrassSeed {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(Paths.get("").toAbsolutePath() + "\\input\\GrassSeed.txt");
        //Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);

        double costPer = sc.nextDouble();
        double lawns = sc.nextDouble();
        double total = 0;

        for (int i = 0; i < lawns; i++) {
            double area = sc.nextDouble() * sc.nextDouble();
            total += area * costPer;
        }
        System.out.println(total);
    }
}
