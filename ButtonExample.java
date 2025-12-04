
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtonExample extends JFrame
{
  
    public ButtonExample()
    {   super("something");
        JPanel p = new JPanel();
        add(p);
        setSize(320,150);
        JButton pb = new JButton("Nothing");
        JButton sb = new JButton("Push Me");
        JButton fb = new JButton("Click Me");
        JButton cb = new JButton("Button 0");
        JButton rb = new JButton("Button 1");
        JButton tb = new JButton("Button 2");
        JButton ab = new JButton("Button 3");
        cb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "button clicked ");
            }
        });
         rb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Button 1  clicked ");
            }
        });
         tb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "button 2 clicked");
            }
        });

     

        p.add(pb);
        p.add(sb);
        p.add(fb);
        p.add(cb);
        p.add(rb);
        p.add(tb);
        p.add(ab);
        //pb.setText("Nothing will be done");
        //fb.addActionListener(new FileActionListener());
        //pb.addActionListener(new PictureActionListener());
        sb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Toolkit.getDefaultToolkit().beep();
               JOptionPane.showMessageDialog(null, "button was pushed");
            }
        });
        fb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              try {
            //URL url = new URL("images.png");
            ImageIcon icon = new ImageIcon("src/images.png");

            JLabel label = new JLabel(icon);

            JOptionPane.showMessageDialog(
                null,
                label,
                "Image",
                JOptionPane.PLAIN_MESSAGE
            );

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Could not load image");
        }

    }
        });


        setVisible(true);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
     public static void main(String[] args){
        new ButtonExample();
    }

}
