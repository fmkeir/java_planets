import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PlanetTest {
    Planet earth;

    @Before
    public void before() {
        earth = new Planet("Earth", 5);
    }

    @Test
    public void hasName() {
        assertEquals("Earth", earth.getName());
    }

    @Test
    public void hasSize() {
        assertEquals(5, earth.getSize());
    }

//    @Test
//    public void canExplode() {
//        assertEquals("Boom! Earth has exploded.", earth.explode());
//    }
}
