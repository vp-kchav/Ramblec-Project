public class RamblecsKeyListener {
    private ControlPanel controlPanel;
    private LetterPanel letterPanel;

    public RamblecsKeyListener(final LetterPanel letterPanel,final ControlPanel controlPanel) {
        setControlPanel(controlPanel);
        setLetterPanel(letterPanel);
    }

    public void setControlPanel(final ControlPanel controlPanel) {
        this.controlPanel = controlPanel;
    }

    public ControlPanel getControlPanel() {
        return controlPanel;
    }

    public void setLetterPanel(final LetterPanel letterPanel) {
        this.letterPanel = letterPanel;
    }

    public LetterPanel getLetterPanel() {
        return letterPanel;
    }

}
