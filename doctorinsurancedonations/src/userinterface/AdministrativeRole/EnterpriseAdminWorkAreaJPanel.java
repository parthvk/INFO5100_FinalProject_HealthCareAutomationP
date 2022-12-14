package userinterface.AdministrativeRole;

import userinterface.NGOAdministratorRole.NGOAdministratorWorkAreaPanel;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EntGovernment;
import Business.Enterprise.EntInsurance;
import Business.Enterprise.EntNGO;
import Business.SystemUserAccount.SystemUsers;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Pratik
 */
public class EnterpriseAdminWorkAreaJPanel extends javax.swing.JPanel {

    JPanel jPanel;
    Enterprise entrpz;
    SystemUsers usrAc;
    EcoSystem ecosystem;

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public EnterpriseAdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, SystemUsers userAccount, EcoSystem ecoSystem) {
        initComponents();
        this.jPanel = userProcessContainer;
        this.entrpz = enterprise;
        this.usrAc = userAccount;
        this.ecosystem = ecoSystem;
        lblEntValue.setText(enterprise.getName());

        if (enterprise instanceof EntGovernment || enterprise instanceof EntInsurance
            || enterprise instanceof EntNGO ) {
            btnGovtundReq.setVisible(false);
        }
        
        if (enterprise instanceof EntGovernment || enterprise instanceof EntInsurance
            || enterprise instanceof EntNGO ) {
            buttonNgoFundReq.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMyWorkArea = new javax.swing.JLabel();
        btnMangeUsr = new javax.swing.JButton();
        btnMngEmp = new javax.swing.JButton();
        btnManageOrg = new javax.swing.JButton();
        lblEnt = new javax.swing.JLabel();
        lblEntValue = new javax.swing.JLabel();
        btnGovtundReq = new javax.swing.JButton();
        lblWrkAreaImg = new javax.swing.JLabel();
        buttonNgoFundReq = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));

        lblMyWorkArea.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMyWorkArea.setText("My Work Area -Adminstrative Role");

        btnMangeUsr.setBackground(new java.awt.Color(204, 204, 204));
        btnMangeUsr.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnMangeUsr.setText("Manage User");
        btnMangeUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMangeUsrActionPerformed(evt);
            }
        });

        btnMngEmp.setBackground(new java.awt.Color(204, 204, 204));
        btnMngEmp.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnMngEmp.setText("Manage Employee");
        btnMngEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMngEmpActionPerformed(evt);
            }
        });

        btnManageOrg.setBackground(new java.awt.Color(255, 204, 204));
        btnManageOrg.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnManageOrg.setText("Manage Organization");
        btnManageOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrgActionPerformed(evt);
            }
        });

        lblEnt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEnt.setText("Enterprise :");

        lblEntValue.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        btnGovtundReq.setBackground(new java.awt.Color(204, 204, 204));
        btnGovtundReq.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnGovtundReq.setText("Request Funds from Government");
        btnGovtundReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGovtundReqActionPerformed(evt);
            }
        });

        lblWrkAreaImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdministrativeRole.png"))); // NOI18N

        buttonNgoFundReq.setBackground(new java.awt.Color(204, 204, 204));
        buttonNgoFundReq.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        buttonNgoFundReq.setText("Request Funds from NGO");
        buttonNgoFundReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNgoFundReqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnMangeUsr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMngEmp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnManageOrg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGovtundReq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonNgoFundReq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEntValue, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 400, Short.MAX_VALUE))
                    .addComponent(lblWrkAreaImg, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMyWorkArea)
                .addGap(225, 225, 225))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblMyWorkArea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnManageOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(btnMngEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(btnMangeUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGovtundReq, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(buttonNgoFundReq, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEntValue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblWrkAreaImg, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMangeUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMangeUsrActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(jPanel, entrpz);
        jPanel.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.next(jPanel);
    }//GEN-LAST:event_btnMangeUsrActionPerformed

    private void btnMngEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMngEmpActionPerformed


        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(jPanel, entrpz.getOrgDir());
        jPanel.add("manageEmployeeJPanel", manageEmployeeJPanel);


        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.next(jPanel);

    }//GEN-LAST:event_btnMngEmpActionPerformed

    private void btnManageOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrgActionPerformed


        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(jPanel, entrpz.getOrgDir(), entrpz);
        jPanel.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.next(jPanel);
    }//GEN-LAST:event_btnManageOrgActionPerformed


    private void btnGovtundReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGovtundReqActionPerformed
        CardLayout layout = (CardLayout) jPanel.getLayout();
        jPanel.add("RequestFundsJPanel", new RequestFundsJPanel(jPanel, entrpz, usrAc, ecosystem));
        layout.next(jPanel);
    }//GEN-LAST:event_btnGovtundReqActionPerformed

    private void buttonNgoFundReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNgoFundReqActionPerformed
        // TODO add your handling code here:
       CardLayout layout = (CardLayout) jPanel.getLayout();
        jPanel.add("NGORequestFundsJPanel", new NGORequestFundsJPanel(jPanel, entrpz, usrAc, ecosystem));
        layout.next(jPanel);
    }//GEN-LAST:event_buttonNgoFundReqActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGovtundReq;
    private javax.swing.JButton btnManageOrg;
    private javax.swing.JButton btnMangeUsr;
    private javax.swing.JButton btnMngEmp;
    private javax.swing.JButton buttonNgoFundReq;
    private javax.swing.JLabel lblEnt;
    private javax.swing.JLabel lblEntValue;
    private javax.swing.JLabel lblMyWorkArea;
    private javax.swing.JLabel lblWrkAreaImg;
    // End of variables declaration//GEN-END:variables

}
