public class HousekeepingStaff extends Staff {
    public HousekeepingStaff(String id, String name, String department) {
        super(id, name, department);
    }

    @Override
    public void performDuties() {
        System.out.println("Cleaning out the rooms and providing fresh towels.");
    }

    @Override
    public String toString() {
        return "HousekeepingStaff {" + getStaffId() + "} - " + getName();
    }
}