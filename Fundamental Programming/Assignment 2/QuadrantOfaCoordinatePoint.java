package Assignment2;
import java.util.Scanner;

public class QuadrantOfaCoordinatePoint {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Point of X : ");
        int x = scanner.nextInt();

        System.out.println("Enter the Point of Y : ");
        int y = scanner.nextInt();

        if(x > 0 && y > 0){
            System.out.println("The coordinate point ( " + x + " , " + y + " ) lies in First Quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("The coordinate point ( " + x + " , " + y + " ) lies in Second Quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("The coordinate point ( " + x + " , " + y + " ) lies in Third Quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("The coordinate point ( " + x + " , " + y + " ) lies in Fourth Quadrant");
        } else if (x == 0 && y > 0 || y < 0) {
            System.out.println("The coordinate point ( " + x + " , " + y + " ) lies in y-axis");
        } else if (y == 0 && x > 0 || x < 0) {
            System.out.println("The coordinate point ( " + x + " , " + y + " ) lies in x-axis");
        } else if (y == 0 && x == 0) {
            System.out.println("The coordinate point ( " + x + " , " + y + " ) lies in center");
        }
    }

}
