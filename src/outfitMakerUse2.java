import java.util.ArrayList;
import components.outfitmaker.OutfitMaker1;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter1L;

/**
 * A sample interactive use of the OutfitMaker component.
 */
public class OutfitMakerUse2 {

    private String shirt;
    private String pants;
    private String shoes;
    private ArrayList<OutfitMakerUse2> outfit;

    public OutfitMakerUse2(String shirt, String pants, String shoes) {
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
        return this.shoes;
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

    public void displayOutfit() {
        System.out.println("Final Outfit: ");
        System.out.println("Shirt: " + this.getShirt());
        System.out.println("Pants: " + this.getPants());
        System.out.println("Shoes: " + this.getShoes());
    }

    public static void main(String[] args) {

        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();

        // Create a new outfit with default values
        OutfitMakerUse2 maker = new OutfitMakerUse2("Default Shirt",
                "Default Pants", "Default Shoes");

        // Interactive outfit modification
        out.println("Welcome to the Interactive Wardrobe Builder! :)");
        out.println("Enter your desired outfit components:");

        out.println("Enter a shirt: ");
        String newShirt = in.nextLine();
        maker.addOrRemoveItem("shirt", newShirt, true);

        out.println("Enter a pair of pants: ");
        String newPants = in.nextLiinne();
        maker.addOrRemoveItem("pants", newPants, true);

        out.println("Enter a pair of shoes: ");
        String newShoes = in.nextLine();
        maker.addOrRemoveItem("shoes", newShoes, true);

        // Display the customized outfit
        out.println("Your customized outfit:");
        maker.displayOutfit();

        // Optionally modify further
        out.println("Would you like to change an item? (yes/no): ");
        String response = in.nextLine();

        while (response.equals("yes")) {
            out.println("What would you like to change (shirt/pants/shoes)? ");
            String type = in.nextLine();

            out.println("Enter the new " + type + ": ");
            String newItem = in.nextLine();

            maker.addOrRemoveItem(type, newItem, true);

            // Display the updated outfit
            out.println("Updated outfit:");
            maker.displayOutfit();

            out.println("Would you like to change another item? (yes/no): ");
            response = in.nextLine();
        }

        out.println("Final outfit:");
        maker.displayOutfit();
        out.println(
                "Thank you for using the Interactive Wardrobe Builder! Hope your enjoyed it :)");

        in.close();
        out.close();
    }
}