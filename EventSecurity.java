import java.util.HashSet;
import java.util.List;
import java.util.Arrays;
//Question 1
class EventSecurity {
    public static void main(String[] args) {
        EventSecurity security = new EventSecurity();
        List<String> attendees = Arrays.asList("Alice", "David", "Bob");
        boolean result = security.containsNonVip(attendees);

        System.out.println("Contains non-VIP? " + result);
    }
    private HashSet<String> vipList = new HashSet<>(Arrays.asList("Alice", "Bob", "Charlie"));
    /**
     * TO-DO: Check if the attendee list contains anyone NOT in the vipList. -->attendenceList - vipList
     \*
     * @param attendees A list of names to check.
     * @return true if a non-VIP is found, false if all attendees are VIPs.
     */

    public boolean containsNonVip(List<String> attendees) {
        for (String currentAttendee : attendees){
            if(!vipList.contains(currentAttendee)){//check if the attendee is not in the VIP list
                return true;
            }
        }
        return false;
    }
}