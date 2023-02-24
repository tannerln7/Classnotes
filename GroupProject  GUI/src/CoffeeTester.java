import static java.lang.System.*;
public class CoffeeTester {
    public static void main(String[] args) {
        CoffeeCounter Caff = new CoffeeCounter();
        CoffeeCounter deCaff = new CoffeeCounter();
        NumberDialog dialog = new NumberDialog();
        dialog.pack();
        dialog.setVisible(true);
        Caff.increase(NumberDialog.cReturn());
        deCaff.increase(NumberDialog.dReturn());
        out.println("The ending total amounts are Caff: " + Caff.display() + " Decaff: " + deCaff.display());
    }
}