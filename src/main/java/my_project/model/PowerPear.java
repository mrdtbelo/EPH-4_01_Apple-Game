package my_project.model;

import KAGO_framework.view.DrawTool;

public class PowerPear extends Pear {

    private double speedBuff;

    public PowerPear(double x, double y) {
        super(x, y);
        speedBuff = Math.random()*10+15;
    }
    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(116,190,88,0);
        drawTool.drawFilledCircle(x,y,radius);
        drawTool.setCurrentColor(0,0,0,255);
        drawTool.drawCircle(x,y,radius);
        drawTool.setCurrentColor(35,0,0,255);
    }
}