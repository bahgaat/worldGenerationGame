package game.Core.EndTheGame;
import game.Core.InteractivityInTheWorld;
import java.io.Serializable;

/** ask if the game is ended when using keyBoard. */
public class EndTheGameWhenUsingKeyBoard implements EndTheGame, Serializable {

    @Override
    public boolean isTheGameEnded(InteractivityInTheWorld interactivityInTheWorld) {
        return interactivityInTheWorld.isGameOver() || interactivityInTheWorld.isTheUserQuitTheGame();
    }
}
