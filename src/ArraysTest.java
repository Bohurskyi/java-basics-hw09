import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArraysTest {

    /**
     * Test data for common array elements.
     *
     * @return test data array
     */
    @DataProvider(name = "ArrayUtil")
    public static Object[][] arrays() {
        return new Object[][]{
                {
                        new String[]{"Python", "JAVA", "PHP", "C#", "C++", "SQL"},
                        new String[]{"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"},
                        new String[]{"JAVA", "SQL"}
                },
                {
                        new String[]{"here", "is", "some", "text", ".", "text"},
                        new String[]{"some", "text", "above", "."},
                        new String[]{"some", "text", "."}
                },
                // TODO add 2 more test data here
                {
                        new String[]{"a", "b", "c", "d", "e"},
                        new String[]{"a", "d", "e"},
                        new String[]{"a", "d", "e"}
                },
                {
                        new String[]{"Vasil", "Petro", "Ivan", "Alex"},
                        new String[]{"vasil", "petro", "ivan", "Alex", ""},
                        new String[]{"Alex"},
                }
        };
    }

    @Test(dataProvider = "ArrayUtil")
    public void testFindCommon(String[] array1, String[] array2, String[] expectedResult) {
        String[] myResult = ArrayUtil.findCommon(array1, array2);
        assertEquals(myResult, expectedResult,
                "Common elements are not correct");
    }
}