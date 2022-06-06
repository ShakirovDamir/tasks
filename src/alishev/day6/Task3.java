package alishev.day6;

public class Task3 {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Иванов Иван Иванович", "История");
        Student student = new Student("Антонов Антон");
        Student student1 = new Student("Сергеев Сергей");
        teacher.evaluate(student);
        teacher.evaluate(student1);
        teacher.evaluate(student);

    }
}
