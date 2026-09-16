import java.util.Scanner;
public class practice5{
    public static void main(String[] args) {
        String day=args[0];
        if (day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")||day.equals("Friday")){
            System.out.println("It's a weekday");
        }
        else if(day.equals("Saturday")||day.equals("Sunday")){
            System.out.println("It's a weekend");
    }
        else{
        
            System.out.println("Please provide a valid input");
} 
        
    }
}