/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dj2.gui;

import dj2.core.*;
import static dj2.core.Collection.allArtists;
import static dj2.persistence.PersistentCollection.collection;
import dj2.persistence.PersistentCollection;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Pavilion
 */
public class AddArtistPanel extends javax.swing.JPanel implements java.beans.Customizer {
  
    private Object bean;

    /**
     * Creates new customizer AddPanel
     */
    public AddArtistPanel() {
        initComponents();
    }
    
    @Override
    public void setObject(Object bean) {
        this.bean = bean;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTitle = new javax.swing.JLabel();
        jName = new javax.swing.JLabel();
        jNameField = new javax.swing.JTextField();
        jBio = new javax.swing.JLabel();
        jBioField = new javax.swing.JTextField();
        jPath = new javax.swing.JLabel();
        jChooseFileButton = new javax.swing.JButton();
        jSingles = new javax.swing.JLabel();
        jSinglesField = new javax.swing.JTextField();
        jAlbums = new javax.swing.JLabel();
        jAlbumsField = new javax.swing.JTextField();
        jConcerts = new javax.swing.JLabel();
        jConcertsField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jAddButton = new javax.swing.JButton();

        jTitle.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTitle.setText("Fill these information to add an Artist");

        jName.setText("Name");

        jNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNameFieldActionPerformed(evt);
            }
        });

        jBio.setText("Bio");

        jPath.setText("Path");

        jChooseFileButton.setText("Choose File");
        jChooseFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChooseFileButtonActionPerformed(evt);
            }
        });

        jSingles.setText("Singles");

        jSinglesField.setText("0");
        jSinglesField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSinglesFieldActionPerformed(evt);
            }
        });

        jAlbums.setText("Albums");

        jAlbumsField.setText("0");
        jAlbumsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAlbumsFieldActionPerformed(evt);
            }
        });

        jConcerts.setText("Concerts");

        jConcertsField.setText("0");
        jConcertsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConcertsFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel8.setText("*: The path of the Artist's picture");

        jAddButton.setText("Add");
        jAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(13, 13, 13)
                                    .addComponent(jName))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jBio)))
                            .addComponent(jPath, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jNameField)
                                .addComponent(jBioField)
                                .addComponent(jTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jChooseFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)))
                        .addGap(0, 139, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jSingles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSinglesField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jAlbums)
                .addGap(18, 18, 18)
                .addComponent(jAlbumsField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jConcerts)
                .addGap(18, 18, 18)
                .addComponent(jConcertsField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBio)
                    .addComponent(jBioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPath)
                    .addComponent(jChooseFileButton)
                    .addComponent(jLabel8))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSinglesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSingles)
                    .addComponent(jAlbumsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAlbums)
                    .addComponent(jConcerts)
                    .addComponent(jConcertsField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jConcertsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConcertsFieldActionPerformed
       numConcerts = Integer.parseInt(jConcertsField.getText());
    }//GEN-LAST:event_jConcertsFieldActionPerformed

    private void jAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddButtonActionPerformed
        
        if(jNameField.getText().equals("") || jBioField.getText().equals("") || jSinglesField.getText().equals("") || picFile == null)
            JOptionPane.showMessageDialog(jAddButton , "Please Fill all the elements!");
        
        else{
          try{  
             Artist artist = new Artist(jNameField.getText(), picFile.getPath(), jBioField.getText(), new GenericList<Track>(), new GenericList<Album>(), new GenericList<Concert>(),Integer.parseInt(jAlbumsField.getText()),Integer.parseInt(jSinglesField.getText()),Integer.parseInt(jConcertsField.getText()));
                    
             allArtists.add(artist);
                    
          }catch(NumberFormatException e){ JOptionPane.showMessageDialog(jAddButton , "Please Fill the 3 last elements with integers!"); }
        }   
    }//GEN-LAST:event_jAddButtonActionPerformed

    private void jNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNameFieldActionPerformed

    private void jChooseFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChooseFileButtonActionPerformed
         
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileNameExtensionFilter("Pictures", "jpg"));
        int returnVal = chooser.showOpenDialog(getParent());
			    
         if(returnVal == JFileChooser.APPROVE_OPTION)   picFile = chooser.getSelectedFile();
    }//GEN-LAST:event_jChooseFileButtonActionPerformed

    private void jSinglesFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSinglesFieldActionPerformed
      numSingles = Integer.parseInt(jSinglesField.getText());
    }//GEN-LAST:event_jSinglesFieldActionPerformed

    private void jAlbumsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAlbumsFieldActionPerformed
        numAlbums = Integer.parseInt(jAlbumsField.getText());
    }//GEN-LAST:event_jAlbumsFieldActionPerformed
  
    /**
     *
     */
    private File picFile;
    private int numSingles, numAlbums, numConcerts;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAddButton;
    private javax.swing.JLabel jAlbums;
    private javax.swing.JTextField jAlbumsField;
    private javax.swing.JLabel jBio;
    private javax.swing.JTextField jBioField;
    private javax.swing.JButton jChooseFileButton;
    private javax.swing.JLabel jConcerts;
    private javax.swing.JTextField jConcertsField;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jName;
    private javax.swing.JTextField jNameField;
    private javax.swing.JLabel jPath;
    private javax.swing.JLabel jSingles;
    private javax.swing.JTextField jSinglesField;
    private javax.swing.JLabel jTitle;
    // End of variables declaration//GEN-END:variables

}