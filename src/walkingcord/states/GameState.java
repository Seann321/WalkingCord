package walkingcord.states;

import java.awt.Color;
import java.awt.Graphics;
import walkingcord.gfx.GUI;
import walkingcord.states.gameState.Dot;
import walkingcord.states.gameState.EntityManager;
import walkingcord.states.gameState.WallDot;

public class GameState extends State {

    GUI gui;
    EntityManager em;

    public GameState(Handler handler) {
        super(handler);
        gui = new GUI(handler);
        em = new EntityManager(handler);
        GUI.currentGUI = gui;
    }

    @Override
    public void tick() {
        gui.tick();
        em.tick();
        if (handler.getMM().isLeftPressed()) {
            em.addDot(new Dot(handler.getMM().getMouseX(), handler.getMM().getMouseY(), new Color((int)(Math.random()*254),(int)(Math.random()*254),(int)(Math.random()*254))));
        }
        if (handler.getMM().isRightPressed()) {
            em.addDot(new WallDot(handler.getMM().getMouseX(), handler.getMM().getMouseY()));
        }
    }

    @Override
    public void render(Graphics g) {
        gui.render(g);
        em.render(g);
    }

}
