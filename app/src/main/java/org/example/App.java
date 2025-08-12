package org.example;

import javax.swing.*;

public class App {
    // public String getGreString() {
    //     return "Hello  World";
    // }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI Sample");
        JButton button = new JButton("Click");

        button.addActionListener(e -> 
          JOptionPane.showMessageDialog(frame, "Button Clicked!")
        );

        frame.add(button); // 버튼
        frame.setSize(300, 200); // 해상도
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 구현
        frame.setVisible(true); // 종료시 프로그램이 꺼짐
    }
}
