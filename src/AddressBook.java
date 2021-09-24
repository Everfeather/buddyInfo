import java.util.ArrayList;

public class AddressBook  {
    private ArrayList<BuddyInfo> buddyArray;
    public AddressBook(){
        buddyArray = new ArrayList<>();
    }
    public void addBuddy(BuddyInfo buddy) {
        if(buddy != null) {
            buddyArray.add(buddy);
        }
    }

    public void removeBuddy(int index){
        if(index >= 0 && index < buddyArray.size()){
            buddyArray.remove(index);
        }

    }
    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tim",20);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }

}
