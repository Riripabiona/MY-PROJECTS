package com.mycompany.taskperformance;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaskPerformance extends JFrame{
    
    private JFrame frame;
    private JTextField tField;
    private JTextField tField2;
    private JButton addButton;
    private JButton clearButton;
    private JLabel label;
 
    public TaskPerformance(){
        frame = new JFrame ("Mega Calc");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension (250, 150));
      
        tField = new JTextField(5);
        tField2 = new JTextField(5);
        addButton = new JButton (" + ");
        label = new JLabel();
        clearButton = new JButton (" Clear ");
             
        JPanel panel = new JPanel (new FlowLayout());
        panel.add(tField);
        panel.add(addButton);
        panel.add(tField2);
        
        JPanel sPanel = new JPanel (new GridLayout(2,1));
        sPanel.add(label);
        sPanel.add(clearButton);
        frame.add(sPanel, BorderLayout.SOUTH);
        
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pAdd();
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clear();
            }
        });
    }

    private void pAdd() {
            int num1 = Integer.parseInt(tField.getText());
            int num2 = Integer.parseInt(tField2.getText());
            int result = num1 + num2;
            label.setText(Integer.toString(result));
    }

    private void clear() {
        tField.setText("");
        tField2.setText("");
        label.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TaskPerformance().setVisible(true);
            }
        });
        
    }
        
        
    
    }
    
    

