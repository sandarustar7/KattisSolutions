package Zanzibar;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Zanzibar {
    public static void main(String[] args) throws FileNotFoundException {
        //File file = new File(Paths.get("").toAbsolutePath() + "\\input\\Zanzibar.txt");
        Scanner sc = new Scanner(file);
        //Scanner sc = new Scanner(System.in);
        sc.nextLine();
        while(sc.hasNextLine()) {
            int lowerBound = 0;
            String[] input = sc.nextLine().split(" ");
            List<Integer> vals = new LinkedList<>();
            for (String str : input) {
                vals.add(Integer.parseInt(str));
            }
            for (int i = 1; i < vals.size(); i++) {
                if (vals.get(i) > (2 * vals.get(i - 1))) {
                    lowerBound += vals.get(i) - vals.get(i-1) * 2;
                }
            }
            System.out.println(lowerBound);
        }
    }
}
