
public class CountNumbersAndSymbols {
    public static void main(String[] args) {
        String input = "james__07@gmail.com"; 

        int numCount = countNumbers(input);
        int symbolCount = countSymbols(input);

        System.out.println("Number Count: " + numCount);
        System.out.println("Symbol Count: " + symbolCount);
    }

    public static int countNumbers(String input) {
        int count = 0;
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                count++;
            }
        }
        return count;
    }

    public static int countSymbols(String input) {
        int count = 0;
        for (char ch : input.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                count++;
            }
        }
        return count;
    }
}
