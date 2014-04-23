/**
This file is part of jjsonui.

jjsonui is free software: you can redistribute it and/or modify
it under the terms of the GNU Lesser General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

jjsonui is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public License
along with jjsonui.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.bmarwell.jjsonui.test;

import static org.junit.Assert.fail;

import org.junit.Test;

import de.bmarwell.jjsonui.err.NoMenuSourceProvidedException;
import de.bmarwell.jjsonui.menu.Menu;

/**
 * @author Benjamin Marwell
 *
 */
public class SimpleMenuBuilderTest {

	/**
	 * Tests for an exception if no source had been provided.
	 * @throws NoMenuSourceProvidedException 
	 */
	@Test(expected = NoMenuSourceProvidedException.class)
	public final void menuOneTest() throws NoMenuSourceProvidedException {
		Menu mi = MenuConstructs.getMenuOne();
		mi.getMenuItems();
		
		fail("Menu constructed successfully. This should be impossible.");
	}
	
	@Test
	public final void menuSampleMenu01Test()
			throws NoMenuSourceProvidedException {
		Menu mi = MenuConstructs.getMenuSample01();
		
		mi.getMenuItems();
	}

}
