public class VowelsConsonantsCounter {
    public static void main(String[] args) {
        String inputString = "This website is aw3som3."; // Replace with your desired input string

        // Convert the input string to lowercase for case-insensitive comparison
        inputString = inputString.toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < inputString.length(); ++i) {
            char ch = inputString.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ++vowels;
                System.out.println("vowel: "+ch);
            }
            // Check if the character is a consonant
            else if (ch >= 'a' && ch <= 'z') {
                ++consonants;
                System.out.println("consonant: "+ch);
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}