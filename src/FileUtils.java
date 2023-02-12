import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtils {
    public static void main(String[] args) throws IOException {
        readingWithScanner();
    }

    public static List<StudentGrade> readingWithScanner() throws FileNotFoundException {
        List<StudentGrade> studentGrades = new ArrayList<>();
        Scanner scanner = new Scanner(new File("files", "grades.txt"));
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String name = line.substring(0, line.indexOf("|"));
            String discipline = line.substring(line.indexOf("|") + 1, line.indexOf("|", line.indexOf("|") + 1));
            Integer grade = Integer.parseInt(line.substring(line.lastIndexOf("|") + 1));
            studentGrades.add(new StudentGrade(name, discipline, grade));
        }
        return studentGrades;
    }
}


