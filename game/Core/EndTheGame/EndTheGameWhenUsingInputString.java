package game.Core.EndTheGame;

import game.Core.Input.InputString;
import game.Core.InteractivityInTheWorld;

import java.io.Serializable;

/** ask if the game is ended when using inputString. */
public class EndTheGameWhenUsingInputString implements Serializable, EndTheGame {
    private InputString inputString;

    public EndTheGameWhenUsingInputString(InputString inputString) {
        this.inputString = inputString;
    }

    @Override
    public boolean isTheGameEnded(InteractivityInTheWorld interactivityInTheWorld) {
        int lengthOfInput = inputString.getLengthOfInput();
        int endSlicingIndex = inputString.getEndSlicingIndex();
        return lengthOfInput < endSlicingIndex || interactivityInTheWorld.isTheUserQuitTheGame();
    }
}
