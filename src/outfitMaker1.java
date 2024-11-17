package components.outfitmaker;
import components.sequence.Sequence;
import components.sequence.Sequence1L;

/**
 * {@code outfitMaker} represented as a sequence of strings
 *
 * @convention $this.shirt and $this.pants, $this.shoes are valid strings
 * @correspondence this = ($this.shirt, $this.pants, $this.shoes)
 */
public class outfitMaker1 extends outfitMakerSecondary {


    /*
     * Private members -----------------------------------------
     */

     private String shirt;

     private String shoes;

     private String pants;

     private Sequence<Outfit> outfit;

     private void createNewRep() {
         this.shirts = "";
         this.pants = "";
         this.shoes = "";
         this.outfit = new Sequence1L<outfitMaker>();

     }


    /*
     * Constructors -----------------------------------------
     */

    public outfitMaker1() {
        this.createNewRep();
    }



     /*
     * Standard methods -----------------------------------------
     */

     //not sure if I need these or not... based it off other components lol 🥲

     @SuppressWarnings("unchecked")
     @Override
     public final outfitMaker newInstance() {
         try {
             return this.getClass().getConstructor().newInstance();
         } catch (ReflectiveOperationException e) {
             throw new AssertionError(
                     "Cannot construct object of type " + this.getClass());
         }
     }

     @Override
     public final void clear() {
         this.createNewRep();
     }

     @Override
     public final void transferFrom(outfitMaker source) {
         assert source != null : "Violation of: source is not null";
         assert source != this : "Violation of: source is not this";
         assert source instanceof outfitMaker : ""
                 + "Violation of: source is of dynamic type outfitMaker";

         outfitMaker localSource = (outfitMaker) source;
         this.shirt = localSource.shirt;
         this.pants = localSource.pants;
         this.shoes = localSource.shoes;
         localSource.createNewRep();
     }


    /*
     * Kernel methods -----------------------------------------
     */

     @Override
     public String shoes() {
         return this.shoes;
     }

     @Override
     public String shirt() {
         return this.shirt;
     }

     @Override
     public String pants() {
         return this.pants;
     }

     @Override
     public Sequence<outfitMaker> outfit() {
         return this.outfit;
     }

     @Override
    public void addOrRemoveItem(String type, String item, boolean isAdding) {

        if (isAdding) {
            switch (type) {
                case "shirt":
                    this.shirt = item;
                    break;
                case "pants":
                    this.pants = item;
                    break;
                case "shoes":
                    this.shoes = item;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid type: " + type);
            }
            this.outfit.add(item);
        } else {
            this.outfit.remove(item);
        }



}
}