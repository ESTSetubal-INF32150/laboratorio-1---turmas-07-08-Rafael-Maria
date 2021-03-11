/**
 * @author Rafael Maria 200221055
 * @version 1
 */
public class WordGuessingGame
{
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;
    public InputReader reader;
    
    public WordGuessingGame()
    {
        hiddenWord = "abc";
        guessedWord = "___";
        this.numberOfTries = 0;
        reader = new InputReader();
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
    
    private void showGuessedWord()
    {
        System.out.println("A palavra: " + getGuessedWord());
    }
    
    public void play(){
        showWelcome();
    }
    
    private void showWelcome(){
        System.out.println("Bem-vindo ao Guessed Word");
    }
    
    private void guess(){
        reader = new InputReader();
        numberOfTries ++;
        for(int i=0; i< hiddenWord.length(); i++){
            char caracter = hiddenWord.charAt(i);
            //if(caracter){}
            
            
            
        }
    }
    
    private void showResult(){
        System.out.println("Foram necessárias " + getNumberOfTries() + " tentativas.");
    }
}
