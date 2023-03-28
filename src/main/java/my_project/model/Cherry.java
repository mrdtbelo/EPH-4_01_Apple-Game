package my_project.model;

import KAGO_framework.view.DrawTool;
import java.awt.*;

public class Cherry extends Fruit{

    public Cherry(double x, double y){
        super(x, y);
        radius = 30;
    }

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(121, 6, 4, 255);
        drawTool.drawFilledCircle(12, 7, 9);
        drawTool.drawFilledCircle(0, 15, 10);
    }

    public void update(double dt){
        super.update(dt);
    }
}
