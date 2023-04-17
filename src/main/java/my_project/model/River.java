package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class River extends GraphicalObject {

    public River(double xPos, double yPos){
       x = xPos;
       y = yPos;
    }

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(43,87,112,255);
        drawTool.drawFilledRectangle(x-80,y-30, 315, 80);
        drawTool.drawFilledRectangle(x,y,100,240);
        drawTool.drawFilledRectangle(x-10,y+180,700,60);
        drawTool.drawFilledEllipse(x+750,y+175,300,100);
    }
}
