package R2;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;

public class R2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(Paths.get("").toAbsolutePath() + "\\input\\R2.txt");
        //Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int s = sc.nextInt();

        System.out.println(((s * 2) - r1));
    }
}
