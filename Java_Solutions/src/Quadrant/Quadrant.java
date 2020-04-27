package Quadrant;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) throws FileNotFoundException {
        //File file = new File(Paths.get("").toAbsolutePath() + "\\input\\Quadrant1.txt");
        //Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = -1;
        result = x > 0 ? (y > 0 ? 1 : 4) : (y > 0 ? 2 : 3);
        System.out.println(result);
    }
}
