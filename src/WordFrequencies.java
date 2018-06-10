import java.util.ArrayList;

public class WordFrequencies {
    private ArrayList<String> myWords;

    public WordFrequencies() {
        myWords = new ArrayList<String>();
    }


    public void findUnique() {
        //Reading a file, then stores words in ArrayList(call it resourse)
        /*for (String s : resource.words()) {
            s = s.toLowerCase();
            int index = myWords.indexOf(s);
            if (index == -1) {
                myWords.add(s);
            }
        }*/
    }

    public void tester() {
        findUnique();
        System.out.println("#uniqe word " + myWords);
    }
}
