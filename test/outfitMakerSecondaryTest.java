import static org.junit.Assert.assertEquals;

import java.util.Set;

import components.outfitmaker.OutfitMaker;

public class outfitMakerSecondaryTest {

    /**
     * Helper method to create an OutfitMaker
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
     * Tests the getShirt method, expecting one shirt.
     */
    @Test
    public void testGetShirt_1() {
        OutfitMaker outfit = this.createFromArgs("Shoes", "Red Shirt", "Pants");
        Set<String> expected = new Set1L<>(); // Assuming Set1L is your custom Set implementation
        expected.add("Red Shirt");

        assertEquals(expected, outfit.getShirts());
    }

    /**
     * Tests the getShirt method, expecting several shirts.
     */
    @Test
    public void testGetShirt_Many() {
        OutfitMaker outfit = this.createFromArgs("Shoes",
                "Red Shirt, Yellow Shirt", "Pants");
        Set<String> expected = new Set1L<>();
        expected.add("Red Shirt");
        expected.add("Yellow Shirt");

        assertEquals(expected, outfit.getShirts());
    }

    /**
     * Tests the getShoes method, expecting one shoe.
     */
    @Test
    public void testGetShoes_1() {
        OutfitMaker outfit = this.createFromArgs("Blue Shoes", "Shirt",
                "Pants");
        Set<String> expected = new Set1L<>();
        expected.add("Blue Shoes");

        assertEquals(expected, outfit.getShoes());
    }

    /**
     * Tests the getShoes method, expecting several shoes.
     */
    @Test
    public void testGetShoes_Many() {
        OutfitMaker outfit = this.createFromArgs("Yellow Shoes, Red Shoes",
                "Shirt", "Pants");
        Set<String> expected = new Set1L<>();
        expected.add("Yellow Shoes");
        expected.add("Red Shoes");

        assertEquals(expected, outfit.getShoes());
    }

    /**
     * Tests the getPants method, expecting one pair of pants.
     */
    @Test
    public void testGetPants_1() {
        OutfitMaker outfit = this.createFromArgs("Shoes", "Shirt",
                "Blue Pants");
        Set<String> expected = new Set1L<>();
        expected.add("Blue Pants");

        assertEquals(expected, outfit.getPants());
    }

    /**
     * Tests the getPants method, expecting several pairs of pants.
     */
    @Test
    public void testGetPants_Many() {
        OutfitMaker outfit = this.createFromArgs("Shoes", "Shirt",
                "Red Pants, Yellow Pants");
        Set<String> expected = new Set1L<>();
        expected.add("Red Pants");
        expected.add("Yellow Pants");

        assertEquals(expected, outfit.getPants());
    }

}