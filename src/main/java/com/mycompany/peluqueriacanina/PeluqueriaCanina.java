package com.mycompany.peluqueriacanina;

import com.mycompany.peluqueriacanina.gui.MainWindowGui;

public class PeluqueriaCanina {

    public static void main(String[] args) {
        
        MainWindowGui mainWindowGui = new MainWindowGui();
        mainWindowGui.setVisible(true);
        mainWindowGui.setLocationRelativeTo(null);
        mainWindowGui.setResizable(false);
        
    }
}
