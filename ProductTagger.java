import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class ProductTagger {
    public static void main(String[] args) {
        ProductTagger tagger = new ProductTagger();

        Set<String> setA = new HashSet<>(Arrays.asList("electronics", "sale"));
        Set<String> setB = new HashSet<>(Arrays.asList("electronics", "sale", "new"));

        System.out.println("setA ⊆ setB ? " + tagger.isSubset(setA, setB)); // true
    }
    /**
     * TO-DO: Check if 'setA' is a subset of 'setB'.
     * For example, if setA is {"electronics", "sale"} and setB is {"electronics", "sale", "new"},
     * then the method should return true.
     \*
     * @param setA The potential subset.
     * @param setB The potential superset.
     * @return true if all elements of setA are in setB, false otherwise.
     */
    public boolean isSubset(Set<String> setA, Set<String> setB) {
        if(setB.containsAll(setA)){
            return true;
        }
        return false;
    }
}