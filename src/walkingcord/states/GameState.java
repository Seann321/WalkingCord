package walkingcord.states;

import java.awt.Color;
import java.awt.Graphics;
import walkingcord.gfx.GUI;
import walkingcord.gfx.UIObject;

public class GameState extends State {

    GUI gui;
    UIObject title = new UIObject("GAME GOES HERE", handler.getWidth() / 2, handler.getHeight() / 10, true, Color.white, Color.white, GUI.font50);

    public GameState(Handler handler) {
        super(handler);
        gui = new GUI(handler);
        addText(gui, title);
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
