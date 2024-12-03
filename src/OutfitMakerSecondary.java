package components.OutfitMaker;
import java.util.Random;
import java.util.Set;
import components.sequence.Sequence;
import components.sequence.Sequence1L;
import components.set.Set;
import components.utilities.Reporter;
import components.set.Set1L;


public abstract class OutfitMakerSecondary implements OutfitMaker {

    @Override
    public final Set<String> getShoes() {
        Set<String> shoe = new Set1L<String>();

        shoe.add(this.shoes());

        Sequence<OutfitMaker> clothes = this.shoes();

        for (OutfitMaker shoes : clothes) {
            shoe.add(clothes.getShoes());
        }

        return shoe;
    }

    @Override
    public final Set<String> getPants() {
        Set<String> pant = new Set1L<String>();

        pant.add(this.pants());

        Sequence<OutfitMaker> clothes = this.pants();

        for (OutfitMaker pants : clothes) {
            pant.add(clothes.getPants());
        }

        return pant;
    }

    @Override
    public final Set<String> getShirt() {
        Set<String> shirt = new Set1L<String>();

        shirt.add(this.shirts());

        Sequence<OutfitMaker> clothes = this.shirts();

        for (OutfitMaker shirts : clothes) {
            shirt.add(clothes.getShirts());
        }

        return shirt;
    }


    @Override
    public void displayOutfit() {
        System.out.println("Final Outfit: ");
        System.out.println("Shirt: " + this.getShirt());
        System.out.println("Pants: " + this.getPants());
        System.out.println("Shoes: " + this.getShoes());
    }


    @Override
    public final boolean equals(Object x) {
        boolean equals = true;
        if (x instanceof OutfitMaker) {
            OutfitMaker ins = (OutfitMaker) x;
            if (!this.shirt.equals(ins.shirt)
                    || !this.pants().equals(ins.pants())
                    || !this.shoes.equals(ins.shoes)) {
                equals = false;
            }
        } else {
            equals = false;
        }
        return equals;
    }

    @Override
    public final int hashCode() {
        return this.shirt().hashCode() * this.pants().hashCode()
            * this.shoes().hashCode();
    }


    @Override
    public final String toString() {
        Reporter.assertElseFatalError("Cannot do toString");
    }

}```
