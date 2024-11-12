package MiniSoMe;

public class Post {
    private final String content;
    private final User author;
    private int likes;

    public Post(String content, User author) {
        this.content = content;
        this.author = author;
    }

    public void like() {
        likes++;
    }

    @Override
    public String toString() {
        return "Content: " + content + "\n" +
                "Author: " + author.getUsername() + "\n" +
                "Likes: " + likes;
    }
}
