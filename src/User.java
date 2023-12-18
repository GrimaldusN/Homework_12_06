public class User implements Comparable<User> {
    String name;
    int age;

    @Override
    public int compareTo(User o) {
        return this.age;
    }
}
