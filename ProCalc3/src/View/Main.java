/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ControlFile;
import View.Panels.PanelCalc;
import View.Panels.PanelCalculate;
import View.Panels.PanelGraphic;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author yatac
 */
public class Main extends javax.swing.JFrame {

    private ArrayList<JLabel> listaLabels = new ArrayList<>();
    private ArrayList<JPanel> listaJpanel = new ArrayList<>();
    private ArrayList<JPanel> listaForms = new ArrayList<>();
    private String rutas[] = {"/img/buttons/ButtonXY_", "/img/buttons/ButtonGrpahic_", "/img/buttons/ButtonCalc_"};
    private String rute = "";
    private int indexPanel = 0;

    /**
     * Creates new form Main
     */
    public Main() {
        /*Inicializacion de carpeta y archivo*/
        ControlFile.createCarpet();
        ControlFile.createDocument();
        
        initComponents();
        setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));
        autoList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBackground = new Static.FondoPanelOscuro();
        jPanelMenu = new Static.FondoPanelMenu();
        jLabelLogo = new javax.swing.JLabel();
        ButtonXY = new javax.swing.JLabel();
        ButtonGraphic = new javax.swing.JLabel();
        ButtonCalculate = new javax.swing.JLabel();
        jPanelContent = new Static.FondoPanelContent();
        jPanelHead = new Static.FondoPanelHead();
        btnClose = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanelMenu.setBackground(new java.awt.Color(239, 219, 16));

        jLabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/LOGOPC3.png"))); // NOI18N

        ButtonXY.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ButtonXY.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttons/ButtonXY_Inactive.png"))); // NOI18N
        ButtonXY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonXYMouseClicked(evt);
            }
        });

        ButtonGraphic.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ButtonGraphic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttons/ButtonGrpahic_Inactive.png"))); // NOI18N
        ButtonGraphic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonGraphicMouseClicked(evt);
            }
        });

        ButtonCalculate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ButtonCalculate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttons/ButtonCalc_Inactive.png"))); // NOI18N
        ButtonCalculate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonCalculateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ButtonGraphic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
            .addComponent(ButtonCalculate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ButtonXY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(ButtonXY)
                .addGap(35, 35, 35)
                .addComponent(ButtonGraphic, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(ButtonCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelContentLayout = new javax.swing.GroupLayout(jPanelContent);
        jPanelContent.setLayout(jPanelContentLayout);
        jPanelContentLayout.setHorizontalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 744, Short.MAX_VALUE)
        );
        jPanelContentLayout.setVerticalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );

        jPanelHead.setBackground(new java.awt.Color(153, 153, 153));

        btnClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/BtnClose.png"))); // NOI18N
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCloseMouseExited(evt);
            }
        });

        btnMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/BtnMinimize.png"))); // NOI18N
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelHeadLayout = new javax.swing.GroupLayout(jPanelHead);
        jPanelHead.setLayout(jPanelHeadLayout);
        jPanelHeadLayout.setHorizontalGroup(
            jPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeadLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelHeadLayout.setVerticalGroup(
            jPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelBackgroundLayout = new javax.swing.GroupLayout(PanelBackground);
        PanelBackground.setLayout(PanelBackgroundLayout);
        PanelBackgroundLayout.setHorizontalGroup(
            PanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBackgroundLayout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        PanelBackgroundLayout.setVerticalGroup(
            PanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelBackgroundLayout.createSequentialGroup()
                .addComponent(jPanelHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseEntered
        btnClose.setIcon(new ImageIcon(getClass().getResource("/img/icon/BtnCloseRed.png")));
    }//GEN-LAST:event_btnCloseMouseEntered

    private void btnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseExited
        btnClose.setIcon(new ImageIcon(getClass().getResource("/img/icon/BtnClose.png")));
    }//GEN-LAST:event_btnCloseMouseExited

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCloseMouseClicked

    private void ButtonXYMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonXYMouseClicked
        cambiarIconoColor(ButtonXY);
        addContainer(new PanelCalculate(), jPanelContent.getWidth(), jPanelContent.getHeight(), jPanelContent);
    }//GEN-LAST:event_ButtonXYMouseClicked

    private void ButtonGraphicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonGraphicMouseClicked
        cambiarIconoColor(ButtonGraphic);
        addContainer(new PanelGraphic(), jPanelContent.getWidth(), jPanelContent.getHeight(), jPanelContent);
    }//GEN-LAST:event_ButtonGraphicMouseClicked

    private void ButtonCalculateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCalculateMouseClicked
        cambiarIconoColor(ButtonCalculate);
        addContainer(new PanelCalc(), jPanelContent.getWidth(), jPanelContent.getHeight(), jPanelContent);
    }//GEN-LAST:event_ButtonCalculateMouseClicked

    private void btnMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseClicked
       setState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizeMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    /**
     *
     * @param p Panel de Ingreso
     * @param width Ancho
     * @param height Alto
     * @param c contenedor
     */
    public void addContainer(JPanel p, int width, int height, JPanel c) {
        p.setSize(width, height);
        p.setLocation(0, 0);
        c.removeAll();
        c.add(p, BorderLayout.CENTER);
        c.revalidate();
        c.repaint();
    }

    /**
     *
     * @param labelWhite Boton activado
     * 
     */
    public void cambiarIconoColor(JLabel labelWhite) {
        for (int i = 0; i < listaLabels.size(); i++) {
            if (!listaLabels.get(i).equals(labelWhite)) {
                rute = rutas[i] + "Inactive.png";
                listaLabels.get(i).setIcon(new ImageIcon(getClass().getResource(rute)));
            } else {
                rute = rutas[i] + "Active.png";
                listaLabels.get(i).setIcon(new ImageIcon(getClass().getResource(rute)));
            }
        }
    }

    private void autoList() {
        ButtonXY.setIcon(new ImageIcon(getClass().getResource("/img/buttons/ButtonXY_Active.png")));
        addContainer(new PanelCalculate(), jPanelContent.getWidth(), jPanelContent.getHeight(), jPanelContent);
         
        /*JLABEL*/
        listaLabels.add(ButtonXY);
        listaLabels.add(ButtonGraphic);
        listaLabels.add(ButtonCalculate);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ButtonCalculate;
    private javax.swing.JLabel ButtonGraphic;
    private javax.swing.JLabel ButtonXY;
    private javax.swing.JPanel PanelBackground;
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnMinimize;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JPanel jPanelHead;
    private javax.swing.JPanel jPanelMenu;
    // End of variables declaration//GEN-END:variables

}
