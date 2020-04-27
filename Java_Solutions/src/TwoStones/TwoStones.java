package TwoStones;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;

public class TwoStones {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(Paths.get("").toAbsolutePath() + "\\input\\TwoStones.txt");
        //Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);
        System.out.println((sc.nextInt() % 2) == 1 ? "Alice" : "Bob");
    }
}
