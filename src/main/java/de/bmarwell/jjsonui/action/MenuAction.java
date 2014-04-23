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
package de.bmarwell.jjsonui.action;

import java.util.concurrent.Future;

/**
 * @author bmarwell
 *
 */
public interface MenuAction {
	String executeBlockingAction();
	
	Future<String> executeAction();

}
