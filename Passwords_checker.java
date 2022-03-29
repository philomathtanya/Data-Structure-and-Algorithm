import java.util.Scanner;

public class Passwords_checker {
    public static void main(String[] args) {
        Scanner s = new Scanner((System.in));
        String str = new String();
        str=s.next();
        int t = 1;
        if (t == 1) {
            if (str.length() > 4) {
                t = 1;
            } else
                t = 0;
        }
        if (t == 1) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    t = 1;
                    break;
                } else
                    t = 0;
            }
        }
        if (t == 1) {
            if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
                t = 0;
            }
        }
        if (t == 1) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                    t = 1;
                    break;
                } else
                    t = 0;
            }
        }
        if(t==1) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ' || str.charAt(i) == '/')
                    t = 0;
            }
        }
        if (t == 1) {
            System.out.println("1");

        } else
            System.out.println("0");


    }
}
