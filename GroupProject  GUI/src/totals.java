import javax.swing.*;
public class totals extends NumberDialog{
    private JPanel Popup;
    private JTextPane caffDisplay;
    private JButton OKButton;
    private JTextPane decaffDisplay;

public totals(){
    getRootPane().setDefaultButton(OKButton);
    setContentPane(Popup);
    decaffDisplay.setText(NumberDialog.dReturn() + " Ounces");
    caffDisplay.setText(NumberDialog.cReturn() + " Ounces");
    OKButton.addActionListener(e -> OK());
}
public void OK(){
    dispose();
}
}
