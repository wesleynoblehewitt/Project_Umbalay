package Game.Core;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import static Game.Core.Constants.delta;

public class GameRunner extends BasicGame {

    private boolean run = true;
    private Scene scene = new Scene();
    private float accumulator = 0;
    private long frameStart = System.nanoTime();

    GameRunner(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        long currentTime = System.nanoTime();

        accumulator += (currentTime - frameStart) / 1000000000f;
        frameStart = currentTime;

        // Clamp accumulator to an arbitrary value
        // This prevents a spiral of death if the physics cannot be computed fast enough to match the dt
        if (accumulator > 0.2f) {
            accumulator = 0.2f;
        }

        processInput();
        while (accumulator > delta) {
            scene.update();
            accumulator -= delta;
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

    }

    private void processInput() {

    }
}
