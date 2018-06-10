public class CaesarCipher {
    public String encrypt( String input, int key ) {
        //Make a StringBuilder with message (encrypted)
        StringBuilder encrypted = new StringBuilder(input);
        //Wrtie down the alphabet
        String alphabet = "ABCDEFGHIJKMNOPQRSTUWXYZ";
        //Compute the shifted alphabet
        String shiftedAlphabet = alphabet.substring(key) + alphabet.substring
                (0, key);
        //Count from 0 to < length of encrypted(call it i)
        for (int i = 0; i < encrypted.length(); i++) {
            //Look at  th i-th character of encrypted(call it currChar)
            char currChar = encrypted.charAt(i);
            //Find the index of the currChar in the alphabet(call it idx)
            int idex = alphabet.indexOf(currChar);
            //If the currCar is in the alphabet
            if (idex != -1) {
                //Get the idxth character of shiftedAlphabet(newChar)
                char newChar = shiftedAlphabet.charAt(idex);
                //Replace the i-th character of encrypted with newChar
                encrypted.setCharAt(i, newChar);
            }
            //Otherwise, do nothing

        }

        //Answer
        return encrypted.toString();
    }

    public void testCaesar() {
        int key = 17;
//        FileResource file = new FileS

    }
}
