package game.Core;
import game.Core.EndTheGame.EndTheGameWhenUsingInputString;
import game.Core.EndTheGame.EndTheGameWhenUsingKeyBoard;
import game.Core.GenerateTheWorld.GenerateWorld;
import game.Core.GenerateTheWorld.GenerateWorldWhenUsingInputString;
import game.Core.GenerateTheWorld.GenerateWorldWhenUsingKeyBoard;
import game.Core.Gui.GuiInteractivityInTheGame;
import game.Core.Input.InputDevice;
import game.Core.Input.InputString;
import game.Core.Input.KeyBoardInput;
import game.Core.Gui.GuiStartingTheGame;
import game.TileEngine.TERenderer;
import game.TileEngine.TETile;

import java.io.Serializable;

/** This is the class that takes over in either keyboard or input string mode. */
public class Game implements Serializable {
    /* Feel free to change the width and height. */
    public static final int WIDTH = 100;
    public static final int HEIGHT = 100;



    /**
     * Method used for playing a fresh game. The game should start from the main menu.
     */
    public void playWithKeyboard()  {
        InputDevice keyBoardInput = new KeyBoardInput();
        SaveAndLoadGame<GuiInteractivityInTheGame> saveAndLoadGame = new SaveAndLoadGame<> (
                "interactivity");
        GuiStartingTheGame guiStartingTheGame = new GuiStartingTheGame();
        guiStartingTheGame.display("Ui");
        TERenderer ter = new TERenderer();
        GenerateWorldWhenUsingKeyBoard generateWorldWhenUsingKeyBoard =
                new GenerateWorldWhenUsingKeyBoard(ter);
        EndTheGameWhenUsingKeyBoard endTheGameWhenUsingKeyBoard = new EndTheGameWhenUsingKeyBoard();
        guiStartingTheGame.readTheInputBeforeStartingTheGame(keyBoardInput, generateWorldWhenUsingKeyBoard,
                saveAndLoadGame, ter, endTheGameWhenUsingKeyBoard, "keyBoard");
    }
    

    /**
     * Method used for testing the game code. The input string will be a series
     * of characters (for example, "n123sswwdasdassadwas", "n123sss:q", "lwww". The game should
     * behave exactly as if the user typed these characters into the game after playing
     * playWithKeyboard. If the string ends in ":q", the same world should be returned as if the
     * string did not end with q. For example "n123sss" and "n123sss:q" should return the same
     * world. However, the behavior is slightly different. After playing with "n123sss:q", the game
     * should save, and thus if we then called playWithInputString with the string "l", we'd expect
     * to get the exact same world back again, since this corresponds to loading the saved game.
     * @param input the input string to feed to your program
     * @return
     */

    public TETile[][] playWithInputString(String input) {
        InputDevice inputString = new InputString(input);
        SaveAndLoadGame<GuiInteractivityInTheGame> saveAndLoadGame = new SaveAndLoadGame<> (
                "interactivity");
        GuiStartingTheGame guiStartingTheGame = new GuiStartingTheGame();
        GenerateWorld generateTheWorldWhenUsingInputString = new GenerateWorldWhenUsingInputString();
        TERenderer ter = new TERenderer();
        EndTheGameWhenUsingInputString endTheGameWhenUsingInputString =
                new EndTheGameWhenUsingInputString((InputString) inputString);
        TETile[][] world = guiStartingTheGame.readTheInputBeforeStartingTheGame(inputString,
                generateTheWorldWhenUsingInputString, saveAndLoadGame, ter, endTheGameWhenUsingInputString,
                "input");
        return world;
    }

}
