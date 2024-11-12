package MiniSoMe;

public class Main {

    public static void main(String[] args) {
        User userMathias = new User("Mathias");
        Post postMathias = new Post("Jeg er Mathias",userMathias);
        userMathias.addPosts(postMathias);

        User userNiklas = new User("Niklas");
        Post postNiklas = new Post("Jeg er Niklas",userNiklas);
        userNiklas.addPosts(postNiklas);

        User userAmalie = new User("Amalie");
        Post postAmalie = new Post("Jeg er Amalie",userAmalie);
        userAmalie.addPosts(postAmalie);

        userMathias.addFriend(userAmalie);
        userMathias.addFriend(userNiklas);

        System.out.println(userMathias.getUsername());
        System.out.println(userMathias.getPosts());
        System.out.println(userMathias.getFriends());

        userMathias.like(postMathias);
        System.out.println(userMathias.getPosts());
    }
}
