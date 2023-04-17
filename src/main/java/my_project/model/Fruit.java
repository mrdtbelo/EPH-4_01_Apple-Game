package my_project.model;

import KAGO_framework.Config;
import KAGO_framework.model.GraphicalObject;

import javax.swing.*;

public class Fruit extends GraphicalObject {

    protected double speed;

    public Fruit(double x, double y){
        this.x = x;
        this.y = y;
        speed = 150;
    }
    public void update(double dt) {
        y = y + speed*dt;

        if(y > 1000){
            jumpBack();
        }
    }
    public void jumpBack(){
        y = -200;
        x = Math.random() * 800 +  100;
   }
   //public void CheckAndHandleCollision(){
       // if(collidesWith(player01)){
            jumpBack();
        //}
   //}

}
