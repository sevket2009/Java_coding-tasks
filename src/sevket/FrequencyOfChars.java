package sevket;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChars {

    public static void main(String[] args) {
        String input = "AAABBCDD";
        String result = findFrequency(input);
        System.out.println(result); // Output: A3B2C1D2
    }

    public static String findFrequency(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }
        return result.toString();
    }
}