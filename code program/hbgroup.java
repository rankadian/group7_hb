import java.util.Scanner;

/**
 * hbgroup7
 */
public class hbgroup7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name, next, input;
        int age;

        String[][] standard = new String[10][10];
        String[][] superior = new String[10][10];
        String[][] deluxe = new String[10][10];
        String[][] single = new String[10][10];
        String[][] twin = new String[10][10];
        String[][] doubleRoom = new String[10][10];
        String[][] family = new String[10][10];
        String[][] juniorSuite = new String[10][10];
        String[][] suite = new String[10][10];
        String[][] presidentialSuite = new String[10][10];
        String[][] connecting = new String[10][10];
        String[][] disabled = new String[10][10];
        String[][] smoking = new String[10][10];

        System.out.println("================================================");
        System.out.println("                      WELCOME                   ");
        System.out.println("                  TO DEXTER HOTEL               ");
        System.out.println("================================================");

        while (true) {
            System.out.println("------------------------------------------------");
            System.out.println("Menu : ");
            System.out.println("1. Input personal data");
            System.out.println("2. Shows room type description");
            System.out.println("3. Select your room");
            System.out.println("4. Add additional facilities");
            System.out.println("5. Payment methods");
            System.out.println("6. Exit");
            

            System.out.print("Choice a menu (1/2/3/4/5) : ");
            int menuChoice = sc.nextInt();
            sc.nextLine();
            System.out.println("------------------------------------------------");

            switch (menuChoice) {
                case 1:
                    System.out.print("Enter your name              :");
                    name = sc.nextLine();
                    System.out.print("Enter your age               :");
                    age = sc.nextInt();
                    System.out.print("Enter your number telephone  :");
                    int numTelephone = sc.nextInt();
                    System.out.print("Enter your gmail             :");
                    input = sc.nextLine();
                    sc.nextLine();
                    System.out.println("------------------------------------------------");
                    break;

                case 2:
                    System.out.println("What type of room would you like to know : ");
                    System.out.println("1. Type Standard Room");
                    System.out.println("2. Type Superior Room");
                    System.out.println("3. Type Deluxe Room");
                    System.out.println("4. Type Single Room");
                    System.out.println("5. Type Twin Room");
                    System.out.println("6. Type Double Room");
                    System.out.println("7. Type Family Room");
                    System.out.println("8. Type Junior Suite Room");
                    System.out.println("9. Type Suite Room");
                    System.out.println("10. Type Presidential Suite");
                    System.out.println("11. Type Connecting Room");
                    System.out.println("12. Type Disabled Room");
                    System.out.println("13. Type Smoking Room");

                    System.out.print("Choice a type of room (1/2/3/4/5/6/7/8/9/10/11/12/13) : ");
                    int menuTypeRoom = sc.nextInt();
                    System.out.println("------------------------------------------------");

                    switch (menuTypeRoom) {
                        case 1:
                            System.out.println(
                                    "As the name suggests, Standard Rooms are the lowest room class and only have limited facilities, such as a bed, air conditioning, TV, toiletries, and drinking water. The size of the mattress provided by the Standard Room usually varies. Some provide single bed, queen size, or even king size mattresses.");
                                    System.out.println("------------------------------------------------");
                            break;
                        case 2:
                            System.out.println(
                                    "Superior Rooms offer a larger room size than Standard Rooms. In terms of facilities, services and amenities, Superior Rooms are almost the same as Standard Rooms. In this type, visitors will be given the option: whether to choose a twin bed or double bed size mattress. Twin beds are 2 single bed size mattresses, while double beds are 1 queen size or king size mattress.");
                            System.out.println("------------------------------------------------");
                            break;                     
                        case 3:
                            System.out.println(
                                    "A Deluxe Room is a type of room that has more size and facilities than a Superior Room. Deluxe Rooms provide almost the same facilities as Superior Rooms. Some hotels even provide mini fridge facilities for Deluxe Room residents. For bed size, visitors can choose between twin beds or double beds.");
                            System.out.println("------------------------------------------------");
                            break;
                        case 4:
                            System.out.println(
                                    "You could say that a Single Room is almost the same as a Standard Room, as both have a low rental price. In addition, some also refer to Single Rooms as Studio Rooms, which is a type of room that consists of one bed and several types of equipment that can add to the functionality of the room such as tables and chairs for decoration.");
                            System.out.println("------------------------------------------------");
                            break;
                        case 5:
                            System.out.println(
                                    "Twin Room can be the best choice for those of you who want to get a separate bed. The mattress size commonly used for Twin Rooms is a single bed. Although the placement of the mattress is made spaced apart. This room type is perfect for those of you who are on vacation with two siblings / friends. Regarding facilities, each hotel provides different services. What is clear is that this room will provide standard stay facilities such as TV, air conditioning, toiletries, and free drinking water.");
                            System.out.println("------------------------------------------------");
                            break;
                        case 6:
                            System.out.println(
                                    "Double Room is a type of hotel room that provides one double bed or can be used by two people at once. This type of mattress is perfect for couples who want to stay together or staycation. Double Room itself is further divided into two variations, there are Queen Double Room and King Double Room. Queen Double Room uses a mattress size of 200 cm x 160 cm or known as mattress number 2, while King Double Room uses mattress number 1 or size 200 cm x 180 cm.");
                            System.out.println("------------------------------------------------");
                            break;
                        case 7:
                            System.out.println(
                                    "Besides being known as a Family Room, this type is also known as a Triple Room. This is because it uses three single beds. However, there are also hotels that use a king-size double bed plus one single bed for the Family Room.");
                            System.out.println("------------------------------------------------");
                            break;
                        case 8:
                            System.out.println(
                                    "Looking for a more luxurious stay? You can book a Junior Suite Room. Unlike the previous rooms, the Junior Suite Room has a larger room size, which can reach 50 square meters for one room. In addition, there is also a small living room with comfortable seating or sofa so it is very suitable for relaxing. While in the bathroom area you are provided with a bathtub for soaking.");
                            System.out.println("------------------------------------------------");
                            break;
                        case 9:
                            System.out.println(
                                    "Suite Room is the room type above Junior Suite Room. The size of a Suite Room can reach up to 80 square meters with facilities that are no less luxurious than a Junior Suite Room. You can even find a mini pantry or private kitchen like an apartment room.");
                            System.out.println("------------------------------------------------");
                            break;
                        case 10:
                            System.out.println(
                                    "The facilities provided include a spacious separate living room, dining room, and more than one bedroom. The interior is also made in such a way as to create an elegant and luxurious impression. Anyway, the comfort of staying in the Presidential Suite will not be found in any other room type.");
                            System.out.println("------------------------------------------------");
                            break;
                        case 11:
                            System.out.println(
                                    "Connecting Rooms can be an option for those of you who stay with a group, but still want to be connected without losing privacy. The Connecting Room itself is two rooms that are next to each other and there is a door that connects the rooms. With this connecting door facility, you no longer need to knock on the door of the next room if you want to visit each other.");
                            System.out.println("------------------------------------------------");
                            break;
                        case 12:
                            System.out.println(
                                    "Disabled Room or Accessible Room is a type of hotel room provided specifically for guests with disabilities. In addition, the presence of this room is expected to prevent these guests from discrimination when staying at the hotel.");
                            System.out.println("------------------------------------------------");
                            break;
                        case 13:
                            System.out.println(
                                    "The Smoking Room is a hotel room reserved for guests who actively smoke. Different from other rooms, here visitors can smoke freely in the room and are expected not to smoke anywhere.");
                            System.out.println("------------------------------------------------");
                        default:
                            System.out.println("The type you selected is not available, please try again!!!!!");
                            System.out.println("------------------------------------------------");
                            break;
                    }
                case 3:
                    break;

                case 4:
                System.out.println("---Add additional facilities---");
                System.out.println("1. Extra mattress");
                System.out.println("2. Extra pillow");
                System.out.println("3. Special events");
                System.out.println("4. Baby cot");
                System.out.println("5. Food or Beverage Packages");

                System.out.print("Choice a add additional facilities (1/2/3/4/5): ");
                int addfas = sc.nextInt();
                System.out.println("---------------------------------------");
                
                switch (addfas) {
                    case 1:
                        System.out.println("> Extra Matter surcharge 50k");
                        break;
                    case 2:
                        System.out.println("> Extra pillow surcharge 10k");
                        break;
                    case 3:
                        System.out.println("> Special event surcharge 100k");
                        break;
                    case 4: 
                        System.out.println("> Baby cot");
                        break;
                    case 5:
                        System.out.println("> Foood or Beverage Packges 50k");
                        break;
                    default:
                        System.out.println("The type you selected is not available, please try again!!!!!");
                        System.out.println("--------------------------");
                        break;
                }
                    break;

                case 5:
                    break;

                case 6:
                    System.out.println("================================================");
                    System.out.println("                 !!!THANK YOU!!!                ");
                    System.out.println("                 FOR YOUR COMING                ");
                    System.out.println("                 HAVE A NICE DAY                ");
                    System.out.println("================================================");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid data menu choice!!!!!");
                    System.out.println("------------------------------------------------");
            }

            System.out.print("Do you want to go back to the main menu? (y/n) : ");
            next = sc.next();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}