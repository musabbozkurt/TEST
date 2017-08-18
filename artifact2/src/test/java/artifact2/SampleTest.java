package artifact2;

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleTest {
	@Test
	public void test1(){
		int a = 1;
		int b = 2;
		assertTrue(a + b == 3);
	}
	@Test
	public void test2(){
		int a = 2;
		int b = 2;
		assertTrue(a + b == 4);
	}
	@Test
	public void test3(){
		int a = 2;
		int b = 2;
		assertTrue(a + b == 4);
	}

}
