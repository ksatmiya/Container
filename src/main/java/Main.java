public class Main {

    public static void main(String[] args) {
        Container<String> container = new Container<>(2);

        container.add("A");
        container.add("B");
        container.add("C");
        container.add("D");

        System.out.println(container.get(0));
        System.out.println(container.get(1));

        container.remove(1);
        System.out.println(container.get(1));

        System.out.println("Size container: " + container.size());

        container.clear();
        System.out.println("Size container after clear: " + container.size());
    }
}
