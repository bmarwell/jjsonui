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
package de.bmarwell.jjsonui.menu;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.bmarwell.jjsonui.domain.MenuItem;
import de.bmarwell.jjsonui.err.NoMenuSourceProvidedException;

/**
 * @author bmarwell
 *
 */
public class Menu {
	private static Logger LOG = LoggerFactory.getLogger(Menu.class);
	
	private List<MenuItem> menuItems = new ArrayList<MenuItem>();

	/**
	 * Builds the menu from a json file.
	 * @param menuBuilder the menuBuilder to build from.
	 * @throws NoMenuSourceProvidedException if no source had been provided.
	 */
	public Menu(MenuBuilder menuBuilder) 
			throws NoMenuSourceProvidedException {
		// TODO Auto-generated constructor stub
		if (menuBuilder.getJsonpath() == null) {
			throw new NoMenuSourceProvidedException("No path for menu provided.");
		}
		
		if (Files.notExists(menuBuilder.getJsonpath(), LinkOption.NOFOLLOW_LINKS)) {
			LOG.error("file does not exist: [{}].", menuBuilder.getJsonpath());
			// TODO: own exception.
			throw new NullPointerException("File does not exist!");
		}
	}
	
	/**
	 * @return the menuItems
	 */
	public List<MenuItem> getMenuItems() {
		return menuItems;
	}

	public void addMenuItem(MenuItem item) {
		menuItems.add(item);
	}
}
