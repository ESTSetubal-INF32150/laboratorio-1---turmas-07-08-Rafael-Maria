/**
 * @author Rafael Maria 200221055
 * @version 1
 */
public class WordGuessingGame
{
    public String hiddenWord;
    public String guessedWord;
    private String underGuessing;
    public int numberOfTries;
    public InputReader reader;
    public WordGenerator generator;
    
    public WordGuessingGame()
    {
        generator = new WordGenerator();
        hiddenWord = generator.generateWord();
        guessedWord = initializeGuessedWord();
        this.numberOfTries = 0;
        reader = new InputReader();
        generator = new WordGenerator();
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
    
    public String initializeGuessedWord(){
        for(int i = 0; i < hiddenWord.length();i++){
            underGuessing += "_";
        }
        return underGuessing;
    }
    
    private void showGuessedWord()
    {
        System.out.println("A palavra: " + getGuessedWord());
    }
    
    public void play(){
        showWelcome();
        hiddenWord = generator.generateWord();
        guessedWord = initializeGuessedWord();
        while(hiddenWord != guessedWord){
            guess();
        }
        showGuessedWord();
        showResult();
    }
    
    private void showWelcome(){
        System.out.println("Bem-vindo ao Guessed Word");
    }
    
    private void guess(){
        reader = new InputReader();
        numberOfTries ++;
        for(int i=0; i< hiddenWord.length(); i++){
            char caracter = hiddenWord.charAt(i);
            //if(caracter.equals(reader)){
            
            //}
            
            
            
        }
    }
    
    private void showResult(){
        if(getNumberOfTries()==0 || getNumberOfTries()>1){
            System.out.println("Foram necessárias " + getNumberOfTries() + " tentativas.");
        }else{
            System.out.println("Foi necessário " + getNumberOfTries() + " tentativa.");
        }
        System.out.println("Para continuar a jogar pressione s");
    }
}
