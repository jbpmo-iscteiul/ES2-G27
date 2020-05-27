package ES2_G27;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestClassA {

	@Test
	public void test() {
		ClassA a1 = new ClassA("ABC");
		
		assertEquals("ABC", a1.getS());	}

}
