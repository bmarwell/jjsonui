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

import java.net.URI;
import java.nio.file.Path;

import de.bmarwell.jjsonui.err.NoMenuSourceProvidedException;

/**
 * @author bmarwell
 *
 */
public class MenuBuilder {
	/**
	 * A path for the jsonfile to create the menu from.
	 */
	private Path jsonpath = null;
	
	/**
	 * A download location for the menu.
	 */
	private URI jsonURI = null;
	
	/**
	 * Adds a menu configuration.
	 * @param path a path to the menu specs.
	 * @return the MenuBuilder for chaining.
	 */
	public final MenuBuilder withJson(final Path path) {
		this.jsonpath = path;
		
		return this;
	}
	
	/**
	 * Add a URI location for the menu. But Path has precedence.
	 * @param location the URI for the menu to get from.
	 * @return MenuBuilder for chaining.
	 * @see #withJson(Path)
	 */
	public final MenuBuilder withJson(final URI location) {
		this.jsonURI = location;
		
		return this;
	}
	
	
	/**
	 * Builds a menu.
	 * @return the Menu.
	 * @throws NoMenuSourceProvidedException  if no source had been provided.
	 */
	public final Menu build() throws NoMenuSourceProvidedException {
		return new Menu(this);
	}


	/**
	 * @return the jsonpath
	 */
	public final Path getJsonpath() {
		return jsonpath;
	}


	/**
	 * @return the jsonURI
	 */
	public final URI getJsonURI() {
		return jsonURI;
	}
	
	
	
}
