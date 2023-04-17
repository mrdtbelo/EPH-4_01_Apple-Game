package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Cloud extends GraphicalObject {

    public Cloud(double xPos,double yPos, double r){
        x = xPos;
        y = yPos;
        radius = r;
    }

    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(new Color(150, 150, 150));
        drawTool.drawFilledCircle(x, y, radius);
        drawTool.drawFilledCircle(x + radius / 2, y + radius / 2, radius);
        drawTool.drawFilledCircle(x + radius, y, radius);
    }

    public void update(double dt){
        x = x + 200*(radius/100)*dt;
        if(x > 1200){
            x = -200;
        }
    }
}
