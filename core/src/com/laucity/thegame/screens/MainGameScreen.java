package com.laucity.thegame.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.laucity.thegame.input.InputHandler;
import com.laucity.thegame.world.GameRenderer;
import com.laucity.thegame.world.GameWorld;

/**
 * Created by Monu on 8/17/15.
 */
public class MainGameScreen implements Screen {

    private GameWorld gameWorld;
    private GameRenderer gameRenderer;

    private int runTime = 0;

    public MainGameScreen() {
        Gdx.app.log("TheGameInfo", "screen attached");

        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        float gameWidth = 136;
        float gameHeight = screenHeight / (screenWidth/gameWidth);

        int midPointY = (int) (gameHeight/2);

        gameWorld = new GameWorld(midPointY);
        gameRenderer = new GameRenderer(gameWorld, (int) gameHeight, midPointY);

        Gdx.input.setInputProcessor(new InputHandler(gameWorld));
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.app.log("TheGameInfo", "rendered");
        runTime += delta;
        gameWorld.update(delta);
        gameRenderer.render(runTime);

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
