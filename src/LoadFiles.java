import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LoadFiles {

    public ArrayList<ArrayList<Integer>> loadNeighbors(String file) {

        ArrayList<ArrayList<Integer>> vecinos = new ArrayList<>();

        try {
            Scanner input = new Scanner(new File(file));
            while (input.hasNextLine()) {
                Scanner colReader = new Scanner(input.nextLine());
                ArrayList col = new ArrayList();
                while (colReader.hasNextInt()) {
                    col.add(colReader.nextInt());
                }
                vecinos.add(col);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TabuSearch.class.getName()).log(Level.SEVERE, null, ex);

        }
        return vecinos;
    }

    public ArrayList<Integer> loadRandom(String randomFile) throws IOException {
        ArrayList<Integer> aleatorios = new ArrayList<>();
        File file = new File(randomFile);
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null) {
                aleatorios.add((int) Math.floor(Double.parseDouble(st) * 99 + 1));
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TabuSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
        return aleatorios;
    }
}
