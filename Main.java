

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Seaside View");


        Room r1 = new Room("101", "Standard", new BigDecimal("1989.09"));
        Room r2 = new Room("102", "Deluxe", new BigDecimal("2003.97"));
        hotel.addRoom(r1);
        hotel.addRoom(r2);


        Guest g1 = new Guest("G1", "Taylor", "Swift", "taylorswift1989@gmail.com");
        Guest g2 = new Guest("G2", "Artemis", "Star", "artemis@gmail.com");


        hotel.makeBooking("B1", r1, g1, LocalDate.of(2025, 7, 10), LocalDate.of(2025, 7, 12));


        hotel.makeBooking("B2", r2, g2, LocalDate.of(2025, 7, 11), LocalDate.of(2025, 7, 14));


        hotel.makeBooking("B3", r1, g2, LocalDate.of(2025, 7, 11), LocalDate.of(2025, 7, 13));


        hotel.cancelBooking("B1");


        hotel.makeBooking("B4", r1, g2, LocalDate.of(2025, 7, 11), LocalDate.of(2025, 7, 13));


        hotel.showAllRooms();
        hotel.showAllBookings();
    }
}
