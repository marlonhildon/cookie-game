package br.com.cookie;

import br.com.cookie.core.CookieGame;
import lombok.extern.java.Log;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Objects;

@Log
public class Config {

    public static void configureLibrary(final URL libsUrl) throws URISyntaxException {
        log.info("Configuring libraries...");

        File file = Paths.get(Objects.requireNonNull(libsUrl).toURI()).toFile();
        System.setProperty("org.lwjgl.librarypath",file.getAbsolutePath());
        System.setProperty("net.java.games.input.librarypath",file.getAbsolutePath());

        log.info("Libraries configured successfully!");
    }

    public static void configureAppGameContainer() throws SlickException {
        log.info("Starting game...");
        AppGameContainer gameContainer = new AppGameContainer(new CookieGame("Cookie Finder"));
        gameContainer.setDisplayMode(640, 480, false);
        gameContainer.setTargetFrameRate(60);
        gameContainer.start();
    }

}
