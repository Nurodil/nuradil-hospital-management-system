
import java.awt.Component;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.SwingUtilities;

/**
 *
 * @author NuradilBerdaliev
 */
public final class MainWindow extends javax.swing.JFrame{
  public MainWindow()
  {
    super("Fullscreen");
    getContentPane().setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
    pack();
    setResizable(false);
    show();

    SwingUtilities.invokeLater(new Runnable() {
      public void run()
      {
        Point p = new Point(0, 0);
        SwingUtilities.convertPointToScreen(p, (Component) getContentPane());
        Point l = getLocation();
        l.x -= p.x;
        l.y -= p.y;
        setLocation(l);
      }

        private Point getLocation() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setLocation(Point l) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    });
  }

  @Override
    public void setResizable(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  @Override
    public void show() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     *
     * @return
     */
   
    //public Object getContentPane() {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}

  @Override
    public void pack() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}