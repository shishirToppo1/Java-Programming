package Assignment2;
import java.util.Scanner;

public class HeightCategory {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Hight in Cm : ");

        int height = scanner.nextInt();

        if (height < 150 ){
            System.out.println("Dwarf height");
        } else if (height > 150 && height <= 165 )  {
            System.out.println("Average height");
        } else if (height > 165) {
            System.out.println("Tall");

        }
    }
}
