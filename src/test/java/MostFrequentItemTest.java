import org.junit.Assert;
import org.junit.Test;

public class MostFrequentItemTest {
    @Test
    public void array_with_1_most_frequent(){
        int[] array1 = {1, 3, 1, 3, 2, 1};
        MostFrequentItem most = new MostFrequentItem();
        Assert.assertEquals(1, most.result(array1));
    }
    @Test
    public void array_with_3_most_frequent() {
        int[] array2 = {3, 3, 1, 3, 2, 1};
        MostFrequentItem most = new MostFrequentItem();
        Assert.assertEquals(3, most.result(array2));
    }
    @Test
    public void array_with_minus1_most_frequent(){
        int[] array3 = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};
        MostFrequentItem most = new MostFrequentItem();
        Assert.assertEquals(-1, most.result(array3));
    }
}
