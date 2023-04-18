package my_project.control;

import KAGO_framework.control.Drawable;
import KAGO_framework.control.ViewController;
import KAGO_framework.model.GraphicalObject;
import my_project.Config;
import my_project.model.*;

/**
 * Ein Objekt der Klasse ProgramController dient dazu das Programm zu steuern. Die updateProgram - Methode wird
 * mit jeder Frame im laufenden Programm aufgerufen.
 */
public class ProgramController extends GraphicalObject {

    //Attribute

    // Referenzen
    private ViewController viewController;  // diese Referenz soll auf ein Objekt der Klasse viewController zeigen. Über dieses Objekt wird das Fenster gesteuert.

    private Background background01;

    //landscape
    private Landscape landscape01;

    //mountains
    private Mountain mountain01;
    private Mountain mountain02;
    private Mountain mountain03;
    private Mountain mountain04;

    //house
    private House house01;

    //river
    private River river01;

    //clouds
    private Cloud cloud01;
    private Cloud cloud02;
    private Cloud cloud03;
    private Cloud cloud04;
    private Cloud cloud05;
    private Cloud cloud06;
    private Cloud cloud07;
    private Cloud cloud08;
    private Cloud cloud09;
    private Cloud cloud10;

    //apples
    private Apple apple01;
    private Apple apple02;
    private Apple apple03;
    private Apple apple04;

    private PowerApple powerApple01;

    //cherries
    private Cherry cherry01;
    private Cherry cherry02;
    private Cherry cherry03;
    private Cherry cherry04;

    //pears
    private Pear pear01;
    private Pear pear02;
    private Pear pear03;
    private Pear pear04;
    private Pear pear05;

    //private PowerPear01;

    private Player player01;
    //private Player player02;


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


        background01 = new Background();

        //landscape
        landscape01 = new Landscape(0,0);
        viewController.draw(landscape01);

        //mountains
        mountain01 = new Mountain(-5,360 );
        viewController.draw(mountain01);
        mountain02 = new Mountain(340,400 );
        viewController.draw(mountain02);
        mountain03 = new Mountain(560,360 );
        viewController.draw(mountain03);
        mountain04 = new Mountain(680,450 );
        viewController.draw(mountain04);

        house01 = new House(350,360);
        viewController.draw(house01);

        //river
        river01 = new River (80,400);
        viewController.draw(river01);

        //clouds
        cloud01 = new Cloud(-45,35,10);
        viewController.draw(cloud01);
        cloud02 = new Cloud(160,50,15);
        viewController.draw(cloud02);
        cloud03 = new Cloud(100,115,30);
        viewController.draw(cloud03);
        cloud04 = new Cloud(350,190,25);
        viewController.draw(cloud04);
        cloud05 = new Cloud(-380,122,35);
        viewController.draw(cloud05);
        cloud06 = new Cloud(560,110,15);
        viewController.draw(cloud06);
        cloud07 = new Cloud(10,130,20);
        viewController.draw(cloud07);
        cloud08 = new Cloud(620,83,20);
        viewController.draw(cloud08);
        cloud09 = new Cloud(230,40,15);
        viewController.draw(cloud09);
        cloud10 = new Cloud(140,210,10);
        viewController.draw(cloud10);

        //apples
        apple01 = new Apple(xPos, yPos);
        viewController.draw(apple01);
        xPos = Math.random() * (Config.WINDOW_WIDTH - 50) + 50;
        yPos = Math.random() * (Config.WINDOW_HEIGHT - 50) + 50;
        apple02 = new Apple(xPos, yPos);
        viewController.draw(apple02);
        xPos = Math.random() * (Config.WINDOW_WIDTH - 50) + 50;
        yPos = Math.random() * (Config.WINDOW_HEIGHT - 50) + 50;
        apple03 = new Apple(xPos, yPos);
        viewController.draw(apple03);
        xPos = Math.random() * (Config.WINDOW_WIDTH - 50) + 50;
        yPos = Math.random() * (Config.WINDOW_HEIGHT - 50) + 50;
        apple04 = new Apple(xPos, yPos);
        viewController.draw(apple04);
        xPos = Math.random() * (Config.WINDOW_WIDTH - 50) + 50;
        yPos = Math.random() * (Config.WINDOW_HEIGHT - 50) + 50;
        powerApple01 = new PowerApple(xPos, yPos);
        viewController.draw(powerApple01);

        xPos = Math.random() * (Config.WINDOW_WIDTH - 50) + 50;
        yPos = Math.random() * (Config.WINDOW_HEIGHT - 50) + 50;

        //cherries
        cherry01 = new Cherry(xPos, yPos);
        viewController.draw(apple01);
        xPos = Math.random() * (Config.WINDOW_WIDTH - 50) + 50;
        yPos = Math.random() * (Config.WINDOW_HEIGHT - 50) + 50;

        //pears
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
        checkAndHandleCollision(apple01);
        checkAndHandleCollision(apple02);
        checkAndHandleCollision(apple03);
        checkAndHandleCollision(apple04);
        checkAndHandleCollision(powerApple01);

        checkAndHandleCollision(pear01);
        checkAndHandleCollision(pear02);
        checkAndHandleCollision(pear03);
        checkAndHandleCollision(pear04);
        checkAndHandleCollision(pear05);

        //TODO 08 Nachdem Sie die TODOs 01-07 erledigt haben: Setzen Sie um, dass im Falle einer Kollision (siehe TODO 06 bzw. 07) zwischen dem Spieler und dem Apfel bzw. dem Spieler und der Birne, die jumpBack()-Methode von dem Apfel bzw. der Birne aufgerufen wird.
        //Weitere TODOs folgen und werden im Unterricht formuliert. Spätestens nach TODO 08 sollte der Aufbau des Projekts durchdacht werden.
    }

    public void checkAndHandleCollision(Fruit f){
        if(f.collidesWith(player01)){
            f.jumpBack();
        }
    }
}

            //TODO 06 Fügen Sie eine Methode checkAndHandleCollision(Apple a) hinzu. Diese gibt true zurück, falls das Apple-Objekt mit dem Player-Objekt kollidiert. Nutzen Sie hierzu die collidesWith-Methode der Klasse GraphicalObject.

            //TODO 07 Fügen Sie eine Methode checkAndHandleCollision(Pear p) hinzu. Diese gibt true zurück, falls das Pear-Objekt mit dem Player-Objekt kollidiert. Nutzen Sie hierzu die collidesWith-Methode der Klasse GraphicalObject.



