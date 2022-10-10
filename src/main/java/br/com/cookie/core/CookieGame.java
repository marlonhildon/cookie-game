package br.com.cookie.core;

import br.com.cookie.Main;
import lombok.SneakyThrows;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

import java.nio.file.Paths;


public class CookieGame extends BasicGame {

    public CookieGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

    }


    @SneakyThrows
    @Override
    public void render(GameContainer gameContainer, Graphics graphics) {
        Image cookie = new Image(Paths.get(Main.class.getResource("../../../").toURI()).toFile().getAbsolutePath() + "/sprites/cookie/cookie.png");
        Input input = gameContainer.getInput();
        graphics.drawString("Cookieeeeeee!", 300, 300);
        cookie.draw(input.getMouseX(), input.getMouseY());
    }

}
