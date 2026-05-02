package main;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame window = new JFrame("Chess Project");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        // --- GAME PANEL ---
        GamePanel gp = new GamePanel();
        window.add(gp, BorderLayout.CENTER);

        // --- UI PANEL ---
        JPanel ui = new JPanel();
        ui.setPreferredSize(new Dimension(300, 800));
        ui.setLayout(null);

        // SURRENDER BUTTON
        JButton surrender = new JButton("Surrender");
        surrender.setBounds(50, 50, 200, 40);
        surrender.addActionListener(e -> gp.surrender());
        ui.add(surrender);

        // OFFER DRAW BUTTON
        JButton draw = new JButton("Offer Draw");
        draw.setBounds(50, 100, 200, 40);
        draw.addActionListener(e -> gp.offerDraw());
        ui.add(draw);

        // RESTART BUTTON
        JButton restart = new JButton("Restart Game");
        restart.setBounds(50, 150, 200, 40);
        restart.addActionListener(e -> gp.restartGame());
        ui.add(restart);

        window.add(ui, BorderLayout.EAST);

        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gp.launchGame();
    }
}
