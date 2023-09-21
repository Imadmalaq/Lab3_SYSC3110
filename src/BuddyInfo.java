import java.util.ArrayList;

public class BuddyInfo {
    private String name;
    private String address;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public BuddyInfo() {
        name = "unknown";
    }

    public static void main(String[] args) {
        BuddyInfo obj = new BuddyInfo();
        obj.setName("Homer");
        System.out.println("Hello " + obj.getName() + "!");
    }
}