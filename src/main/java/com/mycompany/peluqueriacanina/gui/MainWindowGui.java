package com.mycompany.peluqueriacanina.gui;

import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Color;
import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MainWindowGui extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public MainWindowGui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackground = new javax.swing.JPanel();
        jPanelExit = new javax.swing.JPanel();
        jLabelExit = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelPhoto = new javax.swing.JLabel();
        jPanelSaveData = new javax.swing.JPanel();
        jLabelSaveData = new javax.swing.JLabel();
        jPanelShowData = new javax.swing.JPanel();
        jLabelShowData = new javax.swing.JLabel();
        jPanelExitButton = new javax.swing.JPanel();
        jLabelExitButton = new javax.swing.JLabel();
        jPanelHeader = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanelBackground.setBackground(new java.awt.Color(248, 230, 230));
        jPanelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelExit.setBackground(new java.awt.Color(248, 230, 230));
        jPanelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelExitMouseEntered(evt);
            }
        });

        jLabelExit.setBackground(new java.awt.Color(204, 166, 133));
        jLabelExit.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabelExit.setForeground(new java.awt.Color(204, 166, 133));
        jLabelExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelExit.setText("X");
        jLabelExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelExitLayout = new javax.swing.GroupLayout(jPanelExit);
        jPanelExit.setLayout(jPanelExitLayout);
        jPanelExitLayout.setHorizontalGroup(
            jPanelExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExitLayout.createSequentialGroup()
                .addComponent(jLabelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelExitLayout.setVerticalGroup(
            jPanelExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelBackground.add(jPanelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 30, 30));

        jLabelTitle.setBackground(new java.awt.Color(106, 94, 94));
        jLabelTitle.setFont(new java.awt.Font("SansSerif", 1, 62)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(168, 137, 110));
        jLabelTitle.setText("Peluquería Canina");
        jPanelBackground.add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabelPhoto.setIcon(new javax.swing.ImageIcon("C:\\Users\\1\\Documents\\NetBeansProjects\\PeluqueriaCanina\\src\\main\\java\\com\\mycompany\\peluqueriacanina\\gui\\images\\logo.png")); // NOI18N
        jPanelBackground.add(jLabelPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 91, 460, 403));

        jPanelSaveData.setBackground(new java.awt.Color(187, 151, 125));
        jPanelSaveData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelSaveData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelSaveDataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelSaveDataMouseExited(evt);
            }
        });

        jLabelSaveData.setBackground(new java.awt.Color(106, 94, 94));
        jLabelSaveData.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelSaveData.setForeground(new java.awt.Color(106, 94, 94));
        jLabelSaveData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSaveData.setText("Cargar Datos");
        jLabelSaveData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSaveDataMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSaveDataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSaveDataMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelSaveDataLayout = new javax.swing.GroupLayout(jPanelSaveData);
        jPanelSaveData.setLayout(jPanelSaveDataLayout);
        jPanelSaveDataLayout.setHorizontalGroup(
            jPanelSaveDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelSaveData, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelSaveDataLayout.setVerticalGroup(
            jPanelSaveDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSaveDataLayout.createSequentialGroup()
                .addComponent(jLabelSaveData, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        jPanelBackground.add(jPanelSaveData, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 205, 165, 60));

        jPanelShowData.setBackground(new java.awt.Color(187, 151, 125));
        jPanelShowData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelShowData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelShowDataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelShowDataMouseExited(evt);
            }
        });

        jLabelShowData.setBackground(new java.awt.Color(106, 94, 94));
        jLabelShowData.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelShowData.setForeground(new java.awt.Color(106, 94, 94));
        jLabelShowData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelShowData.setText("Ver Datos");
        jLabelShowData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelShowDataMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelShowDataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelShowDataMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelShowDataLayout = new javax.swing.GroupLayout(jPanelShowData);
        jPanelShowData.setLayout(jPanelShowDataLayout);
        jPanelShowDataLayout.setHorizontalGroup(
            jPanelShowDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelShowData, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelShowDataLayout.setVerticalGroup(
            jPanelShowDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelShowDataLayout.createSequentialGroup()
                .addComponent(jLabelShowData, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        jPanelBackground.add(jPanelShowData, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 300, 165, 60));

        jPanelExitButton.setBackground(new java.awt.Color(187, 151, 125));
        jPanelExitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelExitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelExitButtonMouseExited(evt);
            }
        });

        jLabelExitButton.setBackground(new java.awt.Color(106, 94, 94));
        jLabelExitButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelExitButton.setForeground(new java.awt.Color(106, 94, 94));
        jLabelExitButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelExitButton.setText("Salir");
        jLabelExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelExitButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelExitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelExitButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelExitButtonLayout = new javax.swing.GroupLayout(jPanelExitButton);
        jPanelExitButton.setLayout(jPanelExitButtonLayout);
        jPanelExitButtonLayout.setHorizontalGroup(
            jPanelExitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelExitButtonLayout.setVerticalGroup(
            jPanelExitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExitButtonLayout.createSequentialGroup()
                .addComponent(jLabelExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        jPanelBackground.add(jPanelExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 395, 165, 60));

        jPanelHeader.setBackground(new java.awt.Color(248, 230, 230));
        jPanelHeader.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelHeader.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelHeaderMouseDragged(evt);
            }
        });
        jPanelHeader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelHeaderMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanelBackground.add(jPanelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelSaveDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSaveDataMouseEntered
        
    }//GEN-LAST:event_jPanelSaveDataMouseEntered

    private void jPanelSaveDataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSaveDataMouseExited
      
    }//GEN-LAST:event_jPanelSaveDataMouseExited

    private void jLabelSaveDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSaveDataMouseEntered
        jPanelSaveData.setBackground(Color.decode("#AB8B6F"));
        jLabelSaveData.setForeground(Color.decode("#332B2B"));
    }//GEN-LAST:event_jLabelSaveDataMouseEntered

    private void jLabelSaveDataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSaveDataMouseExited
        jPanelSaveData.setBackground(Color.decode("#BB987A"));
        jLabelSaveData.setForeground(Color.decode("#6A5E5E"));
    }//GEN-LAST:event_jLabelSaveDataMouseExited

    private void jLabelSaveDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSaveDataMouseClicked
        DataWindowGui dataWindowGui = new DataWindowGui();
        dataWindowGui.setVisible(true);
        setLocationRelativeTo(null);
        dataWindowGui.setResizable(false);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelSaveDataMouseClicked

    private void jLabelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelExitMouseClicked

    private void jPanelHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanelHeaderMousePressed

    private void jPanelHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jPanelHeaderMouseDragged

    private void jPanelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelExitMouseEntered
        
    }//GEN-LAST:event_jPanelExitMouseEntered

    private void jLabelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseEntered
        jPanelExit.setBackground(Color.red);
        jLabelExit.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabelExitMouseEntered

    private void jLabelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseExited
        jPanelExit.setBackground(Color.decode("#F8E6E6"));
        jLabelExit.setForeground(Color.decode("#CCA685"));
    }//GEN-LAST:event_jLabelExitMouseExited

    private void jLabelShowDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelShowDataMouseClicked

        
        ShowDataWindowGui showDataWindowGui = null;
        try {
            showDataWindowGui = new ShowDataWindowGui();
            FlatMacDarkLaf.setup();
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainWindowGui.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        //raven code
        FlatMacDarkLaf.setup();
        //end raven code
        
        showDataWindowGui.setVisible(true);
        showDataWindowGui.setLocationRelativeTo(null);
        showDataWindowGui.setResizable(false);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelShowDataMouseClicked

    private void jLabelShowDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelShowDataMouseEntered
        jPanelShowData.setBackground(Color.decode("#AB8B6F"));
        jLabelShowData.setForeground(Color.decode("#332B2B"));
    }//GEN-LAST:event_jLabelShowDataMouseEntered

    private void jLabelShowDataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelShowDataMouseExited
        jPanelShowData.setBackground(Color.decode("#BB987A"));
        jLabelShowData.setForeground(Color.decode("#6A5E5E"));
    }//GEN-LAST:event_jLabelShowDataMouseExited

    private void jPanelShowDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelShowDataMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelShowDataMouseEntered

    private void jPanelShowDataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelShowDataMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelShowDataMouseExited

    private void jLabelExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelExitButtonMouseClicked

    private void jLabelExitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitButtonMouseEntered
        jPanelExitButton.setBackground(Color.decode("#AB8B6F"));
        jLabelExitButton.setForeground(Color.decode("#332B2B"));
    }//GEN-LAST:event_jLabelExitButtonMouseEntered

    private void jLabelExitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitButtonMouseExited
        jPanelExitButton.setBackground(Color.decode("#BB987A"));
        jLabelExitButton.setForeground(Color.decode("#6A5E5E"));
    }//GEN-LAST:event_jLabelExitButtonMouseExited

    private void jPanelExitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelExitButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelExitButtonMouseEntered

    private void jPanelExitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelExitButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelExitButtonMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelExitButton;
    private javax.swing.JLabel jLabelPhoto;
    private javax.swing.JLabel jLabelSaveData;
    private javax.swing.JLabel jLabelShowData;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelExit;
    private javax.swing.JPanel jPanelExitButton;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelSaveData;
    private javax.swing.JPanel jPanelShowData;
    // End of variables declaration//GEN-END:variables
}
