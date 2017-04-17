package Game.Core;

import org.newdawn.slick.SlickException;

public class Main {

    public static void main(String[] args){
        try {
            Game game = new Game(new GameRunner("Project Umbalay"));
            game.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
