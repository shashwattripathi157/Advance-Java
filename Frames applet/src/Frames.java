import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frames {
    Frame f;
    Button b;
    public static void main(String[] args) {

        Frames cFrame = new Frames();
        cFrame.createFrame();
    }
    public void createFrame() {
        f = new Frame("hello");
        f.setBackground(Color.cyan);
        f.setLayout(new FlowLayout());
        b = new Button("change color");
        f.setSize(333, 333);
        b.addActionListener(new Action());
        f.add(b);
        f.setVisible(true);
    }
    class Action implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            f.setBackground(Color.red);
        }
    }
}


