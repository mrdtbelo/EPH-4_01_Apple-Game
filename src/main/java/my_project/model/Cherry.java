package my_project.model;

import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Cherry extends Fruit {

    private double speedBuff;

    public Cherry(double x, double y) {
        super(x, y);
        radius = 30;
        speedBuff = Math.random()*8+15;
    }

    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(10, 25, 33, 0);
        drawTool.drawFilledCircle(12, 7, 9);
        drawTool.setCurrentColor(0, 0, 0, 0);
        drawTool.drawCircle(12, 7, 9);
    }

    public void update(double dt) {
        super.update(dt);
    }
}
