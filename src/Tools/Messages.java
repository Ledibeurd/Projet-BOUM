/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outils;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author bouleghlem
 */
public class Messages {
    
    public static void warning (JFrame f, String msg) throws HeadlessException {
        JOptionPane.showMessageDialog(f, msg, f.getTitle(), JOptionPane.WARNING_MESSAGE);
    }

    public static void erreur (JFrame f, String msg) throws HeadlessException {
        JOptionPane.showMessageDialog(f, msg, f.getTitle(), JOptionPane.ERROR_MESSAGE);
    }
    
    
    public static void info (JFrame f, String msg) throws HeadlessException {
        JOptionPane.showMessageDialog(f, msg, f.getTitle(), JOptionPane.INFORMATION_MESSAGE);
    }
}
