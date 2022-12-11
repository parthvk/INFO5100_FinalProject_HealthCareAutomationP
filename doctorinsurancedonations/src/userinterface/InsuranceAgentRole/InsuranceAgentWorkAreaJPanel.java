/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InsuranceAgentRole;

import Business.Enterprise.Enterprise;
import Business.Org.OrgInsuranceAgent;
import Business.Org.Organization;
import Business.SystemUserAccount.SystemUsers;
import java.awt.CardLayout;
import java.util.UUID;
import javax.swing.JPanel;

/**
 *
 * @author ankitajha
 */
public class InsuranceAgentWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InsuranceAgentWorkAreaJPanel
     */
    private JPanel jPanel;
    private SystemUsers usrAcnt;
    private OrgInsuranceAgent insrAgntOrg;
    private Enterprise entrpz;

    public InsuranceAgentWorkAreaJPanel(JPanel jpanel, SystemUsers userAccount, Organization organization, Enterprise enterprise) {
        initComponents();
        this.jPanel = jpanel;
        this.usrAcnt = userAccount;
        this.insrAgntOrg = (OrgInsuranceAgent) organization;
        this.entrpz = enterprise;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdNwCstmr = new javax.swing.JButton();
        btnrcsInsRq = new javax.swing.JButton();
        img = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        btnAdNwCstmr.setBackground(new java.awt.Color(0, 102, 102));
        btnAdNwCstmr.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAdNwCstmr.setForeground(java.awt.Color.white);
        btnAdNwCstmr.setText("Add New Customer");
        btnAdNwCstmr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdNwCstmrActionPerformed(evt);
            }
        });
        add(btnAdNwCstmr);
        btnAdNwCstmr.setBounds(0, 10, 184, 41);

        btnrcsInsRq.setBackground(new java.awt.Color(0, 102, 102));
        btnrcsInsRq.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnrcsInsRq.setForeground(java.awt.Color.white);
        btnrcsInsRq.setText("Process Insurance Requests");
        btnrcsInsRq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrcsInsRqActionPerformed(evt);
            }
        });
        add(btnrcsInsRq);
        btnrcsInsRq.setBounds(700, 550, 200, 39);

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/insurancehealth.jpeg"))); // NOI18N
        add(img);
        img.setBounds(1, 5, 1130, 510);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdNwCstmrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdNwCstmrActionPerformed
        String plcyNum = UUID.randomUUID().toString().substring(0, 7);
        CardLayout layout = (CardLayout) jPanel.getLayout();
        jPanel.add("AddNewPolicyHolderJPanel", new AddNewPolicyHolderJPanel(jPanel, usrAcnt, entrpz, plcyNum));
        layout.next(jPanel);

    }//GEN-LAST:event_btnAdNwCstmrActionPerformed

    private void btnrcsInsRqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrcsInsRqActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) jPanel.getLayout();
        jPanel.add("ProcessInsuranceRequestsJPanel", new AllInsuranceRequestsJPanel(jPanel, usrAcnt, entrpz, insrAgntOrg));
        layout.next(jPanel);
    }//GEN-LAST:event_btnrcsInsRqActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdNwCstmr;
    private javax.swing.JButton btnrcsInsRq;
    private javax.swing.JLabel img;
    // End of variables declaration//GEN-END:variables
}