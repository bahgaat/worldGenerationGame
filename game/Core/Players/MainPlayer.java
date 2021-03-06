package game.Core.Players;

import game.Core.Position;
import game.TileEngine.Tileset;

/** A class which initiates the MainPlayer in the game. */
public class MainPlayer extends BasePlayer {

    private int points;
    private boolean winTheRound;
    private Position startPosition;


    public MainPlayer(Position startPosition) {
        this.startPosition = startPosition;
        setType(Tileset.PLAYER);
        setTypeToAttack(Tileset.FLOWER);
        setToStartPosition();
    }

    @Override
    /* start new round by putting the mainPlayer to the startingPosition and set the points to 0. */
    public void setToStartPosition() {
        int startPositionX = startPosition.getX();
        int startPositionY = startPosition.getY();
        setPositionX(startPositionX);
        setPositionY(startPositionY);
    }


    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}
