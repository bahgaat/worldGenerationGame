package game.Core.GenerateTheWorld;

import game.Core.Draw.DrawWorld;
import java.io.Serializable;

/** helper class which is used in RenderWorld class to draw the world when using inputString. */
public class GenerateWorldWhenUsingInputString implements GenerateWorld, Serializable {

    @Override
    public void generateTheWorld(String seed, DrawWorld drawWorld) {
        long convertSeedFromStringToLong = Long.parseLong(seed);
        drawWorld.drawWorld(convertSeedFromStringToLong);
    }
}
