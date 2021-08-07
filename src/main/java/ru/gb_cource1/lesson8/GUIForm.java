package ru.gb_cource1.lesson8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIForm extends JFrame implements ActionListener {
    private int count = 0;
    public GUIForm(){
        setBounds(500,500,300,300);
        setTitle("Manual GUI");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        JTextField field = new JTextField();
        field.setBounds(20, 20, 120, 32);
        field.setText(String.valueOf(count++));
        add(field);

        JButton button = new JButton("Увеличить");
        button.setBounds(20, 60, 120, 32);
        add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
               count = Integer.parseInt(field.getText());
               field.setText(String.valueOf(++count));
               System.out.println(field.getText());
            }
        });
        field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    System.out.println(field.getText());
                    count = Integer.parseInt(field.getText());
                }catch(Exception ex){
                }
                field.setText(String.valueOf(count));
            }
        });

        setVisible(true);
    }
    public static void main(String[] args) {
     new GUIForm();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
