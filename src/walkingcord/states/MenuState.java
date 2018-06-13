package walkingcord.states;

import java.awt.Color;
import java.awt.Graphics;
import walkingcord.gfx.GUI;
import walkingcord.gfx.UIObject;

public class MenuState extends State {

    GUI gui;
    UIObject title = new UIObject("Walking Cord", handler.getWidth() / 2, handler.getHeight() / 10, true, Color.white, Color.white, GUI.font50);

    public MenuState(Handler handler) {
        super(handler);
        gui = new GUI(handler);
        GUI.currentGUI = gui;
        addText(gui, title);
    }

    @Override
    public void tick() {
        if (title.wasClicked()) {
            handler.switchToGameState();
        }
    }

    @Override
    public void render(Graphics g) {
        gui.render(g);
    }

}
