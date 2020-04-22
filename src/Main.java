import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] address = new String[3];
        // true
        System.out.println(Validator.EmailValid("email@gmail.com"));
        // true
        System.out.println(Validator.EmailValid("email@mail.ru"));
        // true
        System.out.println(Validator.EmailValid("email-post.one@gmail.com"));
        // true
        System.out.println(Validator.EmailValid("ema22.il@mail.ru"));
        // false
        System.out.println(Validator.EmailValid("email.@mail.ru")+"\n");

        // Post form example
        System.out.println("Enter your name and post address like this format:\nIvan Ivanov\nBelvederska 44/66\n73000\n");
        System.out.println("Enter your name:");
        address[0] = scanner.nextLine().trim();
        System.out.println("Enter your address:");
        address[1] = scanner.nextLine().trim();
        System.out.println("Enter your post code:");
        address[2] = scanner.nextLine().trim();


        Validator validator = new Validator(address);
        System.out.println(validator.validationReport());
    }
}
