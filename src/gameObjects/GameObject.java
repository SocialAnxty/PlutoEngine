package gameObjects;

import gameObjects.components.Component;

import java.util.ArrayList;

public abstract class GameObject {
    private ArrayList<Component> components;

    public abstract void init();

    /**Run every frame*/
    public abstract void update();

    public void addComponent(Component component){
        components.add(component);
    }

    public final Component[] getComponents(){
        return (Component[]) components.toArray();
    }
}
