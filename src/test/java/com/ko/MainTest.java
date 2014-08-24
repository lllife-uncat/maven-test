
package com.ko;

import junit.framework.TestCase;

public class MainTest extends TestCase {

	public void testMain() {
		Main.main(new String[]{});

		assertEquals(true, true);	
	}

	public void testBooleanA() {
		boolean rs = Boolean.getBoolean("true");
		assertEquals(false, false);
	}

	public void testBooleanB() {
		boolean rs = Boolean.getBoolean("os.name");
		assertEquals(true, true);
	}
}