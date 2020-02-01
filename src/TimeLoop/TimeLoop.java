package TimeLoop;

import java.io.File;
import java.nio.file.Paths;
import java.util.Scanner;

public class TimeLoop {
    public static void main(String[] args) {
        File file = new File(Paths.get("").toAbsolutePath() + "\\input\\TimeLoop.txt");
        //Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);

        int looops = sc.nextInt();
        for (int i = 1; i <= looops; i++) {
            System.out.println(i + " Abracadabra");
        }
    }
}
