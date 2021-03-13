package game.Core.GenerateTheWorld;

import game.Core.Draw.DrawWorld;
import game.TileEngine.TERenderer;
import java.io.Serializable;

/** helper class which is used in RenderWorld class to draw the world when using keyBoard. */
public class GenerateWorldWhenUsingKeyBoard implements GenerateWorld, Serializable {
    private TERenderer ter;

    public GenerateWorldWhenUsingKeyBoard(TERenderer ter) {
        this.ter = ter;
    }

    @Override
    public void generateTheWorld(String seed, DrawWorld drawWorld) {
        int worldWidth = drawWorld.getWIDTH();
        int worldHeight = drawWorld.getHEIGHT();
        ter.initialize(worldWidth, worldHeight);
        long convertSeedFromStringToLong = Long.parseLong(seed);
        drawWorld.drawWorld(convertSeedFromStringToLong);
    }
}
