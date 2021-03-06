package game.Core;

import game.TileEngine.TETile;

import java.io.Serializable;

/** This is the main entry point for the program. This class simply parses
 *  the command line inputs, and lets the game.Core.Gsame class take over
 *  in either keyboard or input string mode.
 */
public class Main implements Serializable {
    public static void main(String[] args) {
        if (args.length > 1) {
            System.out.println("Can only have one argument - the input string");
            System.exit(0);
        } else if (args.length == 1) {
            Game game = new Game();
            TETile[][] world = game.playWithInputString(args[0]);
            System.out.println(TETile.toString(world));
        } else {
            Game game = new Game();
            game.playWithKeyboard();
        }
    }
}
