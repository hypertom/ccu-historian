/*
    CCU-Historian, a long term archive for the HomeMatic CCU
    Copyright (C) 2011-2017 MDZ (info@ccu-historian.de)

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package mdz.ccuhistorian

import groovy.util.logging.Slf4j
import groovy.transform.CompileStatic

import java.util.logging.Level
import java.util.logging.Logger

@Slf4j
@CompileStatic
public class LogSystemConfig {

	Level fileLevel=Level.OFF
	Level consoleLevel=Level.INFO
	Level binRpcLevel=Level.WARNING
	String fileName='./ccu-historian-%g.log'
	int fileLimit=1000000
	int fileCount=5
	
	// undocumented
	boolean showLoggerNames=false
	boolean directMessages=false
	
	void logDebug() {
		log.debug "logSystem.consoleLevel=Level.$consoleLevel"
		log.debug "logSystem.fileLevel=Level.$fileLevel"
		log.debug "logSystem.fileName='$fileName'"
		log.debug "logSystem.fileLimit=$fileLimit"
		log.debug "logSystem.fileCount=$fileCount"
		log.debug "logSystem.binRpcLevel=Level.$binRpcLevel"
	}
}
