/**
 * Created by FamilyGuy on 30.08.2015.
 */
public class Main3ifSwitch {
    public static void main(String[] args) {
        int a =300;
        int b = 200;
        if (a > b) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        int grade = 7;
        switch (grade) {
            case 5:
                System.out.println("exellent");
                break;
            case 4:
                System.out.println("good");
                break;
            case 3:
                System.out.println("normal");
                break;
            case 2:
                System.out.println("bad");
                break;
            default:
                System.out.println("out of range");
        }
    }
}

