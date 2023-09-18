import java.util.ArrayList;

public class AddressBook {
    public ArrayList<BuddyInfo> addressBook = new ArrayList<BuddyInfo>();

    public void addBuddy(BuddyInfo aBuddy){
        addressBook.add(aBuddy);
    }
    public void removeBuddy(BuddyInfo aBuddy){
        addressBook.remove(aBuddy);
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        System.out.println(addressBook);
        addressBook.removeBuddy(buddy);

    }
}
