package util.AStar;

public class AStarNode2D extends AStarNode{
    public AStarNode2D(int x, int y, int hCost, int gCost, AStarNode previous){
        super(new int[]{x, y}, hCost, gCost, previous);
    }
}
