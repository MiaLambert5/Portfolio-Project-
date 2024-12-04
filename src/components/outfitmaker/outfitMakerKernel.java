package components.outfitmaker;

import components.standard.Standard;

/**
 * outfitMaker kernel component with primary methods.
 */

public interface outfitMakerKernel extends Standard<outfitMaker> {

    /**
     * Gets shirt of {@code this}.
     *
     * @return shirt of {@code this}
     * @ensures {@code <shirt> is shirt of this}
     */
    String getShirt();

    /**
     * Gets pants of {@code this}.
     *
     * @return pants of {@code this}
     * @ensures {@code <pants> is pants of this}
     */
    String getPants();

    /**
     * Gets shoes of {@code this}.
     *
     * @return shoes of {@code this}
     * @ensures {@code <shoes> is shoes of this}
     */

    String getShoes();

    /**
     * Adds/removes item to {@code this}.
     *
     * @param type
     *            the type of article of clothing
     * @param item
     *            the item of clothing
     * @param isAdding
     *            states whether article is being added or removed
     * @updates this
     */

    void addOrRemoveItem(String type, String item, boolean isAdding);

    /**
     * Displays outfit from {@code this}.
     *
     * @ensures {@code [children of this] = #[children of this] + <item>}
     */
    void displayOutfit();

}