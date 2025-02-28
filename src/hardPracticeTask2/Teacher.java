package hardPracticeTask2;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void printInfo() {
        System.out.println("Учитель: " + getName() + ", Предмет: " + getSubject());
    }

    public static void main(String[] args) {
        Teacher newTeacher = new Teacher("Анна Ивановна", "Математика");
        newTeacher.printInfo();
        newTeacher.setSubject("Геометрия");
        newTeacher.printInfo();
    }
}
