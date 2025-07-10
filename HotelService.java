public abstract class HotelService implements Chargeable {
    private String id;
    private String description;
    private double baseCost;

    public HotelService(String id, String description, double baseCost) {
        this.id = id;
        this.description = description;
        this.baseCost = baseCost;
    }

    public String getId() { return id; }
    public String getDescription() { return description; }
    public double getBaseCost() { return baseCost; }

    public abstract double getCharge();
    public abstract String toString();
}
