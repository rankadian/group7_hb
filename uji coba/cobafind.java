import java.util.Scanner;
public class cobafind {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] numStandard = {"201", "202", "203", "204", "205"};
        String [] typeStandard = {"A", "B", "C", "D", "E"};
        boolean isStandard = false;

        while (!isStandard) {
            System.out.print("Enter number room : ");
            String standardNum = sc.nextLine();

            System.out.print("Enter alphabet standard : ");
            String standardType = sc.nextLine();

            for (int i = 0; i < numStandard.length; i++) {
                if (standardNum.equals(numStandard[i]) && standardType.equals(typeStandard[i])) {
                    isStandard = true;
                    System.out.println("The room is available");
                    break;
                }
            }

            if (!isStandard) {
                System.out.println("The room not available or your choice invalid, please choose another room!");
            }
        }

        sc.close();
    }

}
