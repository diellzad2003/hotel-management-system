public class LaundryService extends HotelService {
    public LaundryService(String id, String description, double baseCost) {
        super(id, description, baseCost);
    }

    @Override
    public double getCharge() {
        return getBaseCost() * 1.1;
    }

    @Override
    public String toString() {
        return "LaundryService {" + getId() + "} - " + getDescription() + ", Charge: " + getCharge();
    }
}