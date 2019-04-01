/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.CardLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MeulyMusic
 */
public class TelaPonto extends javax.swing.JFrame {
              
            
    /**
     * Creates new form TelaPonto
     */
    public TelaPonto() {
        initComponents();
    }
    
//    Varivéis Globais.
     int bhacumulado, bmacumulado, hrsai, minsai, hora1, minuto1;
     
     
         
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPonto = new javax.swing.JButton();
        btnReg = new javax.swing.JButton();
        btnNote = new javax.swing.JButton();
        btnSobre = new javax.swing.JButton();
        jPanelPrincipal = new javax.swing.JPanel();
        jPanelPonto = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtHoraAcum = new javax.swing.JTextField();
        txtMinAcum = new javax.swing.JTextField();
        btnInsertHr = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnInsertHr1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        txtHoraEnt = new javax.swing.JTextField();
        txtMinEnt = new javax.swing.JTextField();
        txtMinSai = new javax.swing.JTextField();
        txtHoraSai = new javax.swing.JTextField();
        btnEntrada = new javax.swing.JButton();
        btnSaida = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jDateEntrada = new com.toedter.calendar.JDateChooser();
        jDateSaida = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblTotTurnoMin = new javax.swing.JLabel();
        lblTotMin = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lblTotBh = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lblTotTurnoHr = new javax.swing.JLabel();
        jPanelReg = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTregistro = new javax.swing.JTable();
        btnExcluirReg = new javax.swing.JButton();
        jPanelNote = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtAgenda = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanelSobre = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EVDPoint");

        btnPonto.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnPonto.setText("Ponto");
        btnPonto.setMaximumSize(new java.awt.Dimension(91, 32));
        btnPonto.setMinimumSize(new java.awt.Dimension(91, 32));
        btnPonto.setPreferredSize(new java.awt.Dimension(91, 32));
        btnPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPontoActionPerformed(evt);
            }
        });

        btnReg.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnReg.setText("Registros");
        btnReg.setMaximumSize(new java.awt.Dimension(91, 32));
        btnReg.setMinimumSize(new java.awt.Dimension(91, 32));
        btnReg.setPreferredSize(new java.awt.Dimension(91, 32));
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });

        btnNote.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnNote.setText("Agenda");
        btnNote.setMaximumSize(new java.awt.Dimension(91, 32));
        btnNote.setMinimumSize(new java.awt.Dimension(91, 32));
        btnNote.setPreferredSize(new java.awt.Dimension(91, 32));
        btnNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoteActionPerformed(evt);
            }
        });

        btnSobre.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnSobre.setText("Sobre");
        btnSobre.setMaximumSize(new java.awt.Dimension(91, 32));
        btnSobre.setMinimumSize(new java.awt.Dimension(91, 32));
        btnSobre.setPreferredSize(new java.awt.Dimension(91, 32));
        btnSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSobreActionPerformed(evt);
            }
        });

        jPanelPrincipal.setLayout(new java.awt.CardLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Horas Acumuladas"));

        btnInsertHr.setText("Inserir");
        btnInsertHr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertHrActionPerformed(evt);
            }
        });

        jLabel3.setText("Hr");

        jLabel4.setText("Min");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText(":");

        btnInsertHr1.setText("Excluir");
        btnInsertHr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertHr1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(txtHoraAcum, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMinAcum, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInsertHr, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInsertHr1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoraAcum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertHr)
                    .addComponent(txtMinAcum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(btnInsertHr1))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro de Ponto"));

        txtHoraEnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraEntActionPerformed(evt);
            }
        });

        btnEntrada.setText("Entrada");
        btnEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaActionPerformed(evt);
            }
        });

        btnSaida.setText("Saida");
        btnSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaidaActionPerformed(evt);
            }
        });

        jLabel5.setText("Min");

        jLabel6.setText("Hr");

        jDateEntrada.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N

        jDateSaida.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N

        jLabel1.setText("Data");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText(":");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText(":");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateSaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtHoraEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMinEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtHoraSai, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMinSai, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(94, 94, 94)
                .addComponent(jLabel6)
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMinEnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtHoraEnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(btnEntrada))
                    .addComponent(jDateEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtHoraSai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(txtMinSai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSaida))
                    .addComponent(jDateSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Banco de Horas"));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Hora Entrada:");

        lblTotTurnoMin.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTotTurnoMin.setText("00");

        lblTotMin.setBackground(new java.awt.Color(0, 0, 255));
        lblTotMin.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTotMin.setForeground(new java.awt.Color(0, 0, 255));
        lblTotMin.setText("00");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Bnco de Horas:");

        lbl2.setBackground(new java.awt.Color(0, 0, 255));
        lbl2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl2.setForeground(new java.awt.Color(0, 0, 255));
        lbl2.setText(":");

        lblTotBh.setBackground(new java.awt.Color(0, 0, 255));
        lblTotBh.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTotBh.setForeground(new java.awt.Color(0, 0, 255));
        lblTotBh.setText("00");
        lblTotBh.setToolTipText("");

        lbl1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl1.setText(":");

        lblTotTurnoHr.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTotTurnoHr.setText("00");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addGap(50, 50, 50)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(lblTotTurnoHr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotTurnoMin))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(lblTotBh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotMin)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(lblTotMin)
                            .addComponent(lbl2)
                            .addComponent(lblTotBh)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblTotTurnoMin))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lbl1))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblTotTurnoHr)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelPontoLayout = new javax.swing.GroupLayout(jPanelPonto);
        jPanelPonto.setLayout(jPanelPontoLayout);
        jPanelPontoLayout.setHorizontalGroup(
            jPanelPontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPontoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 316, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPontoLayout.setVerticalGroup(
            jPanelPontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPontoLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanelPrincipal.add(jPanelPonto, "telaPonto");

        jTregistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTregistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data:", "Hora:", "Status"
            }
        ));
        jScrollPane2.setViewportView(jTregistro);

        btnExcluirReg.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnExcluirReg.setText("Excluir");
        btnExcluirReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirRegActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRegLayout = new javax.swing.GroupLayout(jPanelReg);
        jPanelReg.setLayout(jPanelRegLayout);
        jPanelRegLayout.setHorizontalGroup(
            jPanelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                    .addGroup(jPanelRegLayout.createSequentialGroup()
                        .addComponent(btnExcluirReg)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelRegLayout.setVerticalGroup(
            jPanelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExcluirReg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelPrincipal.add(jPanelReg, "telaReg");

        jPanelNote.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTxtAgenda.setColumns(20);
        jTxtAgenda.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTxtAgenda.setRows(5);
        jScrollPane1.setViewportView(jTxtAgenda);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jButton1.setText("Inserir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jButton4.setText("Del");

        jDateChooser1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N

        jButton2.setText(">");

        jButton3.setText("<");

        javax.swing.GroupLayout jPanelNoteLayout = new javax.swing.GroupLayout(jPanelNote);
        jPanelNote.setLayout(jPanelNoteLayout);
        jPanelNoteLayout.setHorizontalGroup(
            jPanelNoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNoteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNoteLayout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(5, 5, 5)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanelNoteLayout.setVerticalGroup(
            jPanelNoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNoteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton4)
                        .addComponent(jButton2)
                        .addComponent(jButton3))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelPrincipal.add(jPanelNote, "telaNote");

        javax.swing.GroupLayout jPanelSobreLayout = new javax.swing.GroupLayout(jPanelSobre);
        jPanelSobre.setLayout(jPanelSobreLayout);
        jPanelSobreLayout.setHorizontalGroup(
            jPanelSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
        );
        jPanelSobreLayout.setVerticalGroup(
            jPanelSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );

        jPanelPrincipal.add(jPanelSobre, "telaSobre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReg, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNote, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSobre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPontoActionPerformed
        CardLayout c1 = (CardLayout) jPanelPrincipal.getLayout();
        c1.show(jPanelPrincipal, "telaPonto");
        
    }//GEN-LAST:event_btnPontoActionPerformed

    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
        CardLayout c1 = (CardLayout) jPanelPrincipal.getLayout();
        c1.show(jPanelPrincipal, "telaReg");
        
        
    }//GEN-LAST:event_btnRegActionPerformed

    private void btnNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoteActionPerformed
        jTxtAgenda.setLineWrap(true); jTxtAgenda.setWrapStyleWord(true);
        CardLayout c1 = (CardLayout) jPanelPrincipal.getLayout();
        c1.show(jPanelPrincipal, "telaNote");
        
        
    }//GEN-LAST:event_btnNoteActionPerformed

    private void txtHoraEntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraEntActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraEntActionPerformed

    private void btnEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaActionPerformed
        // Apontamento das horas de entrada!
        
        hora1 = Integer.parseInt(txtHoraEnt.getText());
        minuto1 = Integer.parseInt(txtMinEnt.getText());
         
         
        SimpleDateFormat dformat = new SimpleDateFormat("dd/MM/yyyy");
        String date = dformat.format(jDateEntrada.getDate());
        DefaultTableModel dtmEntrada = (DefaultTableModel) jTregistro.getModel();
        Object[] dados = {date, txtHoraEnt.getText()+":"+txtMinEnt.getText(), "Entrada"};
        dtmEntrada.addRow(dados);
         
         txtHoraEnt.setText("");
         txtMinEnt.setText("");

               
    }//GEN-LAST:event_btnEntradaActionPerformed

    private void btnSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobreActionPerformed
        CardLayout c1 = (CardLayout) jPanelPrincipal.getLayout();
        c1.show(jPanelPrincipal, "telaSobre");
    }//GEN-LAST:event_btnSobreActionPerformed

    private void btnExcluirRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirRegActionPerformed
        
        if (jTregistro.getSelectedRow() != -1){
        DefaultTableModel dtmEntrada = (DefaultTableModel) jTregistro.getModel();
        dtmEntrada.removeRow(jTregistro.getSelectedRow());
    }else{
            JOptionPane.showMessageDialog(null, "Selecione uma data para excluir.");
            }
    }//GEN-LAST:event_btnExcluirRegActionPerformed

    private void btnInsertHrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertHrActionPerformed
        // Entrada de banco de horas.
          bhacumulado = Integer.parseInt(txtHoraAcum.getText());      
          bmacumulado = Integer.parseInt(txtMinAcum.getText());      
          
          txtHoraAcum.setText("");
          txtMinAcum.setText("");
          
          lblTotBh.setText(Integer.toString(bhacumulado));
          lblTotMin.setText(Integer.toString(bmacumulado));
          
          
    }//GEN-LAST:event_btnInsertHrActionPerformed

    private void btnInsertHr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertHr1ActionPerformed
        // Subtrai banco de horas.
        
          int subbhacum = Integer.parseInt(txtHoraAcum.getText());      
          int subbmacum = Integer.parseInt(txtMinAcum.getText());      
          
          txtHoraAcum.setText("");
          txtMinAcum.setText("");
          
          lblTotBh.setText(Integer.toString(bhacumulado-subbhacum));
          lblTotMin.setText(Integer.toString(bmacumulado-subbmacum));
          
    }//GEN-LAST:event_btnInsertHr1ActionPerformed

    private void btnSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaidaActionPerformed
     // Apontamento das horas de Saída!
       int hrent = hora1;
       int minent = minuto1;
       hrsai = Integer.parseInt(txtHoraSai.getText());
       minsai = Integer.parseInt(txtMinSai.getText());
       
        SimpleDateFormat dformat = new SimpleDateFormat("dd/MM/yyyy");
        String date = dformat.format(jDateEntrada.getDate());
        DefaultTableModel dtmEntrada = (DefaultTableModel) jTregistro.getModel();
        Object[] dados = {date, txtHoraSai.getText()+":"+txtMinSai.getText(), "Saída"};
        dtmEntrada.addRow(dados);
        
        txtHoraSai.setText("");
        txtMinSai.setText("");

     // Horas a compensar no dia!
       int horascomp = 4;
       int hrcompConv = (horascomp)*60;
               
        // Calculo da entrada dos 2 turnos!        
        int entmanha = (((hrsai*60)+minsai)-((hrent*60))-minent);
        
        // Calculo da compensação do dia!
        int horaDia = ((entmanha)-hrcompConv)/60;
        int minDia = ((entmanha)-hrcompConv)%60;
        
        // Total do banco de horas!   
       int bHd = (bhacumulado+horaDia)*60;
       int bMd = (bmacumulado+minDia);
       int bancoHora = (bHd+bMd)/60;
       int bancoMin = (bHd+bMd)%60;
       
       
        
        lblTotBh.setText(Integer.toString(bancoHora));
        lblTotMin.setText(Integer.toString(bancoMin));
        
        if (bancoHora <= 0) { 
            lblTotBh.setForeground(Color.red);
            lbl2.setForeground(Color.red);
            lblTotMin.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnSaidaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String txtagenda = jTxtAgenda.getText();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPonto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrada;
    private javax.swing.JButton btnExcluirReg;
    private javax.swing.JButton btnInsertHr;
    private javax.swing.JButton btnInsertHr1;
    private javax.swing.JButton btnNote;
    private javax.swing.JButton btnPonto;
    private javax.swing.JButton btnReg;
    private javax.swing.JButton btnSaida;
    private javax.swing.JButton btnSobre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateEntrada;
    private com.toedter.calendar.JDateChooser jDateSaida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanelNote;
    private javax.swing.JPanel jPanelPonto;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelReg;
    private javax.swing.JPanel jPanelSobre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTregistro;
    private javax.swing.JTextArea jTxtAgenda;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lblTotBh;
    private javax.swing.JLabel lblTotMin;
    private javax.swing.JLabel lblTotTurnoHr;
    private javax.swing.JLabel lblTotTurnoMin;
    private javax.swing.JTextField txtHoraAcum;
    private javax.swing.JTextField txtHoraEnt;
    private javax.swing.JTextField txtHoraSai;
    private javax.swing.JTextField txtMinAcum;
    private javax.swing.JTextField txtMinEnt;
    private javax.swing.JTextField txtMinSai;
    // End of variables declaration//GEN-END:variables
}
