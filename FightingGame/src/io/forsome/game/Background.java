package io.forsome.game;

import org.academiadecodigo.simplegraphics.graphics.Canvas;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import static org.academiadecodigo.simplegraphics.graphics.Canvas.*;


public class Background {

    Picture backgroundRelva = new Picture();
    Picture backgroundSala = new Picture();
    Picture menu = new Picture(10,10,"FightingGame/rsc/meno-comIntrucao.png");
    private int randomLevel;

    public Background(){
        this.backgroundRelva = new Picture(10, 10, "FightingGame/rsc/BackGroundRelva.JPG");
        this.backgroundSala = new Picture(10, 10, "FightingGame/rsc/BackGroundSala.JPG");
    }

    public void createLevel() {
        randomLevel = (int) Math.floor(Math.random() * 2);
        switch (randomLevel) {
            case 0:

                backgroundRelva.draw();
                break;
            case 1:
                backgroundSala.draw();
                break;
        }
    }

    public void showMenu(){
        menu.draw();
    }

    public void hideMenu(){
        menu.delete();
    }

   /* public static void limitCanvas() {
        limitCanvasWidth(1030);
        limitCanvasHeight(603);
    }

    */

    public static void pause(){
        Canvas.pause();
    }

    public int getX(){
        return menu.getX();
    }

    public int getY(){
        return menu.getY();
    }

    public int getMaxX(){
        return menu.getMaxX();
    }

    public int getMaxY(){
        return menu.getMaxY();
    }
}