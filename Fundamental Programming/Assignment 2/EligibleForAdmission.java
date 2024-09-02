package Assignment2;
import java.util.Scanner;

public class EligibleForAdmission {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Marks of Maths : ");
        int Maths = scanner.nextInt();

        System.out.println("Enter Marks of Physics : ");
        int Physics = scanner.nextInt();

        System.out.println("Enter Marks of Chemistry : ");
        int Chemistry = scanner.nextInt();

        int totalmarks= Maths+Physics+Chemistry;
        int mathsphysics = Maths + Physics;

        System.out.println("Total Mareks :" + totalmarks );
        System.out.println("Total MArks Obtain in Maths & Physics " + mathsphysics);

        if (Maths >= 65 && Physics >= 55 && Chemistry >= 50 ){
            if( totalmarks >= 190 || mathsphysics >= 140 ){
                System.out.println("The Candidate is Eligible for Admission");
            }
        } else {
            System.out.println("Candidate is not Eligible for Admission ");
        }
    }
}
