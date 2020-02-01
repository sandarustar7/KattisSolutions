package Cold;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Cold {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(Paths.get("").toAbsolutePath() + "\\input\\Cold.txt");
       // Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int count = 0;
        for (int i = 0; i < x; i++) {
            count = (sc.nextInt() < 0) ? count + 1 : count;
        }
        System.out.println(count);
    }
}
