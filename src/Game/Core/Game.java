package Game.Core;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

public class Game extends AppGameContainer {

    Game(GameRunner game) throws SlickException {
        super(game);
        setDisplayMode(100, 200, true);
    }
}
