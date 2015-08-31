import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by FamilyGuy on 30.08.2015.
 */
public class SeaBattle {
    public static void main(String[] args) {
        char[] cells = new char[10];
        for (int i = 0; i < cells.length; i++) {
            cells[i] = '.';
        }
        int position = 4;
        cells[position] = 'x';
        do {
            System.out.println(cells);
            Scanner scanner = new Scanner(System.in);
            String s;
            s = scanner.nextLine();
            System.out.printf("Вы ввели %s\n", s);
            int shoot = Integer.parseInt(s);
            switch (cells[shoot]) {
                case '.':
                    System.out.println("промазал");
                    cells[shoot] = '*';
                    break;
                case 'x':
                    System.out.println("попал");
                    cells[shoot] = '-';
                    System.out.println(cells);
                    break;
                case '*':
                    System.out.println("уже стрелял");
                    break;
                default:
                    System.out.println("ERROR");
                 }
            }   while (cells[position] == 'x');
    }
}
