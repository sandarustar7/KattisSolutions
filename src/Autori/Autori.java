package Autori;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Autori {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(Paths.get("").toAbsolutePath() + "\\input\\Autori.txt");
        //Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);
        String[] names = sc.nextLine().split("-");
        String output = new String();
        for (String name : names) {
            output = output + name.substring(0, 1);
        }
        System.out.println(output);
    }

}
