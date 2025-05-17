import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DistanceCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Distance Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(5, 2));

        JLabel x1Label = new JLabel("X1:");
        JTextField x1Field = new JTextField();
        JLabel y1Label = new JLabel("Y1:");
        JTextField y1Field = new JTextField();
        JLabel x2Label = new JLabel("X2:");
        JTextField x2Field = new JTextField();
        JLabel y2Label = new JLabel("Y2:");
        JTextField y2Field = new JTextField();
        JButton calculateButton = new JButton("Calculate Distance");
        JLabel resultLabel = new JLabel("Distance:");

        frame.add(x1Label);
        frame.add(x1Field);
        frame.add(y1Label);
        frame.add(y1Field);
        frame.add(x2Label);
        frame.add(x2Field);
        frame.add(y2Label);
        frame.add(y2Field);
        frame.add(calculateButton);
        frame.add(resultLabel);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x1 = Double.parseDouble(x1Field.getText());
                double y1 = Double.parseDouble(y1Field.getText());
                double x2 = Double.parseDouble(x2Field.getText());
                double y2 = Double.parseDouble(y2Field.getText());
                double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
                resultLabel.setText("Distance: " + distance);
            }
        });

        frame.setVisible(true);
    }
}
