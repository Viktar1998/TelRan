package weeks.Week2.practice;

public class Manager extends Employee{

    private int subordinatesCount;

    public Manager(String name, String position, float salary, int subordinatesCount) {
        super(name, position, salary);
        this.subordinatesCount = subordinatesCount;
    }

    public int getSubordinatesCount() {
        return subordinatesCount;
    }

    public void setSubordinatesCount(int subordinatesCount) {
        this.subordinatesCount = subordinatesCount;
    }

    @Override
    public double calculateBonus() {
        return super.getSalary() * 0.03 * subordinatesCount;
    }
}
