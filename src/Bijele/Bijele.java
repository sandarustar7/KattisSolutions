package Bijele;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Bijele {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(Paths.get("").toAbsolutePath() + "\\input\\Bijele.txt");
        //Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);

        int kings, queens, rooks, bishops, knights, pawns;
        kings = 1 - sc.nextInt();
        queens = 1 - sc.nextInt();
        rooks = 2 - sc.nextInt();
        bishops = 2 - sc.nextInt();
        knights = 2 - sc.nextInt();
        pawns = 8 - sc.nextInt();

        System.out.println(kings + " " + queens + " " + rooks + " " + bishops + " " + knights + " " + pawns);
    }
}
