package bubble;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BubbleSorterTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTiny() {
		int[] a = {1,24,5,10};
		int [] sorted = {1,5,10,24};
		
		BubbleSorter sorter = new BubbleSorter(a);
		sorter.sort();
		assertArrayEquals(sorted, sorter.getArray());
	}
	
	@Test
	public void testBackward() {
		int[] a = {4, 3, 2, 1};
		int[] sorted = {1, 2, 3, 4};

		BubbleSorter sorter = new BubbleSorter(a);
		sorter.sort();
		assertArrayEquals(sorted, sorter.getArray());
	}
	
	@Test
	public void testAlreadySorted() {
		int[] a = {1, 2, 3, 4};
		int[] sorted = {1, 2, 3, 4};

		BubbleSorter sorter = new BubbleSorter(a);
		sorter.sort();
		assertArrayEquals(sorted, sorter.getArray());
		assertEquals(0, sorter.getNSwaps());
		assertEquals(6, sorter.getNVisits());
	}

}
