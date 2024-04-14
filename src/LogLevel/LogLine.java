package LogLevel;

public class LogLine {
	private String logMessage;
	public LogLine(String logMessage) {
		this.setLogMessage(logMessage);
	}

	public String getLogMessage() {
		return logMessage;
	}

	public void setLogMessage(String logMessage) {
		this.logMessage = logMessage;
	}

	public LogLevel getLogLevel() {
		String[] tokensArray = this.getLogMessage().split("[\\[\\]]");
		String token = tokensArray.length == 3 ? tokensArray[1] : null;
		LogLevel logLevel = LogLevel.valueOfLabelString(token);

		return logLevel;
	}
	public String getOutputForShortLog(){
		String[] tokensArray = this.getLogMessage().split("[\\[\\]]");
		String token = tokensArray.length == 3 ? tokensArray[1] : null;
		String text = tokensArray.length == 3 ? tokensArray[2] : null;
		int logNumber = LogLevel.valueOfLabelString(token).levelNumber;

		return "" + logNumber + ":" + text.substring(2);
	}
}
