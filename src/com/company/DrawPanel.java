package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        gr.setColor(Color.pink);
        gr.fillRect(1,1, 3000, 200);
        gr.setColor(Color.GRAY);
        gr.fillRect(1,200, 3000, 400);
        gr.setColor(Color.BLACK);
        gr.fillRect(1,400,3000,4);
        gr.setColor(Color.BLACK);
        gr.fillRoundRect(400,250,30,70,10,10);
        gr.setColor(Color.BLACK);
        gr.fillRect(413,304,4,100);
        drawSun(gr, 20, 30, 50, 70, 30, Color.YELLOW);
        gr.setColor(Color.RED);
        gr.fillOval(405,252,20,20);
        gr.setColor(Color.YELLOW);
        gr.fillOval(405,274,20,20);
        gr.setColor(Color.green);
        gr.fillOval(405,296,20,20);
        drawWheel(gr, 100, 360, 40, 10, 15, Color.BLACK);
        drawWheel(gr, 250, 360, 40, 10, 15, Color.BLACK);
        gr.setColor(Color.BLACK);
        gr.setStroke(new BasicStroke(6.0f));
        int[] arrayX = {100, 150, 230, 170};
        int[] arrayY = {360, 310, 310, 360};
        Polygon poly = new Polygon(arrayX, arrayY, 4);
        gr.drawPolygon(poly);


        gr.drawLine(170,370,150,300);
        gr.drawLine(250,360,228,290);
        gr.drawLine(228,290,250,290);
        gr.setStroke(new BasicStroke(8.0f));
        gr.drawLine(150,300,165,300);
        gr.setStroke(new BasicStroke(3.0f));
        gr.drawLine(170,370,185,370);

        gr.setColor(Color.white);
        gr.fillOval(400,100,100,50);
        gr.fillOval(400,100,50,40);
        gr.fillOval(550,90,70,30);


    }

    public static void drawSun(Graphics2D g, int x, int y, int r, int R, int n, Color c) {
        g.setColor(c);
        g.fillOval(x - r, y - r, r + r, r + r);
        double da = 2 * Math.PI / n;
        for (int i = 0; i < n; i++) {
            double dx1 = r * Math.cos(i * da);
            double dy1 = r * Math.sin(i * da);
            double dx2 = R * Math.cos(i * da);
            double dy2 = R * Math.sin(i * da);
            g.drawLine(x + (int) dx1, y + (int) dy1, x + (int) dx2, y + (int) dy2);


        }
    }
    public static void drawWheel(Graphics2D g, int x, int y, int r, int R, int n, Color c) {
        g.setColor(c);
        g.setStroke(new BasicStroke(5.0f));
        g.drawOval(x - r, y - r, r + r, r + r);
        double da = 2 * Math.PI / n;
        for (int i = 0; i < n; i++) {
            double dx1 = r * Math.cos(i * da);
            double dy1 = r * Math.sin(i * da);
            double dx2 = R * Math.cos(i * da);
            double dy2 = R * Math.sin(i * da);
            g.setStroke(new BasicStroke(2.0f));
            g.drawLine(x + (int) dx1, y + (int) dy1, x + (int) dx2, y + (int) dy2);


        }
    }

}