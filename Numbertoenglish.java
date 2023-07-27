import java.util.Scanner;

public class Numbertoenglish {

    static String[] belowTwenty = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    static String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    static String[] thousands = {
        "", "Thousand", "Million", "Billion"
    };

    static String convertGroup(int num) {
        StringBuilder result = new StringBuilder();

        int hundreds = num / 100;
        int tensUnits = num % 100;

        if (hundreds > 0) {
            result.append(belowTwenty[hundreds]).append(" Hundred");
            if (tensUnits > 0) {
                result.append(" ");
            }
        }

        if (tensUnits < 20) {
            result.append(belowTwenty[tensUnits]);
        } else {
            int tensDigit = tensUnits / 10;
            int unitsDigit = tensUnits % 10;
            result.append(tens[tensDigit]);
            if (unitsDigit > 0) {
                result.append(" ").append(belowTwenty[unitsDigit]);
            }
        }

        return result.toString();
    }

    static String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }

        StringBuilder result = new StringBuilder();
        int groupIndex = 0;

        while (num > 0) {
            if (num % 1000 != 0) {
                String group = convertGroup(num % 1000);
                result.insert(0, group + " " + thousands[groupIndex] + " ");
            }
            num /= 1000;
            groupIndex++;
        }

        int start = 0;
        while (start < result.length() && result.charAt(start) == ' ') {
            start++;
        }
        int end = result.length() - 1;
        while (end >= 0 && result.charAt(end) == ' ') {
            end--;
        }

        return result.substring(start, end + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if (N < 0 || N > 2147483647) {
            System.out.println();
        } else {
            String result = numberToWords(N);
            System.out.println(result);
        }
    }
}
