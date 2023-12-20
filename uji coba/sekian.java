import java.util.Scanner;
public class sekian {

    static String[] username = new String[10];
    static String[] password = new String[10];
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //login
        boolean isNext = false;

        //menu option
        //String next;
        int menuChoice;
        int menuTypeRoom;
        boolean exit = false;

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
        int totalroom = 0;
        String nameRoom = null;

        // select add facilities
        int order = 0;
        int totaladdfac = 0;
        int chooseFacilities = 0;
        String namaadd = null;

        //payment
        int choosepayment = 0;
        int total = 0;
        
        // number of room
        String [] standard = {"200", "201", "202", "203", "204", "205", "206", "207", "208", "209", "210"};
        boolean isStandard = false;

        String [] superior = {"300", "301", "302", "303", "304", "305", "306", "307", "308", "309", "310"};
        boolean isSuperior = false;

        String [] deluxe = {"400", "401", "402", "403", "404", "405", "406", "407", "408", "409", "410"};
        boolean isDeluxe = false;

        String [] single = {"211", "212", "213", "214", "215", "216", "217", "218", "219", "220"};
        boolean isSingle = false;

        String [] twin = {"311", "312", "313", "314", "315", "316", "317", "318", "319", "320"};
        boolean isTwin = false;

        String [] doubled = {"411", "412", "413", "414", "415", "416", "417", "418", "419", "420"};
        boolean isDoubled = false;

        String [] family = {"500", "501", "502", "503", "504", "505", "506", "507", "508", "509", "510"};
        boolean isFamily = false;

        String [] junior = {"511", "512", "513", "514", "515"};
        boolean isJunior = false;

        String [] suite = {"601", "602", "603", "604", "605"};
        boolean isSuite = false;

        String [] presidential = {"701", "702", "703"};
        boolean isPresidential = false;

        String [] connecting = {"221", "222", "223", "224", "225", "321", "322", "323", "324", "325"};
        boolean isConnecting = false;

        String [] disabled = {"421", "422", "423", "424", "425", "426", "427", "428", "429", "430"};
        boolean isDisabled =false;

        String [] smoking = {"226", "227", "228", "229", "230", "326", "327", "328", "329", "330"};
        boolean isSmoking = false;

        // tax payment methods
        int taxBRI = 5000;
        int taxBCA = 4500;
        int taxMandiri = 6000;
        int taxBNI = 4000;

        while (!isNext) { // login and register
            System.out.println("================================================");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.println("================================================");
            System.out.print("Enter your chooice : ");
            int option = sc.nextInt();
            System.out.println("================================================");

            switch (option) {
                case 1:
                    register(sc);
                    break;

                case 2:
                    login(sc);
                    isNext = true;
                    break;

                case 3:
                    System.exit(0);

                default:
                    System.out.println("Your chooice invalid!!!!!");
            }
        }

        System.out.println(""); // give spacing area
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("||================================================||"); // opening greetings from the hotel
        System.out.println("||                      WELCOME                   ||");
        System.out.println("||                  TO DEXTER HOTEL               ||");
        System.out.println("||================================================||");

        do {
            System.out.println("                     MENU                       "); // menu option
            System.out.println("");
            System.out.println("1. Input personal data");
            System.out.println("2. Shows room type description");
            System.out.println("3. Select your room");
            System.out.println("4. Add additional facilities");
            System.out.println("5. Payment methods");
            System.out.println("6. Exit");
            System.out.println("");

            System.out.print("Choice a menu : ");
            menuChoice = sc.nextInt();
            sc.nextLine();
            System.out.println("================================================");
            switch (menuChoice) {
                case 1: // enter personal data
                    System.out.println("        ENTER YOUR PERSONAL DATA        ");
                    System.out.println("");
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

                case 2: // information about the room type
                    System.out.println("         INFORMATION ABOUT ROOM TYPE            ");
                    System.out.println("");
                    System.out.println("What type of room would you like to know : ");
                    System.out.println("");
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
                    System.out.println("");

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

                case 3: // select type room and number of room
                    System.out.println("Which room type would you like to book ? ");
                    System.out.println("");
                    System.out.println("1.  Type Standard Room          Rp 350,000");
                    System.out.println("2.  Type Superior Room          Rp 450,000");
                    System.out.println("3.  Type Deluxe Room            Rp 600,000");
                    System.out.println("4.  Type Single Room            Rp 375,000");
                    System.out.println("5.  Type Twin Room              Rp 500,000");
                    System.out.println("6.  Type Double Room            Rp 550,000");
                    System.out.println("7.  Type Family Room            Rp 750,000");
                    System.out.println("8.  Type Junior Room            Rp 1,250,000");
                    System.out.println("9.  Type Suite Room             Rp 1,700,000");
                    System.out.println("10. Type Presidential Room      Rp 3,000,000");
                    System.out.println("11. Type Connecting Room        Rp 650,000");
                    System.out.println("12. Type Disabled Room          Rp 600,000");
                    System.out.println("13. Type Smoking Room           Rp 400,000");
                    System.out.println("");
                    System.out.println("================================================");
                    
                    System.out.print("Choose the room type you wish to book : ");
                    chooseTypeRoom = sc.nextInt();
                    System.out.print("How long would you like to stay       : ");
                    stay = sc.nextInt();
                    System.out.println("================================================");

                    switch (chooseTypeRoom) {
                        case 1:
                            System.out.println("In standard type we have room at 200 until 210");
                            System.out.println("Room list of standard type :");
                            System.out.println("200 - 210");

                            while (!isStandard) {
                                System.out.println("================================================");
                                System.out.print("Enter number of room : ");
                                String standards = sc.next();
                                System.out.println("================================================");

                                for (int i = 0; i < standard.length; i++) {
                                    if (standards.equals(standard[i])) {
                                       isStandard = true;
                                       System.out.println("Room available");
                                       System.out.println("================================================");
                                       break; 
                                    }
                                }

                                if (!isStandard) {
                                    System.out.println("Room not available or your selection is invalid");
                                    System.out.println("              Please try again!                ");
                                }
                            }
                            totalroom = stay * 350000;
                            nameRoom = "Standard room";
                            System.out.println(nameRoom + " " + stay + " Days" + " Price is Rp " + totalroom);
                            break;

                        case 2:
                            System.out.println("In superior type we have room at 300 until 310");
                            System.out.println("Room list of superior type :");
                            System.out.println("300 - 310");

                            while (!isSuperior) {
                                System.out.println("================================================");
                                System.out.print("Enter number of room :");
                                String superiors = sc.next();
                                System.out.println("================================================");

                                for (int i = 0; i < superior.length; i++) {
                                    if (superiors.equals(superior[i])) {
                                        isSuperior = true;
                                        System.out.println("Room available");
                                        System.out.println("================================================");
                                        break;
                                    }
                                }

                                if (!isSuperior) {
                                    System.out.println("Room not available or your selection is invalid");
                                    System.out.println("              Please try again!                "); 
                                }
                            }
                            totalroom = stay * 450000;
                            nameRoom = "Superior room";
                            System.out.println(nameRoom + " " + stay + " Days " + "Price is Rp " + totalroom);
                            break;

                        case 3:
                            System.out.println("In deluxe type we have room at 400 until 410");
                            System.out.println("Room list of deluxe type :");
                            System.out.println("400 - 410");

                            while (!isDeluxe) {
                                System.out.println("================================================");
                                System.out.print("Enter number of room : ");
                                String deluxes = sc.next();
                                System.out.println("================================================");

                                for (int i = 0; i < deluxe.length; i++) {
                                    if (deluxes.equals(deluxe[i])) {
                                        isDeluxe = true;
                                        System.out.println("Room available");
                                        System.out.println("================================================");
                                        break;
                                    }
                                }

                                if (!isDeluxe) {
                                    System.out.println("Room not available or your selection is invalid");
                                    System.out.println("              Please try again!                "); 
                                }
                            }
                            totalroom = stay * 600000;
                            nameRoom = "Deluxe room";
                            System.out.println(nameRoom + " " + stay + " Days " + "Price is  Rp " + totalroom);
                            break;
                                
                        case 4:
                            System.out.println("In single type we have room at 211 until 220");
                            System.out.println("Room list of single type :");
                            System.out.println("211 - 220");

                            while (!isSingle) {
                                System.out.println("================================================");
                                System.out.print("Enter number of room : ");
                                String singles = sc.next();
                                System.out.println("================================================");

                                for (int i = 0; i < single.length; i++) {
                                    if (singles.equals(single[i])) {
                                        isSingle = true;
                                        System.out.println("Room available");
                                        System.out.println("================================================");
                                        break;
                                    }
                                }

                                if (!isSingle) {
                                    System.out.println("Room not available or your selection is invalid");
                                    System.out.println("              Please try again!                "); 
                                }
                            }
                            totalroom = stay * 375000;
                            nameRoom = "Single Room";
                            System.out.println(nameRoom + " " + stay + " Days " + "Price is Rp " + totalroom);
                            break;

                        case 5:
                            System.out.println("In twin type we have room at 311 until 320");
                            System.out.println("Room list of twin type :");
                            System.out.println("311 - 320");

                            while (!isTwin) {
                                System.out.println("================================================");
                                System.out.print("Enter number of room : ");
                                String twins = sc.next();
                                System.out.println("================================================");

                                for (int i = 0; i < twin.length; i++) {
                                    if (twins.equals(twin[i])) {
                                        isTwin = true;
                                        System.out.println("Room available");
                                        System.out.println("================================================");
                                        break;
                                    }
                                }

                                if (!isTwin) {
                                    System.out.println("Room not available or your selection is invalid");
                                    System.out.println("              Please try again!                "); 
                                }
                            }
                            totalroom = stay * 500000;
                            nameRoom = "Twin room";
                            System.out.println(nameRoom + " " + stay + " Days " + "Price is Rp " + totalroom);
                            break;

                        case 6:
                            System.out.println("In double type we have room at 411 until 420");
                            System.out.println("Room list of double type :");
                            System.out.println("411 - 420");

                            while (!isDoubled) {
                                System.out.println("================================================");
                                System.out.print("Enter number of room : ");
                                String doubleds = sc.next();
                                System.out.println("================================================");

                                for (int i = 0; i < doubled.length; i++) {
                                    if (doubleds.equals(doubled[i])) {
                                        isDoubled = true;
                                        System.out.println("Room available");
                                        System.out.println("================================================");
                                        break;
                                    }
                                }

                                if (!isDoubled) {
                                    System.out.println("Room not available or your selection is invalid");
                                    System.out.println("              Please try again!                "); 
                                }
                            }
                            totalroom = stay * 550000;
                            nameRoom = "Doubled room";
                            System.out.println(nameRoom + " " + stay + " Days " + "Price is Rp " + totalroom);
                            break;

                        case 7:
                            System.out.println("In family type we have room at 500 until 510");
                            System.out.println("Room list of family type :");
                            System.out.println("500 - 510");

                            while (!isFamily) {
                                System.out.println("================================================");
                                System.out.print("Enter number of room : ");
                                String familys = sc.next();
                                System.out.println("================================================");

                                for (int i = 0; i < family.length; i++) {
                                    if (familys.equals(family[i])) {
                                        isFamily = true;
                                        System.out.println("Room available");
                                        System.out.println("================================================");
                                        break;
                                    }
                                }

                                if (!isFamily) {
                                    System.out.println("Room not available or your selection is invalid");
                                    System.out.println("              Please try again!                "); 
                                }
                            }
                            totalroom = stay * 750000;
                            nameRoom = "Family room";
                            System.out.println(nameRoom + " " + stay + " Days " + "Price is Rp " + totalroom);
                            break;

                        case 8:
                            System.out.println("In junior type we have room at 511 until 515");
                            System.out.println("Room list of junior type :");
                            System.out.println("511 - 515");

                            while (!isJunior) {
                                System.out.println("================================================");
                                System.out.print("Enter number of room : ");
                                String juniors = sc.next();
                                System.out.println("================================================");

                                for (int i = 0; i < junior.length; i++) {
                                    if (juniors.equals(junior[i])) {
                                        isJunior = true;
                                        System.out.println("Room available");
                                        System.out.println("================================================");
                                        break;
                                    }
                                }

                                if (!isJunior) {
                                    System.out.println("Room not available or your selection is invalid");
                                    System.out.println("              Please try again!                "); 
                                }
                            }
                            totalroom = stay * 1250000;
                            nameRoom = "Junior room";
                            System.out.println(nameRoom + " " + stay + " Days " + "Price is Rp " + totalroom);
                            break;

                        case 9:
                            System.out.println("In suite type we have room at 601 until 605");
                            System.out.println("Room list of junior type :");
                            System.out.println("601 - 605");

                            while (!isSuite) {
                                System.out.println("================================================");
                                System.out.print("Enter number of room : ");
                                String suites = sc.next();
                                System.out.println("================================================");

                                for (int i = 0; i < suite.length; i++) {
                                    if (suites.equals(suite[i])) {
                                        isSuite = true;
                                        System.out.println("Room availabe");
                                        System.out.println("================================================");
                                        break;
                                    }
                                }

                                if (!isSuite) {
                                    System.out.println("Room not available or your selection is invalid");
                                    System.out.println("              Please try again!                "); 
                                }
                            }
                            totalroom = stay * 3000000;
                            nameRoom = "Suite room";
                            System.out.println(nameRoom + " " + stay + " Days " + "Price is Rp " + totalroom);
                            break;

                        case 10:
                            System.out.println("In presidential type we have room at 701 until 703");
                            System.out.println("Room list of presidential type :");
                            System.out.println("701 - 703");

                            while (!isPresidential) {
                                System.out.println("================================================");
                                System.out.print("Enter number of room : ");
                                String presidentials = sc.next();
                                System.out.println("================================================");

                                for (int i = 0; i < presidential.length; i++) {
                                    if (presidentials.equals(presidential[i])) {
                                        isPresidential = true;
                                        System.out.println("Room available");
                                        System.out.println("================================================");
                                        break;
                                    }
                                }

                                if (!isPresidential) {
                                    System.out.println("Room not available or your selection is invalid");
                                    System.out.println("              Please try again!                "); 
                                }
                            }
                            totalroom = stay * 3000000;
                            nameRoom = "Presidential room";
                            System.out.println(nameRoom + " " + stay + " Days " + "Price is Rp " + totalroom);
                            break;

                        case 11:
                            System.out.println("In connecting type we have room at 221 until 225 and 321 until 325");
                            System.out.println("Room list of presidential type :");
                            System.out.println("221 - 225");
                            System.out.println("321 - 325");

                            while (!isConnecting) {
                                System.out.println("================================================");
                                System.out.print("Enter number of room : ");
                                String connectings = sc.next();
                                System.out.println("================================================");

                                for (int i = 0; i < connecting.length; i++) {
                                    if (connectings.equals(connecting[i])) {
                                        isConnecting = true;
                                        System.out.println("Room available");
                                        System.out.println("================================================");
                                        break;
                                    }
                                }

                                if (!isConnecting) {
                                    System.out.println("Room not available or your selection is invalid");
                                    System.out.println("              Please try again!                ");
                                }
                            }
                            totalroom = stay * 650000;
                            nameRoom = "Connected room";
                            System.out.println(nameRoom + " " + stay + " Days " + "Price is Rp " + totalroom);
                            break;

                        case 12:
                            System.out.println("In disabled type we have room at 421 until 430");
                            System.out.println("Room list of disabled type :");
                            System.out.println("421 - 430");

                            while (!isDisabled) {
                                System.out.println("================================================");
                                System.out.print("Enter number of room : ");
                                String disableds = sc.next();
                                System.out.println("================================================");

                                for (int i = 0; i < disabled.length; i++) {
                                    if (disableds.equals(disabled[i])) {
                                        isDisabled = true;
                                        System.out.println("Room available");
                                        System.out.println("================================================");
                                        break;
                                    }
                                }

                                if (!isDisabled) {
                                    System.out.println("Room not available or your selection is invalid");
                                    System.out.println("              Please try again!                ");
                                }
                            }
                            totalroom = stay * 600000;
                            nameRoom = "Disabled room";
                            System.out.println(nameRoom + " " + stay + " Days " + "Price is Rp " + totalroom);
                            break;

                        case 13:
                            System.out.println("In smoking type we have room at 226 until 230 and 326 until 330");
                            System.out.println("Room list of smoking type :");
                            System.out.println("226 - 230");
                            System.out.println("326 - 330");

                            while (!isSmoking) {
                                System.out.println("================================================");
                                System.out.print("Enter number of room : ");
                                String smokings = sc.next();
                                System.out.println("================================================");

                                for (int i = 0; i < smoking.length; i++) {
                                    if (smokings.equals(smoking[i])) {
                                        isSmoking = true;
                                        System.out.println("Room available");
                                        System.out.println("================================================");
                                        break;
                                    }
                                }

                                if (!isSmoking) {
                                    System.out.println("Room not available or your selection is invalid");
                                    System.out.println("              Please try again!                ");
                                }
                            }
                            totalroom = stay * 400000;
                            nameRoom = "Smoking room";
                            System.out.println(nameRoom + " " + stay + " Days " + "Price is Rp " + totalroom);
                            break;
                    
                        default:
                            System.out.println("The room type you selected is invalid!!!!!");
                            System.out.println("================================================");
                            break;
                    }
                    
                    System.out.println("================================================");
                    break;

                case 4: // add additional facilities
                    System.out.println("Add additional facilities");
                    System.out.println("1. Extra mattress               Rp 100,000");
                    System.out.println("2. Extra pillow                 Rp 25,000");
                    System.out.println("3. Special event                Rp 75,000");
                    System.out.println("4. Baby cot                     Rp 30,000");
                    System.out.println("5. Food or Beverage Packages    Rp 60,000");
                    System.out.println("6. None add facilities          Rp 0");

                    System.out.print("Select the additional facilities you wish to book : ");
                    chooseFacilities = sc.nextInt();
                    System.out.println("================================================");
                    System.out.print("How many additional facilities : "); // for booking how long will stay
                    order = sc.nextInt();
                    System.out.println("================================================");

                    switch (chooseFacilities) {
                        case 1:
                            totaladdfac = order * 100000;
                            namaadd = "Extra Mattress";
                            System.out.println(namaadd + " of additions -" + order + " Price is Rp " + totaladdfac);
                            break;

                         case 2:
                            totaladdfac = order * 25000;
                            namaadd = "Extra Pillow";
                            System.out.println(namaadd + " of additions -" + order + " Price is Rp " + totaladdfac);
                            break;

                        case 3:
                            totaladdfac = order * 75000;
                            namaadd = "Special Even";
                            System.out.println(namaadd + " of additions -" + order + " Price is Rp " + totaladdfac);
                            break;

                        case 4:
                           totaladdfac = order * 30000;
                            namaadd = "Baby Coat";
                            System.out.println(namaadd + " of additions -" + order + " Price is Rp " + totaladdfac);
                            break;
                            
                        case 5:
                            totaladdfac = order * 60000;
                            namaadd = "Food or Beverage Packages";
                            System.out.println(namaadd + " of additions -" + order + " Price is Rp " + totaladdfac);
                            break;

                        case 6:
                            System.out.println("None add additional facilities");
                            break;

                        default:
                        System.out.println("Your chooice invalid!!!!!");
                            break;
                    }
                    System.out.println("================================================");
                    break;
            
                case 5: // payment methods
                    System.out.println("Payment methods you can use");
                    System.out.println("METHODS                    TAX");
                    System.out.println("1. BRI                  Rp 5,000");
                    System.out.println("2. BCA                  Rp 4,500");
                    System.out.println("3. MANDIRI              Rp 6,000");
                    System.out.println("4. BNI                  Rp 4,000");
                    System.out.println("5. CASH                 Rp 0");
                    System.out.print("What payment you want to use : ");
                    choosepayment = sc.nextInt();
                    total = totalroom + totaladdfac;
                    switch (choosepayment) {
                        case 1:
                            System.out.println("                    RECEIPT                     ");
                            System.out.println("================================================");
                            System.out.println("Type Room                            : " + nameRoom);
                            System.out.println("How Long To Stay                     : " + stay + " Days");
                            System.out.println("Additional Facilities                : " + namaadd);
                            System.out.println("Number Of Additional Facilities      : " + order);
                            System.out.println("Payment                              : BRI payment");
                            System.out.println("================================================");
                            System.out.println("The Total Price Is                   : Rp " + total + taxBRI);
                            break;
                        case 2:
                            System.out.println("                    RECEIPT                     ");
                            System.out.println("================================================");
                            System.out.println("Type Room                            : " + nameRoom);
                            System.out.println("How Long To Stay                     : " + stay + " Days");
                            System.out.println("Additional Facilities                : " + namaadd);
                            System.out.println("Number Of Additional Facilities      : " + order);
                            System.out.println("Payment                              : BCA payment");
                            System.out.println("================================================");
                            System.out.println("The Total Price Is                   : Rp " + total + taxBCA);
                            break;
                        case 3:
                            System.out.println("                    RECEIPT                     ");
                            System.out.println("================================================");
                            System.out.println("Type Room                            : " + nameRoom);
                            System.out.println("How Long To Stay                     : " + stay + " Days");
                            System.out.println("Additional Facilities                : " + namaadd);
                            System.out.println("Number Of Additional Facilities      : " + order);
                            System.out.println("Payment                              : MANDIRI payment");
                            System.out.println("================================================");
                            System.out.println("The Total Price Is                   : Rp " + total + taxMandiri);
                            break;
                        case 4:
                            System.out.println("                    RECEIPT                     ");
                            System.out.println("================================================");
                            System.out.println("Type Room                            : " + nameRoom);
                            System.out.println("How Long To Stay                     : " + stay + " Days");
                            System.out.println("Additional Facilities                : " + namaadd);
                            System.out.println("Number Of Additional Facilities      : " + order);
                            System.out.println("Payment                              : BNI payment");
                            System.out.println("================================================");
                            System.out.println("The Total Price Is                   : Rp " + total + taxBNI);
                            break;
                        case 5:
                            System.out.println("                    RECEIPT                     ");
                            System.out.println("================================================");
                            System.out.println("Type Room                            : " + nameRoom);
                            System.out.println("How Long To Stay                     : " + stay + " Days");
                            System.out.println("Additional Facilities                : " + namaadd);
                            System.out.println("Number Of Additional Facilities      : " + order);
                            System.out.println("Payment                              : Tunai payment");
                            System.out.println("================================================");
                            System.out.println("The Total Price Is                   : Rp " + total);
                        default:
                            break;
                    }
                    System.out.println("================================================");
                    break;
                case 6: // exit and print invoice booking
                    System.out.println("================================================");
                    System.out.println("                 !!!THANK YOU!!!                ");
                    System.out.println("                 FOR YOUR COMING                ");
                    System.out.println("                 HAVE A NICE DAY                ");
                    System.out.println("================================================");
                    System.out.println("      ||Your reservation booking invoice||      ");
                    System.out.println("Name                     : " + name);
                    System.out.println("Age                      : " + age);
                    System.out.println("Telephone                : " + numTelephone);
                    System.out.println("Gmail                    : " + gmail);
                    System.out.println("For                      : " + people + " people");
                    System.out.println("Check-In                 : " + checkIn);
                    if (chooseTypeRoom == 1) {
                        System.out.println("Room type you choose     : Standard type");
                    } else if (chooseTypeRoom == 2) {
                        System.out.println("Room type you choose     : Superior type");      
                    } else if (chooseTypeRoom == 3) {
                        System.out.println("Room type you choose     : Deluxe type");
                    } else if (chooseTypeRoom == 4) {
                        System.out.println("Room type you choose     : Single type");
                    } else if (chooseTypeRoom == 5) {
                        System.out.println("Room type you choose     : Twin type");
                    } else if (chooseTypeRoom == 6) {
                        System.out.println("Room type you choose     : Double type");
                    } else if (chooseTypeRoom == 7) {
                        System.out.println("Room type you choose     : Family type");
                    } else if (chooseTypeRoom == 8) {
                        System.out.println("Room type you choose     : Junior type");
                    } else if (chooseTypeRoom == 9) {
                        System.out.println("Room type you choose     : Suite type");
                    } else if (chooseTypeRoom == 10) {
                        System.out.println("Room type you choose     : Presidential type");
                    } else if (chooseTypeRoom == 11) {
                        System.out.println("Room type you choose     : Connecting type");
                    } else if (chooseTypeRoom == 12) {
                        System.out.println("Room type you choose     : Disabled type");
                    } else if (chooseTypeRoom == 13) {
                        System.out.println("Room type you choose     : Smoking type");
                    } else {
                        System.out.println("Room type you choose     : -");
                    }
                    System.out.println("Lenght of your stay      : " + stay + " day ");
                    switch (chooseFacilities) {
                        case 1:
                            System.out.println("Additonal facilities     : Extra mattress");
                            break;

                        case 2:
                            System.out.println("Additonal facilities     : Extra pillow");
                            break;

                        case 3:
                            System.out.println("Additonal facilities     : Special event");
                            break;

                        case 4:
                            System.out.println("Additonal facilities     : Baby cot");
                            break;

                        case 5:
                            System.out.println("Additonal facilities     : Food or beverage packages");
                            break;

                        case 6:
                            System.out.println("Additonal facilities     : None add additional facilities");
                            break;
                    
                        default:
                            System.out.println("Additonal facilities     : -");
                            break;
                    }

                    if (choosepayment == 1) {
                        System.out.println("Payment via              : BRI");
                    } else if (choosepayment == 2) {
                        System.out.println("Payment via              : BCA");
                    } else if (choosepayment == 3) {
                        System.out.println("Payment via              : MANDIRI");
                    } else if (choosepayment == 4) {
                        System.out.println("Payment via              : BNI");
                    } else if (choosepayment == 5) {
                        System.out.println("Payment via              : CASH");
                    } else {
                        System.out.println("Payment via              : -");
                    }
                    
                    System.out.println("Total payment            : " + total);
                    System.out.println("||================================================||");

                    System.exit(0);
                break;
                default: // if the menu selection is not appropriate
                    System.out.println("Invalid data menu choice!!!!!");
                    System.out.println("================================================");
                    break;
            }
        } while (!exit);

    }

    static void register(Scanner sc) {
        if (count >= 1) { // for letter entries more than or equal to 1 letter
            System.out.println("User registration is not available. Please try again later!");
            System.out.println("================================================");
            return;
        }

        // enter username and password for register
        System.out.print("Enter username: ");
        String user = sc.next();

        System.out.print("Enter password: ");
        String pass = sc.next();
        System.out.println("================================================");

        username[count] = user;
        password[count] = pass;
        count++;

        System.out.println("            Registration successful             ");
        System.out.println("                 Please login!                  ");
    }

    static void login(Scanner sc) {

        boolean isUserFound = false; // If the username and password are not found, it will repeat to enter the username and password according to the time of registration.

        while (!isUserFound) { // looping for false value username and password

            // enter username and password for login
            System.out.print("Enter username : ");
            String user = sc.next();

            System.out.print("Enter password : ");
            String pass = sc.next();
            System.out.println("================================================");

            for (int i = 0; i < count; i++) {
                if (username[i].equals(user) && password[i].equals(pass)) {
                    isUserFound = true;
                    break;
                }
                
            }

            if (isUserFound) {
                System.out.println("                Login successful!               ");
            } else {
                System.out.println("        Username or password is incorrect       ");
                System.out.println("                Please try again!               ");
                System.out.println("================================================");
            }
            
        }
    }   
}