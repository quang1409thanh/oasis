import org.testng.Assert;
import org.testng.annotations.Test;

public class Week4Test {
    @Test
    public void testMax2Int1() {
        int actual = Week4.max2Int(5, 10);
        int expected = 10;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMax2Int2() {
        int actual = Week4.max2Int(1, 10);
        int expected = 10;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMax2Int3() {
        int actual = Week4.max2Int(2, 10);
        int expected = 10;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMax2Int4() {
        int actual = Week4.max2Int(3, 10);
        int expected = 10;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMax2Int5() {
        int actual = Week4.max2Int(-4, 10);
        int expected = 10;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMinArray1() {
        int[] a = { 1, 2, 3 };
        Assert.assertEquals(1, Week4.minArray(a));
    }

    @Test
    public void testMinArray2() {
        int[] a = { 1, 2, 3 };
        Assert.assertEquals(1, Week4.minArray(a));
    }

    @Test
    public void testMinArray3() {
        int[] a = { 1, 2, 4 };
        Assert.assertEquals(1, Week4.minArray(a));
    }

    @Test
    public void testMinArray4() {
        int[] a = { 1, 2, 4 };
        Assert.assertEquals(1, Week4.minArray(a));
    }

    @Test
    public void testMinArray5() {
        int[] a = { 1, 2, 6 };
        Assert.assertEquals(1, Week4.minArray(a));
    }

    @Test
    public void testCalculateBMI1() {
        String s = Week4.calculateBMI(50, 1.5);
        Assert.assertEquals("Bình thường", s);
    }

    @Test
    public void testCalculateBMI2() {
        String s = Week4.calculateBMI(50, 1.6);
        Assert.assertEquals("Bình thường", s);
    }

    @Test
    public void testCalculateBMI3() {
        String s = Week4.calculateBMI(50, 1.7);
        Assert.assertEquals("Thiếu cân", s);
    }

    @Test
    public void testCalculateBMI4() {
        String s = Week4.calculateBMI(60, 1.5);
        Assert.assertEquals("Béo phì", s);
    }

    @Test
    public void testCalculateBMI5() {
        String s = Week4.calculateBMI(80, 1.5);
        Assert.assertEquals("Béo phì", s);
    }
}
// khi cài nó thiếu cái gì từ maven nên chờ tải xuống 1 lúc
