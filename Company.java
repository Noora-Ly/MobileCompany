
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Company extends javax.swing.JFrame {
    ArrayList<String> cities;
    User user;
    LogIn login;

    public Company(User user ,LogIn login, ArrayList<String> cities) {
        this.user = user;
        this.login = login;
        this.cities = cities;
        initComponents();
    }

    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CityTextField = new javax.swing.JTextField();
        NameTextField = new javax.swing.JTextField();
        IDTextField = new javax.swing.JTextField();
        PasswordTextField = new javax.swing.JTextField();
        UsernameTextField = new javax.swing.JTextField();
        CityComboBox = new javax.swing.JComboBox<>();
        NewCityCheckBox = new javax.swing.JCheckBox();
        ChangeButton = new javax.swing.JButton();
        StreetNumTextField = new javax.swing.JTextField();
        SuburbTextField = new javax.swing.JTextField();
        StreetTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
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
        jPanel3 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        FindTextField = new javax.swing.JTextField();
        FindButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PlanTextArea = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        DeleteButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        PlansInformationTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        dateFilterText = new javax.swing.JTextField();
        modelFilterText = new javax.swing.JTextField();
        FilterByDateButton = new javax.swing.JButton();
        sortCheck = new javax.swing.JCheckBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        FilterPlansTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        LogoutMenu = new javax.swing.JMenu();

        jButton1.setText("jButton1");

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("User ID");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Suburb");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Street");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Street Number");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Password");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Address Information");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("City");

        CityTextField.setEditable(false);

        NameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextFieldActionPerformed(evt);
            }
        });

        IDTextField.setEditable(false);

        UsernameTextField.setEditable(false);

        CityComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CityComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityComboBoxActionPerformed(evt);
            }
        });

        NewCityCheckBox.setText("New City");
        NewCityCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                NewCityCheckBoxStateChanged(evt);
            }
        });
        NewCityCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewCityCheckBoxActionPerformed(evt);
            }
        });

        ChangeButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        ChangeButton.setForeground(new java.awt.Color(255, 0, 102));
        ChangeButton.setText("Change");
        ChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(IDTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                    .addComponent(UsernameTextField)
                                    .addComponent(NameTextField)
                                    .addComponent(PasswordTextField)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                                            .addGap(52, 52, 52))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(22, 22, 22)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(StreetNumTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(SuburbTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CityComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 90, Short.MAX_VALUE)
                                    .addComponent(StreetTextField))
                                .addGap(27, 27, 27)
                                .addComponent(CityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(NewCityCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(247, 247, 247)
                                .addComponent(ChangeButton)))))
                .addContainerGap(493, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(StreetNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(StreetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(SuburbTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(CityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewCityCheckBox)
                    .addComponent(CityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(ChangeButton)
                .addGap(127, 127, 127))
        );

        jTabbedPane1.addTab("Edit Personal Data", jPanel1);

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel17)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel19))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(cityOrABNLabel)
                                .addGap(27, 27, 27)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                .addGap(45, 45, 45)
                .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(PersonalChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(noEmpLabel)
                                .addGap(18, 18, 18)
                                .addComponent(noEmpText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BusinessChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(ADDButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(584, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PersonalChoice)
                    .addComponent(BusinessChoice))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(planIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(planUsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(modelText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(memoryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(internetText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(caplimitText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(dayText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(monthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityOrABNLabel)
                    .addComponent(cityOrABNText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noEmpLabel)
                    .addComponent(noEmpText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(ADDButton)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Plans", jPanel2);

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
        jScrollPane1.setViewportView(PlanTextArea);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FindTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(FindButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FindTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FindButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );

        jTabbedPane1.addTab("Find a Plan", jPanel3);

        DeleteButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        DeleteButton.setForeground(new java.awt.Color(255, 0, 51));
        DeleteButton.setText("DELETE");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        UpdateButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        UpdateButton.setForeground(new java.awt.Color(255, 0, 51));
        UpdateButton.setText("UPDATE");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        PlansInformationTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(PlansInformationTable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(DeleteButton)
                .addGap(34, 34, 34)
                .addComponent(UpdateButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteButton)
                    .addComponent(UpdateButton))
                .addGap(91, 91, 91))
        );

        jTabbedPane1.addTab("Plans Information", jPanel4);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel27.setText("Expiry Date");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel29.setText("Mobile Model");

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
        jScrollPane4.setViewportView(FilterPlansTable);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(dateFilterText, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(FilterByDateButton)
                        .addGap(99, 99, 99)
                        .addComponent(sortCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(modelFilterText, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 955, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modelFilterText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateFilterText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FilterByDateButton)
                    .addComponent(sortCheck))
                .addGap(75, 75, 75))
        );

        jTabbedPane1.addTab("Filter Plans", jPanel5);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        LogoutMenu.setText("Logout");
        LogoutMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LogoutMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(LogoutMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTextFieldActionPerformed

    private void CityComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityComboBoxActionPerformed

    private void NewCityCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewCityCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewCityCheckBoxActionPerformed

    private void ChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeButtonActionPerformed
        // TODO add your handling code here:
        try{
            IDTextField.setEditable(false);
            UsernameTextField.setEditable(false);
            user.setName(NameTextField.getText());
            user.setPassword(PasswordTextField.getText());
            user.getAddress().setStreetNum(Integer.parseInt(StreetNumTextField.getText()));
            user.getAddress().setStreet(StreetTextField.getText());
            user.getAddress().setSuburb(SuburbTextField.getText());
            if(NewCityCheckBox.isSelected()){
                user.getAddress().setCity(CityTextField.getText());
                cities.add(CityTextField.getText());
                CityComboBox.setModel(new DefaultComboBoxModel<>(cities.toArray(String[]::new)));
                CityComboBox.setSelectedItem(CityTextField.getText());
            }else{
                user.getAddress().setCity((String)CityComboBox.getSelectedItem());
                CityTextField.setText(user.getCity());
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_ChangeButtonActionPerformed

    private void planUsernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planUsernameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_planUsernameTextActionPerformed

    private void cityOrABNTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityOrABNTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityOrABNTextActionPerformed

    private void ADDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDButtonActionPerformed
        // TODO add your handling code here:
        add();
    }//GEN-LAST:event_ADDButtonActionPerformed

    public void add(){
        try{
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
    
    private void FindButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindButtonActionPerformed
        // TODO add your handling code here:
        try{
            MobilePlan plan = user.findPlan(Integer.parseInt(FindTextField.getText()));
            if(plan != null) {
                PlanTextArea.append(plan.toString() + "\n");
            }else{
                PlanTextArea.append("Plan with this ID = " + FindTextField.getText()+ "has not been found \n");
            }
        }catch(Exception e ){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_FindButtonActionPerformed

    private void personalChoiceStateChanged(javax.swing.event.ChangeEvent evt) {                                            
        if(PersonalChoice.isSelected()){
            noEmpLabel.setVisible(false);
            noEmpText.setVisible(false);
            cityOrABNLabel.setText("City");
        }else{
            noEmpLabel.setVisible(true);
            noEmpText.setVisible(true);
            cityOrABNLabel.setText("ABN");
        }
    }
    
    private void sortCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortCheckActionPerformed
        // TODO add your handling code here:
        fillTable1();
    }//GEN-LAST:event_sortCheckActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        int ind = PlansInformationTable.getSelectedRow();
        if(ind>=0){
            int id = Integer.parseInt(PlansInformationTable.getValueAt(ind, 0).toString());
            user.getPlans().remove(id);
            fillTable();
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void noEmpTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noEmpTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noEmpTextActionPerformed

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

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here:
        int ind = PlansInformationTable.getSelectedRow();
        if(ind>=0){
            int id = Integer.parseInt(PlansInformationTable.getValueAt(ind, 0).toString());
            UpdateUI updateUI  = new UpdateUI(user.getPlans().get(id), this, "u");
            updateUI.setVisible(true);
        }
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void FilterByDateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterByDateButtonActionPerformed
        // TODO add your handling code here:
        fillTable1();
    }//GEN-LAST:event_FilterByDateButtonActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:
        PlanTextArea.setText("");
        IDTextField.setEnabled(false);
        UsernameTextField.setEnabled(false);
        IDTextField.setText(user.getUserID() + "");
        NameTextField.setText(user.getName());
        UsernameTextField.setText(user.getName());
        PasswordTextField.setText(user.getPassword());
        StreetNumTextField.setText(user.getAddress().getStreetNum()+ "");
        StreetTextField.setText(user.getAddress().getStreet());
        SuburbTextField.setText(user.getAddress().getSuburb());
        
        CityComboBox.setModel(new DefaultComboBoxModel<>(cities.toArray(String[]::new)));
        CityComboBox.setSelectedItem(user.getCity());
        CityTextField.setText(user.getCity());
        
        if(PersonalChoice.isSelected()){
            noEmpLabel.setVisible(false);
            noEmpText.setVisible(false);
            cityOrABNLabel.setText("City");
        }else{
            noEmpLabel.setVisible(true);
            noEmpText.setVisible(true);
            cityOrABNLabel.setText("ABN");
        }
        fillTable();
        fillTable1();
    }//GEN-LAST:event_jTabbedPane1StateChanged

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

    private void NewCityCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_NewCityCheckBoxStateChanged
        // TODO add your handling code here:
        if(NewCityCheckBox.isSelected()){
            CityComboBox.setEnabled(false);
            CityTextField.setEnabled(true);
            CityTextField.setEditable(true);
        }else{
            CityComboBox.setEnabled(true);
            CityTextField.setEnabled(false);
        }
    }//GEN-LAST:event_NewCityCheckBoxStateChanged

    private void LogoutMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMenuMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_LogoutMenuMouseClicked

    private void modelFilterTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modelFilterTextKeyReleased
        // TODO add your handling code here:
        fillTable1();
    }//GEN-LAST:event_modelFilterTextKeyReleased

    
    public void fillTable(){
        String [] header = {"Plan ID", "Username", "Model", "OS Type", "Memory Size", "handset Price", "Internet Quota", "Cap Limit", "Expiry Date", "City", "ABN", "Number OF Employees", "Mounthly Payment"};
        DefaultTableModel model = new DefaultTableModel(header, 0);
        PlansInformationTable.setModel(model);
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
    
    public void fillTable1(){
        try {
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
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDButton;
    private javax.swing.JRadioButton BusinessChoice;
    private javax.swing.JButton ChangeButton;
    private javax.swing.JComboBox<String> CityComboBox;
    private javax.swing.JTextField CityTextField;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton FilterByDateButton;
    private javax.swing.JTable FilterPlansTable;
    private javax.swing.JButton FindButton;
    private javax.swing.JTextField FindTextField;
    private javax.swing.JTextField IDTextField;
    private javax.swing.JMenu LogoutMenu;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JCheckBox NewCityCheckBox;
    private javax.swing.JTextField PasswordTextField;
    private javax.swing.JRadioButton PersonalChoice;
    private javax.swing.JTextArea PlanTextArea;
    private javax.swing.JTable PlansInformationTable;
    private javax.swing.JTextField StreetNumTextField;
    private javax.swing.JTextField StreetTextField;
    private javax.swing.JTextField SuburbTextField;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField caplimitText;
    private javax.swing.JLabel cityOrABNLabel;
    private javax.swing.JTextField cityOrABNText;
    private javax.swing.JTextField dateFilterText;
    private javax.swing.JTextField dayText;
    private javax.swing.JTextField internetText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField memoryText;
    private javax.swing.JTextField modelFilterText;
    private javax.swing.JTextField modelText;
    private javax.swing.JTextField monthText;
    private javax.swing.JLabel noEmpLabel;
    private javax.swing.JTextField noEmpText;
    private javax.swing.JTextField planIDText;
    private javax.swing.JTextField planUsernameText;
    private javax.swing.JTextField priceText;
    private javax.swing.JCheckBox sortCheck;
    private javax.swing.JComboBox<String> typeComboBox;
    private javax.swing.JTextField yearText;
    // End of variables declaration//GEN-END:variables
}
