import java.util.ArrayList;
import java.util.Scanner;

public class loginv2 {
    private static ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;

        while (!isExit) {
            System.out.println("1. Daftar");
            System.out.println("2. Masuk");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    register(scanner);
                    break;
                case 2:
                    login(scanner);
                    break;
                case 3:
                    isExit = true;
                    continue;
                default:
                    System.out.println("Pilihan tidak valid");
                    System.out.println("================================================");
            }
        }
    }

    private static void register(Scanner scanner) {
        System.out.print("Masukkan nama: ");
        String name = scanner.next();

        System.out.print("Masukkan username: ");
        String user = scanner.next();

        System.out.print("Masukkan password: ");
        String pass = scanner.next();

        User newUser = new User(name, user, pass);
        users.add(newUser);

        System.out.println("Pendaftaran berhasil. Silakan login.");
        System.out.println("================================================");
    }

    private static void login(Scanner scanner) {
        System.out.print("Masukkan username: ");
        String user = scanner.next();

        System.out.print("Masukkan password: ");
        String pass = scanner.next();

        boolean isUserFound = false;
        for (User currentUser : users) {
            if (currentUser.getUsername().equals(user) && currentUser.getPassword().equals(pass)) {
                isUserFound = true;
                break;
            }
        }

        if (isUserFound) {
            System.out.println("Login berhasil");
            System.out.println("================================================");
        } else {
            System.out.println("Username atau password salah. Silakan coba lagi.");
            System.out.println("================================================");
        }
    }
}

class User {
    private String name;
    private String username;
    private String password;

    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}