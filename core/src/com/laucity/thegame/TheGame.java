package com.laucity.thegame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.laucity.thegame.screens.MainGameScreen;

public class TheGame extends Game {

	@Override
	public void create () {
		Gdx.app.log("TheGameInfo", "created");
		setScreen(new MainGameScreen());
		//need class for game object initialization (AssetLoader)
		//need to set gamescreen
	}


	@Override
	public void dispose() {
		super.dispose();
		Gdx.app.log("TheGameInfo", "disposed");
	}
}
