
package ViewPrincipal;

import Model.Contas;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Everton Costa
 */
public class TelaPrincipal extends javax.swing.JFrame {

    ArrayList<Contas> listacontas;
    String modoc;
    double saldototal;
    double sald;
    int i;

    public TelaPrincipal(ArrayList<Contas> listacontas) {
        this.listacontas = listacontas;
    }

    public void LoadTableContas(){
        DefaultTableModel modeloc = new DefaultTableModel(new Object[]{"Tipo de conta","Instituição Financeira", "Saldo"},0);   

    for(i=0;i<listacontas.size();i++){
        modeloc.addRow(new Object[]{listacontas.get(i).getTipo_conta(),
                                listacontas.get(i).getInstituicao_financeira(),
                                listacontas.get(i).getSaldo()});
    }

        tbl_contas.setModel(modeloc);
        modoc = "Tabela Conta";
        ManipulaInterfaceContas();
    }

    /**
     * Criação de tela principal
     */
    public TelaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);

        listacontas = new ArrayList();
        tipo_conta.setText("");
        instituicao_financeira.setText("");
        saldo.setText("");

        modoc = "Navegar";
        ManipulaInterfaceContas();

    }

    public void ManipulaInterfaceContas(){
        switch(modoc){
            case "Navegar":
                btn_nova_conta.setEnabled(true);
                btn_editar_conta.setEnabled(false);
                btn_remover_conta.setEnabled(false);
                btn_salvar_conta.setEnabled(false);
                btn_cancelar_conta.setEnabled(false);
                btn_transferir.setEnabled(false);
                tipo_conta.setEnabled(false);
                instituicao_financeira.setEnabled(false);
                saldo.setEnabled(false);
                break;

            case "Nova Conta":
                btn_nova_conta.setEnabled(false);
                btn_editar_conta.setEnabled(false);
                btn_remover_conta.setEnabled(false);
                btn_salvar_conta.setEnabled(true);
                btn_cancelar_conta.setEnabled(true);
                btn_transferir.setEnabled(false);
                tipo_conta.setEnabled(true);
                instituicao_financeira.setEnabled(true);
                saldo.setEnabled(true);
                break;

            case "Editar Conta":
                btn_nova_conta.setEnabled(false);
                btn_editar_conta.setEnabled(false);
                btn_remover_conta.setEnabled(false);
                btn_salvar_conta.setEnabled(true);
                btn_cancelar_conta.setEnabled(true);
                btn_transferir.setEnabled(false);
                tipo_conta.setEnabled(true);
                instituicao_financeira.setEnabled(true);
                saldo.setEnabled(true);
                break;

            case "Remover Conta":
                btn_nova_conta.setEnabled(true);
                btn_editar_conta.setEnabled(false);
                btn_remover_conta.setEnabled(false);
                btn_salvar_conta.setEnabled(false);
                btn_cancelar_conta.setEnabled(false);
                btn_transferir.setEnabled(false);
                tipo_conta.setEnabled(false);
                instituicao_financeira.setEnabled(false);
                saldo.setEnabled(false);
                break;

            case "Salvar Conta":
                btn_nova_conta.setEnabled(true);
                btn_editar_conta.setEnabled(false);
                btn_remover_conta.setEnabled(false);
                btn_salvar_conta.setEnabled(false);
                btn_cancelar_conta.setEnabled(false);
                btn_transferir.setEnabled(false);
                tipo_conta.setEnabled(false);
                instituicao_financeira.setEnabled(false);
                saldo.setEnabled(false);
                break;

            case "Cancelar Conta":
                btn_nova_conta.setEnabled(true);
                btn_editar_conta.setEnabled(false);
                btn_remover_conta.setEnabled(false);
                btn_salvar_conta.setEnabled(false);
                btn_cancelar_conta.setEnabled(false);
                btn_transferir.setEnabled(false);
                tipo_conta.setEnabled(false);
                instituicao_financeira.setEnabled(false);
                saldo.setEnabled(false);
                break;

            case "Tabela Conta":
                btn_nova_conta.setEnabled(true);
                btn_editar_conta.setEnabled(true);
                btn_remover_conta.setEnabled(true);
                btn_salvar_conta.setEnabled(false);
                btn_cancelar_conta.setEnabled(false);
                btn_transferir.setEnabled(true);
                tipo_conta.setEnabled(false);
                instituicao_financeira.setEnabled(false);
                saldo.setEnabled(false);
                break;

                default: System.out.println("Modo inválido");


          /*  case "Transferir":
                btn_nova_conta.setEnabled(true);
                btn_editar_conta.setEnabled(false);
                btn_remover_conta.setEnabled(false);
                btn_salvar_conta.setEnabled(false);
                btn_cancelar_conta.setEnabled(false);
                btn_transferir.setEnabled(false);
                tipo_conta.setEnabled(false);
                instituicao_financeira.setEnabled(false);
                saldo.setEnabled(false);*/


        }



    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        painel_contas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_contas = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tipo_conta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        instituicao_financeira = new javax.swing.JTextField();
        saldo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_salvar_conta = new javax.swing.JButton();
        btn_cancelar_conta = new javax.swing.JButton();
        btn_nova_conta = new javax.swing.JButton();
        btn_editar_conta = new javax.swing.JButton();
        btn_remover_conta = new javax.swing.JButton();
        btn_transferir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        saldo_total = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        painel_receitas = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_receitas = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tipo_receita = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        valor_receitas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_salvar_receita = new javax.swing.JButton();
        btn_cancelar_receita = new javax.swing.JButton();
        contas_receitas = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        data_recebimento_receita = new javax.swing.JFormattedTextField();
        data_esperada_receita = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        descricao_receita = new javax.swing.JTextField();
        btn_nova_receita = new javax.swing.JButton();
        btn_editar_receita = new javax.swing.JButton();
        btn_remover_receita = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_total_receitas = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        painel_despesas = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbl_despesas = new javax.swing.JTable();
        btn_nova_despesa = new javax.swing.JButton();
        btn_editar_despesa = new javax.swing.JButton();
        btn_remover_despesa = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        total_despesas = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        tipo_despesa = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        valor_despesa = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btn_salvar_despesa = new javax.swing.JButton();
        btn_cancelar_despesa = new javax.swing.JButton();
        conta_despesa = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        data_pagamento_despesa = new javax.swing.JFormattedTextField();
        data_vencimento_despesa = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        descricao_despesa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painel_contas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painel_contasMouseClicked(evt);
            }
        });

        tbl_contas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de Conta", "Instituição Financeira", "Saldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_contas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_contasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_contas);
        if (tbl_contas.getColumnModel().getColumnCount() > 0) {
            tbl_contas.getColumnModel().getColumn(0).setResizable(false);
            tbl_contas.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbl_contas.getColumnModel().getColumn(1).setResizable(false);
            tbl_contas.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbl_contas.getColumnModel().getColumn(2).setResizable(false);
            tbl_contas.getColumnModel().getColumn(2).setPreferredWidth(40);
        }

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cadastro de Contas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N

        jLabel1.setText("Tipo de Conta");

        tipo_conta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_contaActionPerformed(evt);
            }
        });

        jLabel2.setText("Instituição Financeira");

        instituicao_financeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instituicao_financeiraActionPerformed(evt);
            }
        });

        saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldoActionPerformed(evt);
            }
        });

        jLabel3.setText("Saldo");

        btn_salvar_conta.setText("Salvar");
        btn_salvar_conta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvar_contaActionPerformed(evt);
            }
        });

        btn_cancelar_conta.setText("Cancelar");
        btn_cancelar_conta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar_contaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipo_conta, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(instituicao_financeira, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(btn_salvar_conta, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btn_cancelar_conta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(instituicao_financeira, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipo_conta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_salvar_conta, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btn_cancelar_conta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        btn_nova_conta.setText("Nova conta");
        btn_nova_conta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nova_contaActionPerformed(evt);
            }
        });

        btn_editar_conta.setText("Editar conta");
        btn_editar_conta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editar_contaActionPerformed(evt);
            }
        });

        btn_remover_conta.setText("Remover conta");
        btn_remover_conta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_remover_contaActionPerformed(evt);
            }
        });

        btn_transferir.setText("Transferir Saldo");
        btn_transferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transferirActionPerformed(evt);
            }
        });

        jLabel7.setText("Saldo Total:");

        saldo_total.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        saldo_total.setForeground(new java.awt.Color(0, 204, 0));
        saldo_total.setText("00,00");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("R$");

        javax.swing.GroupLayout painel_contasLayout = new javax.swing.GroupLayout(painel_contas);
        painel_contas.setLayout(painel_contasLayout);
        painel_contasLayout.setHorizontalGroup(
            painel_contasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_contasLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(painel_contasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painel_contasLayout.createSequentialGroup()
                        .addComponent(btn_nova_conta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_editar_conta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_remover_conta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_transferir, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_contasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saldo_total, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        painel_contasLayout.setVerticalGroup(
            painel_contasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_contasLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_contasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_contasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(saldo_total, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(132, 132, 132)
                .addGroup(painel_contasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_nova_conta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editar_conta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_remover_conta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_transferir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Contas", painel_contas);

        tbl_receitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de Receita", "Conta", "Data Recebimento", "Data Esperada", "Descrição", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbl_receitas);
        if (tbl_receitas.getColumnModel().getColumnCount() > 0) {
            tbl_receitas.getColumnModel().getColumn(0).setResizable(false);
            tbl_receitas.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbl_receitas.getColumnModel().getColumn(1).setResizable(false);
            tbl_receitas.getColumnModel().getColumn(1).setPreferredWidth(80);
            tbl_receitas.getColumnModel().getColumn(2).setResizable(false);
            tbl_receitas.getColumnModel().getColumn(2).setPreferredWidth(40);
            tbl_receitas.getColumnModel().getColumn(3).setResizable(false);
            tbl_receitas.getColumnModel().getColumn(3).setPreferredWidth(40);
            tbl_receitas.getColumnModel().getColumn(4).setResizable(false);
            tbl_receitas.getColumnModel().getColumn(4).setPreferredWidth(100);
            tbl_receitas.getColumnModel().getColumn(5).setResizable(false);
            tbl_receitas.getColumnModel().getColumn(5).setPreferredWidth(40);
        }

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cadastro de Receitas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 153, 0))); // NOI18N

        jLabel4.setText("Tipo de Receita");

        tipo_receita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_receitaActionPerformed(evt);
            }
        });

        jLabel5.setText("Conta");

        valor_receitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor_receitasActionPerformed(evt);
            }
        });

        jLabel6.setText("Valor");

        btn_salvar_receita.setText("Salvar");
        btn_salvar_receita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvar_receitaActionPerformed(evt);
            }
        });

        btn_cancelar_receita.setText("Cancelar");
        btn_cancelar_receita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar_receitaActionPerformed(evt);
            }
        });

        contas_receitas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setText("Data Recebimento");

        try {
            data_recebimento_receita.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("  ##  /  ##  /  ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            data_esperada_receita.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("  ##  /  ##  /  ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel11.setText("Data Esperada");

        jLabel12.setText("Descrição");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(data_recebimento_receita, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(data_esperada_receita, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btn_salvar_receita, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_cancelar_receita)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(descricao_receita)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(tipo_receita)
                                .addGap(45, 45, 45)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contas_receitas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addGap(28, 28, 28))
                            .addComponent(valor_receitas))))
                .addGap(16, 16, 16))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valor_receitas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tipo_receita, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(contas_receitas))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descricao_receita, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(data_recebimento_receita, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(data_esperada_receita, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_cancelar_receita, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_salvar_receita, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_nova_receita.setText("Nova receita");
        btn_nova_receita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nova_receitaActionPerformed(evt);
            }
        });

        btn_editar_receita.setText("Editar receita");

        btn_remover_receita.setText("Remover receita");
        btn_remover_receita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_remover_receitaActionPerformed(evt);
            }
        });

        tbl_total_receitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Total Receitas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class
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
        jScrollPane4.setViewportView(tbl_total_receitas);
        if (tbl_total_receitas.getColumnModel().getColumnCount() > 0) {
            tbl_total_receitas.getColumnModel().getColumn(0).setResizable(false);
            tbl_total_receitas.getColumnModel().getColumn(0).setPreferredWidth(50);
        }

        javax.swing.GroupLayout painel_receitasLayout = new javax.swing.GroupLayout(painel_receitas);
        painel_receitas.setLayout(painel_receitasLayout);
        painel_receitasLayout.setHorizontalGroup(
            painel_receitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_receitasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_receitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
                    .addGroup(painel_receitasLayout.createSequentialGroup()
                        .addComponent(btn_nova_receita)
                        .addGap(46, 46, 46)
                        .addComponent(btn_editar_receita)
                        .addGap(44, 44, 44)
                        .addComponent(btn_remover_receita)
                        .addGap(143, 143, 143)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel_receitasLayout.setVerticalGroup(
            painel_receitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_receitasLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painel_receitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painel_receitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_nova_receita, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_editar_receita, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_remover_receita, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel_receitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(80, 80, 80))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel_receitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

        jTabbedPane1.addTab("Receitas", jPanel2);

        tbl_despesas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de Despesa", "Conta", "Data Pagamento", "Data Vencimento", "Descrição", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(tbl_despesas);
        if (tbl_despesas.getColumnModel().getColumnCount() > 0) {
            tbl_despesas.getColumnModel().getColumn(0).setResizable(false);
            tbl_despesas.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbl_despesas.getColumnModel().getColumn(1).setResizable(false);
            tbl_despesas.getColumnModel().getColumn(1).setPreferredWidth(80);
            tbl_despesas.getColumnModel().getColumn(2).setResizable(false);
            tbl_despesas.getColumnModel().getColumn(2).setPreferredWidth(40);
            tbl_despesas.getColumnModel().getColumn(3).setResizable(false);
            tbl_despesas.getColumnModel().getColumn(3).setPreferredWidth(40);
            tbl_despesas.getColumnModel().getColumn(4).setResizable(false);
            tbl_despesas.getColumnModel().getColumn(4).setPreferredWidth(100);
            tbl_despesas.getColumnModel().getColumn(5).setResizable(false);
            tbl_despesas.getColumnModel().getColumn(5).setPreferredWidth(40);
        }

        btn_nova_despesa.setText("Nova despesa");
        btn_nova_despesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nova_despesaActionPerformed(evt);
            }
        });

        btn_editar_despesa.setText("Editar despesa");

        btn_remover_despesa.setText("Remover despesa");
        btn_remover_despesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_remover_despesaActionPerformed(evt);
            }
        });

        total_despesas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Total Despesas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class
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
        jScrollPane8.setViewportView(total_despesas);
        if (total_despesas.getColumnModel().getColumnCount() > 0) {
            total_despesas.getColumnModel().getColumn(0).setResizable(false);
            total_despesas.getColumnModel().getColumn(0).setPreferredWidth(50);
        }

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cadastro de Despesas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel13.setText("Tipo de Despesa");

        tipo_despesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_despesaActionPerformed(evt);
            }
        });

        jLabel14.setText("Conta");

        valor_despesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor_despesaActionPerformed(evt);
            }
        });

        jLabel15.setText("Valor");

        btn_salvar_despesa.setText("Salvar");
        btn_salvar_despesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvar_despesaActionPerformed(evt);
            }
        });

        btn_cancelar_despesa.setText("Cancelar");
        btn_cancelar_despesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar_despesaActionPerformed(evt);
            }
        });

        conta_despesa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel16.setText("Data Pagamento");

        try {
            data_pagamento_despesa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("  ##  /  ##  /  ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            data_vencimento_despesa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("  ##  /  ##  /  ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel17.setText("Data Vencimento");

        jLabel18.setText("Descrição");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(data_pagamento_despesa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(data_vencimento_despesa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btn_salvar_despesa, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_cancelar_despesa)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(descricao_despesa)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(tipo_despesa)
                                .addGap(45, 45, 45)))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(conta_despesa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addGap(28, 28, 28))
                            .addComponent(valor_despesa))))
                .addGap(16, 16, 16))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valor_despesa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tipo_despesa, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(conta_despesa))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descricao_despesa, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(data_pagamento_despesa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(data_vencimento_despesa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_cancelar_despesa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_salvar_despesa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painel_despesasLayout = new javax.swing.GroupLayout(painel_despesas);
        painel_despesas.setLayout(painel_despesasLayout);
        painel_despesasLayout.setHorizontalGroup(
            painel_despesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_despesasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_despesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_despesasLayout.createSequentialGroup()
                        .addComponent(btn_nova_despesa)
                        .addGap(46, 46, 46)
                        .addComponent(btn_editar_despesa)
                        .addGap(44, 44, 44)
                        .addComponent(btn_remover_despesa)
                        .addGap(143, 143, 143)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel_despesasLayout.setVerticalGroup(
            painel_despesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_despesasLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painel_despesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painel_despesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_nova_despesa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_editar_despesa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_remover_despesa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel_despesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel_despesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Despesas", jPanel3);

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
    }// </editor-fold>//GEN-END:initComponents

    private void btn_remover_contaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_remover_contaActionPerformed
    /*
    // Tentativa de confirmar remoção de conta

    JOptionPane.showConfirmDialog(rootPane," Tem certeza que deseja remover esta conta?", "Confirme a ação!",JOptionPane.YES_NO_OPTION);
    if(){
        tipo_conta.setText("");
        instituicao_financeira.setText("");
        saldo.setText("");

        int index = tbl_contas.getSelectedRow();
        if(index>=0 && index<listacontas.size()){ 
            listacontas.remove(index);
        }else{}

        }
    */
      tipo_conta.setText("");
        instituicao_financeira.setText("");
        saldo.setText("");

        int index = tbl_contas.getSelectedRow();
        if(index>=0 && index<listacontas.size()){ 
            listacontas.remove(index);
        }
        LoadTableContas();
        modoc = "Remover Conta";
        ManipulaInterfaceContas();

    }//GEN-LAST:event_btn_remover_contaActionPerformed

    private void btn_nova_contaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nova_contaActionPerformed
        tipo_conta.setText("");
        instituicao_financeira.setText("");
        saldo.setText("");

        modoc = "Nova Conta";
        ManipulaInterfaceContas();


    }//GEN-LAST:event_btn_nova_contaActionPerformed

    private void tipo_contaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_contaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipo_contaActionPerformed

    private void instituicao_financeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instituicao_financeiraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_instituicao_financeiraActionPerformed

    private void saldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldoActionPerformed

    }//GEN-LAST:event_saldoActionPerformed

    private void tipo_receitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_receitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipo_receitaActionPerformed

    private void valor_receitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor_receitasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor_receitasActionPerformed

    private void btn_nova_receitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nova_receitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nova_receitaActionPerformed

    private void btn_remover_receitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_remover_receitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_remover_receitaActionPerformed

    private void btn_cancelar_receitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_receitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelar_receitaActionPerformed

    private void btn_salvar_receitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvar_receitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salvar_receitaActionPerformed

    private void btn_nova_despesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nova_despesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nova_despesaActionPerformed

    private void btn_remover_despesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_remover_despesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_remover_despesaActionPerformed

    private void tipo_despesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_despesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipo_despesaActionPerformed

    private void valor_despesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor_despesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor_despesaActionPerformed

    private void btn_salvar_despesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvar_despesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salvar_despesaActionPerformed

    private void btn_cancelar_despesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_despesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelar_despesaActionPerformed

    private void btn_salvar_contaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvar_contaActionPerformed
        sald = Double.parseDouble(saldo.getText());
        if(modoc.equals("Nova Conta")){
            Contas c = new Contas(tipo_conta.getText(), instituicao_financeira.getText(), sald);
            listacontas.add(c);

               saldototal = saldototal + sald;
               saldo_total.setText(String.valueOf(saldototal));

            LoadTableContas();
                tipo_conta.setText("");
                instituicao_financeira.setText("");
                saldo.setText("");

            modoc = "Salvar Conta";
            ManipulaInterfaceContas();

                if(listacontas.size()<=1){
                JOptionPane.showMessageDialog(rootPane,"Para editar, remover ou transferir saldo da conta\n"
                + " é só clicar na linha da conta desejada e os botões ficarão ativos!", "Dica!",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }else if(modoc.equals("Editar Conta")){
            int index = tbl_contas.getSelectedRow();
            listacontas.get(index).setTipo_conta(tipo_conta.getText());
            listacontas.get(index).setInstituicao_financeira(instituicao_financeira.getText());
            listacontas.get(index).setSaldo(sald);


            LoadTableContas();
                tipo_conta.setText("");
                instituicao_financeira.setText("");
                saldo.setText("");

            /* Tentativa de programar a atualização do saldo total quando editado

               saldototal = saldototal - tbl_contas.getSelectedRow() + sald ;
               saldo_total.setText(String.valueOf(saldototal));
            */

            LoadTableContas();
     
            modoc = "Salvar Conta";
            ManipulaInterfaceContas();

        }

    }//GEN-LAST:event_btn_salvar_contaActionPerformed

    private void btn_cancelar_contaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_contaActionPerformed
        tipo_conta.setText("");
        instituicao_financeira.setText("");
        saldo.setText("");

        modoc = "Cancelar Conta";
        ManipulaInterfaceContas();

    }//GEN-LAST:event_btn_cancelar_contaActionPerformed

    private void tbl_contasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_contasMouseClicked
        int index = tbl_contas.getSelectedRow();

        if(index>=0 && index<listacontas.size()){ 
            Contas c = listacontas.get(index);
            tipo_conta.setText(c.getTipo_conta());
            instituicao_financeira.setText(c.getInstituicao_financeira());
            saldo.setText(String.valueOf(c.getSaldo()));
            modoc = "Tabela Conta";
            ManipulaInterfaceContas();

        }

    }//GEN-LAST:event_tbl_contasMouseClicked

    private void btn_editar_contaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editar_contaActionPerformed

        modoc = "Editar Conta";
        ManipulaInterfaceContas();
    }//GEN-LAST:event_btn_editar_contaActionPerformed

    private void btn_transferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transferirActionPerformed
// falta configurar a transferencia de saldos entre contas
    }//GEN-LAST:event_btn_transferirActionPerformed

    private void painel_contasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painel_contasMouseClicked
       if(modoc.equals("Tabela Conta") ){
            modoc = "Cancelar Conta";
            ManipulaInterfaceContas();
            tipo_conta.setText("");
            instituicao_financeira.setText("");
            saldo.setText("");
        }
    }//GEN-LAST:event_painel_contasMouseClicked

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar_conta;
    private javax.swing.JButton btn_cancelar_despesa;
    private javax.swing.JButton btn_cancelar_receita;
    private javax.swing.JButton btn_editar_conta;
    private javax.swing.JButton btn_editar_despesa;
    private javax.swing.JButton btn_editar_receita;
    private javax.swing.JButton btn_nova_conta;
    private javax.swing.JButton btn_nova_despesa;
    private javax.swing.JButton btn_nova_receita;
    private javax.swing.JButton btn_remover_conta;
    private javax.swing.JButton btn_remover_despesa;
    private javax.swing.JButton btn_remover_receita;
    private javax.swing.JButton btn_salvar_conta;
    private javax.swing.JButton btn_salvar_despesa;
    private javax.swing.JButton btn_salvar_receita;
    private javax.swing.JButton btn_transferir;
    private javax.swing.JComboBox<String> conta_despesa;
    private javax.swing.JComboBox<String> contas_receitas;
    private javax.swing.JFormattedTextField data_esperada_receita;
    private javax.swing.JFormattedTextField data_pagamento_despesa;
    private javax.swing.JFormattedTextField data_recebimento_receita;
    private javax.swing.JFormattedTextField data_vencimento_despesa;
    private javax.swing.JTextField descricao_despesa;
    private javax.swing.JTextField descricao_receita;
    private javax.swing.JTextField instituicao_financeira;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel painel_contas;
    private javax.swing.JPanel painel_despesas;
    private javax.swing.JPanel painel_receitas;
    private javax.swing.JTextField saldo;
    private javax.swing.JLabel saldo_total;
    private javax.swing.JTable tbl_contas;
    private javax.swing.JTable tbl_despesas;
    private javax.swing.JTable tbl_receitas;
    private javax.swing.JTable tbl_total_receitas;
    private javax.swing.JTextField tipo_conta;
    private javax.swing.JTextField tipo_despesa;
    private javax.swing.JTextField tipo_receita;
    private javax.swing.JTable total_despesas;
    private javax.swing.JTextField valor_despesa;
    private javax.swing.JTextField valor_receitas;
    // End of variables declaration//GEN-END:variables
}
