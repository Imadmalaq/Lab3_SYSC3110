import java.util.*;

public class AddressBook{
    private ArrayList<BuddyInfo> myBuddies;

    public AddressBook() {
        myBuddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo aBuddy){
        if (aBuddy != null){
            myBuddies.add(aBuddy);
        }
    }

    public BuddyInfo removeBuddy(int i){
        if(i >= 0 && i < myBuddies.size()){
            return myBuddies.remove(i);
        }
        return null;
    }
    
    public Object testMethod (int x){
        return null;
    }

    public static void main(String[] args){
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Tom","Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }
    //test test

}
