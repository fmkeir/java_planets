public class Runner {
    public static void main(String[] args) {
        Planet mars = new Planet("Mars", 908973);
        System.out.println(String.format("%s is %d", mars.getName(), mars.getSize()));
        mars.explode();
    }
}
