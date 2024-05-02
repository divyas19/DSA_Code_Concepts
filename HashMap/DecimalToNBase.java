import java.util.*;

public class DectToNBase {
    
    public static String dectToNBase(int n, int number) {
        StringBuilder ans = new StringBuilder(); //So that we can use reverse()

        HashMap<Integer, Character> d = new HashMap<>();
        // Fill the map for digits and letters - 1-1,2-2,...,9-9
        for (int i = 1; i < 10; i++) {
            d.put(i, 'i');
        }

        //a-65, 10+55 converted to char is A
        for (int i = 10; i < 36; i++) {
            d.put(i, (char)(i + 55));
        }

        while (number > 0) {
            int remainder = number % n;
            ans.append(d.get(remainder)); //Remainder is key
            number /= n;
        }

        // Reverse the result
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        // Example usage
        int n = 16;
        int number = 255;
        String result = dectToNBase(n, number);
        System.out.println("Result: " + result);
    }
}
