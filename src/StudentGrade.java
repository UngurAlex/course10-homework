public class StudentGrade {
    private  String name;
    private  String discipline;
    private  Integer grade;

    public StudentGrade(String name, String discipline, Integer grade) {
        this.name = name;
        this.discipline = discipline;
        this.grade = grade;
    }

    public  String getName() {
        return name;
    }

    public  String getDiscipline() {
        return discipline;
    }

    public  Integer getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "StudentGrade{" +
                "name='" + name + '\'' +
                ", discipline='" + discipline + '\'' +
                ", grade=" + grade +
                '}';
    }
}
