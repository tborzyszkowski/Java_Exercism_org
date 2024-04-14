package LogLevel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogLineTest {

	@Test
	void testLogLine_INF() {
		LogLine logLine = new LogLine("[INF]: File deleted");
		assertEquals(LogLevel.INFO, logLine.getLogLevel());
	}

	@Test
	void testLogLine_UNKNOWN() {
		LogLine logLine = new LogLine("[XYZ]: Overly specific, out of context message");
		assertEquals(LogLevel.UNKNOWN, logLine.getLogLevel());
	}

	@Test
	void getOutputForShortLog() {
		LogLine logLine = new LogLine("[ERR]: Stack Overflow");
		assertEquals("6:Stack Overflow", logLine.getOutputForShortLog());
	}
}