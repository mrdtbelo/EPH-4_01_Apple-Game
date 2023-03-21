package my_project.model;

import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Cherry extends Fruit{

    public Cherry(double x, double y) {
        super(x, y);
    }

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(10,25,33,0);
        drawTool.drawFilledCircle(12,7,9);
    }
}
