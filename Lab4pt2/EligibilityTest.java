package Lab4pt2;
    interface Students {
        void getValue();
    }

    interface Department {
        int getAttendance();
    }

    interface Exam extends Students, Department {
        boolean eligible();
    }

    class StudentDetails implements Students {
        int sno;
        String sname;
        String sclass;

        StudentDetails(int sno, String sname, String sclass) {
            this.sno = sno;
            this.sname = sname;
            this.sclass = sclass;
        }

        public void getValue() {
            System.out.println("Student Number: " + sno);
            System.out.println("Student Name: " + sname);
            System.out.println("Student Class: " + sclass);
        }
    }

    class DepartmentDetails implements Department {
        int sno;
        int attendance;

        DepartmentDetails(int sno, int attendance) {
            this.sno = sno;
            this.attendance = attendance;
        }

        public int getAttendance() {
            return attendance;
        }
    }

    class ExaminationEnrollment implements Exam {
        StudentDetails student;
        DepartmentDetails department;

        ExaminationEnrollment(StudentDetails student, DepartmentDetails department) {
            this.student = student;
            this.department = department;
        }

        public boolean eligible() {
            int studentAttendance = department.getAttendance();
            return studentAttendance >= 75;
        }

        public void getValue() {
            student.getValue();
            System.out.println("Student's Attendance: " + department.getAttendance() + "%");
        }

        @Override
        public int getAttendance() {
            return 0;
        }
    }

    public class EligibilityTest {
        public static void main(String[] args) {
            StudentDetails student1 = new StudentDetails(1, "John", "10th");
            DepartmentDetails department1 = new DepartmentDetails(1, 80);
            ExaminationEnrollment enrollment1 = new ExaminationEnrollment(student1, department1);

            student1.getValue();
            System.out.println("Eligible for Exam: " + enrollment1.eligible());

            System.out.println();

            StudentDetails student2 = new StudentDetails(2, "Jane", "12th");
            DepartmentDetails department2 = new DepartmentDetails(2, 60);
            ExaminationEnrollment enrollment2 = new ExaminationEnrollment(student2, department2);

            student2.getValue();
            System.out.println("Eligible for Exam: " + enrollment2.eligible());
        }
    }

