package Case_Study.Person;

public class Employee {
    private String idCode;
   private String name;
   private int DateOfBirth;
   private String sex;
   private int CMNDNumber;
   private int phoneNumber;
   private String email;
   private String level;
   private String viTri;
   private Double salary;

    public Employee(String idCode, String name, int dateOfBirth, String sex, int CMNDNumber, int phoneNumber,
                    String email, String level, String viTri, Double salary) {
        this.idCode = idCode;
        this.name = name;
        DateOfBirth = dateOfBirth;
        this.sex = sex;
        this.CMNDNumber = CMNDNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.level = level;
        this.viTri = viTri;
        this.salary = salary;
    }
    public Employee(){
    }

    public String getIdCode() {
        return idCode;
    }

    public String getName() {
        return name;
    }

    public int getDateOfBirth() {
        return DateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public int getCMNDNumber() {
        return CMNDNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getLevel() {
        return level;
    }

    public String getViTri() {
        return viTri;
    }

    public Double getSalary() {
        return salary;
    }


    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(int dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setCMNDNumber(int CMNDNumber) {
        this.CMNDNumber = CMNDNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
