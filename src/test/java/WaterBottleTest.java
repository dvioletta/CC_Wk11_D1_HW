import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class WaterBottleTest {

    private WaterBottle waterBottle;

@Before
public void before() {
    waterBottle = new WaterBottle (  95);
}


@Test
    public void startVolume(){
    assertEquals(95, waterBottle.startVolume());
}

@Test
    public void fillBottle() {
    assertEquals( 100, waterBottle.fillBottle(5));
}

@Test
    public void takeDrink() {
    assertEquals(85, waterBottle.takeDrink(10));
}

@Test
    public void takeDrinkFalse(){
    waterBottle = new WaterBottle(0);
    assertEquals(0, waterBottle.takeDrink(10));
}

@Test
    public void bottleEmpty(){
    assertEquals(0, waterBottle.bottleEmpty());
}


}




