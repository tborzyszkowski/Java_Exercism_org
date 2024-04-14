package LogLevel;

import java.util.*;

public enum  LogLevel {
	TRACE("TRC", 1),
	DEBUG("DBG", 2),
	INFO("INF", 4),
	WARNING("WRN", 5),
	ERROR("ERR", 6),
	FATAL("FTL", 42),
	UNKNOWN("UKN", 0);

	private static final Map<String, LogLevel> BY_LABEL = new HashMap<>();
	private static final Map<Integer, LogLevel> BY_NUMBER = new HashMap<>();

	static {
		for (LogLevel level : values()) {
			BY_LABEL.put(level.levelString, level);
			BY_NUMBER.put(level.levelNumber, level);
		}
	}

	public final String levelString;
	public final int levelNumber;

	LogLevel(String levelString, int levelNumber) {
		this.levelString = levelString;
		this.levelNumber = levelNumber;
	}

	public static LogLevel valueOfLabelString(String levelString) {
		LogLevel result = BY_LABEL.get(levelString);
		return result == null ? UNKNOWN : result;
	}

	public static LogLevel valueOfLabelNumber(int levelNumber) {
		LogLevel result = BY_NUMBER.get(levelNumber);
		return result == null ? UNKNOWN : result;
	}

}
