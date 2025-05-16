

//     public static void main(String[] args) {
//         JFrame frame = new JFrame("HelloWorldSwing");
//         final JLabel label = new JLabel("Hello World");
//         frame.getContentPane().add(label);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.pack();
//         frame.setVisible(true);
//     }


// }

// import java.awt.Color;

// import javax.swing.JFrame;
// import javax.swing.JPanel;

// public class jframe{
//     public static void main(String[] args) {
//         JFrame frame = new JFrame("I am a JFrame");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setBounds(20, 30, 300, 100);
//         frame.setLayout(null);

//         // Create a panel
//         JPanel myPanel = new JPanel();
//         myPanel.setBackground(new Color(255, 3, 25));
//         myPanel.setOpaque(true);

//         // Make it the content pane
//         frame.setContentPane(myPanel);
//         frame.setVisible(true);

//             }
// }

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


    
    public class FlowLayoutTest extends JFrame {
    JButton b1 = new JButton("Red"),
    b2 = new JButton("Green"),
    b3 = new JButton("Blue"),
    b4 = new JButton("Yellow"),
    b5 = new JButton("Pink");

    public FlowLayoutTest() {
        setTitle("FlowLayout Test");
        Container pane = getContentPane();
        pane.setLayout(new FlowLayout());
        setBounds(0, 0, 400, 100);
        pane.add(b1);
        pane.add(b2);
        pane.add(b3);
        pane.add(b4);
        pane.add(b5);
    }

    public static void main(String args[]) {
        JFrame f = new FlowLayoutTest();
        f.setVisible(true);
    }
}

