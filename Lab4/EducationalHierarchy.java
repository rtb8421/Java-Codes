package Lab4;

class Office {
    protected int empNo;
    protected String empName;
    protected double salary;

    public Office(int empNo, String empName, double salary) {
        this.empNo = empNo;
        this.empName = empName;
        this.salary = salary;
    }

    public void getValue() {
        System.out.println("Employee Number: " + empNo);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: $" + salary);
    }
}

class Teaching extends Office {
    private String designation;

    public Teaching(int empNo, String empName, double salary, String designation) {
        super(empNo, empName, salary);
        this.designation = designation;
    }

    public void setValue(String newDesignation) {
        this.designation = newDesignation;
    }

    @Override
    public void getValue() {
        super.getValue();
        System.out.println("Designation: " + designation);
    }
}

class NonTeaching extends Office {
    private String designation;

    public NonTeaching(int empNo, String empName, double salary, String designation) {
        super(empNo, empName, salary);
        this.designation = designation;
    }

    public void setValue(String newDesignation) {
        this.designation = newDesignation;
    }

    @Override
    public void getValue() {
        super.getValue();
        System.out.println("Designation: " + designation);
    }
}

public class EducationalHierarchy {
    public static void main(String[] args) {
        Teaching teacher = new Teaching(101, "John Doe", 50000, "Professor");
        teacher.setValue("Assistant Professor");
        teacher.getValue();

        System.out.println();

        NonTeaching staff = new NonTeaching(201, "Jane Smith", 35000, "Clerk");
        staff.setValue("Office Assistant");
        staff.getValue();
    }
}
