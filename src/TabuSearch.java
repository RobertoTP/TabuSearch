
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import static java.lang.System.exit;

public class TabuSearch {


    public static void main(String[] args) throws IOException {

        ArrayList<Integer> aleatorios = new ArrayList<>();
        LoadFiles files = new LoadFiles();
        ArrayList<ArrayList<Integer>> vecinos = new ArrayList<>();


        if (args.length < 1) {
            System.out.println("First argument is mandatory");
            exit(0);
        } else {
            vecinos = files.loadNeighbors(args[1]);
        }

        if (args.length > 2) {
            aleatorios = files.loadRandom(args[2]);
        } else {
            for (int i = 1; i < 100; i++) {
                aleatorios.add(i);
            }
            Collections.shuffle(aleatorios);
        }

    }
}