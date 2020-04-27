package Different;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Different {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        File file = new File(Paths.get("").toAbsolutePath() + "\\input\\Different.txt");
        //Scanner sc = new Scanner(file);
        while(sc.hasNextLine()) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            System.out.println(Math.abs( x - y ));
            sc.nextLine();
        }
    }
}
