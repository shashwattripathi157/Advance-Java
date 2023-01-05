import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class App extends Applet implements ActionListener
{
    Panel p;
    Button b;
    CardLayout cl;
    public void init()
    {
        setLayout(new GridLayout(2,1));
        p=new Panel();
        cl=new CardLayout();
        p.setLayout(cl);
        b=new Button("next");
        b.addActionListener(this);


        p.add(new Button("FIRST"),"1");
        p.add(new TextField(),"2");
        Panel p1=new Panel();
        p1.setBackground(Color.green);
        p1.add(new Label("aaaaaaaaaaaaaaaaaa"));
        p.add(p1,"3");


        add(p);
        add(b);
    }

    public void actionPerformed(ActionEvent e)
    {
        cl.next(p);

    }

}


/*
<applet code="A.class" width=222 height=212>
</applet>
*/

