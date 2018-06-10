public class CaesarCipherOb {
    private String alphabet;
    private String shiftedAlphabet;

    public CaesarCipherOb( int key ) {
        alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0,key);
    }


}
