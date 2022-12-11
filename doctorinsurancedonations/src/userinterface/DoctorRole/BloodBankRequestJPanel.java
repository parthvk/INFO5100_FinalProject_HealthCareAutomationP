/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.Enterprise.Enterprise;
import Business.Org.OrgBloodBankManager;
import Business.Org.OrgLab;
import Business.Org.Organization;
import Business.SystemUserAccount.SystemUsers;
import Business.WorkQueue.BloodBankReq;
import Business.WorkQueue.PatientTreatmentReq;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Parth
 */
public class BloodBankRequestJPanel extends javax.swing.JPanel {

    private JPanel jPanel;
    private Enterprise entrpz;
    private SystemUsers usrAcnt;
    private PatientTreatmentReq pntTrWrkReq;
    //private BloodBankWorkRequest bloodBankWorkRequest;

    /**
     * Creates new form RequestLabTestJPanel
     */
    public BloodBankRequestJPanel(JPanel userProcessContainer, SystemUsers account, Enterprise enterprise, PatientTreatmentReq patientTreatmentWorkRequest) {
        initComponents();

        this.jPanel = userProcessContainer;
        this.entrpz = enterprise;
        this.usrAcnt = account;
        this.pntTrWrkReq = patientTreatmentWorkRequest;
        //this.bloodBankWorkRequest = request;
        lblValue.setText(enterprise.getName());
        btnReqTest.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnReqTest = new javax.swing.JButton();
        lblMsg = new javax.swing.JLabel();
        txtMsg = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lblValue = new javax.swing.JLabel();
        lblEnt = new javax.swing.JLabel();
        lblUnitOfBld = new javax.swing.JLabel();
        txtUnitOfBld = new javax.swing.JTextField();
        lblBldBnkReq = new javax.swing.JLabel();
        imgBldBnkReq = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReqTest.setBackground(new java.awt.Color(0, 102, 102));
        btnReqTest.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReqTest.setForeground(new java.awt.Color(255, 255, 255));
        btnReqTest.setText("Request ");
        btnReqTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReqTestActionPerformed(evt);
            }
        });
        add(btnReqTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 130, 30));

        lblMsg.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblMsg.setText("Message:");
        add(lblMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 100, -1));
        add(txtMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 130, 30));

        btnBack.setBackground(new java.awt.Color(0, 102, 102));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 30));

        lblValue.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblValue.setText("<value>");
        add(lblValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 130, 20));

        lblEnt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblEnt.setText("Enterprise :");
        add(lblEnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 110, 20));

        lblUnitOfBld.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblUnitOfBld.setText("Units of Blood:");
        add(lblUnitOfBld, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 140, -1));
        add(txtUnitOfBld, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 130, 30));

        lblBldBnkReq.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblBldBnkReq.setText("Blood Bank Request ");
        add(lblBldBnkReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        imgBldBnkReq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/blood bank request1.gif"))); // NOI18N
        imgBldBnkReq.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(imgBldBnkReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 490, 320));
    }// </editor-fold>//GEN-END:initComponents

    private void btnReqTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReqTestActionPerformed

        String  bloodUnits = txtUnitOfBld.getText().trim();            
            try {
                Integer.parseInt(bloodUnits);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please provide integer values in Blood Units textfield");
                return;
            }
            
        
        String message = txtMsg.getText().trim();

        if (bloodUnits.equals("")) {
            JOptionPane.showMessageDialog(null, "Blood Units is mandatory!");
            return;
        }
        if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Message is mandatory");
            return;
        }

        
        pntTrWrkReq.setMsgFromBloodBank(message);
        pntTrWrkReq.setSndr(usrAcnt);
        pntTrWrkReq.setReqStatus("SentToBloodBank");
        pntTrWrkReq.setRcvr(null);
        pntTrWrkReq.setBloodUnits(Integer.valueOf(bloodUnits));
        
//        bloodBankWorkRequest.setMessage(message);
//        bloodBankWorkRequest.setSender(userAccount);
//        bloodBankWorkRequest.setStatus("SentToBloodBank");
//        bloodBankWorkRequest.setReceiver(null);

        Organization org = null;

        //added organization and iterating for individual enterprises and fetching all the organisations
        //the organisation will have bloodbankmanager for the enterprise
        for (Organization organization : entrpz.getOrgDir().getOrganizations()) {

            if (organization instanceof OrgBloodBankManager) {
                org = organization;
                break;
            }
        }
        if (org != null) {

            org.getWrkQ().getWrkReqs().add(pntTrWrkReq);
            usrAcnt.getWorkQ().getWrkReqs().add(pntTrWrkReq);


            JOptionPane.showMessageDialog(null, "Blood Bank request sent successfully");
            txtMsg.setText("");
            txtUnitOfBld.setText("");
            btnReqTest.setEnabled(false);
        }

    }//GEN-LAST:event_btnReqTestActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        jPanel.remove(this);
        Component[] componentArray = jPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorWorkAreaJPanel dwjp = (DoctorWorkAreaJPanel) component;
        dwjp.pplReqTbl();
        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.previous(jPanel);

    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReqTest;
    private javax.swing.JLabel imgBldBnkReq;
    private javax.swing.JLabel lblBldBnkReq;
    private javax.swing.JLabel lblEnt;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblUnitOfBld;
    private javax.swing.JLabel lblValue;
    private javax.swing.JTextField txtMsg;
    private javax.swing.JTextField txtUnitOfBld;
    // End of variables declaration//GEN-END:variables
}
