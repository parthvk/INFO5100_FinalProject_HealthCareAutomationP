/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HealthcareAccountantRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EntInsurance;
import Business.Insurance.Insurance;
import Business.InsuranceCustomer.InsuranceCustomer;
import Business.Networks.Networks;
import Business.Org.OrgAccountant;
import Business.Org.OrgInsuranceAgent;
import Business.Org.Organization;
import Business.SystemUserAccount.SystemUsers;
import Business.WorkQueue.AccountBillRqst;
import Business.WorkQueue.InsReq;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.DecimalFormat;
import java.util.List;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Parth
 */
public class AccountantProcessRequestJPanel extends javax.swing.JPanel {

    private JPanel jPanel;
    private SystemUsers usrAcnt;
    private Enterprise entrpz;
    private OrgAccountant acntOrg;
    private AccountBillRqst acntBillingReq;
    private EcoSystem ecosystem;
    private double pyblAmnt;

    /**
     * Creates new form AccountantWorkRequestJPanel
     */
    AccountantProcessRequestJPanel(JPanel userProcessContainer, SystemUsers userAccount, AccountBillRqst request, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        this.jPanel = userProcessContainer;
        this.usrAcnt = userAccount;
        this.entrpz = enterprise;
        this.acntOrg = acntOrg;
        this.acntBillingReq = request;
        this.ecosystem = ecoSystem;
        populate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPrcsBillReqArea = new javax.swing.JLabel();
        lblSsn = new javax.swing.JLabel();
        lblFrstNm = new javax.swing.JLabel();
        lblLstNm = new javax.swing.JLabel();
        lblBllAmt = new javax.swing.JLabel();
        lblInsPlcyNo = new javax.swing.JLabel();
        lblPayableAmt = new javax.swing.JLabel();
        btnChargeAmtInitiateClmReq = new javax.swing.JButton();
        txtSsn = new javax.swing.JTextField();
        txtInsPlcyNm = new javax.swing.JTextField();
        txtPybleAmt = new javax.swing.JTextField();
        txtFrstNm = new javax.swing.JTextField();
        txtBllAmt = new javax.swing.JTextField();
        txtLstNm = new javax.swing.JTextField();
        txtPlcyNo = new javax.swing.JTextField();
        lblPlcyNo = new javax.swing.JLabel();
        lbInsClmAmt = new javax.swing.JLabel();
        txtInsClmAmt = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnCmpltPtntTrnsctn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));

        lblPrcsBillReqArea.setBackground(new java.awt.Color(255, 255, 255));
        lblPrcsBillReqArea.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblPrcsBillReqArea.setText("Process Billing Request Area");

        lblSsn.setBackground(new java.awt.Color(255, 255, 255));
        lblSsn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblSsn.setText("SSN");

        lblFrstNm.setBackground(new java.awt.Color(255, 255, 255));
        lblFrstNm.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblFrstNm.setText("FirstName");

        lblLstNm.setBackground(new java.awt.Color(255, 255, 255));
        lblLstNm.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblLstNm.setText("LastName");

        lblBllAmt.setBackground(new java.awt.Color(255, 255, 255));
        lblBllAmt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblBllAmt.setText("Bill Amount");

        lblInsPlcyNo.setBackground(new java.awt.Color(255, 255, 255));
        lblInsPlcyNo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblInsPlcyNo.setText("Insurance Policy Name");

        lblPayableAmt.setBackground(new java.awt.Color(255, 255, 255));
        lblPayableAmt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblPayableAmt.setText("Payable Amount");

        btnChargeAmtInitiateClmReq.setBackground(new java.awt.Color(0, 102, 102));
        btnChargeAmtInitiateClmReq.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnChargeAmtInitiateClmReq.setForeground(new java.awt.Color(255, 255, 255));
        btnChargeAmtInitiateClmReq.setText("Charge Amount / Initiate Claim Request");
        btnChargeAmtInitiateClmReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChargeAmtInitiateClmReqActionPerformed(evt);
            }
        });

        txtSsn.setEditable(false);

        txtInsPlcyNm.setEditable(false);

        txtPybleAmt.setEditable(false);

        txtFrstNm.setEditable(false);

        txtBllAmt.setEditable(false);

        txtLstNm.setEditable(false);

        txtPlcyNo.setEditable(false);

        lblPlcyNo.setBackground(new java.awt.Color(255, 255, 255));
        lblPlcyNo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblPlcyNo.setText("Policy Number");

        lbInsClmAmt.setBackground(new java.awt.Color(255, 255, 255));
        lbInsClmAmt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbInsClmAmt.setText("Insurance Claim Amount");

        txtInsClmAmt.setEditable(false);

        btnBack.setBackground(new java.awt.Color(0, 102, 102));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnCmpltPtntTrnsctn.setBackground(new java.awt.Color(0, 102, 102));
        btnCmpltPtntTrnsctn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCmpltPtntTrnsctn.setForeground(new java.awt.Color(255, 255, 255));
        btnCmpltPtntTrnsctn.setText("Complete Patient Transaction");
        btnCmpltPtntTrnsctn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCmpltPtntTrnsctnActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Accountant.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnBack)
                        .addGap(104, 104, 104)
                        .addComponent(lblPrcsBillReqArea))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap(136, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblPlcyNo)
                                        .addComponent(lblInsPlcyNo))
                                    .addGap(52, 52, 52)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtInsPlcyNm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPlcyNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPayableAmt)
                                        .addGap(52, 52, 52)
                                        .addComponent(txtPybleAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbInsClmAmt)
                                        .addGap(52, 52, 52)
                                        .addComponent(txtInsClmAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(77, 77, 77)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblSsn)
                                        .addComponent(lblFrstNm)
                                        .addComponent(lblLstNm)
                                        .addComponent(lblBllAmt))
                                    .addGap(52, 52, 52)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtFrstNm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtLstNm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtBllAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtSsn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(48, 48, 48)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(86, 86, 86)
                            .addComponent(btnChargeAmtInitiateClmReq)
                            .addGap(32, 32, 32)
                            .addComponent(btnCmpltPtntTrnsctn))))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrcsBillReqArea)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPlcyNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPlcyNo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtInsPlcyNm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInsPlcyNo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSsn)
                            .addComponent(txtSsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFrstNm)
                            .addComponent(txtFrstNm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLstNm)
                            .addComponent(txtLstNm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBllAmt)
                            .addComponent(txtBllAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbInsClmAmt)
                            .addComponent(txtInsClmAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPayableAmt)
                            .addComponent(txtPybleAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChargeAmtInitiateClmReq, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCmpltPtntTrnsctn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnChargeAmtInitiateClmReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChargeAmtInitiateClmReqActionPerformed
        String policyNumber = acntBillingReq.getPatient().getInsuranceCustomer().getInsPlcyNo();
        String ssn = acntBillingReq.getPatient().getSsn();
        String policyName = acntBillingReq.getPatient().getInsuranceCustomer().getIns().getPolicyName();
        String insuranceCompany = acntBillingReq.getPatient().getInsuranceCustomer().getIns().getInsuranceCompany();
        double claimAmount = Double.parseDouble(txtInsClmAmt.getText());
        double billAmount = acntBillingReq.getBillTotal();
        if (("Patient Transaction Completed").equals(acntBillingReq.getReqStatus())) {
            JOptionPane.showMessageDialog(null, "Insurance request sent for claim");
            return;
        }
        Insurance insr = new Insurance(policyName, insuranceCompany, claimAmount);
        insr.setCoverage(acntBillingReq.getPatient().getInsuranceCustomer().getIns().getCoverage());
        InsuranceCustomer insrCus = new InsuranceCustomer(insr, policyNumber);
        insrCus.setCustFrstNm(txtFrstNm.getText().trim());
        insrCus.setCustLstNme((txtLstNm.getText().trim()));

        InsReq isnrWrkReq = new InsReq();
        isnrWrkReq.setInsuranceName(insuranceCompany);
        isnrWrkReq.setPolicyNumber(policyNumber);
        isnrWrkReq.setNameOfPolicy(policyName);
        isnrWrkReq.setSocialsecurityNumber(ssn);
        isnrWrkReq.setClmAmt(claimAmount);
        isnrWrkReq.setBillingAmt(billAmount);
        isnrWrkReq.setHlthCentre(entrpz.getName());

        isnrWrkReq.setSndr(usrAcnt);
        isnrWrkReq.setReqStatus("Sent");
        isnrWrkReq.setInsuranceCust(insrCus);

        Organization org = null;
        EntInsurance matchedInsuranceCompany = null;

        List<Networks> networks = ecosystem.getNetworks();
        for (Networks network : networks) {
            List<Enterprise> enterprises = network.getEntDir().getEnterpriseList();
            for (Enterprise enterprise : enterprises) {
                if (enterprise.getName().equalsIgnoreCase(acntBillingReq.getPatient().getInsuranceCustomer().getIns().getInsuranceCompany())) {
                    matchedInsuranceCompany = (EntInsurance) enterprise;
                }
            }
        }

        for (Organization organization : matchedInsuranceCompany.getOrgDir().getOrganizations()) {
            if (organization instanceof OrgInsuranceAgent) {
                org = organization;
                break;
            }
        }
        if (org != null) {
            org.getWrkQ().getWrkReqs().add(isnrWrkReq);
            usrAcnt.getWorkQ().getWrkReqs().add(isnrWrkReq);
            acntBillingReq.setReqStatus("Patient Transaction Completed");
            acntBillingReq.getPatient().setIsTrtmntdone(true);
            JOptionPane.showMessageDialog(null, "Money received from patient: " + String.format("%.2f", String.valueOf(pyblAmnt)) + ". Insurance Claim Request Raised Successfully for amount:" + claimAmount);
            btnChargeAmtInitiateClmReq.setEnabled(false);
        }


    }//GEN-LAST:event_btnChargeAmtInitiateClmReqActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        jPanel.remove(this);
        Component[] componentArray = jPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ProcessMedicalBillingsJPanel pmbjp = (ProcessMedicalBillingsJPanel) component;
        pmbjp.populateTable();
        pmbjp.populateInsuranceClaimTable();
        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.previous(jPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCmpltPtntTrnsctnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCmpltPtntTrnsctnActionPerformed
        CardLayout layout = (CardLayout) jPanel.getLayout();
        jPanel.add("EmailBillingInformationToPatient", new EmailBillingInformationToPatient(jPanel, acntBillingReq));
        layout.next(jPanel);
    }//GEN-LAST:event_btnCmpltPtntTrnsctnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChargeAmtInitiateClmReq;
    private javax.swing.JButton btnCmpltPtntTrnsctn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel lbInsClmAmt;
    private javax.swing.JLabel lblBllAmt;
    private javax.swing.JLabel lblFrstNm;
    private javax.swing.JLabel lblInsPlcyNo;
    private javax.swing.JLabel lblLstNm;
    private javax.swing.JLabel lblPayableAmt;
    private javax.swing.JLabel lblPlcyNo;
    private javax.swing.JLabel lblPrcsBillReqArea;
    private javax.swing.JLabel lblSsn;
    private javax.swing.JTextField txtBllAmt;
    private javax.swing.JTextField txtFrstNm;
    private javax.swing.JTextField txtInsClmAmt;
    private javax.swing.JTextField txtInsPlcyNm;
    private javax.swing.JTextField txtLstNm;
    private javax.swing.JTextField txtPlcyNo;
    private javax.swing.JTextField txtPybleAmt;
    private javax.swing.JTextField txtSsn;
    // End of variables declaration//GEN-END:variables

    private void populate() {
        String policyNumber = acntBillingReq.getPatient().getInsuranceCustomer().getInsPlcyNo();
        DecimalFormat df2 = new DecimalFormat("#.##");
        double coverage = acntBillingReq.getPatient().getInsuranceCustomer().getIns().getCoverage();
        double billAmount = acntBillingReq.getBillTotal();
        String ssn = acntBillingReq.getPatient().getSsn();
        String policyName = acntBillingReq.getPatient().getInsuranceCustomer().getIns().getPolicyName();
        String insuranceCompany = acntBillingReq.getPatient().getInsuranceCustomer().getIns().getInsuranceCompany();
        double claimAmount = (coverage * billAmount) / 100;
        pyblAmnt = billAmount - claimAmount;

        txtPlcyNo.setText(policyNumber);
        txtSsn.setText(ssn);
        txtFrstNm.setText(acntBillingReq.getPatient().getPatFrstNm());
        txtLstNm.setText(acntBillingReq.getPatient().getPatLstNm());
        txtBllAmt.setText(String.valueOf(billAmount));
        txtInsPlcyNm.setText(policyName);
        txtInsClmAmt.setText(String.valueOf(claimAmount));
        txtPybleAmt.setText(String.valueOf(df2.format(pyblAmnt)));

        if (claimAmount > 0) {
            btnChargeAmtInitiateClmReq.setEnabled(true);
            btnCmpltPtntTrnsctn.setEnabled(false);
        } else {
            btnCmpltPtntTrnsctn.setEnabled(true);
            btnChargeAmtInitiateClmReq.setEnabled(false);
        }

    }
}
