import java.util.*;

public class Hotel {
    private List<HotelService> services = new ArrayList<>();
    private List<Staff> staffMembers = new ArrayList<>();
    private List<Room> rooms = new ArrayList<>();

    public void addService(HotelService service) { services.add(service); }
    public void addStaff(Staff staff) { staffMembers.add(staff); }
    public void addRoom(Room room) { rooms.add(room); }

    public void displayServices() {
        for (HotelService s : services) System.out.println(s);
    }

    public void displayStaff() {
        for (Staff s : staffMembers) System.out.println(s);
    }

    public void displayRooms() {
        for (Room r : rooms) System.out.println(r);
    }

    public void bookRoom(int number) throws RoomUnavailableException {
        for (Room r : rooms) {
            if (r.toString().contains("Room " + number)) {
                if (r.isBooked()) throw new RoomUnavailableException("Room " + number + " is already booked.");
                r.book();
                return;
            }
        }
        throw new RoomUnavailableException("Room " + number + " not found.");
    }

    public double calculateTotalCharges(List<Chargeable> items) {
        double total = 0;
        for (Chargeable item : items) total += item.getCharge();
        return total;
    }
}
