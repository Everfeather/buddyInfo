import java.util.ArrayList;

public class AddressBook  {
    private ArrayList<BuddyInfo> buddyArray = new ArrayList<>();

    public void addBuddy(String name, int age) {
        BuddyInfo newBuddy = new BuddyInfo(name, age);
        buddyArray.add(newBuddy);
    }
    //second commit comment
    public void removeBuddy(int position){
        buddyArray.remove(position);
    }

}
