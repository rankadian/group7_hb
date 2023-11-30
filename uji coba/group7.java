import java.util.Scanner;
public class group7 {

    // static String[] username = new String[10];
    // static String[] password = new String[10];
    // static int count = 0;

    // static void register(Scanner sc){
    //     if (count >= 10) {
    //         System.out.println("User registration is not available. Please try again later!!!!!");
    //         return;
    //     }

    //     System.out.println("Enter username : ");
    //     String username = sc.next();
        
    //     System.out.println("Enter password : ");
    //     String password = sc.next();

    //     username[count] = user;
    //     password[count] = pass;
    //     count++;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // login
        String[] usernames = {"user1", "user2", "user3"};
        String[] passwords = {"password1", "password2", "password3"};
        boolean loggedIn = false;

        // login and sign up
        // boolean isExit = false;
        // int option = 0;

        String next;
        int menuChoice;
        int menuTypeRoom;

        // data user/customer
        String name = "";
        int age = 0;
        String gmail = "";
        String numTelephone = "";
        int people = 0;
        String checkIn = "";
        
        // select type room
        int chooseTypeRoom = 0;
        int stay = 0;
        int numberRoom;

        // number of room
        int [] standard = {200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210};
        int [] superior = {300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 310};
        int [] deluxe = {400, 401, 402, 403, 404, 405, 406, 407, 408, 409, 410};
        int [] single = {211, 212, 213, 214, 215, 216, 217, 218, 219, 220};
        int [] twin = {311, 312, 313, 314, 315, 316, 317, 318, 319, 320};
        int [] doubled = {411, 412, 413, 414, 415, 416, 417, 418, 419, 420};
        int [] family = {500, 501, 502, 503, 504, 505, 506, 507, 508, 509, 510};
        int [] junior = {511, 512, 513, 514, 515};
        int [] suite = {601, 602, 603, 604, 605};
        int [] presidential = {701, 702, 703};
        int [] connecting = {221, 222, 223, 224, 225, 321, 322, 323, 324, 325};
        int [] disabled = {421, 422, 223, 424, 425, 426, 427, 428, 429, 430};
        int [] smoking = {226, 227, 228, 229, 230, 326, 327, 328, 329, 330};

        // additional facilities
        int addFacilities = 0;

        // while (!isExit) {
        //     System.out.println("1. Register");
        //     System.out.println("2. Login");
        //     System.out.println("3. Exit");
        //     System.out.print("Input your chooice : ");
        //     option = sc.nextInt();

        //     switch (option) {
        //         case 1:
        //             register(scanner);
        //             break;
                
        //         case 2:
        //             login(scanner);
        //             break;

        //         case 3:
        //             isExit = true;
        //             break;

        //         default:
        //             System.out.println("Invalid option!!!!!");
        //             break;
        //     }
        // }

        while (!loggedIn) {
            System.out.println("================================================");
            System.out.print("Enter username: ");
            String username = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();
            System.out.println("================================================");

            for (int i = 0; i < usernames.length; i++) {
                if (username.equals(usernames[i]) && password.equals(passwords[i])) {
                    loggedIn = true;
                    System.out.println("Login successful!");
                    break;
                }
            }

            if (!loggedIn) {
                System.out.println("Incorrect username or password. Please try again!");
            }
        }

        System.out.println("================================================");
        System.out.println("                      WELCOME                   ");
        System.out.println("                  TO DEXTER HOTEL               ");
        System.out.println("================================================");

        while (true) {
            System.out.println("Menu : ");
            System.out.println("1. Input personal data");
            System.out.println("2. Shows room type description");
            System.out.println("3. Select your room");
            System.out.println("4. Add additional facilities");
            System.out.println("5. Payment methods");
            System.out.println("6. Exit");

            System.out.print("Choice a menu (1/2/3/4/5) : ");
            menuChoice = sc.nextInt();
            sc.nextLine();
            System.out.println("================================================");
            switch (menuChoice) {
                case 1:
                    System.out.print("Enter your name               : ");
                    name = sc.nextLine();
                    System.out.print("Enter your age                : ");
                    age = sc.nextInt();
                    System.out.print("Enter your number telephone   : ");
                    numTelephone = sc.next();
                    System.out.print("Enter your gmail              : ");
                    gmail = sc.next();
                    System.out.print("For how many people           : ");
                    people = sc.nextInt();
                    System.out.print("When will you check in        : ");
                    checkIn = sc.next();
                    sc.nextLine();
                    System.out.println("================================================");
                    break;

                case 2:
                    System.out.println("What type of room would you like to know : ");
                    System.out.println("1. Type Standard Room");// 1 people
                    System.out.println("2. Type Superior Room");// 1-2 people
                    System.out.println("3. Type Deluxe Room");// 1-2 people
                    System.out.println("4. Type Single Room");// 1 people
                    System.out.println("5. Type Twin Room");// 1-2 people
                    System.out.println("6. Type Double Room");// 1-2 people
                    System.out.println("7. Type Family Room");// 1-3 people
                    System.out.println("8. Type Junior Suite Room");// 2-4 people
                    System.out.println("9. Type Suite Room");// 2-4 people
                    System.out.println("10. Type Presidential Suite");// 2-4 people
                    System.out.println("11. Type Connecting Room");// 3-6 people
                    System.out.println("12. Type Disabled Room");// 1-2 people
                    System.out.println("13. Type Smoking Room");// 1-2 people

                    System.out.print("Select the room type you want to know  : ");
                    menuTypeRoom = sc.nextInt();
                    System.out.println("================================================");

                    switch (menuTypeRoom) {
                        case 1:
                            System.out.println(
                                    "As the name suggests, Standard Rooms are the lowest room class and only have limited facilities, such as a bed, air conditioning, TV, toiletries, and drinking water. The size of the mattress provided by the Standard Room usually varies. Some provide single bed, queen size, or even king size mattresses.");
                            System.out.println("================================================");
                            break;
                        case 2:
                            System.out.println(
                                    "Superior Rooms offer a larger room size than Standard Rooms. In terms of facilities, services and amenities, Superior Rooms are almost the same as Standard Rooms. In this type, visitors will be given the option: whether to choose a twin bed or double bed size mattress. Twin beds are 2 single bed size mattresses, while double beds are 1 queen size or king size mattress.");
                            System.out.println("================================================");
                            break;
                        case 3:
                            System.out.println(
                                    "A Deluxe Room is a type of room that has more size and facilities than a Superior Room. Deluxe Rooms provide almost the same facilities as Superior Rooms. Some hotels even provide mini fridge facilities for Deluxe Room residents. For bed size, visitors can choose between twin beds or double beds.");
                            System.out.println("================================================");
                            break;
                        case 4:
                            System.out.println(
                                    "You could say that a Single Room is almost the same as a Standard Room, as both have a low rental price. In addition, some also refer to Single Rooms as Studio Rooms, which is a type of room that consists of one bed and several types of equipment that can add to the functionality of the room such as tables and chairs for decoration.");
                            System.out.println("================================================");
                            break;
                        case 5:
                            System.out.println(
                                    "Twin Room can be the best choice for those of you who want to get a separate bed. The mattress size commonly used for Twin Rooms is a single bed. Although the placement of the mattress is made spaced apart. This room type is perfect for those of you who are on vacation with two siblings / friends. Regarding facilities, each hotel provides different services. What is clear is that this room will provide standard stay facilities such as TV, air conditioning, toiletries, and free drinking water.");
                            System.out.println("================================================");
                            break;
                        case 6:
                            System.out.println(
                                    "Double Room is a type of hotel room that provides one double bed or can be used by two people at once. This type of mattress is perfect for couples who want to stay together or staycation. Double Room itself is further divided into two variations, there are Queen Double Room and King Double Room. Queen Double Room uses a mattress size of 200 cm x 160 cm or known as mattress number 2, while King Double Room uses mattress number 1 or size 200 cm x 180 cm.");
                            System.out.println("================================================");
                            break;
                        case 7:
                            System.out.println(
                                    "Besides being known as a Family Room, this type is also known as a Triple Room. This is because it uses three single beds. However, there are also hotels that use a king-size double bed plus one single bed for the Family Room.");
                            System.out.println("================================================");
                            break;
                        case 8:
                            System.out.println(
                                    "Looking for a more luxurious stay? You can book a Junior Suite Room. Unlike the previous rooms, the Junior Suite Room has a larger room size, which can reach 50 square meters for one room. In addition, there is also a small living room with comfortable seating or sofa so it is very suitable for relaxing. While in the bathroom area you are provided with a bathtub for soaking.");
                            System.out.println("================================================");
                            break;
                        case 9:
                            System.out.println(
                                    "Suite Room is the room type above Junior Suite Room. The size of a Suite Room can reach up to 80 square meters with facilities that are no less luxurious than a Junior Suite Room. You can even find a mini pantry or private kitchen like an apartment room.");
                            System.out.println("================================================");
                            break;
                        case 10:
                            System.out.println(
                                    "The facilities provided include a spacious separate living room, dining room, and more than one bedroom. The interior is also made in such a way as to create an elegant and luxurious impression. Anyway, the comfort of staying in the Presidential Suite will not be found in any other room type.");
                            System.out.println("================================================");
                            break;
                        case 11:
                            System.out.println(
                                    "Connecting Rooms can be an option for those of you who stay with a group, but still want to be connected without losing privacy. The Connecting Room itself is two rooms that are next to each other and there is a door that connects the rooms. With this connecting door facility, you no longer need to knock on the door of the next room if you want to visit each other.");
                            System.out.println("================================================");
                            break;
                        case 12:
                            System.out.println(
                                    "Disabled Room or Accessible Room is a type of hotel room provided specifically for guests with disabilities. In addition, the presence of this room is expected to prevent these guests from discrimination when staying at the hotel.");
                            System.out.println("================================================");
                            break;
                        case 13:
                            System.out.println(
                                    "The Smoking Room is a hotel room reserved for guests who actively smoke. Different from other rooms, here visitors can smoke freely in the room and are expected not to smoke anywhere.");
                            System.out.println("================================================");
                            break;
                        default:
                            System.out.println("The type you selected is not available, please try again!!!!!");
                            System.out.println("================================================");
                            break;
                        }
                        break;

                case 3:
                    System.out.println("Which room type would you like to book ? ");
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
                    
                    System.out.print("Choose the room type you wish to book : ");
                    chooseTypeRoom = sc.nextInt();
                    System.out.print("How long would you like to stay : ");
                    stay = sc.nextInt();
                    System.out.println("================================================");

                    switch (chooseTypeRoom) {
                        case 1:
                            System.out.println("1. Type Standard Room (200 - 210)");
                            System.out.print("Select the room number you wish to book : ");
                            numberRoom = sc.nextInt();
                            System.out.println("================================================");
                            if (numberRoom == 200) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 201) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 202) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 203) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 204) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 205) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 206) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 207) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 208) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 209) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 210) {
                                System.out.println("The room number you selected is available");
                            } else {
                                System.out.println("The room number you selected is invalid");
                            }
                            break;

                        case 2:
                            System.out.println("2. Type Superior Room (300 - 310)");
                            System.out.print("Select the room number you wish to book : ");
                            numberRoom = sc.nextInt();
                            System.out.println("================================================");
                            if (numberRoom == 300) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 301) {
                             System.out.println("The room number you selected is available");
                            } else if (numberRoom == 302) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 303) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 304) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 305) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 306) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 307) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 308) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 309) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 310) {
                                System.out.println("The room number you selected is available");
                            } else {
                                System.out.println("The room number you selected is invalid");
                            }
                            break;

                        case 3:
                            System.out.println("3. Type Deluxe Room (400 - 410)");
                            System.out.print("Select the room number you wish to book : ");
                            numberRoom = sc.nextInt();
                            System.out.println("================================================");
                            if (numberRoom == 400) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 401) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 402) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 403) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 404) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 405) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 406) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 407) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 408) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 409) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 410) {
                                System.out.println("The room number you selected is available");
                            } else {
                                System.out.println("The room number you selected is invalid");
                            }
                            break;

                            case 4:
                            System.out.println("4. Type Single Room (211 - 220)");
                            System.out.print("Select the room number you wish to book : ");
                            numberRoom = sc.nextInt();
                            System.out.println("================================================");
                            if (numberRoom == 211) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 212) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 213) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 214) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 215) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 216) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 217) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 218) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 219) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 220) {
                                System.out.println("The room number you selected is available");
                            } else {
                                System.out.println("The room number you selected is invalid");
                            }
                            break;

                        case 5:
                            System.out.println("5. Type Twin Room (311 - 320)");
                            System.out.print("Select the room number you wish to book : ");
                            numberRoom = sc.nextInt();
                            System.out.println("================================================");
                            if (numberRoom == 311) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 312) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 313) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 314) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 315) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 316) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 317) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 318) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 319) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 320) {
                                System.out.println("The room number you selected is available");
                            } else {
                                System.out.println("The room number you selected is invalid");
                            }
                            break;

                        case 6:
                            System.out.println("6. Type Double Room (411 - 420)");
                            System.out.print("Select the room number you wish to book : ");
                            numberRoom = sc.nextInt();
                            System.out.println("================================================");
                            if (numberRoom == 411) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 412) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 413) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 414) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 415) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 416) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 417) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 418) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 419) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 420) {
                                System.out.println("The room number you selected is available");
                            } else {
                                System.out.println("The room number you selected is invalid");
                            }
                            break;

                        case 7:
                            System.out.println("7. Type Family Room (500 - 510)");
                            System.out.print("Select the room number you wish to book : ");
                            numberRoom = sc.nextInt();
                            System.out.println("================================================");
                            if (numberRoom == 500) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 501) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 502) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 503) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 504) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 505) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 506) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 507) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 508) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 509) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 510) {
                                System.out.println("The room number you selected is available");
                            } else {
                                System.out.println("The room number you selected is invalid");
                            }
                            break;

                        case 8:
                            System.out.println("8. Type Junior Suite Room (511 - 515)");
                            System.out.print("Select the room number you wish to book : ");
                            numberRoom = sc.nextInt();
                            System.out.println("================================================");
                            if (numberRoom == 511) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 512) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 513) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 514) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 515) {
                                System.out.println("The room number you selected is available");
                            } else {
                                System.out.println("The room number you selected is invalid");
                            }
                            break;

                        case 9:
                            System.out.println("9. Type Suite Room (601 - 605)");
                            System.out.print("Select the room number you wish to book : ");
                            numberRoom = sc.nextInt();
                            System.out.println("================================================");
                            if (numberRoom == 601) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 602) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 603) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 604) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 605) {
                                System.out.println("The room number you selected is available");
                            } else {
                                System.out.println("The room number you selected is invalid");
                            }
                            break;

                        case 10:
                            System.out.println("10. Type Presidential Suite (701 - 703)");
                            System.out.print("Select the room number you wish to book : ");
                            numberRoom = sc.nextInt();
                            System.out.println("================================================");
                            if (numberRoom == 701) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 702) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 703) {
                                System.out.println("The room number you selected is available");
                            } else {
                                System.out.println("The room number you selected is invalid");
                            }
                            break;

                        case 11:
                            System.out.println("11. Type Connecting Room (221-225) & (321 - 325)");
                            System.out.print("Select the room number you wish to book : ");
                            numberRoom = sc.nextInt();
                            System.out.println("================================================");
                            if (numberRoom == 221) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 222) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 223) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 224) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 225) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 321) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 322) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 323) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 324) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 325) {
                                System.out.println("The room number you selected is available");
                            } else {
                                System.out.println("The room number you selected is invalid");
                            }
                            break;

                        case 12:
                            System.out.println("12. Type Disabled Room (421 - 430)");
                            System.out.print("Select the room number you wish to book : ");
                            numberRoom = sc.nextInt();
                            System.out.println("================================================");
                            if (numberRoom == 421) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 422) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 423) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 424) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 425) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 426) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 427) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 428) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 429) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 430) {
                                System.out.println("The room number you selected is available");
                            } else {
                                System.out.println("The room number you selected is invalid");
                            }
                            break;

                        case 13:
                            System.out.println("13. Type Smoking Room (226 - 230) & (326 - 330)");
                            System.out.print("Select the room number you wish to book : ");
                            numberRoom = sc.nextInt();
                            System.out.println("================================================");
                            if (numberRoom == 226) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 227) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 228) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 229) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 230) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 326) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 327) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 328) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 329) {
                                System.out.println("The room number you selected is available");
                            } else if (numberRoom == 330) {
                                System.out.println("The room number you selected is available");
                            } else {
                            System.out.println("The room number you selected is invalid");
                            }
                            break;

                        default:
                            System.out.println("The room type you selected is invalid!!!!!");
                            System.out.println("================================================");
                            break;
                    }
                    // System.out.println("Number of room types : ");
                    // System.out.println("1. Type Standard Room (200 - 210)");
                    // System.out.println("2. Type Superior Room (300 - 310)");
                    // System.out.println("3. Type Deluxe Room (400 - 410)");
                    // System.out.println("4. Type Single Room (211 - 220)");
                    // System.out.println("5. Type Twin Room (311 - 320)");
                    // System.out.println("6. Type Double Room (411 - 420)");
                    // System.out.println("7. Type Family Room (500 - 510)");
                    // System.out.println("8. Type Junior Suite Room (511 - 515)");
                    // System.out.println("9. Type Suite Room (601 - 605)");
                    // System.out.println("10. Type Presidential Suite (701 - 703)");
                    // System.out.println("11. Type Connecting Room (221-225) & (321 - 325)");
                    // System.out.println("12. Type Disabled Room (421 - 430)");
                    // System.out.println("13. Type Smoking Room (226 - 230) & (326 - 330)");

                    // System.out.print("Select the room number you wish to book : ");
                    // numberRoom = sc.nextInt();
                    // if (chooseTypeRoom == 1) {
                    //     if (numberRoom == 200) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 201) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 202) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 203) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 204) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 205) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 206) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 207) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 208) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 209) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 210) {
                    //         System.out.println("The room number you selected is available");
                    //     } else {
                    //         System.out.println("The room number you selected is invalid");
                    //     }
                    // } else if (chooseTypeRoom == 2) {
                    //     if (numberRoom == 300) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 301) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 302) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 303) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 304) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 305) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 306) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 307) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 308) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 309) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 310) {
                    //         System.out.println("The room number you selected is available");
                    //     } else {
                    //         System.out.println("The room number you selected is invalid");
                    //     }
                    // } else if (chooseTypeRoom == 3) {
                    //     if (numberRoom == 400) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 401) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 402) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 403) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 404) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 405) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 406) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 407) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 408) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 409) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 410) {
                    //         System.out.println("The room number you selected is available");
                    //     } else {
                    //         System.out.println("The room number you selected is invalid");
                    //     }
                    // } else if (chooseTypeRoom == 4) {
                    //     if (numberRoom == 211) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 212) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 213) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 214) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 215) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 216) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 217) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 218) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 219) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 220) {
                    //         System.out.println("The room number you selected is available");
                    //     } else {
                    //         System.out.println("The room number you selected is invalid");
                    //     }
                    // } else if (chooseTypeRoom == 5) {
                    //     if (numberRoom == 311) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 312) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 313) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 314) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 315) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 316) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 317) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 318) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 319) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 320) {
                    //         System.out.println("The room number you selected is available");
                    //     } else {
                    //         System.out.println("The room number you selected is invalid");
                    //     }
                    // } else if (chooseTypeRoom == 6) {
                    //     if (numberRoom == 411) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 412) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 413) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 414) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 415) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 416) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 417) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 418) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 419) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 420) {
                    //         System.out.println("The room number you selected is available");
                    //     } else {
                    //         System.out.println("The room number you selected is invalid");
                    //     }
                    // } else if (chooseTypeRoom == 7) {
                    //     if (numberRoom == 500) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 501) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 502) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 503) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 504) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 505) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 506) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 507) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 508) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 509) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 510) {
                    //         System.out.println("The room number you selected is available");
                    //     } else {
                    //         System.out.println("The room number you selected is invalid");
                    //     }
                    // } else if (chooseTypeRoom == 8) {
                    //     if (numberRoom == 511) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 512) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 513) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 514) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 515) {
                    //         System.out.println("The room number you selected is available");
                    //     } else {
                    //         System.out.println("The room number you selected is invalid");
                    //     }
                    // } else if (chooseTypeRoom == 9) {
                    //     if (numberRoom == 601) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 602) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 603) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 604) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 605) {
                    //         System.out.println("The room number you selected is available");
                    //     } else {
                    //         System.out.println("The room number you selected is invalid");
                    //     }
                    // } else if (chooseTypeRoom == 10) {
                    //     if (numberRoom == 701) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 702) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 703) {
                    //         System.out.println("The room number you selected is available");
                    //     } else {
                    //         System.out.println("The room number you selected is invalid");
                    //     }
                    // } else if (chooseTypeRoom == 11) {
                    //     if (numberRoom == 221) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 222) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 223) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 224) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 225) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 321) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 322) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 323) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 324) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 325) {
                    //         System.out.println("The room number you selected is available");
                    //     } else {
                    //         System.out.println("The room number you selected is invalid");
                    //     }
                    // } else if (chooseTypeRoom == 12) {
                    //     if (numberRoom == 421) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 422) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 423) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 424) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 425) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 426) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 427) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 428) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 429) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 430) {
                    //         System.out.println("The room number you selected is available");
                    //     } else {
                    //         System.out.println("The room number you selected is invalid");
                    //     }
                        
                    // } else if (chooseTypeRoom == 13) {
                    //     if (numberRoom == 226) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 227) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 228) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 229) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 230) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 326) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 327) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 328) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 329) {
                    //         System.out.println("The room number you selected is available");
                    //     } else if (numberRoom == 330) {
                    //         System.out.println("The room number you selected is available");
                    //     } else {
                    //         System.out.println("The room number you selected is invalid");
                    //     }
                    // } else {
                    //     System.out.println("The room type you selected is invalid!!!!!");
                    // }
                    System.out.println("================================================");
                    break;

                case 4:
                    System.out.println("---Add additional facilities---");
                    System.out.println("1. Extra mattress");
                    System.out.println("2. Extra pillow");
                    System.out.println("3. Special event");
                    System.out.println("4. Baby cot");
                    System.out.println("5. Food or Beverage Packages");
                    System.out.println("6. None add facilities");

                    System.out.print("Select the additional facilities you wish to book  ");
                    addFacilities = sc.nextInt();

                    switch (addFacilities) {
                        case 1:
                            System.out.println("Add extra mattress");
                            break;

                         case 2:
                            System.out.println("Add extra pillow");
                            break;

                        case 3:
                            System.out.println("Add special event");
                            break;

                        case 4:
                            System.out.println("Add baby cot");
                            break;
                            
                        case 5:
                            System.out.println("Add food or beverage packages");
                            break;

                        case 6:
                            System.out.println("None add additional facilities");
                            break;

                        default:
                        System.out.println("Your chooice invalid!!!!!");
                            break;
                    }
                    System.out.println("================================================");


                case 6:
                    System.out.println("================================================");
                    System.out.println("                 !!!THANK YOU!!!                ");
                    System.out.println("                 FOR YOUR COMING                ");
                    System.out.println("                 HAVE A NICE DAY                ");
                    System.out.println("================================================");
                    System.out.println("       ||Your reservation booking invoice||        ");
                    System.out.println("Name                    : " + name);
                    System.out.println("Age                     : " + age);
                    System.out.println("Telephone               : " + numTelephone);
                    System.out.println("Gmail                   : " + gmail);
                    System.out.println("For                     : " + people + " people");
                    System.out.println("Check-In                : " + checkIn);
                    System.out.println("Room type you choose    : " + chooseTypeRoom);
                    System.out.println("Lenght of your stay     : " + stay);
                    System.out.println("================================================");

                    System.exit(0);
                break;
                default:
                    System.out.println("Invalid data menu choice!!!!!");
                    System.out.println("================================================");
                    break;
            }   
            System.out.print("Would you like to return to the main menu to continue the reservation process? (y/n) : ");
            next = sc.next();
            System.out.println("================================================");
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
        sc.close();   
    }
}