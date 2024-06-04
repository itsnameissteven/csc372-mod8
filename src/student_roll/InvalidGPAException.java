package student_roll;

// A custom exception to handle improper GPA Values
public class InvalidGPAException extends Exception {
  public InvalidGPAException(String message) {
      super(message);
  }
}
