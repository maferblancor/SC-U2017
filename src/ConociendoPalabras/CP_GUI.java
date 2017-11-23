/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConociendoPalabras;
import java.util.*;
import java.awt.event.*;

/**
 *
 * @author julio
 */
public class CP_GUI extends javax.swing.JFrame {

   
    //VARIABLES 
    String word = "";    //PALABRA CORRECTA CORRESPONDIENTE A LA IMAGEN MOSTRADA ---- DEBERIAS SER EN MAYUSCULAS
    String picture = "";    //NOMBRE IMAGEN A MOSTRAR
    String text = "";       //TEXTO INGRESADO POR EL USUARIO
    int roundCount = 1;
    int roundTotal = 5;
    int teams = 0;
    int team1Score = 0;
    int team2Score = 0;
    int team3Score = 0;
    List<Palabra> wordList; 
    
    Temporizador temporizador;
    
    ActionListener descontarSegundo = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            temporizador.tictoc();		  

            if (temporizador.getiTime() == 0){
                temporizador.stop();
            }
        }
    };
    
    /**
     * Creates new form CP_GUI
     */
    
    public CP_GUI() {
        
        initComponents();
        
        AppManager.setInstance();
        AppManager.instance.getPalabrasBD();
        
        //Temporizador
        /*
        Sus parametros de inicializacion son los siguiente:
           1-. iTime: Desde que segundo va a empezar el temporizador (no puede ser negativo)
           2-. delay: cuanto tardara el temporizador en descontar 1 segundo, esta en ms
           3-. listener: es la accion que se ejecutara cada 'delay' ms
        El listener va a descontar 1 segundo cada 'delay'ms y al llegar a 0 se detiene.
        
        Usar temporizador.start() para iniciar el temporizador.
        Usar temporizador.stop() para detener el temporizador. (Este lo usa el listener 'descontarSegundo'
        Usar temporizador.restart() para reiniciar el temporizador.
        Usar temporizador.getiTime() para saber en que segundo va el temporizador.
        */
        temporizador = new Temporizador(30,1000, descontarSegundo);
        
        wordList = AppManager.instance.getPalabras();
        word = wordList.get(0).getNombre();
        picture = wordList.get(0).getURLImagen();
        
        //INICIO COMPONENTES
        labPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/words/" + picture)));
        PLAY.setVisible(false);
        labTimeCounter.setVisible(false);
        butBAD.setVisible(false);
        butGOOD.setVisible(false);
        butResetTime.setVisible(false);
        butNext.setVisible(false);
        
        labRoundCounter.setText(roundCount + "/" + roundTotal);
       
    }
         
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HOME = new javax.swing.JPanel();
        butSalir = new javax.swing.JButton();
        butConfig = new javax.swing.JButton();
        butInfo = new javax.swing.JButton();
        butPlay = new javax.swing.JButton();
        bground = new javax.swing.JLabel();
        PLAY = new javax.swing.JPanel();
        butGOOD = new javax.swing.JButton();
        butBAD = new javax.swing.JButton();
        textPicture = new javax.swing.JTextField();
        labRoundCounter = new javax.swing.JLabel();
        labTimeCounter = new javax.swing.JLabel();
        butBackC = new javax.swing.JButton();
        butExitC = new javax.swing.JButton();
        butEnter = new javax.swing.JButton();
        butResetTime = new javax.swing.JButton();
        butStartTime = new javax.swing.JButton();
        butNext = new javax.swing.JButton();
        butShowAnsw = new javax.swing.JButton();
        labText = new javax.swing.JLabel();
        labFramePicture = new javax.swing.JLabel();
        labPicture = new javax.swing.JLabel();
        labBGPicture = new javax.swing.JLabel();
        bground4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONOCIENDO PALABRAS ");
        setMaximumSize(new java.awt.Dimension(1024, 600));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setName("index"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 600));

        HOME.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        butSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/HOME/1_SALIR.png"))); // NOI18N
        butSalir.setBorder(null);
        butSalir.setBorderPainted(false);
        butSalir.setContentAreaFilled(false);
        butSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butSalir.setRolloverEnabled(true);
        butSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/HOME/1_SALIR2p.png"))); // NOI18N
        butSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSalirActionPerformed(evt);
            }
        });
        HOME.add(butSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(893, 499, -1, -1));

        butConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/HOME/1_CONFIG.png"))); // NOI18N
        butConfig.setBorder(null);
        butConfig.setBorderPainted(false);
        butConfig.setContentAreaFilled(false);
        butConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butConfig.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butConfig.setRolloverEnabled(true);
        butConfig.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/HOME/1_CONFIGp.png"))); // NOI18N
        butConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butConfigActionPerformed(evt);
            }
        });
        HOME.add(butConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));

        butInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/HOME/1_ABOUT.png"))); // NOI18N
        butInfo.setBorder(null);
        butInfo.setBorderPainted(false);
        butInfo.setContentAreaFilled(false);
        butInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butInfo.setRolloverEnabled(true);
        butInfo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/HOME/1_ABOUTp.png"))); // NOI18N
        butInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butInfoActionPerformed(evt);
            }
        });
        HOME.add(butInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, -1, -1));

        butPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/HOME/1_PLAY.png"))); // NOI18N
        butPlay.setBorder(null);
        butPlay.setBorderPainted(false);
        butPlay.setContentAreaFilled(false);
        butPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butPlay.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butPlay.setRolloverEnabled(true);
        butPlay.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/HOME/1_PLAYp.png"))); // NOI18N
        butPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPlayActionPerformed(evt);
            }
        });
        HOME.add(butPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, -1, -1));

        bground.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/HOME/1_TITULOyFONDO.png"))); // NOI18N
        bground.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        HOME.add(bground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 600));

        PLAY.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        butGOOD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/GOOD.png"))); // NOI18N
        butGOOD.setBorder(null);
        butGOOD.setBorderPainted(false);
        butGOOD.setContentAreaFilled(false);
        butGOOD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butGOOD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butGOOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butGOODActionPerformed(evt);
            }
        });
        PLAY.add(butGOOD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        butBAD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/BAD.png"))); // NOI18N
        butBAD.setBorder(null);
        butBAD.setBorderPainted(false);
        butBAD.setContentAreaFilled(false);
        butBAD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butBAD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butBAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butBADActionPerformed(evt);
            }
        });
        PLAY.add(butBAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        textPicture.setBackground(new java.awt.Color(250, 250, 250, 0));
        textPicture.setFont(new java.awt.Font("Maiandra GD", 0, 36)); // NOI18N
        textPicture.setForeground(new java.awt.Color(100, 10, 178));
        textPicture.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textPicture.setBorder(null);
        textPicture.setSelectedTextColor(new java.awt.Color(41, 181, 184));
        textPicture.setSelectionColor(new java.awt.Color(200, 200, 200, 150));
        PLAY.add(textPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 360, 50));

        labRoundCounter.setFont(new java.awt.Font("Maiandra GD", 1, 21)); // NOI18N
        labRoundCounter.setForeground(new java.awt.Color(255, 157, 1));
        labRoundCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PLAY.add(labRoundCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 412, 70, 40));

        labTimeCounter.setFont(new java.awt.Font("Maiandra GD", 1, 160)); // NOI18N
        labTimeCounter.setForeground(new java.awt.Color(250, 152, 1));
        labTimeCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTimeCounter.setText("1");
        PLAY.add(labTimeCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 160, 140));

        butBackC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_ATRAS.png"))); // NOI18N
        butBackC.setBorder(null);
        butBackC.setBorderPainted(false);
        butBackC.setContentAreaFilled(false);
        butBackC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butBackC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butBackC.setRolloverEnabled(true);
        butBackC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_ATRASp.png"))); // NOI18N
        butBackC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butBackCActionPerformed(evt);
            }
        });
        PLAY.add(butBackC, new org.netbeans.lib.awtextra.AbsoluteConstraints(893, 499, -1, -1));

        butExitC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_SALIR.png"))); // NOI18N
        butExitC.setBorder(null);
        butExitC.setBorderPainted(false);
        butExitC.setContentAreaFilled(false);
        butExitC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butExitC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butExitC.setRolloverEnabled(true);
        butExitC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_SALIRp.png"))); // NOI18N
        butExitC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butExitCActionPerformed(evt);
            }
        });
        PLAY.add(butExitC, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 515, -1, -1));

        butEnter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/4_ENTER.png"))); // NOI18N
        butEnter.setBorder(null);
        butEnter.setBorderPainted(false);
        butEnter.setContentAreaFilled(false);
        butEnter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butEnter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butEnter.setRolloverEnabled(true);
        butEnter.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/4_ENTERp.png"))); // NOI18N
        butEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butEnterActionPerformed(evt);
            }
        });
        PLAY.add(butEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, -1, -1));

        butResetTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/4_FINAL.png"))); // NOI18N
        butResetTime.setBorder(null);
        butResetTime.setBorderPainted(false);
        butResetTime.setContentAreaFilled(false);
        butResetTime.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butResetTime.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butResetTime.setRolloverEnabled(true);
        butResetTime.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/4_RESET.png"))); // NOI18N
        butResetTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butResetTimeActionPerformed(evt);
            }
        });
        PLAY.add(butResetTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 360, 230));

        butStartTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/4_RELOJ.png"))); // NOI18N
        butStartTime.setBorder(null);
        butStartTime.setBorderPainted(false);
        butStartTime.setContentAreaFilled(false);
        butStartTime.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butStartTime.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butStartTime.setRolloverEnabled(true);
        butStartTime.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/4_RELOJ-AC.png"))); // NOI18N
        butStartTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butStartTimeActionPerformed(evt);
            }
        });
        PLAY.add(butStartTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 360, 230));

        butNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/4_SIGUIENTE.png"))); // NOI18N
        butNext.setBorder(null);
        butNext.setBorderPainted(false);
        butNext.setContentAreaFilled(false);
        butNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butNext.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butNext.setRolloverEnabled(true);
        butNext.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/4_SIGUIENTEp.png"))); // NOI18N
        butNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNextActionPerformed(evt);
            }
        });
        PLAY.add(butNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 297, -1, -1));

        butShowAnsw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/4_CANDADO.png"))); // NOI18N
        butShowAnsw.setBorder(null);
        butShowAnsw.setBorderPainted(false);
        butShowAnsw.setContentAreaFilled(false);
        butShowAnsw.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butShowAnsw.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butShowAnsw.setRolloverEnabled(true);
        butShowAnsw.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/4_CANDADOp.png"))); // NOI18N
        butShowAnsw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butShowAnswActionPerformed(evt);
            }
        });
        PLAY.add(butShowAnsw, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 297, -1, -1));

        labText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/4_CUADRO-TEXTO.png"))); // NOI18N
        labText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PLAY.add(labText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, -1, -1));

        labFramePicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/4_MARCOIMAGEN.png"))); // NOI18N
        labFramePicture.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PLAY.add(labFramePicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        labPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labPicture.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labPicture.setMaximumSize(new java.awt.Dimension(391, 298));
        labPicture.setMinimumSize(new java.awt.Dimension(391, 298));
        labPicture.setPreferredSize(new java.awt.Dimension(391, 298));
        PLAY.add(labPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        labBGPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/4_CUADRO.png"))); // NOI18N
        labBGPicture.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PLAY.add(labBGPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        bground4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bground4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/4_FONDO.png"))); // NOI18N
        bground4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PLAY.add(bground4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PLAY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PLAY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getAccessibleContext().setAccessibleName("index");

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    
    
    private void butInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butInfoActionPerformed

    private void butPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPlayActionPerformed
        // TODO add your handling code here:
        PLAY.setVisible(true);
        HOME.setVisible(false);
    }//GEN-LAST:event_butPlayActionPerformed

    private void butConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butConfigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butConfigActionPerformed

    private void butSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSalirActionPerformed
        // TODO add your handling code here:
        
        //VERIFICA
            //FALTA
            
        //SALE
        System.exit(0);
    }//GEN-LAST:event_butSalirActionPerformed

    private void resetGame(){
    //REINICIA BOTONES
        
        labTimeCounter.setVisible(false);
        butBAD.setVisible(false);
        butGOOD.setVisible(false);
        
        butStartTime.setVisible(true);
        butResetTime.setVisible(false);
        butEnter.setEnabled(true);
        textPicture.setEnabled(true);
        textPicture.setText("");
        labText.setEnabled(true);
        butStartTime.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butStartTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/4_RELOJ.png")));
        butStartTime.setRolloverEnabled(true); 
        butStartTime.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/4_RELOJ-AC.png")));
        labPicture.setIcon(null);
        butShowAnsw.setVisible(true);
        
        butNext.setVisible(false);
        
        //REINICIA VARIABLES
        word = "";    //PALABRA CORRECTA CORRESPONDIENTE A LA IMAGEN MOSTRADA ---- DEBERIAS SER EN MAYUSCULAS
        text = "";       //TEXTO INGRESADO POR EL USUARIO
        picture = "";    //NOMBRE IMAGEN A MOSTRAR
        roundCount = 1;
        roundTotal = 5; 
        teams = 0;
        team1Score = 0;
        team2Score = 0;
        team3Score = 0;
        
        word = wordList.get(0).getNombre();
        picture = wordList.get(0).getURLImagen();
        
        labPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/words/" + picture)));
        
        //REINICIA CONTADOR
        labRoundCounter.setText(roundCount + "/" + roundTotal);
        
        //REINICIA PUNTAJE
            //FALTA        
        //REINICIA DATOS
            //FALTA        
    }
    
    private void butBackCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butBackCActionPerformed
        // TODO add your handling code here:
        
        //VERIFICA
            //FALTA
            
        //CAMBIA VENTANA
        PLAY.setVisible(false);
        HOME.setVisible(true);
        
        //REINICIA JUEGO
        resetGame();
        
    }//GEN-LAST:event_butBackCActionPerformed

    private void butExitCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butExitCActionPerformed
        // TODO add your handling code here:
        
        //VERIFICA
            //FALTA
            
        //SALE
        System.exit(0);
    }//GEN-LAST:event_butExitCActionPerformed

    private void butShowAnswActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butShowAnswActionPerformed
        // TODO add your handling code here:
        textPicture.setText(word);
        butEnter.setEnabled(false);
        butShowAnsw.setVisible(false);
        butNext.setVisible(true);
    }//GEN-LAST:event_butShowAnswActionPerformed

    private void butStartTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butStartTimeActionPerformed
        // TODO add your handling code here:
        butStartTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/4_SEGUNDOS.png")));
        butStartTime.setRolloverEnabled(false);
        butStartTime.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labTimeCounter.setVisible(true);
        
      //TEMPORIZADOR
      
        labTimeCounter.setText("1");
        
      // LUEGO DEL TIEMPO
        
        butEnter.setEnabled(false);
        textPicture.setEnabled(false);
        labText.setEnabled(false);
        
        labTimeCounter.setVisible(false);
        butStartTime.setVisible(false);
        butResetTime.setVisible(true);
                
    }//GEN-LAST:event_butStartTimeActionPerformed

    private void butEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butEnterActionPerformed
        // TODO add your handling code here:
        
        text = textPicture.getText().toUpperCase();
        
        if(text.equals(word)){
            butGOOD.setVisible(true);
        }
        else{ 
            butBAD.setVisible(true);
        }

    }//GEN-LAST:event_butEnterActionPerformed

    private void butResetTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butResetTimeActionPerformed
        // TODO add your handling code here:
        butStartTime.setVisible(true);
        butResetTime.setVisible(false);
        butEnter.setEnabled(true);
        textPicture.setEnabled(true);
        textPicture.setText("");
        labText.setEnabled(true);
        butStartTime.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butStartTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/4_RELOJ.png")));
        butStartTime.setRolloverEnabled(true); 
        butStartTime.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/4_RELOJ-AC.png")));
    }//GEN-LAST:event_butResetTimeActionPerformed

    private void butGOODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butGOODActionPerformed
        // TODO add your handling code here:
        butGOOD.setVisible(false);
        
        roundCount++;
        if (roundCount > roundTotal){
           //LLAMA VENTANA FINAL
            PLAY.setVisible(false);
            HOME.setVisible(true);
           resetGame();
        }
        else{
            labRoundCounter.setText(roundCount + "/" + roundTotal);
            textPicture.setText("");
            
            //DEFINE NUEVA IMAGEN Y PALABRA
            
           word = wordList.get(roundCount - 1).getNombre();
           picture = wordList.get(roundCount - 1).getURLImagen();

            labPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/words/" + picture)));
        } 
    }//GEN-LAST:event_butGOODActionPerformed

    private void butBADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butBADActionPerformed
        // TODO add your handling code here:
        butBAD.setVisible(false);
    }//GEN-LAST:event_butBADActionPerformed

    private void butNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNextActionPerformed
        // TODO add your handling code here:
        
        textPicture.setText("");
        butEnter.setEnabled(true);
        butNext.setVisible(false);
        butShowAnsw.setVisible(true);
        
        //DEFINE NUEVA IMAGEN Y PALABRA
         roundCount++;
        if (roundCount > roundTotal){
           //LLAMA VENTANA FINAL
                       PLAY.setVisible(false);
            HOME.setVisible(true);
           resetGame();
        }
        else{
            labRoundCounter.setText(roundCount + "/" + roundTotal);
            textPicture.setText("");
            
            //DEFINE NUEVA IMAGEN Y PALABRA
            
           word = wordList.get(roundCount - 1).getNombre();
           picture = wordList.get(roundCount - 1).getURLImagen();

            labPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/words/" + picture)));
        } 
    }//GEN-LAST:event_butNextActionPerformed

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
            java.util.logging.Logger.getLogger(CP_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CP_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CP_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CP_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CP_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HOME;
    private javax.swing.JPanel PLAY;
    private javax.swing.JLabel bground;
    private javax.swing.JLabel bground4;
    private javax.swing.JButton butBAD;
    private javax.swing.JButton butBackC;
    private javax.swing.JButton butConfig;
    private javax.swing.JButton butEnter;
    private javax.swing.JButton butExitC;
    private javax.swing.JButton butGOOD;
    private javax.swing.JButton butInfo;
    private javax.swing.JButton butNext;
    private javax.swing.JButton butPlay;
    private javax.swing.JButton butResetTime;
    private javax.swing.JButton butSalir;
    private javax.swing.JButton butShowAnsw;
    private javax.swing.JButton butStartTime;
    private javax.swing.JLabel labBGPicture;
    private javax.swing.JLabel labFramePicture;
    private javax.swing.JLabel labPicture;
    private javax.swing.JLabel labRoundCounter;
    private javax.swing.JLabel labText;
    private javax.swing.JLabel labTimeCounter;
    private javax.swing.JTextField textPicture;
    // End of variables declaration//GEN-END:variables
}
