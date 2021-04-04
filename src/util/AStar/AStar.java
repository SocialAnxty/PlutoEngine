package util.AStar;

import util.misc;

import java.util.Arrays;

public class AStar {
    public static HCostFunc diagonalDistance = AStar::diagonalDistanceOf;
    // For when you are allowed to move multiple dimensions at once.

    public static HCostFunc manhattanDistance = AStar::manhattanDistanceOf;
    //For when you are allowed to only move one dimension at a time.

    private static int diagonalDistanceOf(AStarNode node, AStarNode end){
        return misc.intArrayMax(allDimensionDifferences(node, end));
    }

    private static int manhattanDistanceOf(AStarNode node, AStarNode end){
        return Arrays.stream(allDimensionDifferences(node, end)).sum();
    }

    private static int[] allDimensionDifferences(AStarNode node, AStarNode end){
        int[] differences = new int[node.getNumDimensions()];
        for (int i = 0; i < node.getNumDimensions(); i++) {
            differences[i] = Math.abs(node.getDimension(i) - end.getDimension(i));
        }
        return differences;
    }
}
