import bd.daos.Imoveis;
import bd.dbos.Imovel;

import javax.swing.*;

public class Form_CRUD extends javax.swing.JFrame
{

    public Form_CRUD()
    {
        initComponents();
    }

    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPInserir = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCEP_Ins = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNumInserir = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComplementoInserir = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEstadoInserir = new javax.swing.JTextField();
        txtCidadeInserir = new javax.swing.JTextField();
        txtBairroInserir = new javax.swing.JTextField();
        txtRuaInserir = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        txtValorIns = new javax.swing.JTextField();
        txtCodIns = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txtNomeIns = new javax.swing.JTextField();
        jPLer = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtCodLer = new javax.swing.JTextField();
        txtCEPLer = new javax.swing.JTextField();
        txtNumLer = new javax.swing.JTextField();
        txtRuaLer = new javax.swing.JTextField();
        txtCidadeLer = new javax.swing.JTextField();
        txtEstadoLer = new javax.swing.JTextField();
        txtBairroLer = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtComplementoLer = new javax.swing.JTextArea();
        btnConsultar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        txtValorLer = new javax.swing.JTextField();
        txtNomeLer = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jPAtualizar = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtCodAtualizar = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtCEPAtualizar = new javax.swing.JTextField();
        txtNumAtualizar = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtCompAtualizar = new javax.swing.JTextArea();
        txtRuaAtualizar = new javax.swing.JTextField();
        txtBairroAtualizar = new javax.swing.JTextField();
        txtCidadeAtualizar = new javax.swing.JTextField();
        txtEstadoAtualizar = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        txtValorAtualizar = new javax.swing.JTextField();
        txtNomeAtualizar = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jPExcluir = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        txtCodExcluir = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtCEPExcluir = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtNumExcluir = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtCompExcluir = new javax.swing.JTextArea();
        jLabel32 = new javax.swing.JLabel();
        txtRuaExcluir = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtBairroExcluir = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtCidadeExcluir = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtEstadoExcluir = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        txtExcluir = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtNomeExcluir = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPInserir.setBackground(new java.awt.Color(164, 235, 193));
        jPInserir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Inserção de dados");

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getSize()+3f));
        jLabel2.setText("CEP:");

        txtCEP_Ins.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCEP_Ins.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCEP_InsFocusLost(evt);
            }
        });
        txtCEP_Ins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Número:");

        txtNumInserir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Complemento:");

        txtComplementoInserir.setColumns(20);
        txtComplementoInserir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtComplementoInserir.setRows(5);
        jScrollPane1.setViewportView(txtComplementoInserir);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Bairro:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Rua:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Cidade:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Estado:");

        txtEstadoInserir.setEditable(false);
        txtEstadoInserir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtCidadeInserir.setEditable(false);
        txtCidadeInserir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtBairroInserir.setEditable(false);
        txtBairroInserir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBairroInserir.setToolTipText("");

        txtRuaInserir.setEditable(false);
        txtRuaInserir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnInserir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("Valor pedido:");

        txtValorIns.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtValorIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        txtCodIns.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCodIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setText("Cód. do Imóvel:");

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setText("Nome do proprietário:");

        txtNomeIns.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNomeIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        javax.swing.GroupLayout jPInserirLayout = new javax.swing.GroupLayout(jPInserir);
        jPInserir.setLayout(jPInserirLayout);
        jPInserirLayout.setHorizontalGroup(
            jPInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPInserirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPInserirLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addGap(109, 109, 109))
                    .addGroup(jPInserirLayout.createSequentialGroup()
                        .addGroup(jPInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPInserirLayout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodIns, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(jLabel1))
                            .addGroup(jPInserirLayout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addGap(18, 18, 18)
                                .addComponent(txtValorIns, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPInserirLayout.createSequentialGroup()
                                .addGroup(jPInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPInserirLayout.createSequentialGroup()
                                        .addGroup(jPInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel5))
                                        .addGap(14, 14, 14)
                                        .addGroup(jPInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtBairroInserir)
                                            .addComponent(txtEstadoInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCidadeInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPInserirLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(32, 32, 32)
                                        .addComponent(txtRuaInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                                .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(209, 209, 209))
                    .addGroup(jPInserirLayout.createSequentialGroup()
                        .addGroup(jPInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPInserirLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(txtNumInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPInserirLayout.createSequentialGroup()
                                .addGroup(jPInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(41, 41, 41)
                                .addComponent(txtCEP_Ins, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPInserirLayout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeIns, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPInserirLayout.setVerticalGroup(
            jPInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPInserirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(txtCodIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(txtNomeIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCEP_Ins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNumInserir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPInserirLayout.createSequentialGroup()
                        .addGroup(jPInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(txtValorIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtRuaInserir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtEstadoInserir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPInserirLayout.createSequentialGroup()
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addGroup(jPInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCidadeInserir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtBairroInserir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Inserir dados", jPInserir);
        jPInserir.getAccessibleContext().setAccessibleName("jPInserir");

        jPLer.setBackground(new java.awt.Color(137, 196, 244));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Leitura de dados");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Cód. do Imóvel:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("CEP:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Número:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Complemento:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Rua:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Bairro:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Cidade:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Estado:");

        txtCodLer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtCEPLer.setEditable(false);
        txtCEPLer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtNumLer.setEditable(false);
        txtNumLer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtRuaLer.setEditable(false);
        txtRuaLer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtCidadeLer.setEditable(false);
        txtCidadeLer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtEstadoLer.setEditable(false);
        txtEstadoLer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtBairroLer.setEditable(false);
        txtBairroLer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtComplementoLer.setEditable(false);
        txtComplementoLer.setColumns(20);
        txtComplementoLer.setRows(5);
        jScrollPane2.setViewportView(txtComplementoLer);

        btnConsultar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnConsultar.setText("Consultar no BD");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLimpar.setText("Limpar dados");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("Valor pedido:");

        txtValorLer.setEditable(false);
        txtValorLer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtValorLer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        txtNomeLer.setEditable(false);
        txtNomeLer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNomeLer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setText("Nome do proprietário:");

        javax.swing.GroupLayout jPLerLayout = new javax.swing.GroupLayout(jPLer);
        jPLer.setLayout(jPLerLayout);
        jPLerLayout.setHorizontalGroup(
            jPLerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLerLayout.createSequentialGroup()
                .addGroup(jPLerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPLerLayout.createSequentialGroup()
                        .addGroup(jPLerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPLerLayout.createSequentialGroup()
                                .addGap(291, 291, 291)
                                .addComponent(jLabel9))
                            .addGroup(jPLerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPLerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPLerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCEPLer, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPLerLayout.createSequentialGroup()
                                        .addComponent(txtCodLer, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(btnConsultar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnLimpar)))))
                        .addGap(0, 457, Short.MAX_VALUE))
                    .addGroup(jPLerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPLerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPLerLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(49, 49, 49)
                                .addComponent(txtNumLer))
                            .addGroup(jPLerLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2))
                            .addGroup(jPLerLayout.createSequentialGroup()
                                .addGroup(jPLerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPLerLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtRuaLer, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPLerLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtBairroLer, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPLerLayout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEstadoLer, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPLerLayout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCidadeLer, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPLerLayout.createSequentialGroup()
                                        .addComponent(jLabel37)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtValorLer, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPLerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeLer, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPLerLayout.setVerticalGroup(
            jPLerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(32, 32, 32)
                .addGroup(jPLerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodLer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar)
                    .addComponent(btnLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPLerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(txtNomeLer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPLerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCEPLer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPLerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtNumLer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPLerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPLerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(txtValorLer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPLerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtRuaLer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPLerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtBairroLer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPLerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtCidadeLer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPLerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtEstadoLer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("Ler dados", jPLer);

        jPAtualizar.setBackground(new java.awt.Color(174, 169, 211));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Cód. do Imóvel:");

        txtCodAtualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCodAtualizar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodAtualizarFocusLost(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Atualização de dados");

        txtCEPAtualizar.setEditable(false);
        txtCEPAtualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtNumAtualizar.setEditable(false);
        txtNumAtualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtCompAtualizar.setEditable(false);
        txtCompAtualizar.setColumns(20);
        txtCompAtualizar.setRows(5);
        jScrollPane3.setViewportView(txtCompAtualizar);

        txtRuaAtualizar.setEditable(false);
        txtRuaAtualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtBairroAtualizar.setEditable(false);
        txtBairroAtualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtCidadeAtualizar.setEditable(false);
        txtCidadeAtualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtEstadoAtualizar.setEditable(false);
        txtEstadoAtualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Número:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Complemento:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Rua:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Bairro:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Cidade:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Estado:");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("CEP:");

        btnAtualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAtualizar.setText("Atualizar dados");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("Valor pedido:");

        txtValorAtualizar.setEditable(false);
        txtValorAtualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtNomeAtualizar.setEditable(false);
        txtNomeAtualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNomeAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel43.setText("Nome do proprietário:");

        javax.swing.GroupLayout jPAtualizarLayout = new javax.swing.GroupLayout(jPAtualizar);
        jPAtualizar.setLayout(jPAtualizarLayout);
        jPAtualizarLayout.setHorizontalGroup(
            jPAtualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAtualizarLayout.createSequentialGroup()
                .addGroup(jPAtualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPAtualizarLayout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLabel19))
                    .addGroup(jPAtualizarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPAtualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel25)
                            .addComponent(jLabel24)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22)
                            .addComponent(jLabel38))
                        .addGroup(jPAtualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPAtualizarLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPAtualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPAtualizarLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnAtualizar))
                                    .addGroup(jPAtualizarLayout.createSequentialGroup()
                                        .addGroup(jPAtualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtRuaAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPAtualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtEstadoAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtBairroAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtCidadeAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPAtualizarLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPAtualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNumAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 232, Short.MAX_VALUE)))))
                .addGap(215, 215, 215))
            .addGroup(jPAtualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPAtualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPAtualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCEPAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPAtualizarLayout.setVerticalGroup(
            jPAtualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAtualizarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel19)
                .addGap(23, 23, 23)
                .addGroup(jPAtualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtCodAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPAtualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(txtNomeAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPAtualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCEPAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(9, 9, 9)
                .addGroup(jPAtualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPAtualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPAtualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addComponent(txtValorAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPAtualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRuaAtualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPAtualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBairroAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(jPAtualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidadeAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addGroup(jPAtualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstadoAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(46, 46, 46))
        );

        jTabbedPane1.addTab("Atualizar dados", jPAtualizar);

        jPExcluir.setBackground(new java.awt.Color(242, 169, 159));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setText("Exclusão de dados");

        txtCodExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCodExcluir.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodExcluirFocusLost(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Cód. do Imóvel:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("CEP:");

        txtCEPExcluir.setEditable(false);
        txtCEPExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Número:");

        txtNumExcluir.setEditable(false);
        txtNumExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Complemento:");

        txtCompExcluir.setEditable(false);
        txtCompExcluir.setColumns(20);
        txtCompExcluir.setRows(5);
        jScrollPane4.setViewportView(txtCompExcluir);

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Rua:");

        txtRuaExcluir.setEditable(false);
        txtRuaExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Bairro:");

        txtBairroExcluir.setEditable(false);
        txtBairroExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Cidade:");

        txtCidadeExcluir.setEditable(false);
        txtCidadeExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("Estado:");

        txtEstadoExcluir.setEditable(false);
        txtEstadoExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExcluir.setText("Excluir dados");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        txtExcluir.setEditable(false);
        txtExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("Valor pedido:");

        txtNomeExcluir.setEditable(false);
        txtNomeExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNomeExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setText("Nome do proprietário:");

        javax.swing.GroupLayout jPExcluirLayout = new javax.swing.GroupLayout(jPExcluir);
        jPExcluir.setLayout(jPExcluirLayout);
        jPExcluirLayout.setHorizontalGroup(
            jPExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPExcluirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPExcluirLayout.createSequentialGroup()
                        .addGroup(jPExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPExcluirLayout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPExcluirLayout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir)
                        .addGap(216, 216, 216))
                    .addGroup(jPExcluirLayout.createSequentialGroup()
                        .addGroup(jPExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPExcluirLayout.createSequentialGroup()
                                .addGroup(jPExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel35))
                                .addGap(54, 54, 54)
                                .addGroup(jPExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCidadeExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRuaExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEstadoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBairroExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPExcluirLayout.createSequentialGroup()
                                .addGap(292, 292, 292)
                                .addComponent(jLabel27)))
                        .addContainerGap(579, Short.MAX_VALUE))
                    .addGroup(jPExcluirLayout.createSequentialGroup()
                        .addGroup(jPExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPExcluirLayout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(321, 321, 321))
                            .addGroup(jPExcluirLayout.createSequentialGroup()
                                .addGroup(jPExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel29))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCEPExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNumExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPExcluirLayout.setVerticalGroup(
            jPExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPExcluirLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPExcluirLayout.createSequentialGroup()
                        .addGroup(jPExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(txtCodExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(txtNomeExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addGroup(jPExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addGap(13, 13, 13)
                .addGroup(jPExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPExcluirLayout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel31))
                    .addGroup(jPExcluirLayout.createSequentialGroup()
                        .addComponent(txtCEPExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(txtNumExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRuaExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addGap(18, 18, 18)
                .addGroup(jPExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(txtBairroExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(txtCidadeExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstadoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Excluir dados", jPExcluir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt)
    {
        try
        {
            if (txtCodIns.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Código do Imóvel inválido!");
            }
            else {
                int codigo = Integer.parseInt(txtCodIns.getText());
                String cep = txtCEP_Ins.getText();
                String nome = txtNomeIns.getText();
                short numero = Short.parseShort(txtNumInserir.getText());
                float valor = Float.parseFloat(txtValorIns.getText());
                String complemento = txtComplementoInserir.getText();

                Imovel casa = new Imovel(codigo, nome, valor, cep, numero, complemento);
                Imoveis.incluir(casa);
                JOptionPane.showMessageDialog(null, "Inserção concluída!\n CEP: " + txtCEP_Ins.getText(),
                        "INSERÇÃO CONCLUIDA", JOptionPane.WARNING_MESSAGE);
            }
        }
        catch (Exception erro)
        {
            JOptionPane.showMessageDialog(null,"Erro na Inserção! Por favor, tente novamente.",
                    "ERRO DE INSERÇÃO!", JOptionPane.WARNING_MESSAGE);
            System.err.println("Erro ao Inserir " + erro);
        }
    }

    private void txtCEP_InsFocusLost(java.awt.event.FocusEvent evt)
    {
        try
        {
            String cep = txtCEP_Ins.getText();

            Logradouro logradouro =
                    (Logradouro) ClienteWS.getObjeto(Logradouro.class, "https://api.postmon.com.br/v1/cep", cep);

            txtRuaInserir.setText(logradouro.getLogradouro());
            txtEstadoInserir.setText(logradouro.getEstado());
            txtCidadeInserir.setText(logradouro.getCidade());
            txtBairroInserir.setText(logradouro.getBairro());
        }
        catch(Exception erro)
        {
            System.err.println("Olha o ERRO: " + erro);
        }
    }

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt)
    {
        try
        {
            if (txtCodLer.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Código do Imóvel inválido!");
            }
            else
            {
                int codigo = Integer.parseInt(txtCodLer.getText());
                if (Imoveis.cadastrado(codigo))
                {
                    Imovel imovel = Imoveis.getImovel(codigo);


                    txtCEPLer.setText(imovel.getCEP());
                    txtNomeLer.setText(imovel.getNomeProprietario());
                    txtValorLer.setText("" + imovel.getValor());
                    txtComplementoLer.setText(imovel.getComplemento());
                    txtNumLer.setText("" + imovel.getNumero());

                    Logradouro logradouro =
                            (Logradouro) ClienteWS.getObjeto(Logradouro.class, "https://api.postmon.com.br/v1/cep", imovel.getCEP());

                    txtRuaLer.setText(logradouro.getLogradouro());
                    txtEstadoLer.setText(logradouro.getEstado());
                    txtCidadeLer.setText(logradouro.getCidade());
                    txtBairroLer.setText(logradouro.getBairro());
                } else {
                    JOptionPane.showMessageDialog(null, "Imóvel não cadastrado!", "Erro na CONSULTA:",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        catch (Exception erro)
        {
            JOptionPane.showMessageDialog(null, "Erro na CONSULTA! Por favor, tente novamente.", "Erro na CONSULTA:",
                    JOptionPane.WARNING_MESSAGE);
            System.err.println("Olha o ERRO: " + erro);
        }
    }

    private void txtCodAtualizarFocusLost(java.awt.event.FocusEvent evt)
    {
        try
        {
            int codigo = Integer.parseInt(txtCodAtualizar.getText());
            if(Imoveis.cadastrado(codigo))
            {
                Imovel imovel = Imoveis.getImovel(codigo);

                txtCodAtualizar.setEditable(false);
                txtCEPAtualizar.setEditable(true);
                txtNumAtualizar.setEditable(true);
                txtCompAtualizar.setEditable(true);
                txtValorAtualizar.setEditable(true);
                txtNomeAtualizar.setEditable(true);

                txtCEPAtualizar.setText(imovel.getCEP());
                txtNomeAtualizar.setText(imovel.getNomeProprietario());
                txtValorAtualizar.setText(""+imovel.getValor());
                txtCompAtualizar.setText(imovel.getComplemento());
                txtNumAtualizar.setText(""+imovel.getNumero());

                Logradouro logradouro =
                        (Logradouro) ClienteWS.getObjeto(Logradouro.class, "https://api.postmon.com.br/v1/cep", imovel.getCEP());

                txtRuaAtualizar.setText(logradouro.getLogradouro());
                txtEstadoAtualizar.setText(logradouro.getEstado());
                txtCidadeAtualizar.setText(logradouro.getCidade());
                txtBairroAtualizar.setText(logradouro.getBairro());
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Imóvel não cadastrado!","Erro em ATUALIZAR:",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
        catch (Exception erro)
        {
            System.err.println(erro);
        }
    }

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt)
    {
        try
        {
            if (txtCodAtualizar.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Código do Imóvel inválido!");
            }
            else
            {
                int codigo = Integer.parseInt(txtCodAtualizar.getText());
                String cep = txtCEPAtualizar.getText();
                String nome = txtNomeAtualizar.getText();
                short numero = Short.parseShort(txtNumAtualizar.getText());
                float valor = Float.parseFloat(txtValorAtualizar.getText());
                String complemento = txtCompAtualizar.getText();

                Imovel casa = new Imovel(codigo, nome, valor, cep, numero, complemento);
                Imoveis.alterar(casa);
                JOptionPane.showMessageDialog(null,"Atualização concluída!", "ATUALIZAÇÃO CONCLUIDA",
                        JOptionPane.INFORMATION_MESSAGE);
            }

        }
        catch(Exception erro)
        {
            JOptionPane.showMessageDialog(null,"Atualização não concluida! Por favor, tente novamente.", "ERRO NA ATUALIZAÇÃO:",
                    JOptionPane.INFORMATION_MESSAGE);
            System.err.println(erro);
        }
    }


    private void txtCodExcluirFocusLost(java.awt.event.FocusEvent evt)
    {
        try
        {
            int codigo = Integer.parseInt(txtCodExcluir.getText());
            if(Imoveis.cadastrado(codigo))
            {
                txtCodExcluir.setEditable(false);
                Imovel imovel = Imoveis.getImovel(codigo);

                txtCEPExcluir.setText(imovel.getCEP());
                txtNomeExcluir.setText(imovel.getNomeProprietario());
                txtExcluir.setText(""+imovel.getValor());
                txtCompExcluir.setText(imovel.getComplemento());
                txtNumExcluir.setText(""+imovel.getNumero());

                Logradouro logradouro =
                        (Logradouro) ClienteWS.getObjeto(Logradouro.class, "https://api.postmon.com.br/v1/cep", imovel.getCEP());

                txtRuaExcluir.setText(logradouro.getLogradouro());
                txtEstadoExcluir.setText(logradouro.getEstado());
                txtCidadeExcluir.setText(logradouro.getCidade());
                txtBairroExcluir.setText(logradouro.getBairro());
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Imóvel não cadastrado!","Erro em ATUALIZAR:",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
        catch (Exception erro)
        {
            JOptionPane.showMessageDialog(null,"Imóvel não cadastrado!","Erro em ATUALIZAR:",
                    JOptionPane.WARNING_MESSAGE);
            System.err.println(erro);
        }
    }

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt)
    {
        try
        {
            if(txtCodExcluir.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Código do Imóvel invalido!");
            }
            else
            {
                int codigo = Integer.parseInt(txtCodExcluir.getText());
                if(Imoveis.cadastrado(codigo))
                {
                    int resposta = JOptionPane.showOptionDialog(null,"Você tem certeza que deseja excluir esse imóvel?", "Confirmação de exclusão", JOptionPane.OK_CANCEL_OPTION,
                            JOptionPane.WARNING_MESSAGE, null, new String[]{"Sim", "Não, cancele"}, "default");

                    if(resposta == JOptionPane.YES_OPTION)
                    {
                        JOptionPane.showMessageDialog(null,"OK, excluido");
                        Imovel imovel = Imoveis.getImovel(codigo);

                        txtCEPExcluir.setText(imovel.getCEP());
                        txtNomeExcluir.setText(imovel.getNomeProprietario());
                        txtExcluir.setText(""+imovel.getValor());
                        txtCompExcluir.setText(imovel.getComplemento());
                        txtNumExcluir.setText(""+imovel.getNumero());

                        Logradouro logradouro =
                                (Logradouro) ClienteWS.getObjeto(Logradouro.class, "https://api.postmon.com.br/v1/cep", imovel.getCEP());

                        txtRuaExcluir.setText(logradouro.getLogradouro());
                        txtEstadoExcluir.setText(logradouro.getEstado());
                        txtCidadeExcluir.setText(logradouro.getCidade());
                        txtBairroExcluir.setText(logradouro.getBairro());

                        Imoveis.excluir(codigo);

                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"OK, cancelado");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Imóvel não cadastrado!","Erro em ATUALIZAR:",
                            JOptionPane.WARNING_MESSAGE);
                }
            }

        }
        catch (Exception erro)
        {
            JOptionPane.showMessageDialog(null,"Erro na ATUALIZAÇÃO! Por favor, tente novamente.","Erro em ATUALIZAR:",
                    JOptionPane.WARNING_MESSAGE);
            System.err.println(erro);
        }
    }

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt)
    {
        txtCodLer.setText("");
        txtCEPLer.setText("");
        txtNumLer.setText("");
        txtRuaLer.setText("");
        txtValorLer.setText("");
        txtNomeLer.setText("");
        txtComplementoLer.setText("");
        txtBairroLer.setText("");
        txtCidadeLer.setText("");
        txtEstadoLer.setText("");
    }

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
            java.util.logging.Logger.getLogger(Form_CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_CRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPAtualizar;
    private javax.swing.JPanel jPExcluir;
    private javax.swing.JPanel jPInserir;
    private javax.swing.JPanel jPLer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtBairroAtualizar;
    private javax.swing.JTextField txtBairroExcluir;
    private javax.swing.JTextField txtBairroInserir;
    private javax.swing.JTextField txtBairroLer;
    private javax.swing.JTextField txtCEPAtualizar;
    private javax.swing.JTextField txtCEPExcluir;
    private javax.swing.JTextField txtCEPLer;
    private javax.swing.JTextField txtCEP_Ins;
    private javax.swing.JTextField txtCidadeAtualizar;
    private javax.swing.JTextField txtCidadeExcluir;
    private javax.swing.JTextField txtCidadeInserir;
    private javax.swing.JTextField txtCidadeLer;
    private javax.swing.JTextField txtCodAtualizar;
    private javax.swing.JTextField txtCodExcluir;
    private javax.swing.JTextField txtCodIns;
    private javax.swing.JTextField txtCodLer;
    private javax.swing.JTextArea txtCompAtualizar;
    private javax.swing.JTextArea txtCompExcluir;
    private javax.swing.JTextArea txtComplementoInserir;
    private javax.swing.JTextArea txtComplementoLer;
    private javax.swing.JTextField txtEstadoAtualizar;
    private javax.swing.JTextField txtEstadoExcluir;
    private javax.swing.JTextField txtEstadoInserir;
    private javax.swing.JTextField txtEstadoLer;
    private javax.swing.JTextField txtExcluir;
    private javax.swing.JTextField txtNomeAtualizar;
    private javax.swing.JTextField txtNomeExcluir;
    private javax.swing.JTextField txtNomeIns;
    private javax.swing.JTextField txtNomeLer;
    private javax.swing.JTextField txtNumAtualizar;
    private javax.swing.JTextField txtNumExcluir;
    private javax.swing.JTextField txtNumInserir;
    private javax.swing.JTextField txtNumLer;
    private javax.swing.JTextField txtRuaAtualizar;
    private javax.swing.JTextField txtRuaExcluir;
    private javax.swing.JTextField txtRuaInserir;
    private javax.swing.JTextField txtRuaLer;
    private javax.swing.JTextField txtValorAtualizar;
    private javax.swing.JTextField txtValorIns;
    private javax.swing.JTextField txtValorLer;
    // End of variables declaration//GEN-END:variables
}
