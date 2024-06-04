package student_roll;

import java.util.LinkedList;

public class StudentList {
  private LinkedList<Student> students;
  StudentList() {
    students = new LinkedList<Student>();
  }

  // Getter
  public LinkedList<Student> getStudents() {
    return this.students;
  }

  // Setter
  public void setStudents(LinkedList<Student> students) {
    this.students = students;
  }

  // Add student to list
  public void add(String name, String address, double GPA) throws InvalidGPAException {
    Student student = new Student(name, address, GPA);
    this.students.add(student);
  }

  // Sorts and iterates through student list, adding each student to a list
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