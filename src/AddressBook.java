import java.util.*;

public class AddressBook{
    private ArrayList<BuddyInfo> buddyInfoList;

    public AddressBook() {
        buddyInfoList = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        buddyInfoList.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        buddyInfoList.remove(buddy);
    }

    public static void main(String[] args){
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Tom","Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }

}
