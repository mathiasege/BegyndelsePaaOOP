package MiniSoMe;

import java.util.ArrayList;

public class User {
    private final String username;
    private final ArrayList<Post> posts;
    private final ArrayList<SocialNetwork> friends;

    public User(String username) {
        this.username = username;
        posts = new ArrayList<>();
        friends = new ArrayList<>();
    }

    public String getPosts(){
        StringBuilder result = new StringBuilder();
        result.append("------------ Posts ------------").append("\n");
        for (Post post : posts)
        {
            result.append(post).append("\n");
        }

        return result.toString();
    }

    public String getFriends() {
        StringBuilder users = new StringBuilder();
        users.append("------------ Friends ------------").append("\n");
        for (SocialNetwork user : friends) {
            users.append(user).append("\n");
        }
        return users.toString();
    }

    public String getUsername() {
        return username;
    }

    public void addPosts(Post post){
        posts.add(post);
    }

    public void addFriend(User user){
        SocialNetwork test = new SocialNetwork();
        test.addUser(user);

        friends.add(test);
    }

    public void like(Post userPost){
        for(Post post : posts){
            if(userPost.equals(post)){
                post.like();
            }
        }
    }
}
