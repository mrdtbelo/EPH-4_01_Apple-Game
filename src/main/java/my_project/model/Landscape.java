package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Landscape extends GraphicalObject {

    public Landscape(double xPos, double yPos){
        x = xPos;
        y = yPos;
    }
    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(137,207,240,255);
        drawTool.drawFilledRectangle(0,0,1029,360);
        drawTool.setCurrentColor(33,140,0,255);
        drawTool.drawFilledRectangle(0,360,1029,360);
    }
}
