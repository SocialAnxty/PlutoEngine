package gameObjects.components;

import util.Position2D;
import util.Rotation2D;

public class Transform2D implements Component{
    public Position2D position;
    public Rotation2D rotation;

    public Transform2D(Position2D position, Rotation2D rotation){
        this.position = position;
        this.rotation = rotation;
    }

    public Transform2D(Position2D position){
        this(position, new Rotation2D());
    }

    public Transform2D(Rotation2D rotation){
        this(new Position2D(), rotation);
    }

    public Transform2D(){
        this(new Position2D(), new Rotation2D());
    }

    @Override
    public void update() {}
}
