
import javax.swing.JOptionPane;

public class UpdateUI extends javax.swing.JFrame {
    MobilePlan plan;
    Company company1;
    AdminUi adminUi1;
    String continu;
    
    public UpdateUI(MobilePlan plan, Company company, String i) {
        this.plan = plan;
        company1 = company;
        continu = i;
        initComponents();
        
        personalChoice.setEnabled(false);
        businessChoice.setEnabled(false);
        planIDText.setEnabled(false);
        planIDText.setText(plan.getId() +"");
        planUsernameText.setText(plan.getUserName());
        modelText.setText(plan.getHandsetModel());
        memoryText.setText(plan.getSize()+ "");
        priceText.setText(plan.getHandsetPrice()+"");
        internetText.setText(plan.getInternetQuota()+"");
        typeText.setSelectedItem(plan.handset.getType().toString());
        capText.setText(plan.getCapLimit() + "");
        dayText.setText(plan.getExpiryDate().getDay() + "");
        monthText.setText(plan.getExpiryDate().getMonth() + "");
        yearText.setText(plan.getExpiryDate().getYear() + "");
        if(plan instanceof PersonalPlan){
            personalChoice.setSelected(true);
            businessChoice.setSelected(false);
            cityOrABNLabel.setText("City");
            cityOrABNText.setText(((PersonalPlan) plan).getCity());
            noEmpText.setText("");
            noEmpLabel.setVisible(false);
            noEmpText.setVisible(false);
        }else{
            personalChoice.setSelected(false);
            businessChoice.setSelected(true);
            cityOrABNLabel.setText("ABN");
            cityOrABNText.setText(((BusinessPlan) plan).getABN() + "");
            noEmpText.setText(((BusinessPlan)plan).getNumbOfEmployees() + "");
            noEmpLabel.setVisible(true);
            noEmpText.setVisible(true);
        }
    }
    
    public UpdateUI(MobilePlan plan, AdminUi adminUi, String i) {
        this.plan = plan;
        adminUi1 = adminUi;
        continu = i;
        initComponents();
        
        personalChoice.setEnabled(false);
        businessChoice.setEnabled(false);
        planIDText.setEnabled(false);
        planIDText.setText(plan.getId() +"");
        planUsernameText.setText(plan.getUserName());
        modelText.setText(plan.getHandsetModel());
        memoryText.setText(plan.getSize()+ "");
        priceText.setText(plan.getHandsetPrice()+"");
        internetText.setText(plan.getInternetQuota()+"");
        typeText.setSelectedItem(plan.handset.getType().toString());
        capText.setText(plan.getCapLimit() + "");
        dayText.setText(plan.getExpiryDate().getDay() + "");
        monthText.setText(plan.getExpiryDate().getMonth() + "");
        yearText.setText(plan.getExpiryDate().getYear() + "");
        if(plan instanceof PersonalPlan){
            personalChoice.setSelected(true);
            businessChoice.setSelected(false);
            cityOrABNLabel.setText("City");
            cityOrABNText.setText(((PersonalPlan) plan).getCity());
            noEmpText.setText("");
            noEmpLabel.setVisible(false);
            noEmpText.setVisible(false);
        }else{
            personalChoice.setSelected(false);
            businessChoice.setSelected(true);
            cityOrABNLabel.setText("ABN");
            cityOrABNText.setText(((BusinessPlan) plan).getABN() + "");
            noEmpText.setText(((BusinessPlan)plan).getNumbOfEmployees() + "");
            noEmpLabel.setVisible(true);
            noEmpText.setVisible(true);
        }
    }

    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        personalChoice = new javax.swing.JRadioButton();
        businessChoice = new javax.swing.JRadioButton();
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
        jLabel22 = new javax.swing.JLabel();
        planIDText = new javax.swing.JTextField();
        planUsernameText = new javax.swing.JTextField();
        clearBut = new javax.swing.JButton();
        modelText = new javax.swing.JTextField();
        typeText = new javax.swing.JComboBox<>();
        memoryText = new javax.swing.JTextField();
        priceText = new javax.swing.JTextField();
        internetText = new javax.swing.JTextField();
        capText = new javax.swing.JTextField();
        dayText = new javax.swing.JTextField();
        monthText = new javax.swing.JTextField();
        yearText = new javax.swing.JTextField();
        cityOrABNLabel = new javax.swing.JLabel();
        cityOrABNText = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        noEmpLabel = new javax.swing.JLabel();
        noEmpText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(personalChoice);
        personalChoice.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        personalChoice.setText("Personal Plan");
        personalChoice.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                personalChoiceStateChanged(evt);
            }
        });

        buttonGroup1.add(businessChoice);
        businessChoice.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        businessChoice.setText("Business Plan");
        businessChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                businessChoiceActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel10.setText("Plan ID");

        jLabel11.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel11.setText("Username");

        jLabel12.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel12.setText("Mobile Phone");

        jLabel13.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel13.setText("Model");

        jLabel14.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel14.setText("OS Type");

        jLabel15.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel15.setText("Memory Size");

        jLabel16.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel16.setText("Price");

        jLabel17.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel17.setText("Internet Quota");

        jLabel18.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel18.setText("Cap Limit");

        jLabel19.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel19.setText("Expiry Date");

        jLabel20.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel20.setText("Day");

        jLabel21.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel21.setText("Month");

        jLabel22.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel22.setText("Year");

        clearBut.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        clearBut.setForeground(new java.awt.Color(255, 0, 0));
        clearBut.setText("Clear");
        clearBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButActionPerformed(evt);
            }
        });

        typeText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IOS", "Windows", "Android" }));
        typeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeTextActionPerformed(evt);
            }
        });

        monthText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthTextActionPerformed(evt);
            }
        });

        cityOrABNLabel.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        cityOrABNLabel.setText("City");

        update.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        update.setForeground(new java.awt.Color(255, 0, 0));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        noEmpLabel.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        noEmpLabel.setText("No. of Employees");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(personalChoice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(businessChoice))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11))
                                        .addGap(54, 54, 54)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(planUsernameText, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                            .addComponent(planIDText)))
                                    .addComponent(jLabel12))
                                .addGap(90, 90, 90)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clearBut)
                                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(cityOrABNLabel)
                            .addComponent(noEmpLabel))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(modelText, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(typeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(memoryText)
                            .addComponent(priceText)
                            .addComponent(internetText)
                            .addComponent(capText)
                            .addComponent(dayText)
                            .addComponent(yearText)
                            .addComponent(monthText)
                            .addComponent(cityOrABNText)
                            .addComponent(noEmpText))))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personalChoice)
                    .addComponent(businessChoice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(planIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBut))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(planUsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(update)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(modelText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(typeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(memoryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(internetText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(capText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(dayText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(monthText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(yearText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cityOrABNLabel))
                    .addComponent(cityOrABNText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noEmpLabel)
                    .addComponent(noEmpText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 687, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void personalChoiceStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_personalChoiceStateChanged
        if(personalChoice.isSelected()){
            noEmpLabel.setVisible(false);
            noEmpText.setVisible(false);
            cityOrABNLabel.setText("City");
        }else{
            noEmpLabel.setVisible(true);
            noEmpText.setVisible(true);
            cityOrABNLabel.setText("ABN");
        }
    }//GEN-LAST:event_personalChoiceStateChanged

    private void businessChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_businessChoiceActionPerformed

    }//GEN-LAST:event_businessChoiceActionPerformed

    private void typeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeTextActionPerformed

    private void monthTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthTextActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try{
            String username = planUsernameText.getText();
            String model = modelText.getText();
            MobileType type = MobileType.valueOf(typeText.getSelectedItem().toString());
            int size = Integer.parseInt(memoryText.getText());
            double price = Double.parseDouble(priceText.getText());
            int quota = Integer.parseInt(internetText.getText());
            int cap = Integer.parseInt(capText.getText());
            int day = Integer.parseInt(dayText.getText());
            int month = Integer.parseInt(monthText.getText());
            int year = Integer.parseInt(yearText.getText());
            MyDate date = new MyDate(year, month, day);
            MobilePhone phone = new MobilePhone(model, type, size, price);
            plan.setUserName(username);
            plan.setExpiryDate(date);
            plan.setHandset(phone);
            plan.setCapLimit(cap);
            plan.setInternetQuota(quota);
            
            if(personalChoice.isSelected()){
                String city = cityOrABNText.getText();
                ((PersonalPlan)plan).setCity(city);
            }else{
                int abn = Integer.parseInt(cityOrABNText.getText());
                int noEmp = Integer.parseInt(noEmpText.getText());
                ((BusinessPlan)plan).setNumberOfEmployees(noEmp);
                ((BusinessPlan)plan).setABN(abn);
            }
            
            JOptionPane.showMessageDialog(this, "Plan has been updated");
            if(continu.equals("u")){
                company1.fillTable();
            }
            if(continu.equals("a")){
                adminUi1.fillTable();
            }
            this.dispose();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void clearButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButActionPerformed
        planIDText.setText("");
        planUsernameText.setText("");
        modelText.setText("");
        memoryText.setText("");
        priceText.setText("");
        internetText.setText("");
        capText.setText("");
        dayText.setText("");
        monthText.setText("");
        yearText.setText("");
        cityOrABNText.setText("");
        noEmpText.setText("");
    }//GEN-LAST:event_clearButActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton businessChoice;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField capText;
    private javax.swing.JLabel cityOrABNLabel;
    private javax.swing.JTextField cityOrABNText;
    private javax.swing.JButton clearBut;
    private javax.swing.JTextField dayText;
    private javax.swing.JTextField internetText;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField memoryText;
    private javax.swing.JTextField modelText;
    private javax.swing.JTextField monthText;
    private javax.swing.JLabel noEmpLabel;
    private javax.swing.JTextField noEmpText;
    private javax.swing.JRadioButton personalChoice;
    private javax.swing.JTextField planIDText;
    private javax.swing.JTextField planUsernameText;
    private javax.swing.JTextField priceText;
    private javax.swing.JComboBox<String> typeText;
    private javax.swing.JButton update;
    private javax.swing.JTextField yearText;
    // End of variables declaration//GEN-END:variables
}
