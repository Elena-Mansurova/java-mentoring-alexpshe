package hardPracticeTask2;

public class StudentGroup {
    private String groupName;
    private int studentCount;

    public StudentGroup(String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public void printInfo() {
        System.out.println("Группа: " + getGroupName() + ", Количество студентов: " + getStudentCount());
    }

    public static void main(String[] args) {
        StudentGroup group1 = new StudentGroup("QA2025", 26);
        group1.printInfo();
        group1.setStudentCount(30);
        group1.printInfo();
    }
 }
