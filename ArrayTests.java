import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input1 = {1,2,3};
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input1));
  }

  @Test 
  public void testAverageWithoutLowest(){
    double[] input1 = {4.0, 2.0, 6.0};
    assertEquals(5.0,ArrayExamples.averageWithoutLowest(input1), 0.1);
  }

  @Test
  public void testAverageWithoutLowest1(){
    double[] input1 = {2.0, -4.0, -6.0};
    assertEquals(-1.0, ArrayExamples.averageWithoutLowest(input1), 0.1);
  }

  @Test
  public void testAverageWithoutLowest2(){
    double[] input1 = {5.0};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.1);
  }

  @Test
  public void testAverageWithoutLowest3(){
    double[] input1 = {5.0, 5.0, 5.0, 10.0};
    assertEquals(6.6667, ArrayExamples.averageWithoutLowest(input1), 0.1);
  }

  @Test
  public void testAverageWithoutLowest4(){
    double[] input1 = null;
    boolean exception = false;
    try{
      assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.1);
    }catch(NullPointerException e){
      exception = true;
    }
   // assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.1);
  }
}
