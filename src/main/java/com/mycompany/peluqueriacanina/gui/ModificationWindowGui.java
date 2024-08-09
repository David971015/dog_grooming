package com.mycompany.peluqueriacanina.gui;

import com.mycompany.peluqueriacanina.logic.LogicController;
import com.mycompany.peluqueriacanina.logic.Pet;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

public class ModificationWindowGui extends javax.swing.JFrame {
    Pet pet;
    int xMouse, yMouse;
    LogicController logicController = null;

    public ModificationWindowGui(int id) {
        logicController = new LogicController();
        initComponents();
        loadTable(id);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackground = new javax.swing.JPanel();
        jPanelBack = new javax.swing.JPanel();
        jLabelBack = new javax.swing.JLabel();
        jPanelCleanData = new javax.swing.JPanel();
        jLabelCleanData = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jPanelDataForm = new javax.swing.JPanel();
        jLabelClientNumber = new javax.swing.JLabel();
        jTextFieldClientNumber = new javax.swing.JTextField();
        jLabelClientName = new javax.swing.JLabel();
        jTextFieldClientName = new javax.swing.JTextField();
        jLabelClientRace = new javax.swing.JLabel();
        jTextFieldClientRace = new javax.swing.JTextField();
        jLabelClientColor = new javax.swing.JLabel();
        jTextFieldClientColor = new javax.swing.JTextField();
        jLabelClientAlergic = new javax.swing.JLabel();
        jLabelClientSpecialAtention = new javax.swing.JLabel();
        jComboBoxAlergic = new javax.swing.JComboBox<>();
        jComboBoxSpecialAtention = new javax.swing.JComboBox<>();
        jTextFieldOwnerName = new javax.swing.JTextField();
        jLabelOwnerName = new javax.swing.JLabel();
        jLabelOwnerPhone = new javax.swing.JLabel();
        jTextFieldOwnerPhone = new javax.swing.JTextField();
        jLabelObservations = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaObservations = new javax.swing.JTextArea();
        jPanelExit = new javax.swing.JPanel();
        jLabelExit = new javax.swing.JLabel();
        jLabelPhoto = new javax.swing.JLabel();
        jPanelHeader = new javax.swing.JPanel();
        jPanelSaveData = new javax.swing.JPanel();
        jLabelSaveData = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanelBackground.setBackground(new java.awt.Color(248, 230, 230));
        jPanelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBack.setBackground(new java.awt.Color(248, 230, 230));
        jPanelBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelBackMouseEntered(evt);
            }
        });

        jLabelBack.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        jLabelBack.setForeground(new java.awt.Color(204, 166, 133));
        jLabelBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBack.setText("<");
        jLabelBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelBack.setPreferredSize(new java.awt.Dimension(30, 30));
        jLabelBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelBackMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelBackLayout = new javax.swing.GroupLayout(jPanelBack);
        jPanelBack.setLayout(jPanelBackLayout);
        jPanelBackLayout.setHorizontalGroup(
            jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackLayout.createSequentialGroup()
                .addComponent(jLabelBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelBackLayout.setVerticalGroup(
            jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackLayout.createSequentialGroup()
                .addComponent(jLabelBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelBackground.add(jPanelBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanelCleanData.setBackground(new java.awt.Color(187, 151, 125));
        jPanelCleanData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelCleanData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelCleanDataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelCleanDataMouseExited(evt);
            }
        });

        jLabelCleanData.setBackground(new java.awt.Color(106, 94, 94));
        jLabelCleanData.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelCleanData.setForeground(new java.awt.Color(106, 94, 94));
        jLabelCleanData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCleanData.setText("Limpiar");
        jLabelCleanData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCleanDataMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCleanDataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCleanDataMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelCleanDataMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelCleanDataMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelCleanDataLayout = new javax.swing.GroupLayout(jPanelCleanData);
        jPanelCleanData.setLayout(jPanelCleanDataLayout);
        jPanelCleanDataLayout.setHorizontalGroup(
            jPanelCleanDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCleanData, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );
        jPanelCleanDataLayout.setVerticalGroup(
            jPanelCleanDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCleanDataLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelCleanData, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelBackground.add(jPanelCleanData, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, 165, 50));

        jLabelTitle.setBackground(new java.awt.Color(106, 94, 94));
        jLabelTitle.setFont(new java.awt.Font("SansSerif", 1, 62)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(168, 137, 110));
        jLabelTitle.setText("Modificación de Datos");
        jPanelBackground.add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jPanelDataForm.setBackground(new java.awt.Color(248, 230, 230));
        jPanelDataForm.setOpaque(false);

        jLabelClientNumber.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabelClientNumber.setForeground(new java.awt.Color(168, 137, 110));
        jLabelClientNumber.setText("Cliente Nº");

        jTextFieldClientNumber.setEditable(false);
        jTextFieldClientNumber.setBackground(new java.awt.Color(224, 208, 208));
        jTextFieldClientNumber.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextFieldClientNumber.setForeground(new java.awt.Color(148, 121, 97));

        jLabelClientName.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabelClientName.setForeground(new java.awt.Color(168, 137, 110));
        jLabelClientName.setText("Nombre");

        jTextFieldClientName.setBackground(new java.awt.Color(224, 208, 208));
        jTextFieldClientName.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextFieldClientName.setForeground(new java.awt.Color(148, 121, 97));

        jLabelClientRace.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabelClientRace.setForeground(new java.awt.Color(168, 137, 110));
        jLabelClientRace.setText("Raza");

        jTextFieldClientRace.setBackground(new java.awt.Color(224, 208, 208));
        jTextFieldClientRace.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextFieldClientRace.setForeground(new java.awt.Color(148, 121, 97));

        jLabelClientColor.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabelClientColor.setForeground(new java.awt.Color(168, 137, 110));
        jLabelClientColor.setText("Color");

        jTextFieldClientColor.setBackground(new java.awt.Color(224, 208, 208));
        jTextFieldClientColor.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextFieldClientColor.setForeground(new java.awt.Color(148, 121, 97));

        jLabelClientAlergic.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabelClientAlergic.setForeground(new java.awt.Color(168, 137, 110));
        jLabelClientAlergic.setText("Alérgico");

        jLabelClientSpecialAtention.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabelClientSpecialAtention.setForeground(new java.awt.Color(168, 137, 110));
        jLabelClientSpecialAtention.setText("Atención Especial");

        jComboBoxAlergic.setBackground(new java.awt.Color(224, 208, 208));
        jComboBoxAlergic.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jComboBoxAlergic.setForeground(new java.awt.Color(148, 121, 97));
        jComboBoxAlergic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SI", "NO" }));
        jComboBoxAlergic.setBorder(null);

        jComboBoxSpecialAtention.setBackground(new java.awt.Color(224, 208, 208));
        jComboBoxSpecialAtention.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jComboBoxSpecialAtention.setForeground(new java.awt.Color(148, 121, 97));
        jComboBoxSpecialAtention.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SI", "NO" }));
        jComboBoxSpecialAtention.setBorder(null);

        jTextFieldOwnerName.setBackground(new java.awt.Color(224, 208, 208));
        jTextFieldOwnerName.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextFieldOwnerName.setForeground(new java.awt.Color(148, 121, 97));

        jLabelOwnerName.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabelOwnerName.setForeground(new java.awt.Color(168, 137, 110));
        jLabelOwnerName.setText("Nombre Dueño");

        jLabelOwnerPhone.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabelOwnerPhone.setForeground(new java.awt.Color(168, 137, 110));
        jLabelOwnerPhone.setText("Celular Dueño");

        jTextFieldOwnerPhone.setBackground(new java.awt.Color(224, 208, 208));
        jTextFieldOwnerPhone.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextFieldOwnerPhone.setForeground(new java.awt.Color(148, 121, 97));

        jLabelObservations.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabelObservations.setForeground(new java.awt.Color(168, 137, 110));
        jLabelObservations.setText("Observaciones");

        jTextAreaObservations.setBackground(new java.awt.Color(224, 208, 208));
        jTextAreaObservations.setColumns(20);
        jTextAreaObservations.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextAreaObservations.setForeground(new java.awt.Color(148, 121, 97));
        jTextAreaObservations.setLineWrap(true);
        jTextAreaObservations.setRows(5);
        jScrollPane1.setViewportView(jTextAreaObservations);

        javax.swing.GroupLayout jPanelDataFormLayout = new javax.swing.GroupLayout(jPanelDataForm);
        jPanelDataForm.setLayout(jPanelDataFormLayout);
        jPanelDataFormLayout.setHorizontalGroup(
            jPanelDataFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDataFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDataFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDataFormLayout.createSequentialGroup()
                        .addComponent(jLabelObservations)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                    .addGroup(jPanelDataFormLayout.createSequentialGroup()
                        .addGroup(jPanelDataFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDataFormLayout.createSequentialGroup()
                                .addComponent(jLabelOwnerPhone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldOwnerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDataFormLayout.createSequentialGroup()
                                .addComponent(jLabelClientNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldClientNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDataFormLayout.createSequentialGroup()
                                .addComponent(jLabelClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDataFormLayout.createSequentialGroup()
                                .addComponent(jLabelClientRace, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldClientRace, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDataFormLayout.createSequentialGroup()
                                .addComponent(jLabelClientColor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldClientColor, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDataFormLayout.createSequentialGroup()
                                .addComponent(jLabelClientAlergic, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxAlergic, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDataFormLayout.createSequentialGroup()
                                .addComponent(jLabelClientSpecialAtention, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxSpecialAtention, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDataFormLayout.createSequentialGroup()
                                .addComponent(jLabelOwnerName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelDataFormLayout.setVerticalGroup(
            jPanelDataFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDataFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDataFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelClientNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldClientNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDataFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDataFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelClientRace, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldClientRace, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDataFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelDataFormLayout.createSequentialGroup()
                        .addComponent(jLabelClientColor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelClientAlergic, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDataFormLayout.createSequentialGroup()
                        .addComponent(jTextFieldClientColor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxAlergic, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDataFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelClientSpecialAtention, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSpecialAtention, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDataFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDataFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOwnerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldOwnerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDataFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDataFormLayout.createSequentialGroup()
                        .addComponent(jLabelObservations, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jScrollPane1)))
        );

        jPanelBackground.add(jPanelDataForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 350, 480));

        jPanelExit.setBackground(new java.awt.Color(248, 230, 230));
        jPanelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelExitMouseEntered(evt);
            }
        });

        jLabelExit.setBackground(new java.awt.Color(204, 166, 133));
        jLabelExit.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        jLabelExit.setForeground(new java.awt.Color(204, 166, 133));
        jLabelExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelExit.setText("X");
        jLabelExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelExit.setPreferredSize(new java.awt.Dimension(40, 40));
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
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(jPanelExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelExitLayout.createSequentialGroup()
                    .addComponent(jLabelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 4, Short.MAX_VALUE)))
        );
        jPanelExitLayout.setVerticalGroup(
            jPanelExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(jPanelExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabelExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelBackground.add(jPanelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 40, 40));

        jLabelPhoto.setIcon(new javax.swing.ImageIcon("C:\\Users\\1\\Documents\\NetBeansProjects\\PeluqueriaCanina\\src\\main\\java\\com\\mycompany\\peluqueriacanina\\gui\\images\\logo.png")); // NOI18N
        jPanelBackground.add(jLabelPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 460, 403));

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
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanelBackground.add(jPanelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 30));

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
        jLabelSaveData.setText("Modificar");
        jLabelSaveData.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabelSaveDataMouseDragged(evt);
            }
        });
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelSaveDataMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelSaveDataMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelSaveDataLayout = new javax.swing.GroupLayout(jPanelSaveData);
        jPanelSaveData.setLayout(jPanelSaveDataLayout);
        jPanelSaveDataLayout.setHorizontalGroup(
            jPanelSaveDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
            .addGroup(jPanelSaveDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelSaveDataLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabelSaveData, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelSaveDataLayout.setVerticalGroup(
            jPanelSaveDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanelSaveDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelSaveDataLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabelSaveData, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanelBackground.add(jPanelSaveData, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 550, 165, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelExitMouseClicked

    private void jLabelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseEntered
        jPanelExit.setBackground(Color.red);
        jLabelExit.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabelExitMouseEntered

    private void jLabelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseExited
        jPanelExit.setBackground(Color.decode("#F8E6E6"));
        jLabelExit.setForeground(Color.decode("#CCA685"));
    }//GEN-LAST:event_jLabelExitMouseExited

    private void jPanelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelExitMouseEntered

    }//GEN-LAST:event_jPanelExitMouseEntered

    private void jPanelHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jPanelHeaderMouseDragged

    private void jPanelHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanelHeaderMousePressed

    private void jLabelCleanDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCleanDataMouseClicked
        jTextFieldClientNumber.setText("");
        jTextFieldClientName.setText("");
        jTextFieldClientRace.setText("");
        jTextFieldClientColor.setText("");
        jComboBoxAlergic.setSelectedIndex(0);
        jComboBoxSpecialAtention.setSelectedIndex(0);
        jTextFieldOwnerName.setText("");
        jTextFieldOwnerPhone.setText("");
        jTextAreaObservations.setText("");
    }//GEN-LAST:event_jLabelCleanDataMouseClicked

    private void jLabelCleanDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCleanDataMouseEntered
        jPanelCleanData.setBackground(Color.decode("#AB8B6F"));
        jLabelCleanData.setForeground(Color.decode("#332B2B"));
    }//GEN-LAST:event_jLabelCleanDataMouseEntered

    private void jLabelCleanDataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCleanDataMouseExited
        jPanelCleanData.setBackground(Color.decode("#BB987A"));
        jLabelCleanData.setForeground(Color.decode("#6A5E5E"));
    }//GEN-LAST:event_jLabelCleanDataMouseExited

    private void jPanelCleanDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCleanDataMouseEntered

    }//GEN-LAST:event_jPanelCleanDataMouseEntered

    private void jPanelCleanDataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCleanDataMouseExited

    }//GEN-LAST:event_jPanelCleanDataMouseExited

    private void jLabelSaveDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSaveDataMouseClicked
    

        logicController.editPet(
                pet,
                jTextFieldClientName.getText(),
                jTextFieldClientRace.getText(),
                jTextFieldClientColor.getText(),
                (String) jComboBoxAlergic.getSelectedItem(),
                (String) jComboBoxSpecialAtention.getSelectedItem(),
                jTextFieldOwnerName.getText(),
                jTextFieldOwnerPhone.getText(),
                jTextAreaObservations.getText()
        );
        
        JOptionPane.showMessageDialog(jPanelBackground, "¡Se modifico la información correctamente!");
        
        try {
            ShowDataWindowGui showDataWindowGui = new ShowDataWindowGui();
            showDataWindowGui.setVisible(true);
            showDataWindowGui.setLocationRelativeTo(null);
            this.dispose();
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ModificationWindowGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabelSaveDataMouseClicked

    private void jLabelSaveDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSaveDataMouseEntered
       jPanelSaveData.setBackground(Color.decode("#AB8B6F"));
       jLabelSaveData.setForeground(Color.decode("#332B2B"));
    }//GEN-LAST:event_jLabelSaveDataMouseEntered

    private void jLabelSaveDataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSaveDataMouseExited
       jPanelSaveData.setBackground(Color.decode("#BB987A"));
       jLabelSaveData.setForeground(Color.decode("#6A5E5E"));
    }//GEN-LAST:event_jLabelSaveDataMouseExited

    private void jPanelSaveDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSaveDataMouseEntered
       
    }//GEN-LAST:event_jPanelSaveDataMouseEntered

    private void jPanelSaveDataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSaveDataMouseExited
        
    }//GEN-LAST:event_jPanelSaveDataMouseExited

    private void jLabelSaveDataMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSaveDataMouseDragged
       
    }//GEN-LAST:event_jLabelSaveDataMouseDragged

    private void jLabelSaveDataMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSaveDataMousePressed
       jPanelSaveData.setBackground(Color.decode("#BB987A"));
       jLabelSaveData.setForeground(Color.decode("#6A5E5E"));
    }//GEN-LAST:event_jLabelSaveDataMousePressed

    private void jLabelCleanDataMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCleanDataMousePressed
       jPanelCleanData.setBackground(Color.decode("#BB987A"));
       jLabelCleanData.setForeground(Color.decode("#6A5E5E"));
    }//GEN-LAST:event_jLabelCleanDataMousePressed

    private void jLabelCleanDataMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCleanDataMouseReleased
       jPanelCleanData.setBackground(Color.decode("#AB8B6F"));
       jLabelCleanData.setForeground(Color.decode("#332B2B"));
    }//GEN-LAST:event_jLabelCleanDataMouseReleased

    private void jLabelSaveDataMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSaveDataMouseReleased
       jPanelSaveData.setBackground(Color.decode("#AB8B6F"));
       jLabelSaveData.setForeground(Color.decode("#332B2B"));
    }//GEN-LAST:event_jLabelSaveDataMouseReleased

    private void jLabelBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBackMouseEntered
        jPanelBack.setBackground(Color.decode("#E8D7D7"));
        jLabelBack.setForeground(Color.decode("#A3856A"));
    }//GEN-LAST:event_jLabelBackMouseEntered

    private void jLabelBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBackMouseExited
        jPanelBack.setBackground(Color.decode("#F8E6E6"));
        jLabelBack.setForeground(Color.decode("#CCA685"));
    }//GEN-LAST:event_jLabelBackMouseExited

    private void jPanelBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBackMouseEntered
        
    }//GEN-LAST:event_jPanelBackMouseEntered

    private void jLabelBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBackMouseClicked
        MainWindowGui mainWindowGui = new MainWindowGui();
        mainWindowGui.setVisible(true);
        mainWindowGui.setLocationRelativeTo(null);
        mainWindowGui.setResizable(false);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelBackMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxAlergic;
    private javax.swing.JComboBox<String> jComboBoxSpecialAtention;
    private javax.swing.JLabel jLabelBack;
    private javax.swing.JLabel jLabelCleanData;
    private javax.swing.JLabel jLabelClientAlergic;
    private javax.swing.JLabel jLabelClientColor;
    private javax.swing.JLabel jLabelClientName;
    private javax.swing.JLabel jLabelClientNumber;
    private javax.swing.JLabel jLabelClientRace;
    private javax.swing.JLabel jLabelClientSpecialAtention;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelObservations;
    private javax.swing.JLabel jLabelOwnerName;
    private javax.swing.JLabel jLabelOwnerPhone;
    private javax.swing.JLabel jLabelPhoto;
    private javax.swing.JLabel jLabelSaveData;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelBack;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelCleanData;
    private javax.swing.JPanel jPanelDataForm;
    private javax.swing.JPanel jPanelExit;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelSaveData;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaObservations;
    private javax.swing.JTextField jTextFieldClientColor;
    private javax.swing.JTextField jTextFieldClientName;
    private javax.swing.JTextField jTextFieldClientNumber;
    private javax.swing.JTextField jTextFieldClientRace;
    private javax.swing.JTextField jTextFieldOwnerName;
    private javax.swing.JTextField jTextFieldOwnerPhone;
    // End of variables declaration//GEN-END:variables

    private void loadTable(int id) {
        this.pet = logicController.findPet(id);
        jTextFieldClientNumber.setText(String.valueOf(pet.getId()));
        jTextFieldClientName.setText(pet.getPetName());
        jTextFieldClientRace.setText(pet.getRace());
        jTextFieldClientColor.setText(pet.getColor());
        jTextFieldOwnerName.setText(pet.getOwner().getName());
        jTextFieldOwnerPhone.setText(pet.getOwner().getPhone());
        jTextAreaObservations.setText(pet.getObservation());
        
        if(pet.getAlergic().equals("SI"))jComboBoxAlergic.setSelectedIndex(1);
        else if(pet.getAlergic().equals("NO"))jComboBoxAlergic.setSelectedIndex(2);
        
        if(pet.getSpeacialAtention().equals("SI"))jComboBoxSpecialAtention.setSelectedIndex(1);
        else if(pet.getSpeacialAtention().equals("NO"))jComboBoxSpecialAtention.setSelectedIndex(2);
    }
}

