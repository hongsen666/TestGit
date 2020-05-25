public class HelloWorld {
    private int age;
    private String name;

    @Override
    public String toString() {
        return "HelloWorld{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("HelloWorld");
    }
}
