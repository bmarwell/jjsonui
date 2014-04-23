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

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;

import de.bmarwell.jjsonui.err.NoMenuSourceProvidedException;
import de.bmarwell.jjsonui.menu.Menu;
import de.bmarwell.jjsonui.menu.MenuBuilder;

/**
 * @author bmarwell
 *
 */
public class MenuConstructs {
	public static Menu getMenuOne() throws NoMenuSourceProvidedException {
		
		return new MenuBuilder().build();
	}
	
	/**
	 * Creates a root MenuItem.
	 * @return a MenuItem.
	 * @throws NoMenuSourceProvidedException if ressource could not be loaded.
	 */
	public static Menu getMenuSample01() 
			throws NoMenuSourceProvidedException {
		URI jsonfile;
		Menu i = null;
		try {
			jsonfile = MenuConstructs.class.getClassLoader()
					.getResource("./menus/samplemenu01.json").toURI();
			Path jsonpath = new File(jsonfile).toPath();
			
			i = new MenuBuilder().withJson(jsonpath).build();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return i;
	}
}
