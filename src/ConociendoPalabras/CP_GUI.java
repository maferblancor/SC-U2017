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
    int teams = 2;
    int team1Score = 0;
    int team2Score = 0;
    int team3Score = 0;
 
    int level = 1;
    
    List<Palabra> wordList; 
    
    Temporizador temporizador;
    
    ActionListener descontarSegundo = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String tiempo = String.valueOf(temporizador.getiTime());
            labTimeCounter.setText(tiempo);
            
            temporizador.tictoc();

            if (temporizador.getiTime() == -1){
                butEnter.setEnabled(false);
                textPicture.setEnabled(false);
                labText.setEnabled(false);

                labTimeCounter.setVisible(false);
                butStartTime.setVisible(false);
                butResetTime.setVisible(true);
                
                temporizador.stop();
            }
        }
    };
    
    private void resetTimerButton(){
        
        
        labTimeCounter.setVisible(false);
        butStartTime.setVisible(true);
        butStartTime.setEnabled(true);
        
        textPicture.setEnabled(false);
        labText.setEnabled(false);
        
        butStartTime.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butStartTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/4_RELOJ.png")));
        butStartTime.setRolloverEnabled(true); 
        butStartTime.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/4_RELOJ-AC.png")));
    }
    
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
        temporizador = new Temporizador(5,1000, descontarSegundo);
        
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
            
            butEnter.setEnabled(false);
            textPicture.setEnabled(false);
            labText.setEnabled(false);
            
            butPointBG.setVisible(false);
            butPointTeam1.setVisible(false);
            butPointTeam2.setVisible(false);
            butPointTeam3.setVisible(false);
            labPointTeam1.setVisible(false);
            labPointTeam2.setVisible(false);
            labPointTeam3.setVisible(false);
            
        LVL.setVisible(false);
             BACKlvl.setVisible(false);
        
        TEAMS.setVisible(false);
            BACKteams.setVisible(false);
        
        INFO.setVisible(false);
            BACKinfo.setVisible(false);
        
        TAGS.setVisible(false);
            BACKtags.setVisible(false);
       
        FINAL.setVisible(false);
            BACKfinal.setVisible(false);
            scrollWordsT1.getViewport().setOpaque(false);
            scrollWordsT2.getViewport().setOpaque(false);
            scrollWordsT3.getViewport().setOpaque(false);
        
        EXITplay.setVisible(false);
        EXIThome.setVisible(false);
        
        BACKplay.setVisible(false);
       
    }
         
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupTeams = new javax.swing.ButtonGroup();
        groupRounds = new javax.swing.ButtonGroup();
        HOME = new javax.swing.JPanel();
        EXIThome = new javax.swing.JPanel();
        butNoExitHome = new javax.swing.JButton();
        butYesExitHome = new javax.swing.JButton();
        bgroundExit1 = new javax.swing.JLabel();
        butNONE1 = new javax.swing.JButton();
        butSalir = new javax.swing.JButton();
        butConfig = new javax.swing.JButton();
        butInfo = new javax.swing.JButton();
        butPlay = new javax.swing.JButton();
        bground = new javax.swing.JLabel();
        TEAMS = new javax.swing.JPanel();
        BACKteams = new javax.swing.JPanel();
        butNoBackTeams = new javax.swing.JButton();
        butYesBackTeams = new javax.swing.JButton();
        bgroundExit4 = new javax.swing.JLabel();
        butNONE4 = new javax.swing.JButton();
        textTeam3 = new javax.swing.JTextField();
        labTeam3 = new javax.swing.JLabel();
        textTeam2 = new javax.swing.JTextField();
        labTeam2 = new javax.swing.JLabel();
        textTeam1 = new javax.swing.JTextField();
        labTeam1 = new javax.swing.JLabel();
        radTeam2 = new javax.swing.JRadioButton();
        radTeam3 = new javax.swing.JRadioButton();
        radRound5 = new javax.swing.JRadioButton();
        radRound10 = new javax.swing.JRadioButton();
        radRound15 = new javax.swing.JRadioButton();
        radRound20 = new javax.swing.JRadioButton();
        butSummitTeams = new javax.swing.JButton();
        butBackCTeams = new javax.swing.JButton();
        bground3 = new javax.swing.JLabel();
        LVL = new javax.swing.JPanel();
        BACKlvl = new javax.swing.JPanel();
        butNoBackLvl = new javax.swing.JButton();
        butYesBackLvl = new javax.swing.JButton();
        bgroundExit5 = new javax.swing.JLabel();
        butNONE5 = new javax.swing.JButton();
        butLvl1 = new javax.swing.JButton();
        butLvl6 = new javax.swing.JButton();
        butLvl5 = new javax.swing.JButton();
        butLvl3 = new javax.swing.JButton();
        butLvl4 = new javax.swing.JButton();
        butLvl2 = new javax.swing.JButton();
        butLvlPre = new javax.swing.JButton();
        butLvlMat = new javax.swing.JButton();
        butBackCLvl = new javax.swing.JButton();
        bground1 = new javax.swing.JLabel();
        TAGS = new javax.swing.JPanel();
        BACKtags = new javax.swing.JPanel();
        butNoBackTags = new javax.swing.JButton();
        butYesBackTags = new javax.swing.JButton();
        bgroundExit6 = new javax.swing.JLabel();
        butNONE6 = new javax.swing.JButton();
        checkTag6 = new javax.swing.JCheckBox();
        checkTag7 = new javax.swing.JCheckBox();
        checkTag8 = new javax.swing.JCheckBox();
        checkTag9 = new javax.swing.JCheckBox();
        checkTag10 = new javax.swing.JCheckBox();
        checkTag5 = new javax.swing.JCheckBox();
        checkTag4 = new javax.swing.JCheckBox();
        checkTag3 = new javax.swing.JCheckBox();
        checkTag2 = new javax.swing.JCheckBox();
        checkTag1 = new javax.swing.JCheckBox();
        butSummitTags = new javax.swing.JButton();
        butBackCTags = new javax.swing.JButton();
        bground2 = new javax.swing.JLabel();
        PLAY = new javax.swing.JPanel();
        BACKplay = new javax.swing.JPanel();
        butNoBack = new javax.swing.JButton();
        butYesBack = new javax.swing.JButton();
        bgroundExit2 = new javax.swing.JLabel();
        butNONE2 = new javax.swing.JButton();
        EXITplay = new javax.swing.JPanel();
        butNoExit = new javax.swing.JButton();
        butYesExit = new javax.swing.JButton();
        bgroundExit = new javax.swing.JLabel();
        butNONE = new javax.swing.JButton();
        labPointTeam3 = new javax.swing.JLabel();
        butPointTeam3 = new javax.swing.JButton();
        labPointTeam2 = new javax.swing.JLabel();
        butPointTeam2 = new javax.swing.JButton();
        labPointTeam1 = new javax.swing.JLabel();
        butPointTeam1 = new javax.swing.JButton();
        butPointBG = new javax.swing.JButton();
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
        FINAL = new javax.swing.JPanel();
        BACKfinal = new javax.swing.JPanel();
        butNoBackFinal = new javax.swing.JButton();
        butYesBackFinal = new javax.swing.JButton();
        bgroundExit7 = new javax.swing.JLabel();
        butNONE7 = new javax.swing.JButton();
        labT3 = new javax.swing.JLabel();
        labT2 = new javax.swing.JLabel();
        labT1 = new javax.swing.JLabel();
        butBackCFinal = new javax.swing.JButton();
        scrollWordsT1 = new javax.swing.JScrollPane();
        textWordsT1 = new javax.swing.JTextArea();
        scrollWordsT3 = new javax.swing.JScrollPane();
        textWordsT3 = new javax.swing.JTextArea();
        scrollWordsT2 = new javax.swing.JScrollPane();
        textWordsT2 = new javax.swing.JTextArea();
        labScoreT3 = new javax.swing.JLabel();
        labScoreT2 = new javax.swing.JLabel();
        labScoreT1 = new javax.swing.JLabel();
        labWinner = new javax.swing.JLabel();
        bground5 = new javax.swing.JLabel();
        INFO = new javax.swing.JPanel();
        BACKinfo = new javax.swing.JPanel();
        butNoBackInfo = new javax.swing.JButton();
        butYesBackInfo = new javax.swing.JButton();
        bgroundExit3 = new javax.swing.JLabel();
        butNONE3 = new javax.swing.JButton();
        butBackCInfo = new javax.swing.JButton();
        bground6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONOCIENDO PALABRAS ");
        setMaximumSize(new java.awt.Dimension(1024, 600));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setName("index"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 600));

        HOME.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EXIThome.setBackground(new java.awt.Color(250, 250, 250, 0));
        EXIThome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        butNoExitHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_NO.png"))); // NOI18N
        butNoExitHome.setBorder(null);
        butNoExitHome.setBorderPainted(false);
        butNoExitHome.setContentAreaFilled(false);
        butNoExitHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butNoExitHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butNoExitHome.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_NOp.png"))); // NOI18N
        butNoExitHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNoExitHomeActionPerformed(evt);
            }
        });
        EXIThome.add(butNoExitHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, -1, -1));

        butYesExitHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_SI.png"))); // NOI18N
        butYesExitHome.setBorder(null);
        butYesExitHome.setBorderPainted(false);
        butYesExitHome.setContentAreaFilled(false);
        butYesExitHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butYesExitHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butYesExitHome.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_SIp.png"))); // NOI18N
        butYesExitHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butYesExitHomeActionPerformed(evt);
            }
        });
        EXIThome.add(butYesExitHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 310, -1, -1));

        bgroundExit1.setBackground(new java.awt.Color(250, 250, 250, 0));
        bgroundExit1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bgroundExit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_PREGUNTASALIR.png"))); // NOI18N
        bgroundExit1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EXIThome.add(bgroundExit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 600));

        butNONE1.setBorder(null);
        butNONE1.setBorderPainted(false);
        butNONE1.setContentAreaFilled(false);
        butNONE1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butNONE1.setEnabled(false);
        butNONE1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butNONE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNONE1ActionPerformed(evt);
            }
        });
        EXIThome.add(butNONE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 600));

        HOME.add(EXIThome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        butSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/HOME/1_SALIR.png"))); // NOI18N
        butSalir.setBorder(null);
        butSalir.setBorderPainted(false);
        butSalir.setContentAreaFilled(false);
        butSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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

        TEAMS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BACKteams.setBackground(new java.awt.Color(250, 250, 250, 0));
        BACKteams.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        butNoBackTeams.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_NO.png"))); // NOI18N
        butNoBackTeams.setBorder(null);
        butNoBackTeams.setBorderPainted(false);
        butNoBackTeams.setContentAreaFilled(false);
        butNoBackTeams.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butNoBackTeams.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butNoBackTeams.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_NOp.png"))); // NOI18N
        butNoBackTeams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNoBackTeamsActionPerformed(evt);
            }
        });
        BACKteams.add(butNoBackTeams, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, -1, -1));

        butYesBackTeams.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_SI.png"))); // NOI18N
        butYesBackTeams.setBorder(null);
        butYesBackTeams.setBorderPainted(false);
        butYesBackTeams.setContentAreaFilled(false);
        butYesBackTeams.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butYesBackTeams.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butYesBackTeams.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_SIp.png"))); // NOI18N
        butYesBackTeams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butYesBackTeamsActionPerformed(evt);
            }
        });
        BACKteams.add(butYesBackTeams, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 310, -1, -1));

        bgroundExit4.setBackground(new java.awt.Color(250, 250, 250, 0));
        bgroundExit4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bgroundExit4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_PREGUNTAVOLER.png"))); // NOI18N
        bgroundExit4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BACKteams.add(bgroundExit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 600));

        butNONE4.setBorder(null);
        butNONE4.setBorderPainted(false);
        butNONE4.setContentAreaFilled(false);
        butNONE4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butNONE4.setEnabled(false);
        butNONE4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butNONE4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNONE4ActionPerformed(evt);
            }
        });
        BACKteams.add(butNONE4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 600));

        TEAMS.add(BACKteams, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        textTeam3.setBackground(new java.awt.Color(250, 250, 250, 0));
        textTeam3.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        textTeam3.setForeground(new java.awt.Color(100, 10, 178));
        textTeam3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textTeam3.setText("EQUIPO 3");
        textTeam3.setBorder(null);
        textTeam3.setEnabled(false);
        textTeam3.setSelectedTextColor(new java.awt.Color(41, 181, 184));
        textTeam3.setSelectionColor(new java.awt.Color(200, 200, 200, 150));
        TEAMS.add(textTeam3, new org.netbeans.lib.awtextra.AbsoluteConstraints(754, 430, 180, 30));

        labTeam3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTeam3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TEAMS/1-2_E3.png"))); // NOI18N
        labTeam3.setEnabled(false);
        TEAMS.add(labTeam3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, 270, 50));

        textTeam2.setBackground(new java.awt.Color(250, 250, 250, 0));
        textTeam2.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        textTeam2.setForeground(new java.awt.Color(100, 10, 178));
        textTeam2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textTeam2.setText("EQUIPO 2");
        textTeam2.setBorder(null);
        textTeam2.setSelectedTextColor(new java.awt.Color(41, 181, 184));
        textTeam2.setSelectionColor(new java.awt.Color(200, 200, 200, 150));
        TEAMS.add(textTeam2, new org.netbeans.lib.awtextra.AbsoluteConstraints(754, 360, 180, 30));

        labTeam2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTeam2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TEAMS/1-2_E2.png"))); // NOI18N
        labTeam2.setEnabled(false);
        TEAMS.add(labTeam2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, 270, 50));

        textTeam1.setBackground(new java.awt.Color(250, 250, 250, 0));
        textTeam1.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        textTeam1.setForeground(new java.awt.Color(100, 10, 178));
        textTeam1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textTeam1.setText("EQUIPO 1");
        textTeam1.setBorder(null);
        textTeam1.setSelectedTextColor(new java.awt.Color(41, 181, 184));
        textTeam1.setSelectionColor(new java.awt.Color(200, 200, 200, 150));
        textTeam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTeam1ActionPerformed(evt);
            }
        });
        TEAMS.add(textTeam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(752, 290, 180, 30));

        labTeam1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTeam1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TEAMS/1-2_E1.png"))); // NOI18N
        labTeam1.setEnabled(false);
        TEAMS.add(labTeam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 270, 50));

        groupTeams.add(radTeam2);
        radTeam2.setSelected(true);
        radTeam2.setBorder(null);
        radTeam2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radTeam2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TEAMS/1-2_2.png"))); // NOI18N
        radTeam2.setIconTextGap(0);
        radTeam2.setOpaque(false);
        radTeam2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TEAMS/1-2_2.png"))); // NOI18N
        radTeam2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TEAMS/1-2_2p.png"))); // NOI18N
        radTeam2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radTeam2ActionPerformed(evt);
            }
        });
        TEAMS.add(radTeam2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 92, 89));

        groupTeams.add(radTeam3);
        radTeam3.setBorder(null);
        radTeam3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radTeam3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TEAMS/1-2_3.png"))); // NOI18N
        radTeam3.setIconTextGap(0);
        radTeam3.setOpaque(false);
        radTeam3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TEAMS/1-2_3.png"))); // NOI18N
        radTeam3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TEAMS/1-2_3p.png"))); // NOI18N
        radTeam3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radTeam3ActionPerformed(evt);
            }
        });
        TEAMS.add(radTeam3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 92, 89));

        groupRounds.add(radRound5);
        radRound5.setSelected(true);
        radRound5.setBorder(null);
        radRound5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radRound5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TEAMS/1-2_5.png"))); // NOI18N
        radRound5.setIconTextGap(0);
        radRound5.setOpaque(false);
        radRound5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TEAMS/1-2_5.png"))); // NOI18N
        radRound5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TEAMS/1-2_5p.png"))); // NOI18N
        radRound5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radRound5ActionPerformed(evt);
            }
        });
        TEAMS.add(radRound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 92, 89));

        groupRounds.add(radRound10);
        radRound10.setBorder(null);
        radRound10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radRound10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TEAMS/1-2_10.png"))); // NOI18N
        radRound10.setIconTextGap(0);
        radRound10.setOpaque(false);
        radRound10.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TEAMS/1-2_10.png"))); // NOI18N
        radRound10.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TEAMS/1-2_10p.png"))); // NOI18N
        radRound10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radRound10ActionPerformed(evt);
            }
        });
        TEAMS.add(radRound10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 92, 89));

        groupRounds.add(radRound15);
        radRound15.setBorder(null);
        radRound15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radRound15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TEAMS/1-2_15.png"))); // NOI18N
        radRound15.setIconTextGap(0);
        radRound15.setOpaque(false);
        radRound15.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TEAMS/1-2_15.png"))); // NOI18N
        radRound15.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TEAMS/1-2_15p.png"))); // NOI18N
        radRound15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radRound15ActionPerformed(evt);
            }
        });
        TEAMS.add(radRound15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 92, 89));

        groupRounds.add(radRound20);
        radRound20.setBorder(null);
        radRound20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radRound20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TEAMS/1-2_20.png"))); // NOI18N
        radRound20.setIconTextGap(0);
        radRound20.setOpaque(false);
        radRound20.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TEAMS/1-2_20.png"))); // NOI18N
        radRound20.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TEAMS/1-2_20p.png"))); // NOI18N
        radRound20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radRound20ActionPerformed(evt);
            }
        });
        TEAMS.add(radRound20, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 92, 89));

        butSummitTeams.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TEAMS/1-2_OK.png"))); // NOI18N
        butSummitTeams.setBorder(null);
        butSummitTeams.setBorderPainted(false);
        butSummitTeams.setContentAreaFilled(false);
        butSummitTeams.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butSummitTeams.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butSummitTeams.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TEAMS/1-2_OKp.png"))); // NOI18N
        butSummitTeams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSummitTeamsActionPerformed(evt);
            }
        });
        TEAMS.add(butSummitTeams, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 480, 90, -1));

        butBackCTeams.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_ATRAS.png"))); // NOI18N
        butBackCTeams.setBorder(null);
        butBackCTeams.setBorderPainted(false);
        butBackCTeams.setContentAreaFilled(false);
        butBackCTeams.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butBackCTeams.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butBackCTeams.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_ATRASp.png"))); // NOI18N
        butBackCTeams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butBackCTeamsActionPerformed(evt);
            }
        });
        TEAMS.add(butBackCTeams, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 499, 140, -1));

        bground3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bground3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TEAMS/1-2_FONDO.png"))); // NOI18N
        bground3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TEAMS.add(bground3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 600));

        LVL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BACKlvl.setBackground(new java.awt.Color(250, 250, 250, 0));
        BACKlvl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        butNoBackLvl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_NO.png"))); // NOI18N
        butNoBackLvl.setBorder(null);
        butNoBackLvl.setBorderPainted(false);
        butNoBackLvl.setContentAreaFilled(false);
        butNoBackLvl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butNoBackLvl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butNoBackLvl.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_NOp.png"))); // NOI18N
        butNoBackLvl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNoBackLvlActionPerformed(evt);
            }
        });
        BACKlvl.add(butNoBackLvl, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, -1, -1));

        butYesBackLvl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_SI.png"))); // NOI18N
        butYesBackLvl.setBorder(null);
        butYesBackLvl.setBorderPainted(false);
        butYesBackLvl.setContentAreaFilled(false);
        butYesBackLvl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butYesBackLvl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butYesBackLvl.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_SIp.png"))); // NOI18N
        butYesBackLvl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butYesBackLvlActionPerformed(evt);
            }
        });
        BACKlvl.add(butYesBackLvl, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 310, -1, -1));

        bgroundExit5.setBackground(new java.awt.Color(250, 250, 250, 0));
        bgroundExit5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bgroundExit5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_PREGUNTAVOLER.png"))); // NOI18N
        bgroundExit5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BACKlvl.add(bgroundExit5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 600));

        butNONE5.setBorder(null);
        butNONE5.setBorderPainted(false);
        butNONE5.setContentAreaFilled(false);
        butNONE5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butNONE5.setEnabled(false);
        butNONE5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butNONE5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNONE5ActionPerformed(evt);
            }
        });
        BACKlvl.add(butNONE5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 600));

        LVL.add(BACKlvl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        butLvl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/LVL/2_PRIMERO.png"))); // NOI18N
        butLvl1.setBorder(null);
        butLvl1.setBorderPainted(false);
        butLvl1.setContentAreaFilled(false);
        butLvl1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butLvl1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/LVL/2_PRIMEROp.png"))); // NOI18N
        butLvl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butLvl1ActionPerformed(evt);
            }
        });
        LVL.add(butLvl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        butLvl6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/LVL/2_SEXTO.png"))); // NOI18N
        butLvl6.setBorder(null);
        butLvl6.setBorderPainted(false);
        butLvl6.setContentAreaFilled(false);
        butLvl6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butLvl6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/LVL/2_SEXTOp.png"))); // NOI18N
        butLvl6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butLvl6ActionPerformed(evt);
            }
        });
        LVL.add(butLvl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 405, -1, -1));

        butLvl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/LVL/2_QUINTO-.png"))); // NOI18N
        butLvl5.setBorder(null);
        butLvl5.setBorderPainted(false);
        butLvl5.setContentAreaFilled(false);
        butLvl5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butLvl5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/LVL/2_QUINTOp.png"))); // NOI18N
        butLvl5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butLvl5ActionPerformed(evt);
            }
        });
        LVL.add(butLvl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 418, -1, -1));

        butLvl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/LVL/2_TERCERO.png"))); // NOI18N
        butLvl3.setBorder(null);
        butLvl3.setBorderPainted(false);
        butLvl3.setContentAreaFilled(false);
        butLvl3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butLvl3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/LVL/2_TERCEROp.png"))); // NOI18N
        butLvl3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butLvl3ActionPerformed(evt);
            }
        });
        LVL.add(butLvl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, -1));

        butLvl4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/LVL/2_CUARTO.png"))); // NOI18N
        butLvl4.setBorder(null);
        butLvl4.setBorderPainted(false);
        butLvl4.setContentAreaFilled(false);
        butLvl4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butLvl4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/LVL/2_CUARTOp.png"))); // NOI18N
        butLvl4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butLvl4ActionPerformed(evt);
            }
        });
        LVL.add(butLvl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 328, -1, -1));

        butLvl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/LVL/2_SEGUNDO.png"))); // NOI18N
        butLvl2.setBorder(null);
        butLvl2.setBorderPainted(false);
        butLvl2.setContentAreaFilled(false);
        butLvl2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butLvl2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/LVL/2_SEGUNDOp.png"))); // NOI18N
        butLvl2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butLvl2ActionPerformed(evt);
            }
        });
        LVL.add(butLvl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, -1, -1));

        butLvlPre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/LVL/2_PREESCOLAR.png"))); // NOI18N
        butLvlPre.setBorder(null);
        butLvlPre.setBorderPainted(false);
        butLvlPre.setContentAreaFilled(false);
        butLvlPre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butLvlPre.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/LVL/2_PREESCOLARp.png"))); // NOI18N
        butLvlPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butLvlPreActionPerformed(evt);
            }
        });
        LVL.add(butLvlPre, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        butLvlMat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/LVL/2_MATERNAL.png"))); // NOI18N
        butLvlMat.setBorder(null);
        butLvlMat.setBorderPainted(false);
        butLvlMat.setContentAreaFilled(false);
        butLvlMat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butLvlMat.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/LVL/2_MATERNALp.png"))); // NOI18N
        butLvlMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butLvlMatActionPerformed(evt);
            }
        });
        LVL.add(butLvlMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));

        butBackCLvl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_ATRAS.png"))); // NOI18N
        butBackCLvl.setBorder(null);
        butBackCLvl.setBorderPainted(false);
        butBackCLvl.setContentAreaFilled(false);
        butBackCLvl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butBackCLvl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butBackCLvl.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_ATRASp.png"))); // NOI18N
        butBackCLvl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butBackCLvlActionPerformed(evt);
            }
        });
        LVL.add(butBackCLvl, new org.netbeans.lib.awtextra.AbsoluteConstraints(893, 499, -1, -1));

        bground1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bground1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/LVL/2_TITULO.png"))); // NOI18N
        bground1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LVL.add(bground1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 600));

        TAGS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BACKtags.setBackground(new java.awt.Color(250, 250, 250, 0));
        BACKtags.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        butNoBackTags.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_NO.png"))); // NOI18N
        butNoBackTags.setBorder(null);
        butNoBackTags.setBorderPainted(false);
        butNoBackTags.setContentAreaFilled(false);
        butNoBackTags.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butNoBackTags.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butNoBackTags.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_NOp.png"))); // NOI18N
        butNoBackTags.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNoBackTagsActionPerformed(evt);
            }
        });
        BACKtags.add(butNoBackTags, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, -1, -1));

        butYesBackTags.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_SI.png"))); // NOI18N
        butYesBackTags.setBorder(null);
        butYesBackTags.setBorderPainted(false);
        butYesBackTags.setContentAreaFilled(false);
        butYesBackTags.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butYesBackTags.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butYesBackTags.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_SIp.png"))); // NOI18N
        butYesBackTags.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butYesBackTagsActionPerformed(evt);
            }
        });
        BACKtags.add(butYesBackTags, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 310, -1, -1));

        bgroundExit6.setBackground(new java.awt.Color(250, 250, 250, 0));
        bgroundExit6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bgroundExit6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_PREGUNTAVOLER.png"))); // NOI18N
        bgroundExit6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BACKtags.add(bgroundExit6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 600));

        butNONE6.setBorder(null);
        butNONE6.setBorderPainted(false);
        butNONE6.setContentAreaFilled(false);
        butNONE6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butNONE6.setEnabled(false);
        butNONE6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butNONE6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNONE6ActionPerformed(evt);
            }
        });
        BACKtags.add(butNONE6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 600));

        TAGS.add(BACKtags, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        checkTag6.setFont(new java.awt.Font("Maiandra GD", 1, 22)); // NOI18N
        checkTag6.setForeground(new java.awt.Color(100, 10, 178));
        checkTag6.setBorder(null);
        checkTag6.setContentAreaFilled(false);
        checkTag6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkTag6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_UNCHECKBOX.png"))); // NOI18N
        checkTag6.setIconTextGap(12);
        checkTag6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_UNCHECKBOX.png"))); // NOI18N
        checkTag6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_CHECKBOX.png"))); // NOI18N
        checkTag6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_CHECKBOX.png"))); // NOI18N
        TAGS.add(checkTag6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 200, 60));

        checkTag7.setFont(new java.awt.Font("Maiandra GD", 1, 22)); // NOI18N
        checkTag7.setForeground(new java.awt.Color(100, 10, 178));
        checkTag7.setBorder(null);
        checkTag7.setContentAreaFilled(false);
        checkTag7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkTag7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_UNCHECKBOX.png"))); // NOI18N
        checkTag7.setIconTextGap(12);
        checkTag7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_UNCHECKBOX.png"))); // NOI18N
        checkTag7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_CHECKBOX.png"))); // NOI18N
        checkTag7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_CHECKBOX.png"))); // NOI18N
        TAGS.add(checkTag7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 200, 60));

        checkTag8.setFont(new java.awt.Font("Maiandra GD", 1, 22)); // NOI18N
        checkTag8.setForeground(new java.awt.Color(100, 10, 178));
        checkTag8.setBorder(null);
        checkTag8.setContentAreaFilled(false);
        checkTag8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkTag8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_UNCHECKBOX.png"))); // NOI18N
        checkTag8.setIconTextGap(12);
        checkTag8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_UNCHECKBOX.png"))); // NOI18N
        checkTag8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_CHECKBOX.png"))); // NOI18N
        checkTag8.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_CHECKBOX.png"))); // NOI18N
        TAGS.add(checkTag8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 200, 60));

        checkTag9.setFont(new java.awt.Font("Maiandra GD", 1, 22)); // NOI18N
        checkTag9.setForeground(new java.awt.Color(100, 10, 178));
        checkTag9.setBorder(null);
        checkTag9.setContentAreaFilled(false);
        checkTag9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkTag9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_UNCHECKBOX.png"))); // NOI18N
        checkTag9.setIconTextGap(12);
        checkTag9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_UNCHECKBOX.png"))); // NOI18N
        checkTag9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_CHECKBOX.png"))); // NOI18N
        checkTag9.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_CHECKBOX.png"))); // NOI18N
        TAGS.add(checkTag9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 200, 60));

        checkTag10.setFont(new java.awt.Font("Maiandra GD", 1, 22)); // NOI18N
        checkTag10.setForeground(new java.awt.Color(100, 10, 178));
        checkTag10.setBorder(null);
        checkTag10.setContentAreaFilled(false);
        checkTag10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkTag10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_UNCHECKBOX.png"))); // NOI18N
        checkTag10.setIconTextGap(12);
        checkTag10.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_UNCHECKBOX.png"))); // NOI18N
        checkTag10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_CHECKBOX.png"))); // NOI18N
        checkTag10.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_CHECKBOX.png"))); // NOI18N
        TAGS.add(checkTag10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 200, 60));

        checkTag5.setFont(new java.awt.Font("Maiandra GD", 1, 22)); // NOI18N
        checkTag5.setForeground(new java.awt.Color(100, 10, 178));
        checkTag5.setBorder(null);
        checkTag5.setContentAreaFilled(false);
        checkTag5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkTag5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_UNCHECKBOX.png"))); // NOI18N
        checkTag5.setIconTextGap(12);
        checkTag5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_UNCHECKBOX.png"))); // NOI18N
        checkTag5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_CHECKBOX.png"))); // NOI18N
        checkTag5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_CHECKBOX.png"))); // NOI18N
        TAGS.add(checkTag5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 200, 60));

        checkTag4.setFont(new java.awt.Font("Maiandra GD", 1, 22)); // NOI18N
        checkTag4.setForeground(new java.awt.Color(100, 10, 178));
        checkTag4.setBorder(null);
        checkTag4.setContentAreaFilled(false);
        checkTag4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkTag4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_UNCHECKBOX.png"))); // NOI18N
        checkTag4.setIconTextGap(12);
        checkTag4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_UNCHECKBOX.png"))); // NOI18N
        checkTag4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_CHECKBOX.png"))); // NOI18N
        checkTag4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_CHECKBOX.png"))); // NOI18N
        TAGS.add(checkTag4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 200, 60));

        checkTag3.setFont(new java.awt.Font("Maiandra GD", 1, 22)); // NOI18N
        checkTag3.setForeground(new java.awt.Color(100, 10, 178));
        checkTag3.setBorder(null);
        checkTag3.setContentAreaFilled(false);
        checkTag3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkTag3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_UNCHECKBOX.png"))); // NOI18N
        checkTag3.setIconTextGap(12);
        checkTag3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_UNCHECKBOX.png"))); // NOI18N
        checkTag3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_CHECKBOX.png"))); // NOI18N
        checkTag3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_CHECKBOX.png"))); // NOI18N
        TAGS.add(checkTag3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 200, 60));

        checkTag2.setFont(new java.awt.Font("Maiandra GD", 1, 22)); // NOI18N
        checkTag2.setForeground(new java.awt.Color(100, 10, 178));
        checkTag2.setBorder(null);
        checkTag2.setContentAreaFilled(false);
        checkTag2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkTag2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_UNCHECKBOX.png"))); // NOI18N
        checkTag2.setIconTextGap(12);
        checkTag2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_UNCHECKBOX.png"))); // NOI18N
        checkTag2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_CHECKBOX.png"))); // NOI18N
        checkTag2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_CHECKBOX.png"))); // NOI18N
        TAGS.add(checkTag2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 200, 60));

        checkTag1.setFont(new java.awt.Font("Maiandra GD", 1, 22)); // NOI18N
        checkTag1.setForeground(new java.awt.Color(100, 10, 178));
        checkTag1.setBorder(null);
        checkTag1.setContentAreaFilled(false);
        checkTag1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkTag1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_UNCHECKBOX.png"))); // NOI18N
        checkTag1.setIconTextGap(12);
        checkTag1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_UNCHECKBOX.png"))); // NOI18N
        checkTag1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_CHECKBOX.png"))); // NOI18N
        checkTag1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_CHECKBOX.png"))); // NOI18N
        TAGS.add(checkTag1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 200, 60));

        butSummitTags.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TEAMS/1-2_OK.png"))); // NOI18N
        butSummitTags.setBorder(null);
        butSummitTags.setBorderPainted(false);
        butSummitTags.setContentAreaFilled(false);
        butSummitTags.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butSummitTags.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butSummitTags.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TEAMS/1-2_OKp.png"))); // NOI18N
        butSummitTags.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSummitTagsActionPerformed(evt);
            }
        });
        TAGS.add(butSummitTags, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 500, 90, -1));

        butBackCTags.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_ATRAS.png"))); // NOI18N
        butBackCTags.setBorder(null);
        butBackCTags.setBorderPainted(false);
        butBackCTags.setContentAreaFilled(false);
        butBackCTags.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butBackCTags.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butBackCTags.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_ATRASp.png"))); // NOI18N
        butBackCTags.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butBackCTagsActionPerformed(evt);
            }
        });
        TAGS.add(butBackCTags, new org.netbeans.lib.awtextra.AbsoluteConstraints(893, 499, -1, -1));

        bground2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bground2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/TAGS/3_FONDO.png"))); // NOI18N
        bground2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TAGS.add(bground2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 600));

        PLAY.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BACKplay.setBackground(new java.awt.Color(250, 250, 250, 0));
        BACKplay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        butNoBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_NO.png"))); // NOI18N
        butNoBack.setBorder(null);
        butNoBack.setBorderPainted(false);
        butNoBack.setContentAreaFilled(false);
        butNoBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butNoBack.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butNoBack.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_NOp.png"))); // NOI18N
        butNoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNoBackActionPerformed(evt);
            }
        });
        BACKplay.add(butNoBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, -1, -1));

        butYesBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_SI.png"))); // NOI18N
        butYesBack.setBorder(null);
        butYesBack.setBorderPainted(false);
        butYesBack.setContentAreaFilled(false);
        butYesBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butYesBack.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butYesBack.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_SIp.png"))); // NOI18N
        butYesBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butYesBackActionPerformed(evt);
            }
        });
        BACKplay.add(butYesBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 310, -1, -1));

        bgroundExit2.setBackground(new java.awt.Color(250, 250, 250, 0));
        bgroundExit2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bgroundExit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_PREGUNTAVOLER.png"))); // NOI18N
        bgroundExit2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BACKplay.add(bgroundExit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 600));

        butNONE2.setBorder(null);
        butNONE2.setBorderPainted(false);
        butNONE2.setContentAreaFilled(false);
        butNONE2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butNONE2.setEnabled(false);
        butNONE2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butNONE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNONE2ActionPerformed(evt);
            }
        });
        BACKplay.add(butNONE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 600));

        PLAY.add(BACKplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        EXITplay.setBackground(new java.awt.Color(250, 250, 250, 0));
        EXITplay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        butNoExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_NO.png"))); // NOI18N
        butNoExit.setBorder(null);
        butNoExit.setBorderPainted(false);
        butNoExit.setContentAreaFilled(false);
        butNoExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butNoExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butNoExit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_NOp.png"))); // NOI18N
        butNoExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNoExitActionPerformed(evt);
            }
        });
        EXITplay.add(butNoExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, -1, -1));

        butYesExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_SI.png"))); // NOI18N
        butYesExit.setBorder(null);
        butYesExit.setBorderPainted(false);
        butYesExit.setContentAreaFilled(false);
        butYesExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butYesExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butYesExit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_SIp.png"))); // NOI18N
        butYesExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butYesExitActionPerformed(evt);
            }
        });
        EXITplay.add(butYesExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 310, -1, -1));

        bgroundExit.setBackground(new java.awt.Color(250, 250, 250, 0));
        bgroundExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bgroundExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_PREGUNTASALIR.png"))); // NOI18N
        bgroundExit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EXITplay.add(bgroundExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 600));

        butNONE.setBorder(null);
        butNONE.setBorderPainted(false);
        butNONE.setContentAreaFilled(false);
        butNONE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butNONE.setEnabled(false);
        butNONE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butNONE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNONEActionPerformed(evt);
            }
        });
        EXITplay.add(butNONE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 600));

        PLAY.add(EXITplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        labPointTeam3.setFont(new java.awt.Font("Maiandra GD", 1, 28)); // NOI18N
        labPointTeam3.setForeground(new java.awt.Color(51, 65, 82));
        labPointTeam3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labPointTeam3.setText("EQUIPO 3");
        labPointTeam3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labPointTeam3.setEnabled(false);
        PLAY.add(labPointTeam3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 250, 50));

        butPointTeam3.setFont(new java.awt.Font("Maiandra GD", 1, 28)); // NOI18N
        butPointTeam3.setForeground(new java.awt.Color(51, 65, 82));
        butPointTeam3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/4_t3.png"))); // NOI18N
        butPointTeam3.setBorder(null);
        butPointTeam3.setBorderPainted(false);
        butPointTeam3.setContentAreaFilled(false);
        butPointTeam3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butPointTeam3.setEnabled(false);
        butPointTeam3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butPointTeam3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/4_t3p.png"))); // NOI18N
        butPointTeam3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPointTeam3ActionPerformed(evt);
            }
        });
        PLAY.add(butPointTeam3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 290, 190));

        labPointTeam2.setFont(new java.awt.Font("Maiandra GD", 1, 28)); // NOI18N
        labPointTeam2.setForeground(new java.awt.Color(51, 65, 82));
        labPointTeam2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labPointTeam2.setText("EQUIPO 2");
        labPointTeam2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PLAY.add(labPointTeam2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 250, 50));

        butPointTeam2.setFont(new java.awt.Font("Maiandra GD", 1, 28)); // NOI18N
        butPointTeam2.setForeground(new java.awt.Color(51, 65, 82));
        butPointTeam2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/4_t2.png"))); // NOI18N
        butPointTeam2.setBorder(null);
        butPointTeam2.setBorderPainted(false);
        butPointTeam2.setContentAreaFilled(false);
        butPointTeam2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butPointTeam2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butPointTeam2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/4_t2p.png"))); // NOI18N
        butPointTeam2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPointTeam2ActionPerformed(evt);
            }
        });
        PLAY.add(butPointTeam2, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 290, -1, 190));

        labPointTeam1.setFont(new java.awt.Font("Maiandra GD", 1, 28)); // NOI18N
        labPointTeam1.setForeground(new java.awt.Color(51, 65, 82));
        labPointTeam1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labPointTeam1.setText("EQUIPO 1");
        labPointTeam1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PLAY.add(labPointTeam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 250, 50));

        butPointTeam1.setFont(new java.awt.Font("Maiandra GD", 1, 28)); // NOI18N
        butPointTeam1.setForeground(new java.awt.Color(51, 65, 82));
        butPointTeam1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/4_t1.png"))); // NOI18N
        butPointTeam1.setBorder(null);
        butPointTeam1.setBorderPainted(false);
        butPointTeam1.setContentAreaFilled(false);
        butPointTeam1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butPointTeam1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butPointTeam1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/4_t1p.png"))); // NOI18N
        butPointTeam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPointTeam1ActionPerformed(evt);
            }
        });
        PLAY.add(butPointTeam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 290, 190));

        butPointBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/4_PUNTO.png"))); // NOI18N
        butPointBG.setBorder(null);
        butPointBG.setBorderPainted(false);
        butPointBG.setContentAreaFilled(false);
        butPointBG.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        butPointBG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butPointBG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPointBGActionPerformed(evt);
            }
        });
        PLAY.add(butPointBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 600));

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

        labTimeCounter.setFont(new java.awt.Font("Maiandra GD", 1, 100)); // NOI18N
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
        butStartTime.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/4_SEGUNDOS.png"))); // NOI18N
        butStartTime.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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

        FINAL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BACKfinal.setBackground(new java.awt.Color(250, 250, 250, 0));
        BACKfinal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        butNoBackFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_NO.png"))); // NOI18N
        butNoBackFinal.setBorder(null);
        butNoBackFinal.setBorderPainted(false);
        butNoBackFinal.setContentAreaFilled(false);
        butNoBackFinal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butNoBackFinal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butNoBackFinal.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_NOp.png"))); // NOI18N
        butNoBackFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNoBackFinalActionPerformed(evt);
            }
        });
        BACKfinal.add(butNoBackFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, -1, -1));

        butYesBackFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_SI.png"))); // NOI18N
        butYesBackFinal.setBorder(null);
        butYesBackFinal.setBorderPainted(false);
        butYesBackFinal.setContentAreaFilled(false);
        butYesBackFinal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butYesBackFinal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butYesBackFinal.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_SIp.png"))); // NOI18N
        butYesBackFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butYesBackFinalActionPerformed(evt);
            }
        });
        BACKfinal.add(butYesBackFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 310, -1, -1));

        bgroundExit7.setBackground(new java.awt.Color(250, 250, 250, 0));
        bgroundExit7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bgroundExit7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_PREGUNTAVOLER.png"))); // NOI18N
        bgroundExit7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BACKfinal.add(bgroundExit7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 600));

        butNONE7.setBorder(null);
        butNONE7.setBorderPainted(false);
        butNONE7.setContentAreaFilled(false);
        butNONE7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butNONE7.setEnabled(false);
        butNONE7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butNONE7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNONE7ActionPerformed(evt);
            }
        });
        BACKfinal.add(butNONE7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 600));

        FINAL.add(BACKfinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        labT3.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        labT3.setForeground(new java.awt.Color(51, 65, 82));
        labT3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labT3.setText("EQUIPO 3");
        FINAL.add(labT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, 120, 30));

        labT2.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        labT2.setForeground(new java.awt.Color(51, 65, 82));
        labT2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labT2.setText("EQUIPO 2");
        FINAL.add(labT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 130, 125, 30));

        labT1.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        labT1.setForeground(new java.awt.Color(51, 65, 82));
        labT1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labT1.setText("EQUIPO 1");
        FINAL.add(labT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 120, 30));

        butBackCFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_ATRAS.png"))); // NOI18N
        butBackCFinal.setBorder(null);
        butBackCFinal.setBorderPainted(false);
        butBackCFinal.setContentAreaFilled(false);
        butBackCFinal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butBackCFinal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butBackCFinal.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_ATRASp.png"))); // NOI18N
        butBackCFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butBackCFinalActionPerformed(evt);
            }
        });
        FINAL.add(butBackCFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(893, 499, -1, -1));

        scrollWordsT1.setBackground(new java.awt.Color(250, 250, 250, 0));
        scrollWordsT1.setBorder(null);
        scrollWordsT1.setForeground(new java.awt.Color(41, 181, 184));
        scrollWordsT1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollWordsT1.setFont(new java.awt.Font("Maiandra GD", 0, 24)); // NOI18N
        scrollWordsT1.setOpaque(false);

        textWordsT1.setEditable(false);
        textWordsT1.setBackground(new java.awt.Color(250, 250, 250, 0));
        textWordsT1.setColumns(1);
        textWordsT1.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        textWordsT1.setForeground(new java.awt.Color(41, 181, 184));
        textWordsT1.setRows(5);
        textWordsT1.setText("\n");
        textWordsT1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(250, 250, 250, 0))); // NOI18N
        textWordsT1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        textWordsT1.setDisabledTextColor(new java.awt.Color(41, 181, 184));
        textWordsT1.setEnabled(false);
        textWordsT1.setOpaque(false);
        scrollWordsT1.setViewportView(textWordsT1);

        FINAL.add(scrollWordsT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 175, 110, 330));

        scrollWordsT3.setBackground(new java.awt.Color(250, 250, 250, 0));
        scrollWordsT3.setBorder(null);
        scrollWordsT3.setForeground(new java.awt.Color(41, 181, 184));
        scrollWordsT3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollWordsT3.setFont(new java.awt.Font("Maiandra GD", 0, 24)); // NOI18N
        scrollWordsT3.setOpaque(false);

        textWordsT3.setEditable(false);
        textWordsT3.setBackground(new java.awt.Color(250, 250, 250, 0));
        textWordsT3.setColumns(1);
        textWordsT3.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        textWordsT3.setForeground(new java.awt.Color(41, 181, 184));
        textWordsT3.setRows(5);
        textWordsT3.setText("\n");
        textWordsT3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(250, 250, 250, 0))); // NOI18N
        textWordsT3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        textWordsT3.setDisabledTextColor(new java.awt.Color(41, 181, 184));
        textWordsT3.setEnabled(false);
        textWordsT3.setOpaque(false);
        scrollWordsT3.setViewportView(textWordsT3);

        FINAL.add(scrollWordsT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(831, 175, 110, 330));

        scrollWordsT2.setBackground(new java.awt.Color(250, 250, 250, 0));
        scrollWordsT2.setBorder(null);
        scrollWordsT2.setForeground(new java.awt.Color(41, 181, 184));
        scrollWordsT2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollWordsT2.setFont(new java.awt.Font("Maiandra GD", 0, 24)); // NOI18N
        scrollWordsT2.setOpaque(false);

        textWordsT2.setEditable(false);
        textWordsT2.setBackground(new java.awt.Color(250, 250, 250, 0));
        textWordsT2.setColumns(1);
        textWordsT2.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        textWordsT2.setForeground(new java.awt.Color(41, 181, 184));
        textWordsT2.setRows(5);
        textWordsT2.setText("\n");
        textWordsT2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(250, 250, 250, 0))); // NOI18N
        textWordsT2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        textWordsT2.setDisabledTextColor(new java.awt.Color(41, 181, 184));
        textWordsT2.setEnabled(false);
        textWordsT2.setOpaque(false);
        scrollWordsT2.setViewportView(textWordsT2);

        FINAL.add(scrollWordsT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 175, 110, 330));

        labScoreT3.setFont(new java.awt.Font("Maiandra GD", 1, 32)); // NOI18N
        labScoreT3.setForeground(new java.awt.Color(51, 65, 82));
        labScoreT3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labScoreT3.setText("0");
        FINAL.add(labScoreT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 520, 130, 50));

        labScoreT2.setFont(new java.awt.Font("Maiandra GD", 1, 32)); // NOI18N
        labScoreT2.setForeground(new java.awt.Color(51, 65, 82));
        labScoreT2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labScoreT2.setText("0");
        FINAL.add(labScoreT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 520, 120, 50));

        labScoreT1.setFont(new java.awt.Font("Maiandra GD", 1, 32)); // NOI18N
        labScoreT1.setForeground(new java.awt.Color(51, 65, 82));
        labScoreT1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labScoreT1.setText("0");
        FINAL.add(labScoreT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, 120, 50));

        labWinner.setFont(new java.awt.Font("Maiandra GD", 1, 30)); // NOI18N
        labWinner.setForeground(new java.awt.Color(100, 10, 178));
        labWinner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FINAL.add(labWinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 413, 220, 60));

        bground5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bground5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/FINAL/5_FONDO.png"))); // NOI18N
        bground5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        FINAL.add(bground5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 600));

        INFO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BACKinfo.setBackground(new java.awt.Color(250, 250, 250, 0));
        BACKinfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        butNoBackInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_NO.png"))); // NOI18N
        butNoBackInfo.setBorder(null);
        butNoBackInfo.setBorderPainted(false);
        butNoBackInfo.setContentAreaFilled(false);
        butNoBackInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butNoBackInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butNoBackInfo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_NOp.png"))); // NOI18N
        butNoBackInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNoBackInfoActionPerformed(evt);
            }
        });
        BACKinfo.add(butNoBackInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, -1, -1));

        butYesBackInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_SI.png"))); // NOI18N
        butYesBackInfo.setBorder(null);
        butYesBackInfo.setBorderPainted(false);
        butYesBackInfo.setContentAreaFilled(false);
        butYesBackInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butYesBackInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butYesBackInfo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_SIp.png"))); // NOI18N
        butYesBackInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butYesBackInfoActionPerformed(evt);
            }
        });
        BACKinfo.add(butYesBackInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 310, -1, -1));

        bgroundExit3.setBackground(new java.awt.Color(250, 250, 250, 0));
        bgroundExit3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bgroundExit3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_PREGUNTAVOLER.png"))); // NOI18N
        bgroundExit3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BACKinfo.add(bgroundExit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 600));

        butNONE3.setBorder(null);
        butNONE3.setBorderPainted(false);
        butNONE3.setContentAreaFilled(false);
        butNONE3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butNONE3.setEnabled(false);
        butNONE3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butNONE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNONE3ActionPerformed(evt);
            }
        });
        BACKinfo.add(butNONE3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 600));

        INFO.add(BACKinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        butBackCInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_ATRAS.png"))); // NOI18N
        butBackCInfo.setBorder(null);
        butBackCInfo.setBorderPainted(false);
        butBackCInfo.setContentAreaFilled(false);
        butBackCInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butBackCInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butBackCInfo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/c_ATRASp.png"))); // NOI18N
        butBackCInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butBackCInfoActionPerformed(evt);
            }
        });
        INFO.add(butBackCInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(893, 499, -1, -1));

        bground6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bground6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/INFO.png"))); // NOI18N
        bground6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        INFO.add(bground6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 600));

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
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LVL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TAGS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TEAMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(FINAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(INFO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LVL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TAGS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TEAMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(FINAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(INFO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getAccessibleContext().setAccessibleName("index");

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    
    
    private void butInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butInfoActionPerformed
        // TODO add your handling code here:
        INFO.setVisible(true);
        HOME.setVisible(false);
    }//GEN-LAST:event_butInfoActionPerformed

    private void butPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPlayActionPerformed
        // TODO add your handling code here:
        TEAMS.setVisible(true);
        HOME.setVisible(false);
    }//GEN-LAST:event_butPlayActionPerformed

    private void butConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butConfigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butConfigActionPerformed

    private void butSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSalirActionPerformed
        EXIThome.setVisible(true);
    }//GEN-LAST:event_butSalirActionPerformed

    private void resetGame(){
    //REINICIA BOTONES
    
        //TEAMS
        groupRounds.clearSelection();
        radRound5.setSelected(true);
        groupTeams.clearSelection();
        radTeam2.setSelected(true);
        textTeam1.setText("EQUIPO 1");
        textTeam2.setText("EQUIPO 2");
        textTeam3.setText("EQUIPO 3");
        labTeam1.setEnabled(true);
        labTeam2.setEnabled(true);
        labTeam3.setEnabled(false);
        textTeam1.setEnabled(true);
        textTeam2.setEnabled(true);
        textTeam3.setEnabled(false);
        
        //TAGS
        
        checkTag1.setText("");
        checkTag2.setText("");
        checkTag3.setText("");
        checkTag4.setText("");
        checkTag5.setText("");
        checkTag6.setText("");
        checkTag7.setText("");
        checkTag8.setText("");
        checkTag9.setText("");
        checkTag10.setText("");
        
        checkTag1.setSelected(false);
        checkTag2.setSelected(false);
        checkTag3.setSelected(false);
        checkTag4.setSelected(false);
        checkTag5.setSelected(false);
        checkTag6.setSelected(false);
        checkTag7.setSelected(false);
        checkTag8.setSelected(false);
        checkTag9.setSelected(false);
        checkTag10.setSelected(false);
        
        //BACK PANELS
        BACKplay.setVisible(false);
        BACKteams.setVisible(false);
        BACKlvl.setVisible(false);
        BACKtags.setVisible(false);
        BACKfinal.setVisible(false);
        
        
        //PLAY
        labTimeCounter.setVisible(false);
        butBAD.setVisible(false);
        butGOOD.setVisible(false);
        
        butEnter.setEnabled(false);
        textPicture.setEnabled(false);
        labText.setEnabled(false);
        
        butStartTime.setVisible(true);
        butResetTime.setVisible(false);
        butEnter.setEnabled(false);
        textPicture.setEnabled(false);
        textPicture.setText("");
        labText.setEnabled(false);
        butStartTime.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butStartTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/4_RELOJ.png")));
        butStartTime.setRolloverEnabled(true); 
        butStartTime.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/4_RELOJ-AC.png")));
        labPicture.setIcon(null);
        butShowAnsw.setVisible(true);
        butNext.setVisible(false);
        
        butPointBG.setVisible(false);
        butPointTeam1.setVisible(false);
        butPointTeam2.setVisible(false);
        butPointTeam3.setVisible(false);
        labPointTeam1.setVisible(false);
        labPointTeam2.setVisible(false);
        labPointTeam3.setVisible(false);
        
        //REINICIA VARIABLES
        word = "";    //PALABRA CORRECTA CORRESPONDIENTE A LA IMAGEN MOSTRADA ---- DEBERIAS SER EN MAYUSCULAS
        text = "";       //TEXTO INGRESADO POR EL USUARIO
        picture = "";    //NOMBRE IMAGEN A MOSTRAR
        roundCount = 1;
        roundTotal = 5; 
        teams = 2;
        team1Score = 0;
        team2Score = 0;
        team3Score = 0;

        level = 1;
        
               
        word = wordList.get(0).getNombre();
        picture = wordList.get(0).getURLImagen();
        
        labPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/words/" + picture)));
        
        //REINICIO DE TEMPORIZADOR        
        
        temporizador.stop();
        butStartTime.setEnabled(true);
        
        //REINICIA CONTADOR
        labRoundCounter.setText(roundCount + "/" + roundTotal);
        
        //REINICIA PUNTAJE
            //FALTA        
        //REINICIA DATOS
            //FALTA        
    }
    
    private void butBackCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butBackCActionPerformed
        BACKplay.setVisible(true);
    }//GEN-LAST:event_butBackCActionPerformed

    private void butExitCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butExitCActionPerformed
        // TODO add your handling code here:
        
        EXITplay.setVisible(true);
    }//GEN-LAST:event_butExitCActionPerformed

    private void butShowAnswActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butShowAnswActionPerformed
        // TODO add your handling code here:
        textPicture.setText(word);
        butEnter.setEnabled(false);
        butShowAnsw.setVisible(false);
        butNext.setVisible(true);
        labText.setEnabled(true);
        
        textPicture.setEnabled(false);
        temporizador.stop();
    }//GEN-LAST:event_butShowAnswActionPerformed

    private void butStartTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butStartTimeActionPerformed
        // TODO add your handling code here:
        butStartTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/4_SEGUNDOS.png")));
        butStartTime.setRolloverEnabled(false);
        butStartTime.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labTimeCounter.setVisible(true);
        
      // HABILITA CUADRO TEXTO  
        butEnter.setEnabled(true);
        textPicture.setEnabled(true);
        labText.setEnabled(true);
        
      //TEMPORIZADOR
      
        butStartTime.setEnabled(false);
        butEnter.setEnabled(true);
        labText.setEnabled(true);
        textPicture.setEnabled(true);
        
        temporizador.startAt(29);
        labTimeCounter.setText(String.valueOf(temporizador.getiTime() + 1));
        
        
      // LUEGO DEL TIEMPO
        
        /*De esto se encarga la accion descontarSegundo() en la linea 31*/
                
    }//GEN-LAST:event_butStartTimeActionPerformed

    private void butEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butEnterActionPerformed
        // TODO add your handling code here:
        
        text = textPicture.getText().toUpperCase();
        
        if(text.equals(word)){
            butGOOD.setVisible(true);
            temporizador.stop();
        }
        else{ 
            butBAD.setVisible(true);
            temporizador.stop();
        }

    }//GEN-LAST:event_butEnterActionPerformed

    private void butResetTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butResetTimeActionPerformed
        // TODO add your handling code here:
        butStartTime.setVisible(true);
        butResetTime.setVisible(false);
        butEnter.setEnabled(false);
        textPicture.setEnabled(false);
        labText.setEnabled(false);
        butStartTime.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butStartTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/4_RELOJ.png")));
        butStartTime.setRolloverEnabled(true); 
        butStartTime.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gui/PLAY/4_RELOJ-AC.png")));
        
        //Para reiniciar el temporizador
        butStartTime.setEnabled(true);
        
    }//GEN-LAST:event_butResetTimeActionPerformed

    private void butGOODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butGOODActionPerformed
        // TODO add your handling code here:
        butGOOD.setVisible(false);
        resetTimerButton();
        
        textPicture.setEnabled(false);
        butEnter.setEnabled(false);

        butPointBG.setVisible(true);
        butPointTeam1.setVisible(true);
        butPointTeam2.setVisible(true);
        butPointTeam3.setVisible(true);
        labPointTeam1.setVisible(true);
        labPointTeam2.setVisible(true);
        labPointTeam3.setVisible(true);
    }//GEN-LAST:event_butGOODActionPerformed

    private void butBADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butBADActionPerformed
        // TODO add your handling code here:
        butBAD.setVisible(false);
        resetTimerButton();
    }//GEN-LAST:event_butBADActionPerformed

    private void butNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNextActionPerformed
        // TODO add your handling code here:
        
        textPicture.setText("");
        butNext.setVisible(false);
        butShowAnsw.setVisible(true);
        

        resetTimerButton();

        butEnter.setEnabled(false);
        textPicture.setEnabled(false);
        labText.setEnabled(false);

        
        //DEFINE NUEVA IMAGEN Y PALABRA
         roundCount++;
        if (roundCount > roundTotal){
           //LLAMA VENTANA FINAL
            PLAY.setVisible(false);
            FINAL.setVisible(true);
            
            labScoreT1.setText("" + team1Score);
            labScoreT2.setText("" + team2Score);
            labScoreT3.setText("" + team3Score);
            
            if (team1Score > team2Score){
                if (team1Score > team3Score){
                    labWinner.setText(textTeam1.getText().toUpperCase());
                }
                else if (team1Score < team3Score){
                    labWinner.setText(textTeam3.getText().toUpperCase());
                }
                else if (team1Score == team3Score){
                    labWinner.setText("EMPATE");
                }
            }
            else if (team1Score < team2Score){
                if (team2Score > team3Score){
                    labWinner.setText(textTeam2.getText().toUpperCase());
                }
                else if (team2Score < team3Score){
                    labWinner.setText(textTeam3.getText().toUpperCase());
                }
                else if (team2Score == team3Score){
                    labWinner.setText("EMPATE");
                }
            }
            else if (team1Score == team2Score){
                if (team2Score < team3Score){
                    labWinner.setText(textTeam3.getText().toUpperCase());
                }
                else labWinner.setText("EMPATE");
            }
            else labWinner.setText("ERROR");
            
            
            
           //resetGame();
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

    private void butYesExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butYesExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_butYesExitActionPerformed

    private void butNoExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNoExitActionPerformed
        // TODO add your handling code here:
        EXITplay.setVisible(false);
    }//GEN-LAST:event_butNoExitActionPerformed

    private void butNONEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNONEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butNONEActionPerformed

    private void butNoExitHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNoExitHomeActionPerformed
       EXIThome.setVisible(false);
    }//GEN-LAST:event_butNoExitHomeActionPerformed

    private void butYesExitHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butYesExitHomeActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_butYesExitHomeActionPerformed

    private void butNONE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNONE1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butNONE1ActionPerformed

    private void butNoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNoBackActionPerformed
        // TODO add your handling code here:
        BACKplay.setVisible(false);
    }//GEN-LAST:event_butNoBackActionPerformed

    private void butYesBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butYesBackActionPerformed

        PLAY.setVisible(false);
        HOME.setVisible(true);
        
        resetGame();
    }//GEN-LAST:event_butYesBackActionPerformed

    private void butNONE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNONE2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butNONE2ActionPerformed

    private void butNoBackInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNoBackInfoActionPerformed
        // TODO add your handling code here:
        BACKinfo.setVisible(false);        
    }//GEN-LAST:event_butNoBackInfoActionPerformed

    private void butYesBackInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butYesBackInfoActionPerformed
        // TODO add your handling code here:
        
        INFO.setVisible(false);
        HOME.setVisible(true);
        
        BACKinfo.setVisible(false);
    }//GEN-LAST:event_butYesBackInfoActionPerformed

    private void butNONE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNONE3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butNONE3ActionPerformed

    private void butBackCInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butBackCInfoActionPerformed
        // TODO add your handling code here:
        BACKinfo.setVisible(true);       
    }//GEN-LAST:event_butBackCInfoActionPerformed

    private void butNoBackTeamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNoBackTeamsActionPerformed
        // TODO add your handling code here:
        BACKteams.setVisible(false);
    }//GEN-LAST:event_butNoBackTeamsActionPerformed

    private void butYesBackTeamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butYesBackTeamsActionPerformed
        // TODO add your handling code here:
        HOME.setVisible(true);
        TEAMS.setVisible(false);
        
        resetGame();
        
    }//GEN-LAST:event_butYesBackTeamsActionPerformed

    private void butNONE4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNONE4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butNONE4ActionPerformed

    private void butBackCTeamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butBackCTeamsActionPerformed
        // TODO add your handling code here:
        BACKteams.setVisible(true);
    }//GEN-LAST:event_butBackCTeamsActionPerformed

    private void butNoBackLvlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNoBackLvlActionPerformed
        // TODO add your handling code here:
        BACKlvl.setVisible(false);
    }//GEN-LAST:event_butNoBackLvlActionPerformed

    private void butYesBackLvlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butYesBackLvlActionPerformed
        // TODO add your handling code here:
        LVL.setVisible(false);
        HOME.setVisible(true);
        
        resetGame();
    }//GEN-LAST:event_butYesBackLvlActionPerformed

    private void butNONE5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNONE5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butNONE5ActionPerformed

    private void butBackCLvlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butBackCLvlActionPerformed
        // TODO add your handling code here:
        BACKlvl.setVisible(true);
    }//GEN-LAST:event_butBackCLvlActionPerformed

    private void butNoBackTagsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNoBackTagsActionPerformed
        // TODO add your handling code here:
        BACKtags.setVisible(false);
    }//GEN-LAST:event_butNoBackTagsActionPerformed

    private void butYesBackTagsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butYesBackTagsActionPerformed
        // TODO add your handling code here:
        BACKtags.setVisible(false);
        TAGS.setVisible(false);
        HOME.setVisible(true);
        
        resetGame();
    }//GEN-LAST:event_butYesBackTagsActionPerformed

    private void butNONE6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNONE6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butNONE6ActionPerformed

    private void butBackCTagsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butBackCTagsActionPerformed
        // TODO add your handling code here:
        BACKtags.setVisible(true);
    }//GEN-LAST:event_butBackCTagsActionPerformed

    private void butNoBackFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNoBackFinalActionPerformed
        // TODO add your handling code here:
        BACKfinal.setVisible(false);
    }//GEN-LAST:event_butNoBackFinalActionPerformed

    private void butYesBackFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butYesBackFinalActionPerformed
        // TODO add your handling code here:
        BACKfinal.setVisible(false);
        FINAL.setVisible(false);
        HOME.setVisible(true);
        
        resetGame();
    }//GEN-LAST:event_butYesBackFinalActionPerformed

    private void butNONE7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNONE7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butNONE7ActionPerformed

    private void butBackCFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butBackCFinalActionPerformed
        // TODO add your handling code here:
        BACKfinal.setVisible(true);
    }//GEN-LAST:event_butBackCFinalActionPerformed

    private void radTeam3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radTeam3ActionPerformed
        // TODO add your handling code here:
        labTeam1.setEnabled(true);
        labTeam2.setEnabled(true);
        labTeam3.setEnabled(true);
        textTeam1.setEnabled(true);
        textTeam2.setEnabled(true);
        textTeam3.setEnabled(true);
        
        teams = 3;
        
        butPointTeam3.setEnabled(true);
        labPointTeam3.setEnabled(true);
    }//GEN-LAST:event_radTeam3ActionPerformed

    private void radTeam2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radTeam2ActionPerformed
        // TODO add your handling code here:
        labTeam1.setEnabled(true);
        labTeam2.setEnabled(true);
        labTeam3.setEnabled(false);
        textTeam1.setEnabled(true);
        textTeam2.setEnabled(true);
        textTeam3.setEnabled(false);
        
        butPointTeam3.setEnabled(false);
        labPointTeam3.setEnabled(false);
        
        teams = 2;
    }//GEN-LAST:event_radTeam2ActionPerformed

    private void butSummitTeamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSummitTeamsActionPerformed
        // TODO add your handling code here:
        TEAMS.setVisible(false);
        LVL.setVisible(true);
        
        labPointTeam1.setText(textTeam1.getText().toUpperCase());
        labPointTeam2.setText(textTeam2.getText().toUpperCase());
        labPointTeam3.setText(textTeam3.getText().toUpperCase());
        labT1.setText(textTeam1.getText().toUpperCase());
        labT2.setText(textTeam2.getText().toUpperCase());
        labT3.setText(textTeam3.getText().toUpperCase());
                
        //ESCRIBE NUMERO DE RONDAS 
        labRoundCounter.setText(roundCount + "/" + roundTotal);
    }//GEN-LAST:event_butSummitTeamsActionPerformed

    private void radRound5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radRound5ActionPerformed
        // TODO add your handling code here:
        roundTotal = 5;
    }//GEN-LAST:event_radRound5ActionPerformed

    private void radRound10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radRound10ActionPerformed
        // TODO add your handling code here:
        roundTotal = 10;
    }//GEN-LAST:event_radRound10ActionPerformed

    private void radRound15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radRound15ActionPerformed
        // TODO add your handling code here:
        roundTotal = 15;
    }//GEN-LAST:event_radRound15ActionPerformed

    private void radRound20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radRound20ActionPerformed
        // TODO add your handling code here:
        roundTotal = 20;
    }//GEN-LAST:event_radRound20ActionPerformed

    private void butLvlMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLvlMatActionPerformed
        // TODO add your handling code here:
        level = -1;
        LVL.setVisible(false);
        PLAY.setVisible(true);
    }//GEN-LAST:event_butLvlMatActionPerformed

    private void butLvlPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLvlPreActionPerformed
        // TODO add your handling code here:
        level = 0;
        LVL.setVisible(false);
        PLAY.setVisible(true);
    }//GEN-LAST:event_butLvlPreActionPerformed

    private void butLvl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLvl1ActionPerformed
        // TODO add your handling code here:
        level = 1;
        LVL.setVisible(false);
        TAGS.setVisible(true);
    }//GEN-LAST:event_butLvl1ActionPerformed

    private void butLvl2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLvl2ActionPerformed
        // TODO add your handling code here:
        level = 2;
        LVL.setVisible(false);
        PLAY.setVisible(true);
    }//GEN-LAST:event_butLvl2ActionPerformed

    private void butLvl3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLvl3ActionPerformed
        // TODO add your handling code here:
        level = 3;
        LVL.setVisible(false);
        PLAY.setVisible(true);
    }//GEN-LAST:event_butLvl3ActionPerformed

    private void butLvl4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLvl4ActionPerformed
        // TODO add your handling code here:
        level = 4;
        LVL.setVisible(false);
        PLAY.setVisible(true);
    }//GEN-LAST:event_butLvl4ActionPerformed

    private void butLvl5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLvl5ActionPerformed
        // TODO add your handling code here:
        level = 5;
        LVL.setVisible(false);
        PLAY.setVisible(true);
    }//GEN-LAST:event_butLvl5ActionPerformed

    private void butLvl6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLvl6ActionPerformed
        // TODO add your handling code here:
        level = 6;
        LVL.setVisible(false);
        PLAY.setVisible(true);
    }//GEN-LAST:event_butLvl6ActionPerformed

    private void butSummitTagsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSummitTagsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butSummitTagsActionPerformed

    private void butPointBGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPointBGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butPointBGActionPerformed

    private void butPointTeam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPointTeam1ActionPerformed
        // TODO add your handling code here:
        butPointBG.setVisible(false);
        butPointTeam1.setVisible(false);
        butPointTeam2.setVisible(false);
        butPointTeam3.setVisible(false);
        labPointTeam1.setVisible(false);
        labPointTeam2.setVisible(false);
        labPointTeam3.setVisible(false);
        
        team1Score++;  
        
        if (team1Score == 1) {
            textWordsT1.setText(" - " + word);
        }
        else textWordsT1.setText(textWordsT1.getText() + "\n - " + word);
        
        roundCount++;
        
        if (roundCount > roundTotal){
           //LLAMA VENTANA FINAL
            PLAY.setVisible(false);
            FINAL.setVisible(true);
            
            labScoreT1.setText("" + team1Score);
            labScoreT2.setText("" + team2Score);
            labScoreT3.setText("" + team3Score);
                      
            if (team1Score > team2Score){
                if (team1Score > team3Score){
                    labWinner.setText(textTeam1.getText().toUpperCase());
                }
                else if (team1Score < team3Score){
                    labWinner.setText(textTeam3.getText().toUpperCase());
                }
                else if (team1Score == team3Score){
                    labWinner.setText("EMPATE");
                }
            }
            else if (team1Score < team2Score){
                if (team2Score > team3Score){
                    labWinner.setText(textTeam2.getText().toUpperCase());
                }
                else if (team2Score < team3Score){
                    labWinner.setText(textTeam3.getText().toUpperCase());
                }
                else if (team2Score == team3Score){
                    labWinner.setText("EMPATE");
                }
            }
            else if (team1Score == team2Score){
                if (team2Score < team3Score){
                    labWinner.setText(textTeam3.getText().toUpperCase());
                }
                else labWinner.setText("EMPATE");
            }
            else labWinner.setText("ERROR");
            
            // EN LA VENTANA FINAL DEBE HACER EL RESET
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
    }//GEN-LAST:event_butPointTeam1ActionPerformed

    private void butPointTeam2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPointTeam2ActionPerformed
        // TODO add your handling code here:
        butPointBG.setVisible(false);
        butPointTeam1.setVisible(false);
        butPointTeam2.setVisible(false);
        butPointTeam3.setVisible(false);
        labPointTeam1.setVisible(false);
        labPointTeam2.setVisible(false);
        labPointTeam3.setVisible(false);
        
        team2Score++;  
        
        if (team2Score == 1) {
            textWordsT2.setText(" - " + word);
        }
        else textWordsT2.setText(textWordsT2.getText() + "\n - " + word);
        
        roundCount++;
        
        if (roundCount > roundTotal){
           //LLAMA VENTANA FINAL
            PLAY.setVisible(false);
            FINAL.setVisible(true);
            
            labScoreT1.setText("" + team1Score);
            labScoreT2.setText("" + team2Score);
            labScoreT3.setText("" + team3Score);
            
            if (team1Score > team2Score){
                if (team1Score > team3Score){
                    labWinner.setText(textTeam1.getText().toUpperCase());
                }
                else if (team1Score < team3Score){
                    labWinner.setText(textTeam3.getText().toUpperCase());
                }
                else if (team1Score == team3Score){
                    labWinner.setText("EMPATE");
                }
            }
            else if (team1Score < team2Score){
                if (team2Score > team3Score){
                    labWinner.setText(textTeam2.getText().toUpperCase());
                }
                else if (team2Score < team3Score){
                    labWinner.setText(textTeam3.getText().toUpperCase());
                }
                else if (team2Score == team3Score){
                    labWinner.setText("EMPATE");
                }
            }
            else if (team1Score == team2Score){
                if (team2Score < team3Score){
                    labWinner.setText(textTeam3.getText().toUpperCase());
                }
                else labWinner.setText("EMPATE");
            }
            else labWinner.setText("ERROR");
            
            // EN LA VENTANA FINAL DEBE HACER EL RESET
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
    }//GEN-LAST:event_butPointTeam2ActionPerformed

    private void butPointTeam3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPointTeam3ActionPerformed
        // TODO add your handling code here:
        butPointBG.setVisible(false);
        butPointTeam1.setVisible(false);
        butPointTeam2.setVisible(false);
        butPointTeam3.setVisible(false);
        labPointTeam1.setVisible(false);
        labPointTeam2.setVisible(false);
        labPointTeam3.setVisible(false);
        
        team3Score++;  
        
        if (team3Score == 1) {
            textWordsT3.setText(" - " + word);
        }
        else textWordsT3.setText(textWordsT3.getText() + "\n - " + word);
        
        roundCount++;
        
        if (roundCount > roundTotal){
           //LLAMA VENTANA FINAL
            PLAY.setVisible(false);
            FINAL.setVisible(true);
            
            labScoreT1.setText("" + team1Score);
            labScoreT2.setText("" + team2Score);
            labScoreT3.setText("" + team3Score);
            
            if (team1Score > team2Score){
                if (team1Score > team3Score){
                    labWinner.setText(textTeam1.getText().toUpperCase());
                }
                else if (team1Score < team3Score){
                    labWinner.setText(textTeam3.getText().toUpperCase());
                }
                else if (team1Score == team3Score){
                    labWinner.setText("EMPATE");
                }
            }
            else if (team1Score < team2Score){
                if (team2Score > team3Score){
                    labWinner.setText(textTeam2.getText().toUpperCase());
                }
                else if (team2Score < team3Score){
                    labWinner.setText(textTeam3.getText().toUpperCase());
                }
                else if (team2Score == team3Score){
                    labWinner.setText("EMPATE");
                }
            }
            else if (team1Score == team2Score){
                if (team2Score < team3Score){
                    labWinner.setText(textTeam3.getText().toUpperCase());
                }
                else labWinner.setText("EMPATE");
            }
            else labWinner.setText("ERROR");
            
            
            // EN LA VENTANA FINAL DEBE HACER EL RESET
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
    }//GEN-LAST:event_butPointTeam3ActionPerformed

    private void textTeam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTeam1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTeam1ActionPerformed

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
            @Override
            public void run() {
                new CP_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BACKfinal;
    private javax.swing.JPanel BACKinfo;
    private javax.swing.JPanel BACKlvl;
    private javax.swing.JPanel BACKplay;
    private javax.swing.JPanel BACKtags;
    private javax.swing.JPanel BACKteams;
    private javax.swing.JPanel EXIThome;
    private javax.swing.JPanel EXITplay;
    private javax.swing.JPanel FINAL;
    private javax.swing.JPanel HOME;
    private javax.swing.JPanel INFO;
    private javax.swing.JPanel LVL;
    private javax.swing.JPanel PLAY;
    private javax.swing.JPanel TAGS;
    private javax.swing.JPanel TEAMS;
    private javax.swing.JLabel bground;
    private javax.swing.JLabel bground1;
    private javax.swing.JLabel bground2;
    private javax.swing.JLabel bground3;
    private javax.swing.JLabel bground4;
    private javax.swing.JLabel bground5;
    private javax.swing.JLabel bground6;
    private javax.swing.JLabel bgroundExit;
    private javax.swing.JLabel bgroundExit1;
    private javax.swing.JLabel bgroundExit2;
    private javax.swing.JLabel bgroundExit3;
    private javax.swing.JLabel bgroundExit4;
    private javax.swing.JLabel bgroundExit5;
    private javax.swing.JLabel bgroundExit6;
    private javax.swing.JLabel bgroundExit7;
    private javax.swing.JButton butBAD;
    private javax.swing.JButton butBackC;
    private javax.swing.JButton butBackCFinal;
    private javax.swing.JButton butBackCInfo;
    private javax.swing.JButton butBackCLvl;
    private javax.swing.JButton butBackCTags;
    private javax.swing.JButton butBackCTeams;
    private javax.swing.JButton butConfig;
    private javax.swing.JButton butEnter;
    private javax.swing.JButton butExitC;
    private javax.swing.JButton butGOOD;
    private javax.swing.JButton butInfo;
    private javax.swing.JButton butLvl1;
    private javax.swing.JButton butLvl2;
    private javax.swing.JButton butLvl3;
    private javax.swing.JButton butLvl4;
    private javax.swing.JButton butLvl5;
    private javax.swing.JButton butLvl6;
    private javax.swing.JButton butLvlMat;
    private javax.swing.JButton butLvlPre;
    private javax.swing.JButton butNONE;
    private javax.swing.JButton butNONE1;
    private javax.swing.JButton butNONE2;
    private javax.swing.JButton butNONE3;
    private javax.swing.JButton butNONE4;
    private javax.swing.JButton butNONE5;
    private javax.swing.JButton butNONE6;
    private javax.swing.JButton butNONE7;
    private javax.swing.JButton butNext;
    private javax.swing.JButton butNoBack;
    private javax.swing.JButton butNoBackFinal;
    private javax.swing.JButton butNoBackInfo;
    private javax.swing.JButton butNoBackLvl;
    private javax.swing.JButton butNoBackTags;
    private javax.swing.JButton butNoBackTeams;
    private javax.swing.JButton butNoExit;
    private javax.swing.JButton butNoExitHome;
    private javax.swing.JButton butPlay;
    private javax.swing.JButton butPointBG;
    private javax.swing.JButton butPointTeam1;
    private javax.swing.JButton butPointTeam2;
    private javax.swing.JButton butPointTeam3;
    private javax.swing.JButton butResetTime;
    private javax.swing.JButton butSalir;
    private javax.swing.JButton butShowAnsw;
    private javax.swing.JButton butStartTime;
    private javax.swing.JButton butSummitTags;
    private javax.swing.JButton butSummitTeams;
    private javax.swing.JButton butYesBack;
    private javax.swing.JButton butYesBackFinal;
    private javax.swing.JButton butYesBackInfo;
    private javax.swing.JButton butYesBackLvl;
    private javax.swing.JButton butYesBackTags;
    private javax.swing.JButton butYesBackTeams;
    private javax.swing.JButton butYesExit;
    private javax.swing.JButton butYesExitHome;
    private javax.swing.JCheckBox checkTag1;
    private javax.swing.JCheckBox checkTag10;
    private javax.swing.JCheckBox checkTag2;
    private javax.swing.JCheckBox checkTag3;
    private javax.swing.JCheckBox checkTag4;
    private javax.swing.JCheckBox checkTag5;
    private javax.swing.JCheckBox checkTag6;
    private javax.swing.JCheckBox checkTag7;
    private javax.swing.JCheckBox checkTag8;
    private javax.swing.JCheckBox checkTag9;
    private javax.swing.ButtonGroup groupRounds;
    private javax.swing.ButtonGroup groupTeams;
    private javax.swing.JLabel labBGPicture;
    private javax.swing.JLabel labFramePicture;
    private javax.swing.JLabel labPicture;
    private javax.swing.JLabel labPointTeam1;
    private javax.swing.JLabel labPointTeam2;
    private javax.swing.JLabel labPointTeam3;
    private javax.swing.JLabel labRoundCounter;
    private javax.swing.JLabel labScoreT1;
    private javax.swing.JLabel labScoreT2;
    private javax.swing.JLabel labScoreT3;
    private javax.swing.JLabel labT1;
    private javax.swing.JLabel labT2;
    private javax.swing.JLabel labT3;
    private javax.swing.JLabel labTeam1;
    private javax.swing.JLabel labTeam2;
    private javax.swing.JLabel labTeam3;
    private javax.swing.JLabel labText;
    private javax.swing.JLabel labTimeCounter;
    private javax.swing.JLabel labWinner;
    private javax.swing.JRadioButton radRound10;
    private javax.swing.JRadioButton radRound15;
    private javax.swing.JRadioButton radRound20;
    private javax.swing.JRadioButton radRound5;
    private javax.swing.JRadioButton radTeam2;
    private javax.swing.JRadioButton radTeam3;
    private javax.swing.JScrollPane scrollWordsT1;
    private javax.swing.JScrollPane scrollWordsT2;
    private javax.swing.JScrollPane scrollWordsT3;
    private javax.swing.JTextField textPicture;
    private javax.swing.JTextField textTeam1;
    private javax.swing.JTextField textTeam2;
    private javax.swing.JTextField textTeam3;
    private javax.swing.JTextArea textWordsT1;
    private javax.swing.JTextArea textWordsT2;
    private javax.swing.JTextArea textWordsT3;
    // End of variables declaration//GEN-END:variables
}
