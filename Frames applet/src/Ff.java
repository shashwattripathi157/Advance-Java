import java.awt.*;
import java.awt.event.*;

public class Ff {
    Frame f;
    Button b;
    public static void main(String args[])
    {

        Ff cf=new Ff();
        cf.createFrame();
    }
    public void createFrame()
    {
        f=new Frame("geu");
        f.setLayout(new FlowLayout());
        b=new Button("click");
        f.setSize(333,333);
        b.addActionListener(new Action());
        f.add(b);
        f.setVisible(true);
    }
    class Action implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            f.setBackground(Color.yellow);
        }
    }
}