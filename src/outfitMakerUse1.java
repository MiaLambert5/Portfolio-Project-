import java.util.ArrayList;

/**
 * A sample use of the outfitMaker component (non-interactive)
 */

public class outfitMakerUse1 {

    private String shirts;
    private String pants;
    private String shoes;
    private ArrayList<OutfitMakerUse1> outfit;

    public void OutfitMakerUse1(String shirt, String pants, String shoes) {
        this.shirt = shirt;
        this.pants = pants;
        this.shoes = shoes;
        this.outfit = new ArrayList<>();
    }

    public String getShirt() {
        return this.shirt;
    }

    public String getPants() {
        return this.pants;
    }

    public String getShoes() {
        return this.pants;
    }

    public void addOrRemoveItem(String type, String item, boolean isAdding) {
        if (isAdding) {
            if (type.equals("shirt")) {
                this.shirt = item;
            } else if (type.equals("pants")) {
                this.pants = item;
            } else if (type.equals("shoes")) {
                this.shoes = item;
            }
            this.outfit.add(item); // Adds to the outfit list
        } else {
            this.outfit.remove(item); // Removes from the outfit list
        }
    }

    // Display the current outfit

    public void displayOutfit() {
        System.out.println("Final Outfit: ");
        System.out.println("Shirt: " + this.getShirt());
        System.out.println("Pants: " + this.getPants());
        System.out.println("Shoes: " + this.getShoes());
    }

    public static void main(String[] args) {
        // Creating an outfit with initial shirt, pants, and shoes
        OutfitMakerUse1 maker = new OutfitMakerUse1("Red Shirt", "Blue Pants",
                "White Shoes");

        // Display the initial outfit
        maker.displayOutfit();

        // Modify the outfit
        maker.addOrRemoveItem("shirt", "Yellow Shirt", true); // Change shirt to Yellow
        maker.addOrRemoveItem("pants", "Black Pants", true); // Change pants to Black

        // Display updated outfit
        maker.displayOutfit();
    }

}
