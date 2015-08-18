package com.laucity.thegame.world;

/**
 * Created by Monu on 8/18/15.
 */
public class GameRenderer {

    private GameWorld gameWorld;
    private int gameHeight;
    private int midPointY;

    public GameRenderer(GameWorld gameWorld, int gameHeight, int midPointY) {
        this.gameHeight = gameHeight;
        this.gameWorld = gameWorld;
        this.midPointY = midPointY;

    }

    public void render(int runTime) {
    }
}
