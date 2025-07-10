class Room implements Bookable, Chargeable {
    private String id;
    private String type;
    private double rate;
    private boolean booked;

    public Room(String id, String type, double rate) {
        this.id = id;
        this.type = type;
        this.rate = Math.max(0, rate);
        this.booked = false;
    }

    public String getId() { return id; }
    public String getType() { return type; }
    public double getRate() { return rate; }

    @Override
    public boolean isBooked() { return booked; }

    @Override
    public void book() { this.booked = true; }

    @Override
    public double getCharge() { return rate; }

    @Override
    public String toString() {
        return "Room{id=" + id + ", type=" + type + ", rate=" + rate + ", booked=" + booked + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room room)) return false;
        return id.equals(room.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
