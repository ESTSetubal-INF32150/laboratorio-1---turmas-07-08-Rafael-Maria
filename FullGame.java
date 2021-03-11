
/**
 * @author (your name)
 * @version (a version number or a date)
 */
public class FullGame
{
    private WordGuessingGame game;
    private InputReader playGame;
    public FullGame()
    {
        game = new WordGuessingGame();
        playGame = new InputReader();
    }

    public void reset()
    {
          game.numberOfTries = 0;
          game.hiddenWord = "abc";
          game.guessedWord = "___";
    }
    
    public void play(){
        do{
            reset();
            game.play();
            playGame= new InputReader();
        }while(playGame.equals("s"));
    }
}
