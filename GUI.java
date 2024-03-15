import java.awt.*;

public class GUI extends Frame{
    public GUI(){
        setLayout(new BorderLayout());
        setTitle("Peer-to-peer czat");

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
        TextField messageField = new TextField("Tutaj wpisz wiadomość...                              ");
        messageField.setSize(50, 400);
        messageField.setEditable(true);
        bottomPanel.add(messageField);
        Button sendButton = new Button("Wyślij");
        bottomPanel.add(sendButton);

        add(bottomPanel, "South");


        setSize(600, 500);
        setResizable(false);
        setVisible(true);
    }
}