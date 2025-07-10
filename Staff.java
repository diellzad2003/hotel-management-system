public abstract class Staff {
    private String staffId;
    private String name;
    private String department;

    public Staff(String staffId, String name, String department) {
        this.staffId = staffId;
        this.name = name;
        this.department = department;
    }

    public String getStaffId() { return staffId; }
    public String getName() { return name; }
    public String getDepartment() { return department; }

    public abstract void performDuties();
    public abstract String toString();
}
