import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first and last name or first middle and last name and Nickname");
        String fullName = scanner.nextLine().trim();

        String[] nameParts = fullName.split(" ");

        String firstName = nameParts[0];
        String middleName = "";
        String lastName = nameParts[nameParts.length -1];
        String nickName = "";

        if (nameParts.length == 4) {
            nickName = nameParts[nameParts.length -2];
            middleName = nameParts[1];
        } else if (nameParts.length == 3) {
            middleName = nameParts[1];
        }

        System.out.println("First name: " + firstName);
        if (middleName.isEmpty()){
            System.out.println("Last name: " + lastName);
        } else {
            System.out.println("Middle name: " + middleName);
            System.out.println("Last name: " + lastName);
        }
        if (!nickName.isEmpty())
            System.out.println("Nick name: " + nickName);


    }
}
