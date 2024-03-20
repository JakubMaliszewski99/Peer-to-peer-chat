import java.awt.event.*;

public class WindowHandler extends WindowAdapter{
    public void windowClosing(WindowEvent event){
        System.exit(0);
    }
    
}
