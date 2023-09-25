import java.util.ArrayList;

public class AddressBook {
    public ArrayList<BuddyInfo> addressBook = new ArrayList<BuddyInfo>();

    public void addBuddy(BuddyInfo aBuddy){
        if (aBuddy != null) {
            addressBook.add(aBuddy);
        }
    }
    public BuddyInfo removeBuddy(int index){
        if(index >= 0 && index < addressBook.size()) {
            return addressBook.remove(index);
        }
        return null;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }
}
