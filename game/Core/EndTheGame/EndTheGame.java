package game.Core.EndTheGame;
import game.Core.InteractivityInTheWorld;

/** Interface used to ask if the the game is ended. The interface is implemented by both classes
 * EndTheGameWhenUsingInputString and EndTheGameWhenUsingKeyBoard. */
public interface EndTheGame {

    boolean isTheGameEnded(InteractivityInTheWorld interactivityInTheWorld);
}
