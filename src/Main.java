import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
//        System.out.println(Classroom.getPersons());

        ClassRoom classRoom = new ClassRoom(FileUtils.readingWithScanner());
        System.out.println(classRoom.getPersons());
        System.out.println(classRoom.getGradesForDiscipline("Computer Science"));
        System.out.println(classRoom.getGradesForStudent("Marina Alimjan"));
        System.out.println(classRoom.getMaxGrade("Mathematics"));
        System.out.println(classRoom.getMaxGradeOfStudents());
        System.out.println(classRoom.getAverageGrade("Mathematics"));
        System.out.println(classRoom.getWorstGrade("Computer Science"));
    }
}