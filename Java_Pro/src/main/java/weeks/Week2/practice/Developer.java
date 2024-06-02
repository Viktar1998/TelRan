package weeks.Week2.practice;

public class Developer extends Employee{

    private String programingLanguage;

    public Developer(String name, String position, float salary, String programingLanguage) {
        super(name, position, salary);
        this.programingLanguage = programingLanguage;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "programingLanguage='" + programingLanguage + '\'' +
                '}';
    }
    @Override
    public double calculateBonus() {
        return super.getSalary() + 500;
    }
}
