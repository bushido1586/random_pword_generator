import java.util.*;

public class PasswordGenerator {
    public static void main(String[] args){
        int length = 10;
        System.out.println(password(length));
    }
    static char[] password(int len){
        System.out.println("Generating password using random() : ");
        System.out.print("Your new password is : ");
        String capitalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallChars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialChars = "!@#$%^&*_=+-/>?,.()";
        String values = capitalChars + smallChars + numbers + specialChars;
        Random random = new Random();
        char[] newPassword = new char[len];
        for(int i =0; i < len; i++){
            newPassword[i] = values.charAt(random.nextInt(values.length()));
        }
        return newPassword;
    }

}
