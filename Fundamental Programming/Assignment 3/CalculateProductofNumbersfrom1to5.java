package Assignment3;

public class CalculateProductofNumbersfrom1to5 {
    public  static void main(String[]args){
        int number = 1;
        int product = 1;

        while(number <= 5){
            product = product * number;
            number++;
        }
        System.out.println("product 1 to 5 : "+ product);
    }
}
