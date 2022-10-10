package br.com.cookie;

import lombok.extern.java.Log;
import org.newdawn.slick.SlickException;

import java.net.URISyntaxException;

@Log
public class Main {

    public static void main(String[] args) {
        try{
            Config.configureLibrary(Main.class.getResource("../../../"));
            Config.configureAppGameContainer();
        } catch (SlickException | URISyntaxException ex) {
            log.severe(ex.getMessage());
        }
    }

}
