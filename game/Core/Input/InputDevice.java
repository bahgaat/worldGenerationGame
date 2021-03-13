package game.Core.Input;

/** Interface to interact with what the user types. The interface is implemented by both classes
 * InputString and KeyBoardInput.
 */
public interface InputDevice {

    boolean hasNextChar();

    /* to be able to call nextChar. hasNextChar() has to return true. */
    char getNextChar();

    String collectTheSeed(String input);

    String getSeed();
}
