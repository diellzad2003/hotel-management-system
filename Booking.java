

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Booking {
    private String bookingId;
    private Room room;
    private Guest guest;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public Booking(String bookingId, Room room, Guest guest, LocalDate checkIn, LocalDate checkOut) {
        if (checkOut == null || checkIn == null || !checkOut.isAfter(checkIn)) {
            throw new IllegalArgumentException("Check-out date must be after check-in date.");
        }
        this.bookingId = bookingId;
        this.room = room;
        this.guest = guest;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public String getBookingId() {
        return bookingId;
    }

    public Room getRoom() {
        return room;
    }

    public Guest getGuest() {
        return guest;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public BigDecimal getTotalCost() {
        long nights = ChronoUnit.DAYS.between(checkIn, checkOut);
        return room.getRate().multiply(BigDecimal.valueOf(nights));
    }

    @Override
    public String toString() {
        return "Booking{id=" + bookingId +
                ", guest=" + guest.getFullName() +
                ", room=" + room.getId() +
                ", from=" + checkIn +
                " to=" + checkOut +
                ", total=" + getTotalCost() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Booking booking)) return false;
        return bookingId.equals(booking.bookingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId);
    }
}
