package Bijele;

import java.io.File;
import java.nio.file.Paths;
import java.util.Scanner;

public class Bijele {
    public static void main(String[] args) {
        File file = new File(Paths.get("").toAbsolutePath() + "\\input\\Bijele.txt");
        Scanner sc = new Scanner(file);
    }
}
