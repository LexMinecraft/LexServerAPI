package lexteam.minecraft.lexserverapi;

public final class Lex {
	private static Server server = null;
	
	public Lex() {}
	
	/**
	 * Current server
	 * @return the current server in use.
	 */
	public static Server getServer() {
		return server;
	}
	
	/**
	 * Sets the server, unless the server isn't null
	 */
	public void setServer(Server server) {
		if (Lex.server != null) {
            throw new UnsupportedOperationException("The server was already set!");
        }
		Lex.server = server;
		server.getLogger().info("This server if running the server software, " + server.getName() + " " + server.getVersion() + " with LexServerAPI version " + server.getAPIVersion());
	}
}
