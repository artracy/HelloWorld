import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldJunit {

	@Test
	void testTimesTwo() {
		
	//	fail("Not yet implemented");
		HelloWorld world = new HelloWorld();
		assertEquals(world.timesTwo(5), 10);
		assertEquals(world.timesTwo(1), 2);
	}

}
