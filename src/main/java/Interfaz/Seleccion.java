/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import Interfaz.interfaz;
import java.awt.Color;
import java.awt.Graphics2D;
/**
 *
 * @author alexis
 */
public class Seleccion extends javax.swing.JFrame {

    /**
     * Creates new form Seleccion
     */
    public Seleccion() {
        initComponents();
        muestraInfo();
        
        buttonGroup3.add(NormalButton);
        buttonGroup3.add(CustomizeButton);
    }
    
    public String[] nombres(){
        String nombres[] = new String [6];
        interfaz interfazjugador = new interfaz();
 interfaz simon = new interfaz();
 
        System.out.println(simon.jugadoresCantidad);
        if ( interfazjugador.jugadoresCantidad== 1) {
         nombres[0]= jTextField1.getText();
           
        } else if (interfazjugador.jugadoresCantidad == 2) {
            nombres[0]= jTextField1.getText();
             nombres[1]= jTextField2.getText();
        } else if (interfazjugador.jugadoresCantidad == 3) {
            nombres[0]= jTextField1.getText();
             nombres[1]= jTextField2.getText();
             nombres[2]= jTextField3.getText();
             
        } else if (interfazjugador.jugadoresCantidad == 4) {
              nombres[0]= jTextField1.getText();
             nombres[1]= jTextField2.getText();
             nombres[2]= jTextField3.getText();
             nombres[3]= jTextField4.getText();
            } else if (interfazjugador.jugadoresCantidad == 5) {
               nombres[0]= jTextField1.getText();
             nombres[1]= jTextField2.getText();
             nombres[2]= jTextField3.getText();
             nombres[3]= jTextField4.getText();
             nombres[4]= jTextField5.getText();
            } else if (interfazjugador.jugadoresCantidad == 6) {
           nombres[0]= jTextField1.getText();
             nombres[1]= jTextField2.getText();
             nombres[2]= jTextField3.getText();
             nombres[3]= jTextField4.getText();
             nombres[4]= jTextField5.getText();
             nombres[5]= jTextField6.getText();
                    }
        
        
        return nombres;
    }
    public void muestraInfo(){
 // TODO add your handling code here:
 interfaz interfazjugador = new interfaz();
 interfaz simon = new interfaz();
 
        System.out.println(simon.jugadoresCantidad);
        if ( interfazjugador.jugadoresCantidad== 1) {
            jLabel1.setVisible(true);
            jLabel4.setVisible(false);
            jLabel5.setVisible(false);
            jLabel3.setVisible(false);
            jLabel2.setVisible(false);
            jLabel6.setVisible(false);
          jTextField1.setVisible(true);
            jTextField2.setVisible(false);
            jTextField3.setVisible(false);
           jTextField4.setVisible(false);
            jTextField5.setVisible(false);
            jTextField6.setVisible(false);
           
        } else if (interfazjugador.jugadoresCantidad == 2) {
            jLabel3.setVisible(false);
            jLabel4.setVisible(false);
            jLabel5.setVisible(false);
            jLabel1.setVisible(true);
            jLabel2.setVisible(true);
            jLabel6.setVisible(false);
            jTextField1.setVisible(true);
            jTextField2.setVisible(true);
            jTextField3.setVisible(false);
           jTextField4.setVisible(false);
            jTextField5.setVisible(false);
            jTextField6.setVisible(false);
        } else if (interfazjugador.jugadoresCantidad == 3) {
            jLabel3.setVisible(true);
            jLabel4.setVisible(false);
            jLabel5.setVisible(false);
            jLabel1.setVisible(true);
            jLabel2.setVisible(true);
            jLabel6.setVisible(false);
             jTextField1.setVisible(true);
            jTextField2.setVisible(true);
            jTextField3.setVisible(true);
           jTextField4.setVisible(false);
            jTextField5.setVisible(false);
            jTextField6.setVisible(false);
        } else if (interfazjugador.jugadoresCantidad == 4) {
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(false);
            jLabel1.setVisible(true);
            jLabel2.setVisible(true);
            jLabel6.setVisible(false);
             jTextField1.setVisible(true);
            jTextField2.setVisible(true);
            jTextField3.setVisible(true);
           jTextField4.setVisible(true);
            jTextField5.setVisible(false);
            jTextField6.setVisible(false);
            } else if (interfazjugador.jugadoresCantidad == 5) {
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            jLabel1.setVisible(true);
            jLabel2.setVisible(true);
                         jLabel6.setVisible(false);

             jTextField1.setVisible(true);
            jTextField2.setVisible(true);
            jTextField3.setVisible(true);
           jTextField4.setVisible(true);
            jTextField5.setVisible(true);
            jTextField6.setVisible(false);
            } else if (interfazjugador.jugadoresCantidad == 6) {
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            jLabel1.setVisible(true);
            jLabel2.setVisible(true);
            jLabel6.setVisible(true);
              jTextField1.setVisible(true);
            jTextField2.setVisible(true);
            jTextField3.setVisible(true);
           jTextField4.setVisible(true);
            jTextField5.setVisible(true);
            jTextField6.setVisible(true);
                    }
       // StartScreen.setVisible(false);
       // SecondScreen.setVisible(true);




    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup3 = new javax.swing.ButtonGroup();
        SecondScreen = new javax.swing.JPanel();
        Player1NameField = new javax.swing.JTextField();
        Player2NameField = new javax.swing.JTextField();
        Player3NameField = new javax.swing.JTextField();
        BackToStartScreen = new javax.swing.JButton();
        toStandardOrCustom = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        CustomizeButton = new javax.swing.JRadioButton();
        NormalButton = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SecondScreen.setBackground(new java.awt.Color(102, 102, 255));
        SecondScreen.setPreferredSize(new java.awt.Dimension(1000, 700));

        BackToStartScreen.setText("< Regreso");
        BackToStartScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToStartScreenActionPerformed(evt);
            }
        });

        toStandardOrCustom.setText("Jugar >");
        toStandardOrCustom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toStandardOrCustomActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ingrese el nombre del jugador");

        CustomizeButton.setText("Juego personal");

        NormalButton.setText("Juego estandar");
        NormalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NormalButtonActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Tipo de juego");

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jPanel2.setBackground(java.awt.Color.magenta);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setText("Jugador 1");

        jLabel2.setText("Jugador 2");

        jLabel3.setText("Jugador 3");

        jLabel4.setText("Jugador 4");

        jLabel5.setText("Jugador 5");

        jLabel6.setText("Jugador 6");

        javax.swing.GroupLayout SecondScreenLayout = new javax.swing.GroupLayout(SecondScreen);
        SecondScreen.setLayout(SecondScreenLayout);
        SecondScreenLayout.setHorizontalGroup(
            SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SecondScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SecondScreenLayout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(SecondScreenLayout.createSequentialGroup()
                        .addGap(0, 314, Short.MAX_VALUE)
                        .addGroup(SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SecondScreenLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(SecondScreenLayout.createSequentialGroup()
                                    .addComponent(CustomizeButton)
                                    .addGap(81, 81, 81)
                                    .addComponent(NormalButton))
                                .addGroup(SecondScreenLayout.createSequentialGroup()
                                    .addComponent(BackToStartScreen)
                                    .addGap(81, 81, 81)
                                    .addComponent(toStandardOrCustom)))
                            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, SecondScreenLayout.createSequentialGroup()
                                .addGroup(SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(103, 103, 103)
                                .addGroup(SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SecondScreenLayout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addGroup(SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Player2NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Player3NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SecondScreenLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                                .addComponent(Player1NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91))))))
        );
        SecondScreenLayout.setVerticalGroup(
            SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SecondScreenLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SecondScreenLayout.createSequentialGroup()
                        .addGroup(SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SecondScreenLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(SecondScreenLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(Player1NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(Player2NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Player3NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SecondScreenLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(SecondScreenLayout.createSequentialGroup()
                                .addGroup(SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(SecondScreenLayout.createSequentialGroup()
                                        .addGroup(SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel1)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2))
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(SecondScreenLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addGroup(SecondScreenLayout.createSequentialGroup()
                                .addGroup(SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(SecondScreenLayout.createSequentialGroup()
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33))
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33))
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(126, 126, 126)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CustomizeButton)
                    .addComponent(NormalButton))
                .addGap(60, 60, 60)
                .addGroup(SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackToStartScreen)
                    .addComponent(toStandardOrCustom))
                .addGap(88, 88, 88))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SecondScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 1019, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SecondScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toStandardOrCustomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toStandardOrCustomActionPerformed
        // TODO add your handling code here:

        if (buttonGroup3.getSelection().equals(NormalButton.getModel())) {
            SecondScreen.setVisible(false);
           // CustomGameCreateScreen.setVisible(false);
            juego pantallaj = new juego();
            this.setVisible(false);
            pantallaj.setVisible(true);
            tableroPersonal personal = new tableroPersonal();
            personal.setVisible(false);
            
            nombresArreglo=nombres();
            
        } else if (buttonGroup3.getSelection().equals(CustomizeButton.getModel())) {
            SecondScreen.setVisible(false);
            SnakeAndLadderGame personal = new SnakeAndLadderGame();
            personal.setVisible(true);
            juego pantallaj = new juego();
            this.setVisible(false);
            pantallaj.setVisible(false);
            nombresArreglo=nombres();
           // CustomGameCreateScreen.setVisible(true);
            //StandardGameScreen.setVisible(false);

        }
        
    }//GEN-LAST:event_toStandardOrCustomActionPerformed

    private void BackToStartScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToStartScreenActionPerformed
        // TODO add your handling code here:
        
        interfaz regreso = new interfaz();
        regreso.setVisible(true);
        this.setVisible(false);
        //SecondScreen.setVisible(false);
      //  StartScreen.setVisible(true);
    }//GEN-LAST:event_BackToStartScreenActionPerformed

    private void NormalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NormalButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NormalButtonActionPerformed


    public static String nombresArreglo[]=new String[6]; 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToStartScreen;
    private javax.swing.JRadioButton CustomizeButton;
    private javax.swing.JRadioButton NormalButton;
    private javax.swing.JTextField Player1NameField;
    private javax.swing.JTextField Player2NameField;
    private javax.swing.JTextField Player3NameField;
    private javax.swing.JPanel SecondScreen;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton toStandardOrCustom;
    // End of variables declaration//GEN-END:variables
}
