package nadia;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfChars {

    public static String frequencyOfChars(String str) {
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();

        // Count the frequency of each character
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Build the result string
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "AAABBCDD";
        String output = frequencyOfChars(input);
        System.out.println(output);  // Output: A3B2C1D2
    }
}