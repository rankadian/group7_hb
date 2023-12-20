import java.util.Scanner;
public class newnada3 {

    public static void main(String[] args) {
        Scanner hotel = new Scanner(System.in);

        String[] fasilities = {"Type Room", "Extra Mattress", "Extra Pillow", "Special Event", "Baby Cot", "Food or Beverage Packages"};
        String[] review = {"Normal", "Good Service", "Amazing!", "The Hotel is Good", "Complete Facilities"};
        
        // display hotel information
        System.out.println("Hotel Name: " + "DEXTER HOTEL");
        System.out.println("Rating Hotel: " + "4.9");
        System.out.println("Fasilities: ");
        for (String fasility : fasilities) {
            System.out.println("- " + fasility);
        }
        System.out.println("Customer Review: ");
        for (String reviewItem : review) {
            System.out.println(reviewItem);
        } 
        System.out.println("===================================================");
        // hotel rating options for customers
        System.out.println("Hotel rating options.");
        System.out.println("1 (very bad)");
        System.out.println("2 (bad)");
        System.out.println("3 (not bad)");
        System.out.println("4 (good)");
        System.out.println("5 (very good)");
        System.out.print("Enter hotel rating: ");
        // int hotelRating = hotel.nextInt();
        hotel.nextLine();

        System.out.println("===================================================");
        // addition of reviews for customers
        System.out.print("Want To Add A Review? " + "(y/n): ");
        String addReview = hotel.nextLine();
        
            if (addReview.equals("y")) {
                System.out.print("Enter your additional review: ");
                addReview = hotel.nextLine();

                System.out.println("Your review has been successfully added!");
                System.out.println("Thank You!!");
                System.out.println("Goodbye.");
            } else {
                System.out.println("No additional reviews.");
                System.out.println("Thank You!!");
                System.out.println("Goodbye.");
            }
            hotel.close();
        }
    }

