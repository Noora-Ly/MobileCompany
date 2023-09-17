
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

public class AdminUi extends javax.swing.JFrame {
    MobileCompany mobileCompany;
    LogIn login;
    /**
     * Creates new form AdminUi
     */
    public AdminUi(LogIn login, MobileCompany company) {
        this.login = login;
        this.mobileCompany = company;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        companyReportArea = new javax.swing.JTextArea();
        reportButton = new javax.swing.JButton();
        companyLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        planTable = new javax.swing.JTable();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        userCombo1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userTextField = new javax.swing.JTextField();
        findButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        userArea = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        PersonalChoice = new javax.swing.JRadioButton();
        BusinessChoice = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        planUsernameText = new javax.swing.JTextField();
        modelText = new javax.swing.JTextField();
        cityOrABNText = new javax.swing.JTextField();
        memoryText = new javax.swing.JTextField();
        priceText = new javax.swing.JTextField();
        internetText = new javax.swing.JTextField();
        caplimitText = new javax.swing.JTextField();
        dayText = new javax.swing.JTextField();
        monthText = new javax.swing.JTextField();
        ClearButton = new javax.swing.JButton();
        typeComboBox = new javax.swing.JComboBox<>();
        ADDButton = new javax.swing.JButton();
        planIDText = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        cityOrABNLabel = new javax.swing.JLabel();
        noEmpLabel = new javax.swing.JLabel();
        yearText = new javax.swing.JTextField();
        noEmpText = new javax.swing.JTextField();
        userCombo2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        dateFilterText = new javax.swing.JTextField();
        modelFilterText = new javax.swing.JTextField();
        FilterByDateButton = new javax.swing.JButton();
        sortCheck = new javax.swing.JCheckBox();
        jScrollPane5 = new javax.swing.JScrollPane();
        FilterPlansTable = new javax.swing.JTable();
        userCombo3 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        allUsersCheckBox = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        planIDTextField = new javax.swing.JTextField();
        FindButton = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        PlanTextArea = new javax.swing.JTextArea();
        userCombo4 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        sortUsername = new javax.swing.JCheckBox();
        jScrollPane7 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        sortPayment = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        CityTable = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        ModelTable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu13 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenu5.setText("jMenu5");

        jMenu6.setText("jMenu6");

        jMenu7.setText("jMenu7");

        jMenu8.setText("jMenu8");

        jMenu9.setText("jMenu9");

        jMenu10.setText("jMenu10");

        jMenu11.setText("jMenu11");

        jMenu12.setText("jMenu12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        companyReportArea.setBackground(new java.awt.Color(204, 204, 255));
        companyReportArea.setColumns(20);
        companyReportArea.setRows(5);
        jScrollPane1.setViewportView(companyReportArea);

        reportButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        reportButton.setText("Report");
        reportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportButtonActionPerformed(evt);
            }
        });

        companyLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        companyLabel.setText("Cmpany");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(companyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(companyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(reportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("User Report", jPanel1);

        jLabel3.setText("Users");

        planTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(planTable);

        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 0, 102));
        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 0, 102));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        userCombo1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                userCombo1ItemStateChanged(evt);
            }
        });
        userCombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userCombo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1056, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(deleteButton)
                                .addGap(48, 48, 48)
                                .addComponent(updateButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(deleteButton))
                .addGap(59, 59, 59))
        );

        jTabbedPane1.addTab("Plans Information", jPanel4);

        jLabel1.setText("UserID");

        findButton.setText("Find");
        findButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButtonActionPerformed(evt);
            }
        });

        userArea.setColumns(20);
        userArea.setRows(5);
        jScrollPane2.setViewportView(userArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(findButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(582, 582, 582))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Find User", jPanel2);

        buttonGroup1.add(PersonalChoice);
        PersonalChoice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PersonalChoice.setText("Personal Plan");
        PersonalChoice.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                PersonalChoiceStateChanged(evt);
            }
        });

        buttonGroup1.add(BusinessChoice);
        BusinessChoice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BusinessChoice.setText("Business Plan");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Plan ID");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Username");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Model");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Mobile Phone");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("OS type");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Memory Size");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Price");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Internet Quota");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Cap Limit");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Expiry Date");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Day");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("Year");

        planUsernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planUsernameTextActionPerformed(evt);
            }
        });

        cityOrABNText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityOrABNTextActionPerformed(evt);
            }
        });

        ClearButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ClearButton.setForeground(new java.awt.Color(255, 0, 102));
        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IOS", "Windows", "Android" }));

        ADDButton.setText("ADD");
        ADDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDButtonActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setText("Month");

        cityOrABNLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cityOrABNLabel.setText("City");

        noEmpLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        noEmpLabel.setText("No.  of Employees");

        noEmpText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noEmpTextActionPerformed(evt);
            }
        });

        userCombo2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                userCombo2ItemStateChanged(evt);
            }
        });
        userCombo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userCombo2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Users");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel17)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel19))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(cityOrABNLabel)
                                .addGap(27, 27, 27)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(planUsernameText)
                    .addComponent(planIDText)
                    .addComponent(modelText)
                    .addComponent(priceText)
                    .addComponent(internetText)
                    .addComponent(caplimitText)
                    .addComponent(dayText)
                    .addComponent(monthText)
                    .addComponent(memoryText)
                    .addComponent(typeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yearText)
                    .addComponent(cityOrABNText, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ADDButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(PersonalChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(BusinessChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 551, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(noEmpLabel)
                        .addGap(18, 18, 18)
                        .addComponent(noEmpText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(87, 87, 87))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PersonalChoice)
                    .addComponent(BusinessChoice)
                    .addComponent(userCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(planIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(planUsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(modelText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(memoryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(internetText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(caplimitText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(dayText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(monthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityOrABNLabel)
                    .addComponent(cityOrABNText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ADDButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noEmpLabel)
                    .addComponent(noEmpText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Plans", jPanel5);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel27.setText("Expiry Date");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel29.setText("Mobile Model");

        modelFilterText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelFilterTextActionPerformed(evt);
            }
        });
        modelFilterText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                modelFilterTextKeyReleased(evt);
            }
        });

        FilterByDateButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        FilterByDateButton.setText("Filter By Date");
        FilterByDateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterByDateButtonActionPerformed(evt);
            }
        });

        sortCheck.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        sortCheck.setText("Sort By Usernames");
        sortCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortCheckActionPerformed(evt);
            }
        });

        FilterPlansTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(FilterPlansTable);

        userCombo3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                userCombo3ItemStateChanged(evt);
            }
        });
        userCombo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userCombo3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Users");

        allUsersCheckBox.setText("All users");
        allUsersCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allUsersCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(userCombo3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(allUsersCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modelFilterText, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(dateFilterText, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(FilterByDateButton)
                                .addGap(49, 49, 49)
                                .addComponent(sortCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userCombo3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(allUsersCheckBox))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modelFilterText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateFilterText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FilterByDateButton)
                    .addComponent(sortCheck))
                .addGap(28, 28, 28))
        );

        jTabbedPane1.addTab("Filter Plans", jPanel6);

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel26.setText("Plan ID");

        FindButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        FindButton.setForeground(new java.awt.Color(255, 0, 51));
        FindButton.setText("FIND");
        FindButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindButtonActionPerformed(evt);
            }
        });

        PlanTextArea.setBackground(new java.awt.Color(204, 204, 255));
        PlanTextArea.setColumns(20);
        PlanTextArea.setRows(5);
        jScrollPane6.setViewportView(PlanTextArea);

        userCombo4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                userCombo4ItemStateChanged(evt);
            }
        });
        userCombo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userCombo4ActionPerformed(evt);
            }
        });

        jLabel6.setText("Users");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(planIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(FindButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userCombo4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FindButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userCombo4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );

        jTabbedPane1.addTab("Find a Plan", jPanel7);

        sortUsername.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        sortUsername.setText("Sort By Usernames");
        sortUsername.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sortUsernameStateChanged(evt);
            }
        });
        sortUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortUsernameActionPerformed(evt);
            }
        });

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(usersTable);

        sortPayment.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        sortPayment.setText("Sort By Payment");
        sortPayment.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sortPaymentStateChanged(evt);
            }
        });
        sortPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortPaymentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sortUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sortPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(223, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sortPayment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sortUsername)
                .addGap(54, 54, 54))
        );

        jTabbedPane1.addTab("Users-Payment", jPanel8);

        CityTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(CityTable);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("City-Payment", jPanel9);

        ModelTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane9.setViewportView(ModelTable);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Model-Payment", jPanel10);

        jMenu13.setText("Logout");
        jMenu13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu13MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu13);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1068, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:
        companyLabel.setText("Report for " + mobileCompany.getName()+ " Co. ");
        for(User user : mobileCompany.getUsers().values())
        {
            //userCombo.addItem(user.getName() + ":" + user.getID());
            userCombo1.addItem(user.getName() + ":" + user.getID());
            userCombo2.addItem(user.getName() + ":" + user.getID());
            userCombo3.addItem(user.getName() + ":" + user.getID());
            userCombo4.addItem(user.getName() + ":" + user.getID());

            fillTable3();
            fillTable5();
            fillTable6();
        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void sortPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortPaymentActionPerformed
        // TODO add your handling code here:
        fillTable3();
    }//GEN-LAST:event_sortPaymentActionPerformed

    private void sortUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortUsernameActionPerformed
        // TODO add your handling code here:
        fillTable3();
    }//GEN-LAST:event_sortUsernameActionPerformed

    private void userCombo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userCombo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userCombo4ActionPerformed

    private void userCombo4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_userCombo4ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_userCombo4ItemStateChanged

    private void FindButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindButtonActionPerformed
        // TODO add your handling code here:
        try{
            String text = (String) userCombo4.getSelectedItem();
            String[] fileds = text.split(":");
            int id2 = Integer.parseInt(fileds[1]);
            User user = mobileCompany.findUser(id2);
            MobilePlan plan = user.findPlan(Integer.parseInt(planIDTextField.getText()));
            if(plan != null) {
                PlanTextArea.append(plan.toString() + "\n");
            }else{
                PlanTextArea.append("Plan with this ID = " + planIDTextField.getText()+ "has not been found \n");
            }
        }catch(Exception e ){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_FindButtonActionPerformed

    private void userCombo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userCombo3ActionPerformed
        // TODO add your handling code here:
        fillTable1();
    }//GEN-LAST:event_userCombo3ActionPerformed

    private void userCombo3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_userCombo3ItemStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_userCombo3ItemStateChanged

    private void sortCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortCheckActionPerformed
        // TODO add your handling code here:
        fillTable1();
    }//GEN-LAST:event_sortCheckActionPerformed

    private void FilterByDateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterByDateButtonActionPerformed
        // TODO add your handling code here:
        if(allUsersCheckBox.isSelected())
            fillTable4();
        else
            fillTable1();
    }//GEN-LAST:event_FilterByDateButtonActionPerformed

    private void modelFilterTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modelFilterTextKeyReleased
        // TODO add your handling code here:
        if(allUsersCheckBox.isSelected())
            fillTable4();
        else
            fillTable1();
    }//GEN-LAST:event_modelFilterTextKeyReleased

    private void userCombo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userCombo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userCombo2ActionPerformed

    private void userCombo2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_userCombo2ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_userCombo2ItemStateChanged

    private void noEmpTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noEmpTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noEmpTextActionPerformed

    private void ADDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDButtonActionPerformed
        // TODO add your handling code here:
        add();
    }//GEN-LAST:event_ADDButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        // TODO add your handling code here:
        planIDText.setText("");
        planUsernameText.setText("");
        modelText.setText("");
        memoryText.setText("");
        priceText.setText("");
        internetText.setText("");
        caplimitText.setText("");
        dayText.setText("");
        monthText.setText("");
        yearText.setText("");
        cityOrABNText.setText("");
        noEmpText.setText("");
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void cityOrABNTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityOrABNTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityOrABNTextActionPerformed

    private void planUsernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planUsernameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_planUsernameTextActionPerformed

    private void PersonalChoiceStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_PersonalChoiceStateChanged
        // TODO add your handling code here:
        if(PersonalChoice.isSelected()){
            noEmpLabel.setVisible(false);
            noEmpText.setVisible(false);
            cityOrABNLabel.setText("City");
        }else{
            noEmpLabel.setVisible(true);
            noEmpText.setVisible(true);
            cityOrABNLabel.setText("ABN");
        }
    }//GEN-LAST:event_PersonalChoiceStateChanged

    private void findButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButtonActionPerformed
        // TODO add your handling code here:
        try
        {
            int id = Integer.parseInt(userTextField.getText());
            User user = mobileCompany.findUser(id);
            if(user != null)
            userArea.append(user.toString() + "\n");
            else
            userArea.append("User with this id "+ id + " has not been found"+ "\n");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_findButtonActionPerformed

    private void userCombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userCombo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userCombo1ActionPerformed

    private void userCombo1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_userCombo1ItemStateChanged
        // TODO add your handling code here:
        fillTable();
    }//GEN-LAST:event_userCombo1ItemStateChanged

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        int ind = planTable.getSelectedRow();
        String text = (String) userCombo1.getSelectedItem();
        String[] fileds = text.split(":");
        int id2 = Integer.parseInt(fileds[1]);
        User user = mobileCompany.findUser(id2);
        if(ind > 0)
        {
            int id = Integer.parseInt(planTable.getValueAt(ind, 0).toString());
            UpdateUI updateUI = new UpdateUI(user.getPlans().get(id) , this , "a");
            updateUI.setVisible(true);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int ind = planTable.getSelectedRow();
        String text = (String) userCombo1.getSelectedItem();
        String[] fileds = text.split(":");
        int id2 = Integer.parseInt(fileds[1]);
        User user = mobileCompany.findUser(id2);
        if(ind > 0)
        {
            int id = Integer.parseInt(planTable.getValueAt(ind, 0).toString());
            user.getPlans().remove(id);
            fillTable();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void reportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportButtonActionPerformed
        // TODO add your handling code here:
        companyReportArea.setText(mobileCompany.toString());
    }//GEN-LAST:event_reportButtonActionPerformed

    private void allUsersCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allUsersCheckBoxActionPerformed
        // TODO add your handling code here:
        fillTable4();
    }//GEN-LAST:event_allUsersCheckBoxActionPerformed

    private void modelFilterTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelFilterTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelFilterTextActionPerformed

    private void sortPaymentStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sortPaymentStateChanged
        // TODO add your handling code here:
        if(sortPayment.isSelected()){
        sortUsername.setSelected(false);
        }
    }//GEN-LAST:event_sortPaymentStateChanged

    private void sortUsernameStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sortUsernameStateChanged
        // TODO add your handling code here:
        if(sortUsername.isSelected()){
        sortPayment.setSelected(false);
        }
    }//GEN-LAST:event_sortUsernameStateChanged

    private void jMenu13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu13MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_jMenu13MouseClicked

    public void add(){
        try{
            String text = (String) userCombo2.getSelectedItem();
            String[] fileds = text.split(":");
            int id2 = Integer.parseInt(fileds[1]);
            User user = mobileCompany.findUser(id2);
            int id = Integer.parseInt(planIDText.getText());
            String username = planUsernameText.getText();
            String model = modelText.getText();
            MobileType type = MobileType.valueOf(typeComboBox.getSelectedItem().toString());
            int size = Integer.parseInt(memoryText.getText());
            double price = Double.parseDouble(priceText.getText());
            int quota = Integer.parseInt(internetText.getText());
            int cap = Integer.parseInt(caplimitText.getText());
            int day = Integer.parseInt(dayText.getText());
            int month = Integer.parseInt(monthText.getText());
            int year = Integer.parseInt(yearText.getText());
            MyDate date = new MyDate(year, month, day);
            MobilePhone phone = new MobilePhone(model, type, size, price);
            MobilePlan plan;
            if(PersonalChoice.isSelected()){
                String city = cityOrABNText.getText();
                plan = UITools.creatPersonalPlan(username, id, phone, quota, cap, date, city);
                //plan = new PersonalPlan(username, id, phone, quota, cap, date, city);
            }else{
                int abn = Integer.parseInt(cityOrABNText.getText());
                int noEmp = Integer.parseInt(noEmpText.getText());
                plan = UITools.creatBusinessPlan(username, id, phone, quota, cap,date, noEmp, abn);
                //plan = new BusinessPlan(username, id, phone, quota, cap, noEmp, abn, date);
            }
            if(user.addPlan(user.getUserID(), user.getPassword(), plan)){
                JOptionPane.showMessageDialog(this, "Plan has been added");
                planIDText.setText("");
                planUsernameText.setText("");
                modelText.setText("");
                memoryText.setText("");
                priceText.setText("");
                internetText.setText("");
                caplimitText.setText("");
                dayText.setText("");
                monthText.setText("");
                yearText.setText("");
                cityOrABNText.setText("");
                noEmpText.setText("");
            }else{
                JOptionPane.showMessageDialog(this, "Plan can not been added");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }
    
    public void fillTable1(){
        try {
            String text = (String) userCombo3.getSelectedItem();
            String[] fileds = text.split(":");
            int id2 = Integer.parseInt(fileds[1]);
            User user = mobileCompany.findUser(id2);
            ArrayList<MobilePlan> plansCopy = user.shallowCopyPlans();
            if (!modelFilterText.getText().isEmpty()) {
                plansCopy = MobilePlan.filterByMobileModel(plansCopy, modelFilterText.getText());
            }
            if (!dateFilterText.getText().isEmpty()) {
                String[] fields = dateFilterText.getText().split("/");
                int year = Integer.parseInt(fields[0]);
                int month = Integer.parseInt(fields[1]);
                int day = Integer.parseInt(fields[2]);
                MyDate date = new MyDate(year, month, day);
                plansCopy = MobilePlan.filterByExpiryDate(plansCopy, date);
            }
            if (sortCheck.isSelected()) {
                Collections.sort(plansCopy);
            }
            String[] header = {"Plan ID", "username", "Model", "OS Type", "Memory Size", "handset price", "Internet Quota", "Cap Limit", "Expiry Date", "City", "ABN", "Number of Employees", "Monthly Payment"};
            DefaultTableModel model = new DefaultTableModel(header, 0);
            this.FilterPlansTable.setModel(model);
            for (MobilePlan plan : plansCopy) {

                String[] row = new String[13];
                row[0] = plan.getId() + "";
                row[1] = plan.getUserName();
                row[2] = plan.getHandsetModel();
                row[3] = plan.getType().toString();
                row[4] = plan.getSize()+ "";
                row[5] = plan.getHandsetPrice() + "";
                row[6] = plan.getInternetQuota() + "";
                row[7] = plan.getCapLimit() + "";
                row[8] = plan.getExpiryDate().toString();
                if (plan instanceof PersonalPlan) {

                    row[9] = ((PersonalPlan) plan).getCity();
                    row[10] = "NA";
                    row[11] = "NA";
                } else {

                    row[9] = "NA";
                    row[10] = ((BusinessPlan) plan).getABN() + "";
                    row[11] = ((BusinessPlan) plan).getNumbOfEmployees() + "";
                }
                row[12] = String.format("$%.2f", plan.calcPayment(5));

                model.addRow(row);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }
    
    public void fillTable(){
        String [] header = {"Plan ID", "Username", "Model", "OS Type", "Memory Size", "handset Price", "Internet Quota", "Cap Limit", "Expiry Date", "City", "ABN", "Number OF Employees", "Mounthly Payment"};
        DefaultTableModel model = new DefaultTableModel(header, 0);
        planTable.setModel(model);
        String text = (String) userCombo1.getSelectedItem();
        String[] fileds = text.split(":");
        int id = Integer.parseInt(fileds[1]);
        User user = mobileCompany.findUser(id);
        for(MobilePlan plan : user.getPlans().values()){
            String[] row = new String[13];
            row[0] = plan.getId() + "";
            row[1] = plan.userName;
            row[2] = plan.getHandsetModel();
            row[3] = plan.handset.getType().toString();
            row[4] = plan.handset.getSize() + "";
            row[5] = plan.handset.getPrice() + "";
            row[6] = plan.internetQuota + "";
            row[7] = plan.capLimit + "";
            row[8] = plan.getExpiryDate().toString();
            if(plan instanceof PersonalPlan){
                row[9] = ((PersonalPlan)plan).getCity();
                row[10] = "NA";
                row[11] = "NA";
            }else{
                row[9] = "NA";
                row[10] = ((BusinessPlan)plan).getABN() +"";
                row[11] = ((BusinessPlan)plan).getNumbOfEmployees() +"";
            }
            row[12] = String.format("$%.2f", plan.calcPayment(10));
            model.addRow(row);
        }
    }
    
    public void fillTable5(){
        String [] header = {"City", "Total Monthly Payment"};
        DefaultTableModel model = new DefaultTableModel(header, 0);
        CityTable.setModel(model);
        
        ArrayList<String> cities = mobileCompany.populateDistinctCityNames();
        ArrayList<Double> payments = mobileCompany.getTotalPaymentPerCity(cities);
        
        for(int i=0 ; i<cities.size() ; i++)
        {
            String[] row = new String[2];
            row[0] = cities.get(i);
            row[1] = payments.get(i).toString();
            model.addRow(row);
        }
    }
    
    public void fillTable6(){
        String [] header = {"Mobile Model ", "TotalPremium ", "Average Premium "};
        DefaultTableModel model = new DefaultTableModel(header, 0);
        ModelTable.setModel(model);
        
        HashMap<String , Integer> count = mobileCompany.getTotalCountPerMobileModel();
        HashMap<String , Double> payments = mobileCompany.getTotalPaymentPerMobileModel();


        for(String mobileModel : payments.keySet())
        {
            String[] row = new String[3];
            row[0] = mobileModel;
            row[1] = payments.get(mobileModel)+ "";
            row[2] = payments.get(mobileModel)/ count.get(mobileModel)+ "";
            model.addRow(row);
        }
    }
    
    public void fillTable4(){
        try {
            ArrayList<MobilePlan> plansCopy = mobileCompany.allPlans().values().stream().collect(Collectors.toCollection(ArrayList::new));
            if (!modelFilterText.getText().isEmpty()) {
                plansCopy = MobilePlan.filterByMobileModel(plansCopy, modelFilterText.getText());
            }
            if (!dateFilterText.getText().isEmpty()) {
                String[] fields = dateFilterText.getText().split("/");
                int year = Integer.parseInt(fields[0]);
                int month = Integer.parseInt(fields[1]);
                int day = Integer.parseInt(fields[2]);
                MyDate date = new MyDate(year, month, day);
                plansCopy = MobilePlan.filterByExpiryDate(plansCopy, date);
            }
            if (sortCheck.isSelected()) {
                Collections.sort(plansCopy);
            }
            String[] header = {"Plan ID", "username", "Model", "OS Type", "Memory Size", "handset price", "Internet Quota", "Cap Limit", "Expiry Date", "City", "ABN", "Number of Employees", "Monthly Payment"};
            DefaultTableModel model = new DefaultTableModel(header, 0);
            this.FilterPlansTable.setModel(model);
            for (MobilePlan plan : plansCopy) {
                String[] row = new String[13];
                row[0] = plan.getId() + "";
                row[1] = plan.getUserName();
                row[2] = plan.getHandsetModel();
                row[3] = plan.getType().toString();
                row[4] = plan.getSize()+ "";
                row[5] = plan.getHandsetPrice() + "";
                row[6] = plan.getInternetQuota() + "";
                row[7] = plan.getCapLimit() + "";
                row[8] = plan.getExpiryDate().toString();
                if (plan instanceof PersonalPlan) {
                    row[9] = ((PersonalPlan) plan).getCity();
                    row[10] = "NA";
                    row[11] = "NA";
                } else {
                    row[9] = "NA";
                    row[10] = ((BusinessPlan) plan).getABN() + "";
                    row[11] = ((BusinessPlan) plan).getNumbOfEmployees() + "";
                }
                row[12] = String.format("$%.2f", plan.calcPayment(5));
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }
    
    public void fillTable3(){
        ArrayList<User> users = mobileCompany.shallowCopyUsers();
        String [] header = {"Username", "Total monthly payment"};
        DefaultTableModel model = new DefaultTableModel(header, 0);
        usersTable.setModel(model);
        if(sortUsername.isSelected()){
            users = mobileCompany.sortUsersByUsername();
        }
        if(sortPayment.isSelected()){
           users = mobileCompany.sortUsersByMonthlyPayment();
        }
        String[] row = new String[2];
        for(User user : users)
        {
            row[0] = user.getName();
            row[1] =  mobileCompany.calcTotalPayments(mobileCompany.getAdminUsername(),mobileCompany.getAdminPassword(),user.getUserID(),user.getPassword())+ "";
            model.addRow(row);
        }
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
            java.util.logging.Logger.getLogger(AdminUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDButton;
    private javax.swing.JRadioButton BusinessChoice;
    private javax.swing.JTable CityTable;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton FilterByDateButton;
    private javax.swing.JTable FilterPlansTable;
    private javax.swing.JButton FindButton;
    private javax.swing.JTable ModelTable;
    private javax.swing.JRadioButton PersonalChoice;
    private javax.swing.JTextArea PlanTextArea;
    private javax.swing.JCheckBox allUsersCheckBox;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField caplimitText;
    private javax.swing.JLabel cityOrABNLabel;
    private javax.swing.JTextField cityOrABNText;
    private javax.swing.JLabel companyLabel;
    private javax.swing.JTextArea companyReportArea;
    private javax.swing.JTextField dateFilterText;
    private javax.swing.JTextField dayText;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton findButton;
    private javax.swing.JTextField internetText;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField memoryText;
    private javax.swing.JTextField modelFilterText;
    private javax.swing.JTextField modelText;
    private javax.swing.JTextField monthText;
    private javax.swing.JLabel noEmpLabel;
    private javax.swing.JTextField noEmpText;
    private javax.swing.JTextField planIDText;
    private javax.swing.JTextField planIDTextField;
    private javax.swing.JTable planTable;
    private javax.swing.JTextField planUsernameText;
    private javax.swing.JTextField priceText;
    private javax.swing.JButton reportButton;
    private javax.swing.JCheckBox sortCheck;
    private javax.swing.JCheckBox sortPayment;
    private javax.swing.JCheckBox sortUsername;
    private javax.swing.JComboBox<String> typeComboBox;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextArea userArea;
    private javax.swing.JComboBox<String> userCombo1;
    private javax.swing.JComboBox<String> userCombo2;
    private javax.swing.JComboBox<String> userCombo3;
    private javax.swing.JComboBox<String> userCombo4;
    private javax.swing.JTextField userTextField;
    private javax.swing.JTable usersTable;
    private javax.swing.JTextField yearText;
    // End of variables declaration//GEN-END:variables
}
