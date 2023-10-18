/**
 * tes
 */
    import java.util.Scanner;
public class tes {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("WELCOME TO THE JUNGLE");

            double typeRoom;
            int option;

            while(true){
                System.out.println();
                System.out.println("Type Room Hotel");
                System.out.println("1. Type Deluxe");
                System.out.println("2. Type Executive");
                System.out.println("Choose your Type Room");
                System.out.println();

                System.out.print("Type Hotel Room (1/2): ");
                option = input.nextInt();

                System.out.println();

                if (option == 1){
                    System.out.println("You choose type ==>> DELUXE <<=="); 
                    System.out.println();
                    System.out.println("Price List Type Deluxe Room : ");
                    System.out.println("1. IDR 500.000 for one day");
                    System.out.println("2. IDR 1.000.000 for two day");
                    System.out.println("3. Discount 15% for three day");
                    System.out.println("4. Discount 15% for four day");
                    System.out.println("5. Discount 20% for five days or more");
                }
                    else{
                    System.out.println("You choose type ==>> EXECUTIVE <<==");
                    System.out.println();
                    System.out.println("Price List Type Executive Room : ");
                    System.out.println("1. IDR 500.000 for one day");
                    System.out.println("2. IDR 1.000.000 for two day");
                    System.out.println("3. Discount 20% for three day");
                    System.out.println("4. Discount 20% for four day");
                    System.out.println("5. Discount 30% for five days or more");
                    }
 
                System.out.println();
                
                System.out.println("How many days do you want to stay : ");
                typeRoom = input.nextDouble();

                if (typeRoom == 1){
                    System.out.println("Hargany");
                }
 
            }
        }
    }
        
 }
