package alishev.day13;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("User1");
        User user2 = new User("User2");
        User user3 = new User("User3");

        user1.sendMessage(user2, "Hello");
        user2.sendMessage(user1, "Bye");

        MessageDatabase.showDialog(user1, user2);
    }



}
