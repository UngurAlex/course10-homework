

import java.util.ArrayList;
import java.util.List;


public class ClassRoom {

    private List<StudentGrade> persons;

    public ClassRoom(List<StudentGrade> persons) {
        this.persons = persons;
    }

    public List<StudentGrade> getPersons() {
        return persons;
    }

    //1
    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> gradesForDiscipline = new ArrayList<>();
        System.out.println(discipline);
        for (StudentGrade person : persons) {
            if (person.getDiscipline().equals(discipline)) {
                gradesForDiscipline.add(person.getGrade());
            }
        }
        return gradesForDiscipline;
    }

    //2
    public List<Integer> getGradesForStudent(String name) {
        List<Integer> gradesForStudent = new ArrayList<>();
        for (StudentGrade anotherPerson : persons) {
            if (anotherPerson.getName().equals(name)) {
                gradesForStudent.add(anotherPerson.getGrade());
            }
        }
        return gradesForStudent;
    }

    //3
    public StudentGrade getMaxGrade(String discipline) {
        StudentGrade studentMax = new StudentGrade("", "", Integer.MIN_VALUE);

        for (StudentGrade student : persons) {
            if (student.getDiscipline().equals(discipline)) {
                if (studentMax.getGrade() < student.getGrade()) {
                    studentMax = student;
                }
            }
        }
        return studentMax;
    }

    //4
    public StudentGrade getMaxGradeOfStudents() {
        StudentGrade studentsMax = new StudentGrade("", "", 0);
        for (StudentGrade students : persons) {
            if (studentsMax.getGrade() < students.getGrade()) {
                studentsMax = students;
            }
        }
        return studentsMax;
    }

    //5
    public Double getAverageGrade(String discipline) {
        List<Integer> lista=new ArrayList<>();
        Double average=0.0;
        Double sum = 0.0;
        for (StudentGrade studentsss : persons) {
            if (studentsss.getDiscipline().equals(discipline)) {
              lista.add(studentsss.getGrade());

                //sum = (double) lista.stream().mapToInt(Integer::valueOf).sum();
                // -am gasit "sintagma" asta pe net(face exact suma), nu stiu exact ce inseamna, mi-ai putea-o explica ?
                sum=studentsss.getGrade()+sum;
                average=sum/lista.size();

            }

        }return average;

    }

    //6
    public StudentGrade getWorstGrade(String discipline) {
        StudentGrade studentWorst = new StudentGrade("", "", Integer.MAX_VALUE);
        for (StudentGrade studentss : persons) {
            if (studentss.getDiscipline().equals(discipline)) {
                if (studentWorst.getGrade() > studentss.getGrade()) {
                    studentWorst = studentss;
                }

            }
        }
        return studentWorst;
    }



}
