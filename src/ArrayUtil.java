import java.util.*;

/**
 * ArrayUtil exercises.
 */
public class ArrayUtil {

    /**
     * Finds the common elements between two arrays (String values).
     *
     * @param array1 first array
     * @param array2 second array
     * @return String array with common elements
     */
    public static String[] findCommon(String[] array1, String[] array2) {
        // TODO fill in code here
        List<String> res = new ArrayList<>();
        for (String s1 : array1) {
            for (String s2 : array2) {
                if (s1.equals(s2) && !res.contains(s2)) {
                    res.add(s1);

                }
            }
        }
        return res.toArray(new String[0]);
    }
}