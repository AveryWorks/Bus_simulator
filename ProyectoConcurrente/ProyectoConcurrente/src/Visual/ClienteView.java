/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visual;

import Clases.Reloj;
import java.awt.Dimension;
import java.awt.Graphics;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author DerekMSI
 */
public class ClienteView extends javax.swing.JFrame {

    Reloj clockP = new Reloj();
    int z = 0;
    public static String imgbus1 = "Bus1.jpg";
    public static String imgbus2 = "Bus2.jpg";
    public static String imgbus3 = "Bus3.jpg";
    public static String imgbus4 = "Bus4.jpg";
    public static String imgbus5 = "Bus5.jpg";
    public static String imgbus6 = "Bus6.jpg";
    public static String imgbus7 = "Bus7.jpg";
    public static String imgbus8 = "Bus8.jpg";
    public static String imgbus9 = "Bus9.jpg";
    public static String imgbus10 = "Bus10.jpg";
    
    public static String imgparada = "Parada.png";

    public ClienteView() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel_Buttons = new javax.swing.JPanel();
        JButton_Exit = new javax.swing.JButton();
        JButton_Start = new javax.swing.JButton();
        JButton_Stop = new javax.swing.JButton();
        labelHora = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable_Paradas = new javax.swing.JTable();
        PanelParadas = new FondoPanel();
        N4 = new javax.swing.JLabel();
        N3 = new javax.swing.JLabel();
        N2 = new javax.swing.JLabel();
        N1 = new javax.swing.JLabel();
        N5 = new javax.swing.JLabel();
        N6 = new javax.swing.JLabel();
        N7 = new javax.swing.JLabel();
        N8 = new javax.swing.JLabel();
        N9 = new javax.swing.JLabel();
        N10 = new javax.swing.JLabel();
        N11 = new javax.swing.JLabel();
        N12 = new javax.swing.JLabel();
        N13 = new javax.swing.JLabel();
        N14 = new javax.swing.JLabel();
        N15 = new javax.swing.JLabel();
        N16 = new javax.swing.JLabel();
        N17 = new javax.swing.JLabel();
        N18 = new javax.swing.JLabel();
        N19 = new javax.swing.JLabel();
        N20 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BUS SIMULATOR");
        setAutoRequestFocus(false);
        setResizable(false);

        JPanel_Buttons.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        JPanel_Buttons.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        JButton_Exit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JButton_Exit.setText("EXIT");
        JButton_Exit.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));
        JButton_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_ExitActionPerformed(evt);
            }
        });

        JButton_Start.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JButton_Start.setText("START");
        JButton_Start.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));
        JButton_Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_StartActionPerformed(evt);
            }
        });

        JButton_Stop.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JButton_Stop.setText("STOP");
        JButton_Stop.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));
        JButton_Stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_StopActionPerformed(evt);
            }
        });

        labelHora.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        labelHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHora.setText("\"00:00:00\"");

        javax.swing.GroupLayout JPanel_ButtonsLayout = new javax.swing.GroupLayout(JPanel_Buttons);
        JPanel_Buttons.setLayout(JPanel_ButtonsLayout);
        JPanel_ButtonsLayout.setHorizontalGroup(
            JPanel_ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_ButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(JButton_Start, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButton_Stop, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JButton_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        JPanel_ButtonsLayout.setVerticalGroup(
            JPanel_ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_ButtonsLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(JPanel_ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButton_Exit)
                    .addComponent(JButton_Start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButton_Stop))
                .addGap(7, 7, 7))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_ButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        JTable_Paradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"P1-Rafael Angel Perez"},
                {"P2-Super Lian, Hatillo"},
                {"P3-Plasticos Tosso"},
                {"P4-Yamuni, San Francisco"},
                {"P5-Colegio Maria Auxiliadora"},
                {"P6-Escuela Juan Rafael Mora"},
                {"P7-Hotel Caribbean, Amon"},
                {"P8-Parque San Francisco"},
                {"P9-Liceo Jose Joaquin Nuniez"},
                {"P10-AYA Guadalupe"},
                {"P11-Ronda De Betania"},
                {"P12-Colegio Don Bosco"},
                {"P13-Escuela Republica Dominicana"},
                {"P14-Abastecedor Los Sauces"},
                {"P15-Parque de Monte Azul"},
                {"P16-Cevicheria Costa Azul"},
                {"P17-Taller Gernon"},
                {"P18-Plaza America"},
                {"P19-Rest. La Fortuna, hatillo 4"},
                {"P20-Terminal Hatillo"},
            },
            new String [] {
                "Paradas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class

            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTable_Paradas);

        PanelParadas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        N4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Parada.png"))); // NOI18N
        N4.setText("P4");
        N4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        N3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Parada.png"))); // NOI18N
        N3.setText("P3");
        N3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        N2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Parada.png"))); // NOI18N
        N2.setText("P2");
        N2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        N1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Parada.png"))); // NOI18N
        N1.setText("P1");
        N1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        N5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Parada.png"))); // NOI18N
        N5.setText("P5");
        N5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        N6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Parada.png"))); // NOI18N
        N6.setText("P6");
        N6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        N7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Parada.png"))); // NOI18N
        N7.setText("P7");
        N7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        N8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Parada.png"))); // NOI18N
        N8.setText("P8");
        N8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        N9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Parada.png"))); // NOI18N
        N9.setText("P9");
        N9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        N10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Parada.png"))); // NOI18N
        N10.setText("P10");
        N10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        N11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Parada.png"))); // NOI18N
        N11.setText("P11");
        N11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        N12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Parada.png"))); // NOI18N
        N12.setText("P12");
        N12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        N13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Parada.png"))); // NOI18N
        N13.setText("P13");
        N13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        N14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Parada.png"))); // NOI18N
        N14.setText("P14");
        N14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        N15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Parada.png"))); // NOI18N
        N15.setText("P15");
        N15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        N16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Parada.png"))); // NOI18N
        N16.setText("P16");
        N16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        N17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Parada.png"))); // NOI18N
        N17.setText("P17");
        N17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        N18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Parada.png"))); // NOI18N
        N18.setText("P18");
        N18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        N19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Parada.png"))); // NOI18N
        N19.setText("P19");
        N19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        N20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Parada.png"))); // NOI18N
        N20.setText("P20");
        N20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout PanelParadasLayout = new javax.swing.GroupLayout(PanelParadas);
        PanelParadas.setLayout(PanelParadasLayout);
        PanelParadasLayout.setHorizontalGroup(
            PanelParadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelParadasLayout.createSequentialGroup()
                .addGroup(PanelParadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelParadasLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(N7))
                    .addGroup(PanelParadasLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(N1)
                        .addGap(18, 18, 18)
                        .addComponent(N20)
                        .addGap(26, 26, 26)
                        .addComponent(N19))
                    .addGroup(PanelParadasLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(N3))
                    .addGroup(PanelParadasLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(N2))
                    .addGroup(PanelParadasLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(PanelParadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelParadasLayout.createSequentialGroup()
                                .addGroup(PanelParadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelParadasLayout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(N8))
                                    .addComponent(N4)
                                    .addGroup(PanelParadasLayout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(N5)))
                                .addGroup(PanelParadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelParadasLayout.createSequentialGroup()
                                        .addGap(340, 340, 340)
                                        .addGroup(PanelParadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(N18)
                                            .addComponent(N17)
                                            .addComponent(N15)
                                            .addComponent(N16)
                                            .addComponent(N14)))
                                    .addGroup(PanelParadasLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(N9)
                                        .addGap(18, 18, 18)
                                        .addComponent(N10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(N11)
                                        .addGap(18, 18, 18)
                                        .addComponent(N12)
                                        .addGap(18, 18, 18)
                                        .addComponent(N13))))
                            .addComponent(N6))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        PanelParadasLayout.setVerticalGroup(
            PanelParadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelParadasLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(PanelParadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(N1)
                    .addComponent(N20)
                    .addComponent(N19))
                .addGap(8, 8, 8)
                .addGroup(PanelParadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(N2)
                    .addComponent(N18))
                .addGap(18, 18, 18)
                .addGroup(PanelParadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(N17)
                    .addComponent(N3))
                .addGroup(PanelParadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelParadasLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(N16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(N15)
                        .addGap(42, 42, 42)
                        .addComponent(N14)
                        .addGap(62, 62, 62)
                        .addGroup(PanelParadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelParadasLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(PanelParadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(N9)
                                    .addComponent(N10)
                                    .addComponent(N11)
                                    .addComponent(N12)))
                            .addComponent(N13)))
                    .addGroup(PanelParadasLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(N4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(N5)
                        .addGap(18, 18, 18)
                        .addComponent(N6)
                        .addGap(18, 18, 18)
                        .addComponent(N7)
                        .addGap(46, 46, 46)
                        .addComponent(N8)))
                .addGap(326, 326, 326))
        );

        Titulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Titulo.setText("Simulador de Buses-Periferica L1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPanel_Buttons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(PanelParadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(PanelParadas, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(JPanel_Buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButton_StopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_StopActionPerformed
        // TODO add your handling code here:
        if (z == 1) {
            clockP.activo = false;
            JOptionPane.showMessageDialog(ClienteView.this, "Se ha detenido el servidor");
        }
    }//GEN-LAST:event_JButton_StopActionPerformed

    private void JButton_StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_StartActionPerformed
        // TODO add your handling code here:
        if (clockP.isAlive() == false) {
            clockP = new Reloj();
            clockP.activo = true;
            clockP.start();
            z = 1;
        }
    }//GEN-LAST:event_JButton_StartActionPerformed

    private void JButton_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_ExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_JButton_ExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteView().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton_Exit;
    public javax.swing.JButton JButton_Start;
    private javax.swing.JButton JButton_Stop;
    private javax.swing.JPanel JPanel_Buttons;
    public static javax.swing.JTable JTable_Paradas;
    public static javax.swing.JLabel N1;
    public static javax.swing.JLabel N10;
    public static javax.swing.JLabel N11;
    public static javax.swing.JLabel N12;
    public static javax.swing.JLabel N13;
    public static javax.swing.JLabel N14;
    public static javax.swing.JLabel N15;
    public static javax.swing.JLabel N16;
    public static javax.swing.JLabel N17;
    public static javax.swing.JLabel N18;
    public static javax.swing.JLabel N19;
    public static javax.swing.JLabel N2;
    public static javax.swing.JLabel N20;
    public static javax.swing.JLabel N3;
    public static javax.swing.JLabel N4;
    public static javax.swing.JLabel N5;
    public static javax.swing.JLabel N6;
    public static javax.swing.JLabel N7;
    public static javax.swing.JLabel N8;
    public static javax.swing.JLabel N9;
    public javax.swing.JPanel PanelParadas;
    private javax.swing.JLabel Titulo;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel labelHora;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {

        @Override
        public void paint(Graphics g) {
            Dimension dimension = this.getSize();
            ImageIcon icon = new ImageIcon(getClass().getResource("/IMGs/mapaproyecto.png"));
            g.drawImage(icon.getImage(), 0, 0, dimension.width, dimension.height, null);
            setOpaque(false);
            super.paintChildren(g);
        }
    }
}
