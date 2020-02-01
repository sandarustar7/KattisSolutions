package Planina;

import java.io.File;
import java.nio.file.Paths;
import java.util.Scanner;

public class Planina {
    public static void main(String[] args) {
        File file = new File(Paths.get("").toAbsolutePath() + "\\input\\Planina.txt");
        //Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);
        System.out.println((int)Math.pow((Math.pow(2, sc.nextInt()) + 1 ), 2 ));
    }
}
