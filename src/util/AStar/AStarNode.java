package util.AStar;

public class AStarNode {
    AStarNode previous;
    int[] position;
    int hCost;
    int fCost;

    public AStarNode(int[] position, int hCost, int gCost, AStarNode previous){
        this.position = position;
        this.hCost = hCost;
        this.fCost = hCost + gCost;
        this.previous = previous;
    }

    public int getNumDimensions(){
        return position.length;
    }

    public int getDimension(int d){
        return position[d];
    }
}
