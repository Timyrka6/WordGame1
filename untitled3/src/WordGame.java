import java.util.HashMap;
import java.util.Random;

public class WordGame {
    public HashMap<String, String> wordswithTranslation;
    public HashMap<String, Integer> scores;
public String[] words ;
Random random = new Random();
    public boolean check(String word, String translationCheck)
        {
            String rightTranslation = wordswithTranslation.get(word);
            return rightTranslation.equals(translationCheck);
        }

        public String nextWord(){
            int index = random.nextInt(words.length);
            return words[index];
        }
public  WordGame() {



        this.wordswithTranslation=new HashMap<>();
        this.wordswithTranslation.put("friend","друг");
    this.wordswithTranslation.put("freez","замороженный");
    this.wordswithTranslation.put("frog","лягушкка");
    this.wordswithTranslation.put("rider","гонщик");
    this.wordswithTranslation.put("end","конец");
    this.scores=new HashMap<>();
    words= new String[wordswithTranslation.size()];
    int i = 0;
        for (String currennt : this.wordswithTranslation.keySet()){
            this.scores.put(currennt, 0);
            words[i] = currennt;
            i++;

        }






}
}
