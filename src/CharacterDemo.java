public class CharacterDemo {
    public static void main( String[] args ) {
        digitTest();
    }

    public static void digitTest() {
        String test = "ABCabc0123';#!";
        for (int i = 0; i < test.length(); i++) {
            char ch = test.charAt(i);

            if (Character.isDigit(ch)) {
                System.out.println(ch + " is digit!");
            }

            if (Character.isAlphabetic(ch)) {
                System.out.println(ch + " is a alphabect character.");
            }

            if (ch == '#') {
                System.out.println(ch + " #hashtag!.");
            }
        }
    }
}