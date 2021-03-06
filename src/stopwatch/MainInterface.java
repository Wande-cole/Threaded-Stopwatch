/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stopwatch;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ROUNA
 */
public class MainInterface extends javax.swing.JFrame {

    private int watchNum = 0;
	private boolean status = false;
	

    /**
     * Creates new form MainInterface
     */
    public MainInterface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        hour1 = new javax.swing.JLabel();
        minute1 = new javax.swing.JLabel();
        second1 = new javax.swing.JLabel();
        millisecond1 = new javax.swing.JLabel();
        hour2 = new javax.swing.JLabel();
        minute2 = new javax.swing.JLabel();
        second2 = new javax.swing.JLabel();
        millisecond2 = new javax.swing.JLabel();
        millisecond3 = new javax.swing.JLabel();
        hour3 = new javax.swing.JLabel();
        minute3 = new javax.swing.JLabel();
        second3 = new javax.swing.JLabel();
        hour4 = new javax.swing.JLabel();
        minute4 = new javax.swing.JLabel();
        second4 = new javax.swing.JLabel();
        millisecond4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Start watch");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Stop all watches");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("1");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("2");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("3");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("4");

        hour1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        hour1.setText("00:");

        minute1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        minute1.setText("00:");

        second1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        second1.setText("00:");

        millisecond1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        millisecond1.setText("00");

        hour2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        hour2.setText("00:");

        minute2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        minute2.setText("00:");

        second2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        second2.setText("00:");

        millisecond2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        millisecond2.setText("00");

        millisecond3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        millisecond3.setText("00");

        hour3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        hour3.setText("00:");

        minute3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        minute3.setText("00:");

        second3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        second3.setText("00:");

        hour4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        hour4.setText("00:");

        minute4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        minute4.setText("00:");

        second4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        second4.setText("00:");

        millisecond4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        millisecond4.setText("00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 121, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hour1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minute1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(second1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(millisecond1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hour2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minute2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(second2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(millisecond2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hour3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minute3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(second3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(millisecond3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hour4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minute4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(second4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(millisecond4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(19, 19, 19)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(hour1)
                    .addComponent(minute1)
                    .addComponent(second1)
                    .addComponent(millisecond1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(hour2)
                    .addComponent(minute2)
                    .addComponent(second2)
                    .addComponent(millisecond2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(hour3)
                    .addComponent(minute3)
                    .addComponent(second3)
                    .addComponent(millisecond3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(hour4)
                    .addComponent(minute4)
                    .addComponent(second4)
                    .addComponent(millisecond4))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private class countTimer extends Thread {
		private int watchNumber;
		int milliseconds = 0;
		int seconds = 0;
		int minutes = 0;
		int hours = 0;

		public countTimer(int wNumber) {
			this.watchNumber = wNumber;
		}
		
		public void resetTimer(){
			millisecond1.setText(":00");
			millisecond2.setText(":00");
			millisecond3.setText(":00");
			millisecond4.setText(":00");
			
			second1.setText(":00");
			second2.setText(":00");
			second3.setText(":00");
			second4.setText(":00");
			
			minute1.setText(":00");
			minute2.setText(":00");
			minute3.setText(":00");
			minute4.setText(":00");
			
			hour1.setText("00");
			hour2.setText("00");
			hour3.setText("00");
			hour4.setText("00");
			
		}
		
		public void run() {
		for (;;) {
		if(status==true){
			try {
				sleep(1);
				if (milliseconds > 999) {
					milliseconds = 0;
					seconds++;
				}
				if (seconds > 59) {
					milliseconds = 0;
					seconds = 0;
					minutes++;
				}
				if (minutes > 59) {
					milliseconds = 0;
					seconds = 0;
					minutes = 0;
					hours++;
				}
				if(watchNumber == 1){
					millisecond1.setText(" : " + milliseconds);
					milliseconds++;
					second1.setText(" : " + seconds);
					minute1.setText(" : " + minutes);
					hour1.setText("" + hours);
				}else if(watchNumber == 2){
					millisecond2.setText(" : " + milliseconds);
					milliseconds++;
					second2.setText(" : " + seconds);
					minute2.setText(" : " + minutes);
					hour2.setText("" + hours);
				}else if(watchNumber == 3){
					millisecond3.setText(" : " + milliseconds);
					milliseconds++;
					second3.setText(" : " + seconds);
					minute3.setText(" : " + minutes);
					hour3.setText("" + hours);
				}else if(watchNumber == 4){
					millisecond4.setText(" : " + milliseconds);
					milliseconds++;
					second4.setText(" : " + seconds);
					minute4.setText(" : " + minutes);
					hour4.setText("" + hours);
				}
			} catch (Exception e) {

			}
		}
		}
	}
	}
	
	countTimer timer;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
		status = true;
		watchNum ++;
		timer = new countTimer(watchNum);
		timer.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
		
		status = false;
		timer.resetTimer();
		watchNum = 0;
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hour1;
    private javax.swing.JLabel hour2;
    private javax.swing.JLabel hour3;
    private javax.swing.JLabel hour4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel millisecond1;
    private javax.swing.JLabel millisecond2;
    private javax.swing.JLabel millisecond3;
    private javax.swing.JLabel millisecond4;
    private javax.swing.JLabel minute1;
    private javax.swing.JLabel minute2;
    private javax.swing.JLabel minute3;
    private javax.swing.JLabel minute4;
    private javax.swing.JLabel second1;
    private javax.swing.JLabel second2;
    private javax.swing.JLabel second3;
    private javax.swing.JLabel second4;
    // End of variables declaration//GEN-END:variables
}
