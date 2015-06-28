/*
 * mySB.java
 *
 * Created on May 4, 2007, 10:54 PM
 */

package ca;

/**
 *
 * @author  jlaval3
 */
public class mySB extends javax.swing.JPanel {
    /** Creates new form mySB */
    public mySB() {
        initComponents();
        txtVal.setText("" + jSlider1.getValue());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        txtVal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setText("jLabel1");
        add(jLabel1);

        jSlider1.setMaximumSize(new java.awt.Dimension(150, 25));
        jSlider1.setPreferredSize(new java.awt.Dimension(150, 25));
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        jSlider1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jSlider1PropertyChange(evt);
            }
        });
        add(jSlider1);

        txtVal.setBackground(new java.awt.Color(221, 236, 251));
        txtVal.setText("jTextField1");
        txtVal.setMaximumSize(new java.awt.Dimension(30, 20));
        txtVal.setMinimumSize(new java.awt.Dimension(30, 20));
        txtVal.setPreferredSize(new java.awt.Dimension(30, 20));
        txtVal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValActionPerformed(evt);
            }
        });
        add(txtVal);

        jLabel2.setText("jLabel2");
        add(jLabel2);
    }// </editor-fold>//GEN-END:initComponents

    private void txtValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValActionPerformed
        jSlider1.setValue(Integer.valueOf( txtVal.getText() ).intValue());
    }//GEN-LAST:event_txtValActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
         txtVal.setText("" + jSlider1.getValue());
         setValue(jSlider1.getValue());
    }//GEN-LAST:event_jSlider1StateChanged

    //BORRAME:
    private void jSlider1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jSlider1PropertyChange
        //jLabel2.setText(jSlider1.getValue() + " " + txt2);
    }//GEN-LAST:event_jSlider1PropertyChange
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField txtVal;
    // End of variables declaration//GEN-END:variables

    /**
     * Holds value of property txt1.
     */
    private String txt1;

    /**
     * Getter for property txt1.
     * @return Value of property txt1.
     */
    public String getTxt1() {
        return this.txt1;
    }

    /**
     * Setter for property txt1.
     * @param txt1 New value of property txt1.
     */
    public void setTxt1(String txt1) {
        this.txt1 = txt1;
        jLabel1.setText(txt1);
    }

    /**
     * Holds value of property sMax.
     */
    private int sMax = 100;

    /**
     * Getter for property sMax.
     * @return Value of property sMax.
     */
    public int getSMax() {
        return this.sMax;
    }

    /**
     * Setter for property sMax.
     * @param sMax New value of property sMax.
     */
    public void setSMax(int sMax) {
        this.sMax = sMax;
        jSlider1.setMaximum(sMax);
    }

    /**
     * Holds value of property sMin.
     */
    private int sMin;

    /**
     * Getter for property sMin.
     * @return Value of property sMin.
     */
    public int getSMin() {
        return this.sMin;
    }

    /**
     * Setter for property sMin.
     * @param sMin New value of property sMin.
     */
    public void setSMin(int sMin) {
        this.sMin = sMin;
        jSlider1.setMinimum(sMin);
    }

    /**
     * Holds value of property txt2.
     */
    private String txt2;

    /**
     * Getter for property txt2.
     * @return Value of property txt2.
     */
    public String getTxt2() {
        return this.txt2;
    }

    /**
     * Setter for property txt2.
     * @param txt2 New value of property txt2.
     */
    public void setTxt2(String txt2) {
        this.txt2 = txt2;
        jLabel2.setText(txt2);
    }

    /**
     * Holds value of property value.
     */
    private int value;

    /**
     * Utility field used by bound properties.
     */
    private java.beans.PropertyChangeSupport propertyChangeSupport =  new java.beans.PropertyChangeSupport(this);

    /**
     * Adds a PropertyChangeListener to the listener list.
     * @param l The listener to add.
     */
    public void addPropertyChangeListener(java.beans.PropertyChangeListener l) {
        propertyChangeSupport.addPropertyChangeListener(l);
    }

    /**
     * Removes a PropertyChangeListener from the listener list.
     * @param l The listener to remove.
     */
    public void removePropertyChangeListener(java.beans.PropertyChangeListener l) {
        propertyChangeSupport.removePropertyChangeListener(l);
    }

    /**
     * Getter for property value.
     * @return Value of property value.
     */
    public int getValue() {
        return this.value;
    }

    /**
     * Setter for property value.
     * @param value New value of property value.
     */
    public void setValue(int value) {
        jSlider1.setValue(value);
        int oldValue = this.value;
        this.value = value;
        propertyChangeSupport.firePropertyChange ("value", new Integer (oldValue), new Integer (value));
    }



    
}
