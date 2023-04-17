package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Mountain extends GraphicalObject {

    public Mountain(double xPos, double yPos){
        x = xPos;
        y = yPos;
    }

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(44,44,44,255);
        drawTool.drawFilledTriangle(x,y,x+475,y,x+230,y-240);
    }
}
