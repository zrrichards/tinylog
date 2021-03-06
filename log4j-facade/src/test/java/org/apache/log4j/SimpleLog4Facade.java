/*
 * Copyright 2013 Martin Winandy
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package org.apache.log4j;

/**
 * Simple Log4j logger that simulate the external logger facade.
 */
final class SimpleLog4Facade {

	/**
	 * Get the active logging level for the caller class.
	 *
	 * @return Active logging level
	 */
	Level getLoggingLevel() {
		return TinylogBridge.getLevel();
	}

	/**
	 * Get the active logging level for the caller class.
	 *
	 * @param callerClass
	 *            Class that has called this method
	 * @return Active logging level
	 */
	Level getLoggingLevel(final Class<?> callerClass) {
		return TinylogBridge.getLevel(callerClass);
	}

	/**
	 * Check if a given logging level will be output.
	 *
	 * @param level
	 *            Logging level to test
	 * @return <code>true</code> if log entries with the given logging level will be output, <code>false</code> if not
	 */
	boolean isEnabled(final Priority level) {
		return TinylogBridge.isEnabled(level);
	}

	/**
	 * Check if a given logging level will be output.
	 *
	 * @param callerClass
	 *            Class that has called this method
	 * @param level
	 *            Logging level to test
	 * @return <code>true</code> if log entries with the given logging level will be output, <code>false</code> if not
	 */
	boolean isEnabled(final Class<?> callerClass, final Priority level) {
		return TinylogBridge.isEnabled(callerClass, level);
	}

	/**
	 * Create a log entry.
	 *
	 * @param level
	 *            Logging level of log entry
	 * @param message
	 *            Message to log
	 */
	void log(final Priority level, final Object message) {
		TinylogBridge.log(level, message);
	}

	/**
	 * Create a log entry.
	 *
	 * @param level
	 *            Logging level of log entry
	 * @param throwable
	 *            Throwable to log
	 * @param message
	 *            Message to log
	 */
	void log(final Priority level, final Throwable throwable, final Object message) {
		TinylogBridge.log(level, throwable, message);
	}

	/**
	 * Create a log entry. The parameterized message will be formatted by
	 * {@link java.text.MessageFormat#format(String,Object[])}.
	 *
	 * @param level
	 *            Logging level of log entry
	 * @param message
	 *            Message pattern to log
	 * @param arguments
	 *            Arguments for formatting message
	 */
	void log(final Priority level, final String message, final Object... arguments) {
		TinylogBridge.log(level, message, arguments);
	}

	/**
	 * Create a log entry. The parameterized message will be formatted by
	 * {@link java.text.MessageFormat#format(String,Object[])}.
	 *
	 * @param level
	 *            Logging level of log entry
	 * @param throwable
	 *            Throwable to log
	 * @param message
	 *            Message pattern to log
	 * @param arguments
	 *            Arguments for formatting message
	 */
	void log(final Priority level, final Throwable throwable, final String message, final Object... arguments) {
		TinylogBridge.log(level, throwable, message, arguments);
	}

}
