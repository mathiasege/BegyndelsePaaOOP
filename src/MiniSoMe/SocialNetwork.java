package MiniSoMe;


public class SocialNetwork {
    private User friend;

    public SocialNetwork() { }

    public void addUser(User user) {
        friend = user;
    }

    @Override
    public String toString(){
        return friend.getUsername();
    }
}
