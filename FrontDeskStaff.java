public class FrontDeskStaff extends Staff {
    public FrontDeskStaff(String id, String name, String department) {
        super(id, name, department);
    }

    public void greet() {
        System.out.println("Welcome to our hotel!");
    }

    public void greet(String guestName) {
        System.out.println("Welcome, " + guestName + "!");
    }

    @Override
    public void performDuties() {
        System.out.println("Checking-in the hotel guests and answering inquiries.");
    }

    @Override
    public String toString() {
        return "FrontDeskStaff {" + getStaffId() + "} - " + getName();
    }
}