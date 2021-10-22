import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Map {
    String[][] mapArray;
    int[] startLocation = new int[2];
    int[] mapDimensions = new int[2];
    int mapXDimension;
    int mapYDimension;
    public Map() {
        mapArray = generateMap("src/map.txt");

        mapDimensions[0] = mapArray[0].length;
        mapDimensions[1] = mapArray.length;
        startLocation[0] = 0;
        startLocation[1] = 1;
    }
    public Map(String filename, int mapXDimension, int mapYDimension, int[] startLocation) {

    }
    public String[][] generateMap(String filename) {
        ArrayList<String[]> mapArrayList = new ArrayList<>();
        try {
            File file = new File(filename);
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) {
                String row = scan.nextLine();
                String[] splitRow = row.split("\t");
                mapArrayList.add(splitRow);
            }
            String[][] mapArray = new String[mapArrayList.size()][mapArrayList.get(0).length];
            for (int i = 0; i < mapArray.length; i++) {
                for (int j = 0; j < mapArray[0].length; j++) {
                    mapArray[i][j] = mapArrayList.get(i)[j];
                }
            }
            return mapArray;
        } catch (FileNotFoundException e) {
            System.out.println("filenotfound");
            return new String[0][0];
        }
    }
    public void printMap() {
        for (String[] row : mapArray) {
            for (String s : row) {
                if (!s.equals("☐")) {
                    System.out.print(s + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
