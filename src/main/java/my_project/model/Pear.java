package my_project.model;

import KAGO_framework.view.DrawTool;

public class Pear extends Fruit {

    private double timer;
    private double speedX;

    public Pear(double x, double y) {
        super(x, y);
        width = 25;
        height = 35;
        timer = 0;
        speedX = 50;
    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(0, 255, 0, 255);
        drawTool.drawFilledRectangle(x, y, width, height);
    }

    @Override
    public void update(double dt) {
        timer = timer + dt;
        x = x + speedX * dt;
        if (timer > 2) {
            speedX = speedX * (-1);
            timer = 0;
        }

        super.update(dt);
        x = x + speedX * dt;
        if(timer < 0){
            speedX = speedX * (0);
        }
    }
}

        //TODO 03 Eine Birne soll von oben herab fallen. Sobald sie unten den Bildschirmrand berührt wird die Methode jumpBack() aufgerufen (siehe TODO 04).
        //TODO 04 Lege eine Methode jumpBack() an, die bei Aufruf das Pear-Objekt oben am oberen Bildschirmrand an einer zufälligen x-Position positioniert.

