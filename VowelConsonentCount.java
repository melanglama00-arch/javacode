public class VowelConsonentCount {
    public static void main(String[] args) {
        String str = "hello nepal"; // input string
        int vowel = 0;
        int consonent = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // check if the character is a letter
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                    vowel++;
                } else {
                    consonent++;
                }
            }
        }

        System.out.println("string: " + str);
        System.out.println("vowel: " + vowel);
        System.out.println("consonent: " + consonent);
    }
}
