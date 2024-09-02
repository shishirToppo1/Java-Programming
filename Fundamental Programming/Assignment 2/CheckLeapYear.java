package Assignment2;
public class CheckLeapYear {
    public static void main(String[] args){
        int year =2016;

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println(year + " is Leap Year");
                } else {
                    System.out.println(year + " is Not a Leap Year");
                }
            }else {
                System.out.println( year + " is Leap Year ");
            }
        }else {
            System.out.println( year + " is Not aLeap Year ");
        }
    }
}
