package walkingcord.states;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Graphics;
import walkingcord.gfx.GUI;
import walkingcord.gfx.UIObject;

public class MenuState extends State {

    GUI gui;
    UIObject start = new UIObject("Start", handler.getWidth() / 2, handler.getHeight() / 10, true, Color.white, Color.white, GUI.font50);

    public MenuState(Handler handler) throws AWTException {
        super(handler);
        gui = new GUI(handler);
        GUI.currentGUI = gui;
        addText(gui, start);
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        gui.render(g);
    }

}
