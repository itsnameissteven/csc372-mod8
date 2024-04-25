package student_roll;

import java.util.LinkedList;

public class StudentList {
  private LinkedList<Student> students;
  StudentList() {
    students = new LinkedList<Student>();
  }

  public LinkedList<Student> getStudents() {
    return this.students;
  }

  public void setStudents(LinkedList<Student> students) {
    this.students = students;
  }

  public void add(String name, String address, double GPA) throws InvalidGPAException {
    Student student = new Student(name, address, GPA);
    this.students.add(student);
  }

  @Override
  public String toString() {
    MergeSort mergeSort = new MergeSort();
    mergeSort.sort(students, 0, students.size() - 1);

    String studentsString = "";
    for(int i = 0; i < students.size(); i++) {
      studentsString += students.get(i).toString() + "\n";
    }
    return studentsString;
  }
}