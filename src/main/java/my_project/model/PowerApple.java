package my_project.model;


import KAGO_framework.view.DrawTool;

import java.awt.*;

public class PowerApple extends Apple {

    private double speedBuff;
    private double timer;
    private double speedX;

    public PowerApple(double x, double y) {
        super(x, y);
        speedBuff = Math.random() * 10 + 15;
        timer = 0;
        speedX = 50;

    }

    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(255, 8, 0, 110);
        drawTool.drawFilledCircle(x, y, radius);
        drawTool.setCurrentColor(0, 0, 0, 110);
        drawTool.drawCircle(x, y, radius);
        drawTool.setCurrentColor(59, 46, 42, 110);
        drawTool.drawFilledRectangle(x - 2.5, y - 10, 5, 10);
    }

    public void update(double dt) {
        timer = timer + dt;
        x = x + speedX * dt;
        if (timer > 2) {
            speedX = speedX * (-1);
        }
        timer = timer + dt;
        super.update(dt);
        //x = x + speedX * dt;
        //if (timer < 0) {
            speedX = speedX * (0);
        //}

    }
}
