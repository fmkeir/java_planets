public class Planet {
    private String name;
    private int size;

    public Planet(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    public int getSize() {
        return this.size;
    }

    public void explode() {
        String result = String.format("Boom! %s has exploded.", this.name);
        System.out.println(result);
    }
}