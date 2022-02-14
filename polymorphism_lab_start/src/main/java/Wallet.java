import java.util.ArrayList;

public class Wallet {
    private String name;
    private ArrayList<Scannable> scannables;

    public Wallet(String name) {
        this.name = name;
        this.scannables = new ArrayList<Scannable>();

    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
        return this.scannables.size();
    }

    public void addItem(Scannable item) {
        this.scannables.add(item);
    }

}
