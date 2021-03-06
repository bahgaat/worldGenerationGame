package game.Core.GenerateTheWorld;
import game.Core.Draw.DrawShapes;
import game.Core.Draw.DrawWorld;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/** helper class which is used in RenderWorld class. */
public class GenerateClassDrawWorld implements Serializable {

    protected DrawWorld initializeDrawWorld() {
        Map<Character, ArrayList<Integer>> mapOfDirections = new HashMap<>();
        mapOfDirections.put('x', new ArrayList<Integer>());
        mapOfDirections.put('y', new ArrayList<Integer>());
        DrawShapes drawShapes = new DrawShapes(mapOfDirections);
        DrawWorld drawWorld = new DrawWorld(drawShapes);
        return drawWorld;
    }

}
