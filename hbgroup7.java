import java.util.Scanner;
/**
 * hbgroup7
 */
public class hbgroup7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String typeRoom;
        //String choose;
        //boolean deluxe;
        //boolean executive;
        //int price;
        //double disc15=0.15;
        //double disc20=0.2;
        //double disc30=0.3;

        System.out.println("==================================================");
        System.out.println("            Welcome to Berchandya Hotel           ");
        System.out.println("           Online Hotel Room Reservation          ");
        System.out.println("==================================================");
        System.out.println("Type room hotel : ");
        System.out.println("1. Type Deluxe ");
        System.out.println("2. Type Executive ");
        System.out.println("==================================================");

        System.out.print("Choose type of room : ");// pemilihan tipe kamar
        typeRoom = input.next();

        if (typeRoom == "1") {// if then else pemilihan tipe kamar
            System.out.println("\n You choose type DELUXE");
        } else {
            System.out.println("\n You choose type EXECUTIVE");
        }
        System.out.println("==================================================");

        if (typeRoom == "1") {
            System.out.println("Price List Type Deluxe Room : ");
            System.out.println("1. IDR 500.000 for one day");
            System.out.println("2. IDR 1.000.000 for two day");
            System.out.println("3. Discount 15% for three day");
            System.out.println("4. Discount 15% for four day");
            System.out.println("5. Discount 20% for five days or more");
        } else {
            System.out.println("Price List Type Executive Room : ");
            System.out.println("1. IDR 500.000 for one day");
            System.out.println("2. IDR 1.000.000 for two day");
            System.out.println("3. Discount 20% for three day");
            System.out.println("4. Discount 20% for four day");
            System.out.println("5. Discount 30% for five days or more");
        }
        System.out.println("==================================================");

        System.out.println("How many days do you want to stay : ");
        System.out.println("1. One day");
        System.out.println("2. Two day");
        System.out.println("3. Three day");
        System.out.println("4. Four day");
        System.out.println("5. Five days or more");

        System.out.println("==================================================");
    }
}