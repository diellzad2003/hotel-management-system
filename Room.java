

import java.math.BigDecimal;
import java.util.Objects;

public class Room {
    private String id;
    private String type;
    private BigDecimal rate;

    public Room(String id, String type, BigDecimal rate) {
        this.id = id;
        this.type = type;
        this.rate = rate != null && rate.compareTo(BigDecimal.ZERO) >= 0 ? rate : BigDecimal.ZERO;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public BigDecimal getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "Room{id=" + id + ", type=" + type + ", rate=" + rate + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room room)) return false;
        return id.equals(room.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
