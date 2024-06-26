package student_roll;
import java.util.Comparator;

// Evaluates students names and returns proper order
public class NameComparator implements Comparator<Student>{
  @Override
  public int compare(Student studentA, Student studentB) { 
    return studentA.getName().toLowerCase().compareTo(studentB.getName().toLowerCase());
  }
}

