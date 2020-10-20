import java.util.Scanner;

public class TicketKiosk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indicate if the film is part of the film"
            +  "\nFestival '0' if so and '1' if not part of festival");
        int y = input.nextInt();
        if (y == 0) {
            System.out.println("Price for this ticket is $15.00");
            input.close();
        }
        if (y == 1) {
            System.out.println("Enter your age below");
            int z = input.nextInt();            
            if (z <= 12) {
                System.out.println("Price for this ticket is $10.00");
            }
            System.out.println("Enter screening time in 24 hour format without minutes");
            int x = input.nextInt();            
            if (x >= 18) {
                System.out.println("Price for ticket is $18.00");
                if (z >= 60) {
                    System.out.println("Price for ticket with Senior discount: $16.20");
                }
            }
            else {
                if (z >= 60) {
                    System.out.println("Price for ticket with Senior Discount: $10.80");
                }
                System.out.println("Price for ticket is $12.00");
            }
            input.close();
        }
        
    
    }

}
