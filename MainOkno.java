import java.awt.*;
import java.awt.event.*;

public class MainOkno extends Frame{
    public MainOkno(){
        setLayout(new BorderLayout());
        setTitle("Peer-to-peer czat");
        addWindowListener(windowHandler);

        createMenu();

        setSize(600, 500);
        setResizable(false);
        setVisible(true);
    }

    private void createMenu(){
        // Menu
        MenuBar mb = new MenuBar();
        setMenuBar(mb);

        // Zakładka Program
        Menu prog = new Menu("Program");
        mb.add(prog);
        MenuItem connect = new MenuItem("Połącz", new MenuShortcut(KeyEvent.VK_C));
        connect.addActionListener(actionHandler);
        prog.add(connect);
        MenuItem disconnect = new MenuItem("Rozłącz", new MenuShortcut(KeyEvent.VK_D));
        prog.add(disconnect);
        disconnect.addActionListener(actionHandler);
        MenuItem send = new MenuItem("Wyślij", new MenuShortcut(KeyEvent.VK_W));
        send.addActionListener(actionHandler);
        prog.add(send);
        // Separator
        prog.add(new MenuItem("-"));
        // Zamknij program z menu
        MenuItem quit = new MenuItem("Zamknij", 
                                        new MenuShortcut(KeyEvent.VK_X));
        prog.add(quit);
        quit.addActionListener(actionHandler);

        // Historia czatów
        Menu history = new Menu("Historia czatów");
        mb.add(history);
        MenuItem open = new MenuItem("Otwórz historię czatu",
                new MenuShortcut(KeyEvent.VK_O));
        history.add(open);
        MenuItem save = new MenuItem("Zapisz historię czatu",
                new MenuShortcut(KeyEvent.VK_S));
        history.add(save);
        
        Menu help = new Menu("Pomoc");
        mb.setHelpMenu(help);
        MenuItem doc = new MenuItem("Dokumentacja",
                new MenuShortcut(KeyEvent.VK_H));
        help.add(doc);

        // Top panel
        Panel topPanel = new Panel();
        topPanel.setLayout(new FlowLayout());
        Label ipLabel = new Label("IP drugiego peera: ");
        topPanel.add(ipLabel);
        TextField ipInput = new TextField("XXX.XXX.XXX.XXX");
        ipInput.setEditable(true);
        topPanel.add(ipInput);
        Button connectButton = new Button("Połącz");
        topPanel.add(connectButton);
        Label statusLabel = new Label("Niepołączono");
        topPanel.add(statusLabel);
        add(topPanel, "North");

        // Center panel
        TextArea chatWindow = new TextArea();
        chatWindow.setEditable(false);
        add(chatWindow, "Center");

        // Bottom panel
        Panel bottomPanel = new Panel();
        bottomPanel.setLayout(new FlowLayout());
        TextArea messageArea = new TextArea("Tutaj wpisz wiadomość...", 8, 60);
        messageArea.setEditable(true);
        bottomPanel.add(messageArea);
        Button sendButton = new Button("Wyślij");
        bottomPanel.add(sendButton);
        add(bottomPanel, "South");
    }

    private WindowHandler windowHandler = new WindowHandler();
    private ActionHandler actionHandler = new ActionHandler();
}