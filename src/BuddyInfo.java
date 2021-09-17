public class BuddyInfo {

    public BuddyInfo(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public BuddyInfo(){
        this.name = "joe";
        this.age = 46;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    private String name;
    private Integer age;


    public static void main(String[] args) {
        BuddyInfo peter = new BuddyInfo("peter",43);
        System.out.println("Hello " + peter.getName());
    }
}
