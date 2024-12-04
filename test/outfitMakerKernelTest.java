public class outfitMakerKernelTest {

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import components.outfitmaker.OutfitMaker;

/**
 * Test class for kernel methods of OutfitMaker1.
 */
public final class outfitMakerKernelTest {

    /**
     * Arg method to create an OutfitMaker
     *
     * @param shoes
     *            the shoes of the OutfitMaker
     * @param shirt
     *            the shirt of the OutfitMaker
     * @param pants
     *            the pants of the OutfitMaker
     * @return a new OutfitMaker instance with the specified attributes
     */
    private OutfitMaker createFromArgs(String Shoes, String Shirt,
            String Pants) {
        OutfitMaker outfit = new OutfitMaker1();
        outfit.setShoes(Shoes);
        outfit.setShirt(Shirt);
        outfit.setPants(Pants);
        return outfit;
    }

    /**
     * Tests the shirt method.
     */
    @Test
    public void testShirt() {
        OutfitMaker shirt = createFromArgs("Shirt", "Shoes", "Pants");
        OutfitMaker ShirtCopy = createFromArgs("Shirt", "Shoes", "Pants");

        assertEquals("Shirt", shirt.shirt());
        assertEquals(shirtCopy, shirt);
    }

    /**
     * Tests the shoes method.
     */
    @Test
    public void testShoes() {
        OutfitMaker shoes = createFromArgs("Shirt", "Shoes", "Pants");
        OutfitMaker shoesCopy = createFromArgs("Shirt", "Shoes", "Pants");

        assertEquals("Shoes", shoes.shoes());
        assertEquals(shoesCopy, shoes);
    }

    /**
     * Tests the pants method.
     */
    @Test
    public void testpants() {
        OutfitMaker pants = createFromArgs("Shirt", "Shoes", "Pants");
        OutfitMaker pantsCopy = createFromArgs("Shirt", "Shoes", "Pants");

        assertEquals("Pants", pants.pants());
        assertEquals(pantsCopy, Pants);
    }

    /**
     * Tests the setShirt method.
     */
    @Test
    public void testsetShirt() {
        OutfitMaker shirt = createFromArgs("Shirt", "Shoes", "Pants");
        OutfitMaker ShirtCopy = createFromArgs("Shirt", "Shoes", "Pants");

        assertEquals("Shirt", shirt.shirt());
        assertEquals(shirtCopy, shirt);

        shirt.setShirt("Shirt");
        ShirtCopy.setShirt("Shirt");

        assertEquals("Shirt", shirt.shirt());
        assertEquals(ShirtCopy, shirt);
    }

    /**
     * Tests the setShoes method.
     */
    @Test
    public void testSetShoes() {
        OutfitMaker shoes = createFromArgs("Shirt", "Shoes", "Pants");
        OutfitMaker shoesCopy = createFromArgs("Shirt", "Shoes", "Pants");

        assertEquals("Shoes", shoes.shoes());
        assertEquals(shoesCopy, shoes);

        shoes.setShoes("Shoes");
        ShoesCopy.setShoes("Shoes");

        assertEquals("Shoes", shoes.shoes());
        assertEquals(ShoesCopy, shoes);
    }

    /**
     * Tests the setPants method.
     */
    @Test
    public void testSetPants() {
        OutfitMaker pants = createFromArgs("Shirt", "Shoes", "Pants");
        OutfitMaker pantsCopy = createFromArgs("Shirt", "Shoes", "Pants");

        assertEquals("Pants", pants.pants());
        assertEquals(pantsCopy, Pants);

        pants.setPants("Pants");
        pantsCopy.setPants("Pants");

        assertEquals("Pants", pants.pants());
        assertEquals(pantsCopy, pants);
    }

    /**
     * Tests the addOrRemoveItem method
     */

 /**
     * Tests adding a shirt using addOrRemoveItem.
     */
    @Test
    public void testAddShirt() {
        OutfitMaker outfit = createFromArgs("Shoes", "Shirt", "Pants");

        outfit.addOrRemoveItem("shirt", "yellow Shirt", true);

        assertEquals("yellow Shirt", outfit.shirt());

    }

    /**
     * Tests adding pants using addOrRemoveItem.
     */
    @Test
    public void testAddPants() {

            OutfitMaker outfit = createFromArgs("Shoes", "Shirt", "Pants");

            outfit.addOrRemoveItem("pants", "yellow pants", true);

            assertEquals("yellow pants", outfit.pants());

        }

    /**
     * Tests adding shoes using addOrRemoveItem.
     */
    @Test
    public void testAddShoes() {
        OutfitMaker outfit = createFromArgs("Shoes", "Shirt", "Pants");

        outfit.addOrRemoveItem("shoes", "yellow shoes", true);

        assertEquals("yellow shoes", outfit.shoes());
    }

    /**
     * Tests removing an item using addOrRemoveItem.
     */
    @Test
    public void testRemoveItem() {
        OutfitMaker outfit = createFromArgs("Shoes", "Shirt", "Pants");

        outfit.addOrRemoveItem("shirt", "Shirt", false);

        assertEquals(null, outfit.shirt());
    }

    }

}
