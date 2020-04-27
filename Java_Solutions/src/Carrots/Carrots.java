package Carrots;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Carrots {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(Paths.get("").toAbsolutePath() + "\\input\\Carrots1.txt");
        //Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);
        int output = -1;
        while(sc.hasNextInt()) {
            output = sc.nextInt();
        }
        System.out.println(output);
    }
}
