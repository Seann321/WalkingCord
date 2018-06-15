package walkingcord.states.gameState;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Dot {

    public final int SIZE = 10;
    public boolean active = true;
    int x, y, movement = 5;
    public Rectangle bounds;
    Color color;

    public enum Type {
        NORMAL, WALL
    };
    
    public Type type = Type.NORMAL;

    public Dot(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
        bounds = new Rectangle(x, y, SIZE, SIZE);
    }

    public void tick() {
        updateBounds();
        move();
    }

    public void updateBounds() {
        bounds.x = x;
        bounds.y = y;
    }

    public void move() {
        switch ((int) (Math.random() * 8)) {
            case 1:
                x += movement;
                break;
            case 2:
                x -= movement;
                break;
            case 3:
                y += movement;
                break;
            case 4:
                y -= movement;
                break;

        }
    }

    public void render(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, SIZE, SIZE);
    }

}
