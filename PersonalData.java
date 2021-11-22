public class PersonalData {
    private String name;
    private String address;
    private int age;
    private String phoneNumber;

    public PersonalData(String name, String address, int age, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phoneNumber = phoneNumber;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNuber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String gerAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}