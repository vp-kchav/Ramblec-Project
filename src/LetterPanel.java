import javax.swing.*;

public class LetterPanel extends JPanel {
    private int speed;
    private ScoreDisplay scoreDisplay;
    private Ramblecs ramblecs;
    private RamblecsDictionary ramblecsDictionary;

    public LetterPanel(final Ramblecs ramblecs, final RamblecsDictionary dictionary) {
        this.ramblecs = ramblecs;
        this.ramblecsDictionary = dictionary;
    }
    // create each face for the Letter panel
    //it should has 6 faces with random letter for each face.

    //there should have method to rotate each face.
    public void setSpeed(final int speed) {
        this.speed = speed;
    }

    public void newGame() {
        //implement new game here
    }

    public void setScoreDisplay(final ScoreDisplay scoreDisplay) {
        this.scoreDisplay = scoreDisplay;
    }

    //implement this method
    public void dropCube() {

    }

    //implement this method
    public void stopCube() {

    }


}

