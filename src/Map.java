import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Map {
    String maptxt;

    public Map() {
        maptxt = generateMap("map.txt");
    }
    public Map(String filename) {

    }
    public String generateMap(String filename) {
        try {
            File file = new File("filename");
            Scanner scan = new Scanner(file);
            int x = 0;
            while (scan.hasNextLine()) {
                x++;
            }
            System.out.println(x);
            return "s";
        } catch (FileNotFoundException e) {
            return "s";
        }
    }
}
