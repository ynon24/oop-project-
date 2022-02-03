
public class PieceWorkerEmployee extends Employee{

    private int items; // amount of items
    private double priceForItem; // price for item

    // constructor
    public PieceWorkerEmployee(String firstName, String lastName,
                               String socialSecurityNumber,BirthDate birthDate, int items, double priceForItem) {
        super(firstName, lastName, socialSecurityNumber, birthDate);

        if (items < 0) { // validate wage
            throw new IllegalArgumentException("items amount must be at least 0");
        }

        if (priceForItem <= 0) { // validate price for item
            throw new IllegalArgumentException(
                    "price for item worked must be bigger than 0");
        }

        this.items = items;
        this.priceForItem = priceForItem;
    }

    // set items
    public void setItems(int items) {
        if (items < 0) { // validate wage
            throw new IllegalArgumentException("items number must be at least 0 ");
        }

        this.items = items;
    }

    // return items
    public double getItems() {return items;}

    // set hours worked
    public void setPriceForItem(double priceForItem) {
        if (priceForItem <= 0) { // validate price for items
            throw new IllegalArgumentException(
                    "price for items worked must be bigger then 0");
        }

        this.priceForItem = priceForItem;
    }

    // return hours worked
    public double getPriceForItem() {return priceForItem;}

    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings() {
        return getItems() * getPriceForItem();
    }

    // return String representation of HourlyEmployee object
    @Override
    public String toString() {
        return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
                super.toString(), "items sold", getItems(),
                "price for item", getPriceForItem());
    }
}



