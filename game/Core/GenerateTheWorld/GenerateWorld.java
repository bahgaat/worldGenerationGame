package game.Core.GenerateTheWorld;

import game.Core.Draw.DrawWorld;

/** Interface which is implemented by both classes GenerateWorldWhenUsingInputString and
 * GenerateWorldWhenUsingKeyBoard.
 */

public interface GenerateWorld {

   void generateTheWorld(String seed, DrawWorld drawWorld);
}
