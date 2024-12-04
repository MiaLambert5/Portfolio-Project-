
package components.outfitmaker;

import java.util.Set;

/**
 * {@code outfitMaker} enhanced with secondary methods.
 */
public interface outfitMaker extends outfitMakerKernel {

    /**
     * Reports if {@code this} has any items
     *
     * @return true iff {@code this} has at least 1 item of clothing
     * @ensures {@code <hasItem> = (|[children of this]| >= 1)}
     */
    boolean hasItem();

    /**
     * Reports the set of items in an outfit {@code this}.
     *
     * @return the set of items in {@code this}
     * @ensures {@code <getOutfit> = set of items in entry tree this}
     */
    Set<String> getOutfit();
}