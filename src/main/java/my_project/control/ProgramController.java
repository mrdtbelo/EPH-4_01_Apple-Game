package my_project.control;

import KAGO_framework.control.Drawable;
import KAGO_framework.control.ViewController;
import my_project.Config;
import my_project.model.Apple;
import my_project.model.Pear;
import my_project.model.Player;
import my_project.model.PowerApple;

/**
 * Ein Objekt der Klasse ProgramController dient dazu das Programm zu steuern. Die updateProgram - Methode wird
 * mit jeder Frame im laufenden Programm aufgerufen.
 */
public class ProgramController {

    //Attribute


    // Referenzen
    private ViewController viewController;  // diese Referenz soll auf ein Objekt der Klasse viewController zeigen. Über dieses Objekt wird das Fenster gesteuert.

    //private Background background;

    private Apple apple01;
    private Apple apple02;
    private Apple apple03;
    private Apple apple04;
    private PowerApple powerApple01;

    private Pear pear01;
    private Pear pear02;
    private Pear pear03;
    private Pear pear04;
    private Pear pear05;
    private Player player01;


    /**
     * Konstruktor
     * Dieser legt das Objekt der Klasse ProgramController an, das den Programmfluss steuert.
     * Damit der ProgramController auf das Fenster zugreifen kann, benötigt er eine Referenz auf das Objekt
     * der Klasse viewController. Diese wird als Parameter übergeben.
     *
     * @param viewController das viewController-Objekt des Programms
     */
    public ProgramController(ViewController viewController) {
        this.viewController = viewController;
    }

    /**
     * Diese Methode wird genau ein mal nach Programmstart aufgerufen.
     * Sie erstellt die leeren Datenstrukturen, zu Beginn nur eine Queue
     */
    public void startProgram() {
        double xPos = Math.random() * (Config.WINDOW_WIDTH - 50) + 50;
        double yPos = Math.random() * (Config.WINDOW_HEIGHT - 50) + 50;

        //background01 = new Background()
        //apple
        apple01 = new Apple(xPos, yPos);
        viewController.draw(apple01);
        double xpos = Math.random() * (Config.WINDOW_WIDTH - 50) + 50;
        double ypos = Math.random() * (Config.WINDOW_HEIGHT - 50) + 50;
        apple02 = new Apple(xpos, ypos);
        viewController.draw(apple02);
        double x1 = Math.random() * (Config.WINDOW_WIDTH - 50) + 50;
        double y1 = Math.random() * (Config.WINDOW_HEIGHT - 50) + 50;
        apple03 = new Apple(x1, y1);
        viewController.draw(apple03);
        double x2 = Math.random() * (Config.WINDOW_WIDTH - 50) + 50;
        double y2 = Math.random() * (Config.WINDOW_HEIGHT - 50) + 50;
        apple04 = new Apple(x2, y2);
        viewController.draw(apple04);
        double x3 = Math.random() * (Config.WINDOW_WIDTH - 50) + 50;
        double y3 = Math.random() * (Config.WINDOW_HEIGHT - 50) + 50;
        powerApple01 = new PowerApple(x3, y3);
        viewController.draw(powerApple01);

        xPos = Math.random() * (Config.WINDOW_WIDTH - 50) + 50;
        yPos = Math.random() * (Config.WINDOW_HEIGHT - 50) + 50;
        //pear
        pear01 = new Pear(xPos, yPos);
        viewController.draw(pear01);
        xPos = Math.random() * (Config.WINDOW_WIDTH - 50) + 50;
        yPos = Math.random() * (Config.WINDOW_HEIGHT - 50) + 50;
        pear02 = new Pear(xPos, yPos);
        viewController.draw(pear02);
        xPos = Math.random() * (Config.WINDOW_WIDTH - 50) + 50;
        yPos = Math.random() * (Config.WINDOW_HEIGHT - 50) + 50;
        pear03 = new Pear(xPos, yPos);
        viewController.draw(pear03);
        xPos = Math.random() * (Config.WINDOW_WIDTH - 50) + 50;
        yPos = Math.random() * (Config.WINDOW_HEIGHT - 50) + 50;
        pear04 = new Pear(xPos, yPos);
        viewController.draw(pear04);
        xPos = Math.random() * (Config.WINDOW_WIDTH - 50) + 50;
        yPos = Math.random() * (Config.WINDOW_HEIGHT - 50) + 50;
        pear05 = new Pear(xPos, yPos);
        viewController.draw(pear05);

        //player
        player01 = new Player(50, Config.WINDOW_HEIGHT - 100);
        viewController.draw(player01);
        viewController.register(player01);

        //player02 = new Player(250, Config.WINDOW_HEIGHT - 100);
        //viewController.draw(player02);
        //viewController.register(player02);
    }

    /**
     * Aufruf mit jeder Frame
     *
     * @param dt Zeit seit letzter Frame
     */
    public void updateProgram(double dt) {
        //if(checkANdHandleCollision(apple01)){

    }

    //TODO 08 Nachdem Sie die TODOs 01-07 erledigt haben: Setzen Sie um, dass im Falle einer Kollision (siehe TODO 06 bzw. 07) zwischen dem Spieler und dem Apfel bzw. dem Spieler und der Birne, die jumpBack()-Methode von dem Apfel bzw. der Birne aufgerufen wird.
    //Weitere TODOs folgen und werden im Unterricht formuliert. Spätestens nach TODO 08 sollte der Aufbau des Projekts durchdacht werden.
    // }
    //private boolean checkANdHandleCollision(Apple apple01) {
        //public void checkAndHandleColision(){
        //if()

        //TODO 06 Fügen Sie eine Methode checkAndHandleCollision(Apple a) hinzu. Diese gibt true zurück, falls das Apple-Objekt mit dem Player-Objekt kollidiert. Nutzen Sie hierzu die collidesWith-Methode der Klasse GraphicalObject.

        //TODO 07 Fügen Sie eine Methode checkAndHandleCollision(Pear p) hinzu. Diese gibt true zurück, falls das Pear-Objekt mit dem Player-Objekt kollidiert. Nutzen Sie hierzu die collidesWith-Methode der Klasse GraphicalObject.
    }
//}
