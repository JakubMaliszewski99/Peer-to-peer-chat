import java.awt.event.*;

public class ActionHandler implements ActionListener{
    public void actionPerformed(ActionEvent event){
        if(event.getActionCommand().startsWith("Połącz")){
            System.exit(0);
        }
        if(event.getActionCommand().startsWith("Rozłącz")){
            System.exit(0);
        }
        if(event.getActionCommand().startsWith("Wyślij")){
            System.exit(0);
        }
        if(event.getActionCommand().startsWith("Zamknij")){
            System.exit(0);
        }
    }
}
