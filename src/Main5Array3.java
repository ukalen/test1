import java.util.Arrays;

/**
 * Created by FamilyGuy on 30.08.2015.
 */
public class Main5Array3 {
    public static void main(String[] args) {
        char[][] cells;
        cells = new char[3][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                cells[j][i] = '.';
            }
        }
        cells[1][1] = 'o';
        cells[2][1] = 'x';
      //  System.out.println(Arrays.toString(cells));
       // System.out.println(Arrays.deepToString(cells));
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(cells[j][i]);
            }
            System.out.println();
        }
    }
}
//0 1 2 --- x ось абцисс
//. . . 0
//. . . 1
//. . . 2
//. . . 3