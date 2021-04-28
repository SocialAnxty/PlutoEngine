package gameObjects.components;

import util.Position3D;
import util.Rotation3D;

public class Transform3D implements Component{
    public Position3D position;
    public Rotation3D rotation;

    public Transform3D(Position3D position, Rotation3D rotation){
        this.position = position;
        this.rotation = rotation;
    }

    public Transform3D(Position3D position){
        this(position, new Rotation3D());
    }

    public Transform3D(Rotation3D rotation){
        this(new Position3D(), rotation);
    }

    public Transform3D(){
        this(new Position3D(), new Rotation3D());
    }

    @Override
    public void update() {}
}
