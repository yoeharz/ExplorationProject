/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explorationproject;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Yoeda H
 */
public class MaxValueFrame extends JFrame{

    public MaxValueFrame() {
        setLayout(null);
        setSize(300, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTextField textField = new JTextField();
        textField.setBounds(10, 10, 200, 50);
        textField.setDocument(new DocumentDiskon(3, 5));
        add(textField);
    }
    
    public static void main(String[] args){
        MaxValueFrame maxValueFrame = new MaxValueFrame();
        maxValueFrame.setVisible(true);
    }
}
