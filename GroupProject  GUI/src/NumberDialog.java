import javax.swing.*;
import java.awt.event.*;

public class NumberDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField Caff;
    private JTextField deCaff;
    private JTextPane Instructions;
    private JTextPane caffTotal;
    private JLabel caffLabel;
    private JLabel decaffLabel;
    private JTextPane decaffTotal;
    private static int cAmount;
    private static int dAmount;

    public NumberDialog() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(e -> onOK());
        buttonCancel.addActionListener(e -> onCancel());

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(e -> onCancel(), KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    public void onOK(){
        dAmount = Integer.parseInt(deCaff.getText()) + dAmount;
        cAmount = Integer.parseInt(Caff.getText()) + cAmount;
        decaffTotal.setText(String.valueOf(dAmount));
        caffTotal.setText(String.valueOf(cAmount));
    }
    public static int dReturn() {
        return dAmount;
    }
    public static int cReturn(){
        return cAmount;
    }
    public void onCancel() {
        dispose();
        totals total = new totals();
        setModal(true);
        total.pack();
        total.setVisible(true);
    }
}
