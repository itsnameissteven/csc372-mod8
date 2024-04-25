package student_roll;

public class Student {
  private String name, address;
  private double GPA;

  Student(String name, String address, double GPA) throws InvalidGPAException {
    if(GPA > 4.0 || GPA < 0.0) {
      throw new InvalidGPAException("GPA value must be between 0-4");
    }
    this.name = name;
    this.address = address;
    this.GPA = GPA;
  }
  
  // Getters
  public String getName() { return this.name; };
  public String getAddress() { return this.address; };
  public double getGPA() { return this.GPA; };

  // Setters
  public void setName(String name) {
    this.name = name;
  };

  public void setAddress(String address) {
    this.address = address;
  }

  public void setGPA(double GPA) throws InvalidGPAException {
    if(GPA > 4.0 || GPA < 0.0) {
      throw new InvalidGPAException("GPA value must be between 0-4");
    }
    this.GPA = GPA;
  }

  @Override
  public String toString() {
    return "Name: " + this.name + ", " + "address: " + this.address + ", GPA: " + this.GPA + ".";
  }
}
