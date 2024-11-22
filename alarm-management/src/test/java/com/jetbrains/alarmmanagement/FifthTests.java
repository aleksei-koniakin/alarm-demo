
package com.jetbrains.alarmmanagement;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.shaded.com.google.common.util.concurrent.Uninterruptibles;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class FifthTests {

	@Test
	void secondContextLoads() {
		Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
		assertEquals(2,2);
	}

	@Test
	void secondContextLoads_1() {
		Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
		assertEquals(2,2);
	}

	@Test
	void secondContextLoads_2() {
		Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);


		assertEquals(2,2);
	}

	@Test
	void secondContextLoads_3() {
		Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
		assertEquals(2,2);
	}

	@Test
	void secondContextLoads_4() {
		Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
		assertEquals(2,2);
	}

	@Test
	void secondContextLoads_5() {
		/*if (System.currentTimeMillis() % 2 == 0) {
			fail("Flaky test");

		}*/
	}
}
