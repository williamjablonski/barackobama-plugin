package hudson.plugins.chucknorris;

import junit.framework.TestCase;

public class RoundhouseActionTest extends TestCase {

	private RoundhouseAction action;

	public void setUp() {
		action = new RoundhouseAction(Style.BAD_ASS,
				"Barack Obama can divide by zero.");
	}

	public void testAccessors() {
		assertEquals(Style.BAD_ASS, action.getStyle());
		assertEquals("Barack Obama can divide by zero.", action
				.getFact());
		assertEquals("Barack Obama", action.getDisplayName());
		assertNull(action.getIconFileName());
		assertEquals("chucknorris", action.getUrlName());
	}
}
