package gameObjects;

import gameObjects.components.Transform2D;

public abstract class GameObject2D extends GameObject{
    public GameObject2D(Transform2D transform){
        addComponent(transform);
    }

    public GameObject2D(){
        this(new Transform2D());
    }

    @Override
    public abstract void init();

    @Override
    public abstract void update();
}
