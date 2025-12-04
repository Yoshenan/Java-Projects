import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.*;
import javax.swing.event.*;

public class DrawingProgram extends JFrame implements MouseMotionListener, ChangeListener {

    private Point mousePnt = new Point();
    private Point oldPnt = new Point(); 

    public final int FPS_MAX = 60;
    public final int FPS_MIN = 5;
    public int FPS_INIT = 30;
    private JSlider sample;
    
    
    private JColorChooser jcc; 

    public DrawingProgram() {
        super("Painter");
        JPanel toolbar = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        toolbar.add(new JLabel("Drag mouse to draw. Slider controls brush size.")); 
        this.add(toolbar, BorderLayout.SOUTH);
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addMouseMotionListener(this);
        
       
        jcc = new JColorChooser(Color.BLACK); 
        this.add(jcc, BorderLayout.EAST);
        
     
        sample = new JSlider(JSlider.HORIZONTAL, FPS_MIN, FPS_MAX, FPS_INIT);
        sample.setMajorTickSpacing(10);
        sample.setMinorTickSpacing(1);
        sample.setPaintTicks(true);
        sample.setPaintLabels(true);
        this.add(sample, BorderLayout.NORTH);
        sample.addChangeListener(this);

        setVisible(true); 
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        int value = sample.getValue();
        System.out.println("Brush Size = " + value);
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        
        Graphics g = getGraphics();
      
        int size = sample.getValue();
        g.setColor(jcc.getColor());
        
        if (g instanceof Graphics2D) {
            ((Graphics2D) g).setStroke(new BasicStroke(size, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        }

        mousePnt = e.getPoint();

       
        g.drawLine(oldPnt.x, oldPnt.y, mousePnt.x, mousePnt.y);
       
        oldPnt = mousePnt;
    }

    @Override
    public void mouseMoved(MouseEvent e) {
     
        oldPnt = e.getPoint(); 
    }

    @Override
    public void paint(Graphics g) {
        
        super.paint(g);
 
    }

    public static void main(String[] a) {
        SwingUtilities.invokeLater(() -> new DrawingProgram());
    }
}
