import java.util.HashSet;
import java.util.Set;

class DataValidator {
    public static void main(String[] args) {
        DataValidator validator = new DataValidator();

        String[] array1 = {"cherry", "banana", "apple", "cherry"};

        System.out.println("Array1 has duplicates: " + validator.hasDuplicates(array1));
    }
    /**
     * TO-DO: Efficiently check for duplicates in an array using a HashSet.
     * The method should stop and return true as soon as the first duplicate is found.
     \*
     * @param items The array of strings to check.
     * @return true if duplicates exist, false otherwise.
     */
    public boolean hasDuplicates(String[] items) {
        Set<String> seenItems = new HashSet<>();
        for(String currentItem : items){
            if(!seenItems.add(currentItem)){
                return true;//if currentItem was already in the set--> (duplicate)
            }
        }
        return false;
    }
}