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
package de.bmarwell.jjsonui.domain;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.bmarwell.jjsonui.action.MenuAction;

/**
 * @author bmarwell
 *
 */
public class MenuItem {
	private static Logger LOG = LoggerFactory.getLogger(MenuItem.class);
	
	private MenuItem parent = null;
	private String displaystring = null;
	private MenuAction action = null;
	
	private ArrayList<MenuItem> children = new ArrayList<MenuItem>();

	/**
	 * @return the parent
	 */
	public MenuItem getParent() {
		return parent;
	}

	/**
	 * @param parent the parent to set
	 */
	public void setParent(MenuItem parent) {
		this.parent = parent;
	}

	/**
	 * @return the children
	 */
	public ArrayList<MenuItem> getChildren() {
		return children;
	}

	/**
	 * @param children the children to set
	 */
	public void setChildren(ArrayList<MenuItem> children) {
		this.children = children;
	}

	/**
	 * @return the displaystring
	 */
	public String getDisplaystring() {
		return displaystring;
	}

	/**
	 * @param displaystring the displaystring to set
	 */
	public void setDisplaystring(String displaystring) {
		this.displaystring = displaystring;
	}

	/**
	 * @return the action
	 */
	public MenuAction getAction() {
		return action;
	}

	/**
	 * @param action the action to set
	 */
	public void setAction(MenuAction action) {
		this.action = action;
	}
	
	
}
