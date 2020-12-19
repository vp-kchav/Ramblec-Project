import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RamblecsMenu extends JMenuBar implements ActionListener {
    // Fields:
    // Constructor:
    public RamblecsMenu(Ramblecs game) {

    }

    public boolean soundEnabled() {
        return false;
    }

    public void actionPerformed(ActionEvent e) {
        JMenuItem src = (JMenuItem)e.getSource();
    }

}
