package Case_Study.Person;

public class Customer {
    private String id;
    private String name;
    private int DateOfBirth;
    private String sex;
    private int PhoneNumber;
    private String email;
    private String loaiKhach;
    private String address;

    public Customer(String id, String name, int dateOfBirth, String sex, int phoneNumber, String email,
                    String loaiKhach, String address) {
        this.id = id;
        this.name = name;
        DateOfBirth = dateOfBirth;
        this.sex = sex;
        PhoneNumber = phoneNumber;
        this.email = email;
        this.loaiKhach = loaiKhach;
        this.address = address;
    }
    public Customer(){

    }

    public String getId() {
        return id;
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

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public String getAddress() {
        return address;
    }

    public void setId(String id) {
        this.id = id;
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

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
