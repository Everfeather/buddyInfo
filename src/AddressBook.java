import java.util.ArrayList;

public class AddressBook  {
    private ArrayList<BuddyInfo> buddyArray = new ArrayList<>();

    public void addBuddy(BuddyInfo buddy) {
        buddyArray.add(buddy);
    }
    //second commit comment
    public void removeBuddy(BuddyInfo buddy){
        buddyArray.remove(buddy);
    }

}
