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
package de.bmarwell.jjsonui.util;

import java.io.IOException;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * System utilities.
 * @author bmarwell
 *
 */
public final class SystemCommandHelper {
	/**
	 * Logger for SystemCommandHelper.class.
	 */
	private static final Logger LOG = 
			LoggerFactory.getLogger(SystemCommandHelper.class);
	
	/**
	 * Private constructor for utility class.
	 */
	private SystemCommandHelper() { }
	
	/**
	 * Executes a command and blocks.
	 * @param command the command to execute.
	 * @return return code of the command.
	 */
	public static int executeCommand(final String command) {
		ProcessBuilder processBuilder = new ProcessBuilder(command);
		Map<String, String> env = processBuilder.environment();
		
		try {
			LOG.info("Executing command: [{}].", command);
			Process p = processBuilder.start();
			
			return p.waitFor();
		} catch (IOException e) {
			LOG.error("IOException: [{}].", e.getMessage());
		} catch (InterruptedException e) {
			LOG.error("IOException: [{}].", e.getMessage());
		}
		
		return -1;
	}

}
