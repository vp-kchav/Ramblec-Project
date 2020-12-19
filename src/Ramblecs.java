
import javax.swing.JFrame;
import javax.swing.Box;

public class Ramblecs extends JFrame{
    private RamblecsMenu menuBar;
    private ControlPanel controlPanel;

    //TODO: this is the starting point what you have to do is to implement code and Swing controls(textBox, button...etc) learn how to add them from your lecture or  https://www.guru99.com/java-swing-gui.html or https://www.javatpoint.com/java-swing
    //TODO: what you have to do is to make the GUI which looks exactly the same as Figure 17-3
    //TODO: I already created the necessary class according to the the Diagram (Figure 17-4)
    //TODO: you can try by yourself adding those controls and do some research form books or the link I above.
    public Ramblecs()
    {
        super("Ramblecs");

        menuBar = new RamblecsMenu(this);
        setJMenuBar(menuBar);

        RamblecsDictionary dictionary = new RamblecsDictionary();
        LetterPanel whiteboard = new LetterPanel(this, dictionary);
        controlPanel = new ControlPanel(whiteboard);
        whiteboard.setScoreDisplay(controlPanel);
        //for addKeyListner here I am not familar with Swing, you should be able to add it here.
        RamblecsKeyListener keyListener = new RamblecsKeyListener(whiteboard, controlPanel);
        //TODO: add this KeyListener here
        //controlPanel.addKeyListener();
        Box box = Box.createHorizontalBox();
        box.add(whiteboard);
        box.add(controlPanel);
        getContentPane().add(box);

        //TODO: need to enable this once newGame method in ControlPanel is implemented
        //newGame();
    }

    public void newGame()
    {
        controlPanel.newGame();
    }

    public boolean soundEnabled()
    {
        return menuBar.soundEnabled();
    }

    public static void main(String[] args)
    {
        // Set system look and feel:

        Ramblecs window = new Ramblecs();
        window.setBounds(100, 100, 395, 355);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

}
