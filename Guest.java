
import java.util.Objects;

public class Guest {
    private String id;
    private String firstName;
    private String lastName;
    private String email;

    public Guest(String id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getId() { return id; }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Guest{id=" + id + ", name=" + getFullName() + ", email=" + email + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guest guest)) return false;
        return id.equals(guest.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
