public class Employee {

    public String empname;
    public int empId;
    public int empAge;
    public boolean isManager;
  public Employee(String empname, int empId, int empAge, boolean isManager){
      this.empname = empname;
      this.empId = empId;
      this.empAge = empAge;
      this.isManager = isManager;
  }

    @Override
    public String toString() {
        return "Employee{" +
                "empname='" + empname + '\'' +
                ", empId=" + empId +
                ", empAge=" + empAge +
                ", isManager=" + isManager +
                '}';
    }
}
