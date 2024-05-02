import java.util.HashMap;

public class ReplaceMostRepeatedCharacter {
    
    public static String replaceMostRepeatedChar(String str, char x) {
        // Create a HashMap to store character frequencies
        HashMap<Character, Integer> map = new HashMap<>();
        
        // Count the frequency of each character in the input string
        for (char c : str.replace(" ", "").toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
        
        // Find the character with maximum frequency
        char maxxChar = str.charAt(0); 
        int maxx = map.get(maxxChar);
        for (char c : map.keySet()) {
            if (map.get(c) > maxx) {
                maxxChar = c;
                maxx = map.get(c);
            }
        }
        
        // Replace the most repeated character with the given character
        String ans = str.replace(maxxChar, x);
        
        return ans;
    }

    public static void main(String[] args) {
        String str = "water         melon";
        char x = '*';
        String ans = replaceMostRepeatedChar(str, x);
        System.out.println("Replaced String: " + ans);
    }
}
