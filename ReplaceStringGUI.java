import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReplaceStringGUI {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("Replace X in Y");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Labels and Text Fields
        JLabel labelX = new JLabel("Enter x:");
        JTextField textX = new JTextField(20);

        JLabel labelY = new JLabel("Enter y:");
        JTextField textY = new JTextField(20);

        JButton button = new JButton("FULL NAME");
        JLabel resultLabel = new JLabel("Result will appear here");

        // Button Action
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String x = textX.getText();
                String y = textY.getText();
                String replaced = y.replace(x, "");
                String reversed = new StringBuilder(replaced).reverse().toString();
                resultLabel.setText("Modified: " + replaced + " | Reverse: " + reversed);
            }
        });

        // Add components to frame
        frame.add(labelX);
        frame.add(textX);
        frame.add(labelY);
        frame.add(textY);
        frame.add(button);
        frame.add(resultLabel);

        frame.setVisible(true);
    }
}
