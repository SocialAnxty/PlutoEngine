package util.AStar;

public interface HCostFunc {
    int calculate(AStarNode node, AStarNode end);
}
