package gameObjects;

import gameObjects.components.Transform3D;

public abstract class GameObject3D extends GameObject{
    public GameObject3D(Transform3D transform){
        addComponent(transform);
    }

    public GameObject3D(){
        this(new Transform3D());
    }

    @Override
    public abstract void init();

    @Override
    public abstract void update();
}
