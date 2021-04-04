package util.AStar;

public class AStarNode {
    private AStarNode previous;
    private int[] position;
    private int hCost;
    private int fCost;

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

    public int getHCost(){
        return hCost;
    }

    public int getGCost(){
        return fCost - hCost;
    }

    public int getFCost(){
        return fCost;
    }

    public AStarNode getPrevious(){
        return previous;
    }
}
