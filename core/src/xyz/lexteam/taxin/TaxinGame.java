package xyz.lexteam.taxin;

import com.badlogic.gdx.Game;
import xyz.lexteam.taxin.ui.GameScreen;

public class TaxinGame extends Game {

    @Override
    public void create() {
        setScreen(new GameScreen());
    }

    @Override
    public void render() {
        super.render();
    }
}
