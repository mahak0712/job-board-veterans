/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VeteranOrg.VeteranRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.VeteranOrganization.VeteranOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.StandardBarPainter;
import org.jfree.data.category.DefaultCategoryDataset;


/**
 *
 * @author mahaksingh
 */
public class ReviewCompanyGraphJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount account;
    private EcoSystem business;
    private VeteranOrganization organization;

    /**
     * Creates new form ReviewCompanyGraphJPanel
     */
    public ReviewCompanyGraphJPanel(JPanel userProcessContainer, UserAccount account,VeteranOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.business = business;
        this.organization=organization;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnShowChart = new javax.swing.JButton();
        ReviewCompanyJPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnShowChart.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        btnShowChart.setForeground(new java.awt.Color(0, 51, 255));
        btnShowChart.setText("ShowChart");
        btnShowChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowChartActionPerformed(evt);
            }
        });
        add(btnShowChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, -1, -1));

        ReviewCompanyJPanel.setBackground(new java.awt.Color(102, 102, 102));
        ReviewCompanyJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Show Report", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        ReviewCompanyJPanel.setLayout(new javax.swing.BoxLayout(ReviewCompanyJPanel, javax.swing.BoxLayout.LINE_AXIS));
        add(ReviewCompanyJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 850, 460));

        jButton1.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowChartActionPerformed
        // TODO add your handling code here:
         DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        dcd.setValue(93, "Reviews", "Keller Williams Realty");
        dcd.setValue(94, "Reviews", "Chick-fil-A");
        dcd.setValue(94, "Reviews", "Delta");
        dcd.setValue(96, "Reviews", "Costco Wholesale");
        dcd.setValue(89, "Reviews", "HEB");
        dcd.setValue(90, "Reviews", "Northrop Grumman");
         dcd.setValue(85, "Reviews", "FBI");
          dcd.setValue(97,"Reviews", "Marriot International, Inc");
        
        JFreeChart jchart = ChartFactory.createBarChart("Company based on Reviews", "Company", "Percentage", dcd, PlotOrientation.VERTICAL, true, true, true);
        CategoryPlot cplot = jchart.getCategoryPlot();
        cplot.setRangeGridlinePaint(Color.black);
        ((BarRenderer) cplot.getRenderer()).setBarPainter(new StandardBarPainter());
        BarRenderer r = (BarRenderer) jchart.getCategoryPlot().getRenderer();
        r.setSeriesPaint(0, Color.green);

        
        ChartPanel chartPanel = new ChartPanel(jchart);

        ReviewCompanyJPanel.removeAll();
        ReviewCompanyJPanel.add(chartPanel);
        ReviewCompanyJPanel.updateUI();
    }//GEN-LAST:event_btnShowChartActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ReviewCompanyJPanel;
    private javax.swing.JButton btnShowChart;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
