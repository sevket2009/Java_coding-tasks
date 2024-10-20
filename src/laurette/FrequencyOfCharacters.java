package laurette;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

         frequencyOfCharacters("AAABBCDD");//Example

    }

    public static void frequencyOfCharacters(String element){

        String result = "";


        for (int j = 0; j < element.length(); j++) {
            int frequency = 0;
            char ch = element.charAt(j);
            for (int i = 0; i < element.length(); i++) {

                if (element.charAt(i) == ch) {
                    frequency++;
                }
            }

            if (result.contains(ch + "")) {
                continue;
            }
            result += ch + "" + frequency;


        }
        System.out.println(result);
    }

}
