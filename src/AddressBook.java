import java.util.ArrayList;
//this is a change made from gitHub!
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
    public void printBuddies(){
        for( BuddyInfo buddy : buddyArray){
            System.out.println(buddy.getName() + " is " + buddy.getAge().toString() + " years old.");
        }
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tim",20);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.printBuddies();
        addressBook.removeBuddy(0);
    }

}
