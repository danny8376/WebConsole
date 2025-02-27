package com.mesacarlos.webconsole.websocket.command;

import java.util.HashMap;

public class CommandFactory {

	public static HashMap<String, WSCommand> getCommandsHashMap() {
		HashMap<String, WSCommand> commands = new HashMap<String, WSCommand>();
		commands.put("LOGIN", new LogInCommand());
		commands.put("EXEC", new ExecCommand());
		commands.put("PLAYERS", new PlayersCommand());
		commands.put("CPUUSAGE", new CpuUsageCommand());
		commands.put("RAMUSAGE", new RamUsageCommand());
		return commands;
	}
}