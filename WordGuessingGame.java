/**
 * @author Rafael Maria 200221055
 * @version 1
 */
public class WordGuessingGame
{
    private String hiddenWord = "abc";
    private String guessedWord = "___";
    private int numberOfTries;
    
    public WordGuessingGame(int numberOfTries, String hiddenWord)
    {
        this.numberOfTries = numberOfTries;
        this.hiddenWord = hiddenWord;
    }

    public String getHiddenWord()
    {
        return hiddenWord;
    }
    
    public String getGuessedWord()
    {
        return guessedWord;
    }
    
    public int getNumberOfTries()
    {
        return numberOfTries;
    }
    
    public void showGuessedWord()
    {
        System.out.println("A palavra descoberta até agora:");
        System.out.println(getGuessedWord());
    }
    
}
