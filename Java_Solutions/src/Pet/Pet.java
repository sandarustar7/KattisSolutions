package Pet;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Pet {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(Paths.get("").toAbsolutePath() + "\\input\\Pet.txt");
        //Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);
        int position = -1;
        int finalScore = -1;
        for (int i = 1; i <= 5; i++) {
            int score = 0;
            for (int j = 0; j < 4; j++) {
                score += sc.nextInt();
            }
            if (score > finalScore) {
                position = i;
                finalScore = score;
            }
        }
        System.out.println(position + " " + finalScore);
    }
}
