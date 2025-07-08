
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private List<Room> rooms;
    private List<Booking> bookings;

    public Hotel(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public List<Room> getAvailableRooms(LocalDate checkIn, LocalDate checkOut) {
        List<Room> available = new ArrayList<>();
        for (Room room : rooms) {
            if (isRoomAvailable(room, checkIn, checkOut)) {
                available.add(room);
            }
        }
        return available;
    }

    public boolean isRoomAvailable(Room room, LocalDate checkIn, LocalDate checkOut) {
        for (Booking b : bookings) {
            if (b.getRoom().equals(room)) {
                boolean overlaps = !(checkOut.isBefore(b.getCheckIn()) || checkIn.isAfter(b.getCheckOut().minusDays(1)));
                if (overlaps) return false;
            }
        }
        return true;
    }

    public void makeBooking(String bookingId, Room room, Guest guest, LocalDate checkIn, LocalDate checkOut) {
        if (checkOut == null || checkIn == null || !checkOut.isAfter(checkIn)) {
            System.out.println("Invalid dates. Check-out must be after check-in.");
            return;
        }

        if (!isRoomAvailable(room, checkIn, checkOut)) {
            System.out.println("Room " + room.getId() + " is not available from " + checkIn + " to " + checkOut);
            return;
        }

        Booking booking = new Booking(bookingId, room, guest, checkIn, checkOut);
        bookings.add(booking);
        System.out.println("Booking successful: " + booking);
    }

    public void cancelBooking(String bookingId) {
        bookings.removeIf(b -> b.getBookingId().equals(bookingId));
    }

    public void showAllRooms() {
        System.out.println("Rooms:");
        for (Room r : rooms) {
            System.out.println(r);
        }
    }

    public void showAllBookings() {
        System.out.println("Bookings:");
        for (Booking b : bookings) {
            System.out.println(b);
        }
    }
}
