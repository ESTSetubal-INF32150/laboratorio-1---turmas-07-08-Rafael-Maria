import java.util.ArrayList;
import java.util.Random;
/**
 * @author Rafael Maria
 * @version 3
 */
public class WordGenerator
{
    private ArrayList<String> words;
    
    public WordGenerator()
    {
        words = new ArrayList<String>();
    }

    public void fillArrayList(){
        words.add("boolean");
        words.add("break");
        words.add("byte");
        words.add("case");
        words.add("char");
        words.add("class");
        words.add("continue");
        words.add("do");
        words.add("double");
        words.add("else");
        words.add("enum");
        words.add("for");
        words.add("if");
        words.add("import");
        words.add("int");
    }
    
    public String generateWord(){
        Random random = new Random();
        return words.get(random.nextInt(words.size()));
    }
    
    public void addWord(String newWord){
        words.add("newWord");
    }
}
