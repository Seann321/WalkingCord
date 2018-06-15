package walkingcord.states;

import java.awt.Graphics;
import walkingcord.gfx.GUI;

public class GameState extends State {

    GUI gui;

    public GameState(Handler handler) {
        super(handler);
        gui = new GUI(handler);
        GUI.currentGUI = gui;
    }

    @Override
    public void tick() {
        gui.tick();
    }

    @Override
    public void render(Graphics g) {
        gui.render(g);
    }

}
