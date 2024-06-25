/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.TeamGorila.Main;

import javax.swing.*;
import com.TeamGorila.View.Jframe.Mainly.Main;

/**
 *
 * @author JENS07
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> {
            main app = new main();
            app.start();
        });
    }

    private void start() {
        Main mainframe = new Main();
        mainframe.setVisible(true);
    }
    
}
