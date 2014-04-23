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

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author bmarwell
 *
 */
public class ActionNOOP implements MenuAction {
	private static final String NOOP = "NOOP";
	
	private static Logger LOG = LoggerFactory.getLogger(MenuAction.class);

	/* (non-Javadoc)
	 * @see de.bmarwell.jjsonui.action.MenuAction#executeBlockingAction()
	 */
	public String executeBlockingAction() {
		LOG.debug("Executing NOOP action.");
		
		return ActionNOOP.NOOP;
	}

	/* (non-Javadoc)
	 * @see de.bmarwell.jjsonui.action.MenuAction#executeAction()
	 */
	public Future<String> executeAction() {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		Callable<String> nocall = new Callable<String>() {
			/* (non-Javadoc)
			 * @see java.util.concurrent.Callable#call()
			 */
			public String call() throws Exception {
				return ActionNOOP.NOOP;
			}
		};
		
		Future<String> noop = executor.submit(nocall);
		
		return noop;
	}

}
