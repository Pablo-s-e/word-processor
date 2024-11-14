package com.mycompany.wordprocessor;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import say.swing.JFontChooser;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        
        // Set to fullscreen
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    }
    
    // Methods
    
    // Save file
    public void saveFile() {
        JOptionPane.showMessageDialog(this, "File saved successfuly.", "File saved", JOptionPane.PLAIN_MESSAGE);
        String fileName = docName.getText();
        String replace = fileName.replace(' ', '_');
        File savedFile = new File(replace + ".txt");
        
        try {
            savedFile.createNewFile();
            FileWriter fw = new FileWriter(savedFile);
            fw.write(textArea.getText());
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.requestFocus();
    }
    
    // Create new file
    public void newFile() {
        // new
        int respuesta = JOptionPane.showConfirmDialog(this, "Are you sure you want to create a new file?", "Create new file", JOptionPane.YES_NO_OPTION);
        
        if (respuesta == 0) {
            docName.setText("New document");
            textArea.setText("");
        }
        
        this.requestFocus();
    }
    
    // Light theme
    public void lightTheme() {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
            SwingUtilities.updateComponentTreeUI(this);
            this.pack();
            setExtendedState(JFrame.MAXIMIZED_BOTH);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        this.requestFocus();
    }
    
    // Dark theme
    public void darkTheme() {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
            SwingUtilities.updateComponentTreeUI(this);
            this.pack();
            setExtendedState(JFrame.MAXIMIZED_BOTH);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        this.requestFocus();
    }
    
    // Bold
    public void fontBold() {
        if (!textArea.getFont().isBold()) {
            Font font = new Font(textArea.getFont().getName(), Font.BOLD, textArea.getFont().getSize());
            textArea.setFont(font);
        } else {
            Font font = new Font(textArea.getFont().getName(), Font.PLAIN, textArea.getFont().getSize());
            textArea.setFont(font);
        }
        
        this.requestFocus();
    }
    
    // Italics
    public void fontItalics() {
        if (!textArea.getFont().isItalic()) {
            Font font = new Font(textArea.getFont().getName(), Font.ITALIC, textArea.getFont().getSize());
            textArea.setFont(font);
        } else {
            Font font = new Font(textArea.getFont().getName(), Font.PLAIN, textArea.getFont().getSize());
            textArea.setFont(font);
        }
        
        this.requestFocus();
    }
    
    // Layout settings
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        docName = new javax.swing.JTextField();
        buttonBold = new javax.swing.JButton();
        buttonItalics = new javax.swing.JButton();
        buttonFont = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        spinnerTextSize = new javax.swing.JSpinner();
        buttonTextColor = new javax.swing.JButton();
        buttonResetFormat = new javax.swing.JButton();
        buttonAuthor = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Procesador de texto");
        setMinimumSize(new java.awt.Dimension(613, 374));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        docName.setText("New document");
        docName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                docNameKeyPressed(evt);
            }
        });
        jPanel2.add(docName);

        buttonBold.setText("Bold");
        buttonBold.setToolTipText("Ctrl + B");
        buttonBold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBoldActionPerformed(evt);
            }
        });
        jPanel2.add(buttonBold);

        buttonItalics.setText("Italics");
        buttonItalics.setToolTipText("Ctrl + I");
        buttonItalics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonItalicsActionPerformed(evt);
            }
        });
        jPanel2.add(buttonItalics);

        buttonFont.setText("Change Font");
        buttonFont.setToolTipText("Shift + F");
        buttonFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFontActionPerformed(evt);
            }
        });
        jPanel2.add(buttonFont);

        jLabel1.setText("Text Size");
        jPanel4.add(jLabel1);

        spinnerTextSize.setToolTipText("Ctrl + '+' / Ctrl + '-'");
        spinnerTextSize.setValue(12);
        spinnerTextSize.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerTextSizeStateChanged(evt);
            }
        });
        jPanel4.add(spinnerTextSize);

        jPanel2.add(jPanel4);

        buttonTextColor.setText("Text Color");
        buttonTextColor.setToolTipText("");
        buttonTextColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTextColorActionPerformed(evt);
            }
        });
        jPanel2.add(buttonTextColor);

        buttonResetFormat.setText("Reset Format");
        buttonResetFormat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetFormatActionPerformed(evt);
            }
        });
        jPanel2.add(buttonResetFormat);

        buttonAuthor.setText("Author");
        buttonAuthor.setToolTipText("");
        buttonAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAuthorActionPerformed(evt);
            }
        });
        jPanel2.add(buttonAuthor);

        jPanel1.add(jPanel2, java.awt.BorderLayout.LINE_START);
        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_END);
        jPanel1.add(jSeparator1, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 1, 1, 1));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        textArea.setColumns(20);
        textArea.setLineWrap(true);
        textArea.setRows(5);
        textArea.setWrapStyleWord(true);
        textArea.setMargin(new java.awt.Insets(60, 80, 60, 80));
        jScrollPane1.setViewportView(textArea);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(199, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                .addContainerGap(199, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenu1.setText("File");

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem8.setText("New");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Save");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem7.setText("Exit");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("View");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem2.setText("Edit mode");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem3.setText("View-only mode");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Theme");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem5.setText("Light Theme");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem6.setText("Dark Theme");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuBar1.add(jMenu5);

        jMenu4.setText("Help");

        jMenuItem4.setText("Show key shortcuts");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // Light theme button
        lightTheme();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // Dark theme button
        darkTheme();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // KeyPressed events
        
        if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_S) {
            saveFile();
        }
        
        if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_N) {
            newFile();
        }
        
        if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_B) {
            fontBold();
        }
        
        if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_I) {
            fontItalics();
        }
        
        if (evt.isShiftDown() && evt.getKeyCode() == KeyEvent.VK_1) {
            lightTheme();
        }
        
        if (evt.isShiftDown() && evt.getKeyCode() == KeyEvent.VK_2) {
            darkTheme();
        }
        
        if (evt.isShiftDown() && evt.getKeyCode() == KeyEvent.VK_E) {
            textArea.setEditable(true);
        }
        
        if (evt.isShiftDown() && evt.getKeyCode() == KeyEvent.VK_V) {
            textArea.setEditable(false);
        }
        
        if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_PLUS) {
            int textSize = Integer.parseInt(spinnerTextSize.getValue().toString()) + 4;
            spinnerTextSize.setValue(textSize);
        }
        
        if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_MINUS) {
            int textSize = Integer.parseInt(spinnerTextSize.getValue().toString()) - 4;
            spinnerTextSize.setValue(textSize);
        }
    }//GEN-LAST:event_formKeyPressed

    private void buttonBoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBoldActionPerformed
        // Change font to bold
        fontBold();
    }//GEN-LAST:event_buttonBoldActionPerformed

    private void buttonItalicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonItalicsActionPerformed
        // Change font to italics
        fontItalics();
    }//GEN-LAST:event_buttonItalicsActionPerformed

    private void spinnerTextSizeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerTextSizeStateChanged
        // Change text size
        int textSize = (int) spinnerTextSize.getValue();
        Font font = new Font(textArea.getFont().getName(), textArea.getFont().getStyle(), textSize);
        textArea.setFont(font);
        
        this.requestFocus();
    }//GEN-LAST:event_spinnerTextSizeStateChanged

    private void buttonTextColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTextColorActionPerformed
        // Choose text color
        Color textColor = JColorChooser.showDialog(this, "Elegir color.", Color.red);
        textArea.setForeground(textColor);
        
        this.requestFocus();
    }//GEN-LAST:event_buttonTextColorActionPerformed

    private void docNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_docNameKeyPressed
        // Request focus after changing document name
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.requestFocus();
        }
    }//GEN-LAST:event_docNameKeyPressed

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // Request focus after clicking on whitespace
        this.requestFocus();
    }//GEN-LAST:event_jPanel5MouseClicked

    private void buttonFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFontActionPerformed
        // Change font
        JFontChooser fontChooser = new JFontChooser();
        fontChooser.showDialog(this);
        textArea.setFont(fontChooser.getSelectedFont());
        spinnerTextSize.setValue(fontChooser.getSelectedFont().getSize());
    }//GEN-LAST:event_buttonFontActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // Exit button
        System.exit(0);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // Save file
        saveFile();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // New file
        newFile();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void buttonAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAuthorActionPerformed
        // Show author
        JOptionPane.showMessageDialog(this, "Made by Pablo Serrano.");
    }//GEN-LAST:event_buttonAuthorActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // Change to edit mode
        textArea.setEditable(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // Change to view-only mode
        textArea.setEditable(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // Show available key shortcuts
        ShortcutsWindow va = new ShortcutsWindow(this, true);
        va.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void buttonResetFormatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetFormatActionPerformed
        // Reset text format
        Font defaultFont = new Font("Segoe UI", Font.PLAIN, 12);
        textArea.setFont(defaultFont);
        textArea.setForeground(Color.BLACK);
        spinnerTextSize.setValue(12);
    }//GEN-LAST:event_buttonResetFormatActionPerformed

    // Main
    
    public static void main(String args[]) {
        // Set the FlatLaf look and feel
        
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAuthor;
    private javax.swing.JButton buttonBold;
    private javax.swing.JButton buttonFont;
    private javax.swing.JButton buttonItalics;
    private javax.swing.JButton buttonResetFormat;
    private javax.swing.JButton buttonTextColor;
    private javax.swing.JTextField docName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner spinnerTextSize;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
