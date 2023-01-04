package pacman.entities;

import java.awt.*;

public class SuperPacGum extends StaticEntity {
    private int blinkTimer;

    public SuperPacGum(int xPos, int yPos) {
        super(xPos, yPos, 16);
        blinkTimer = 0;
    }

    @Override
    public void update() {
        blinkTimer++;
        if (blinkTimer > 60) blinkTimer = 0;

    }

    @Override
    public void draw(Graphics2D g) {
        if (blinkTimer < 30) {
            g.setColor(new Color(255, 183, 174));
            g.fillOval(xPos, yPos, size, size);
        }


    }
}
