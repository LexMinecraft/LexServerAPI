package lexteam.minecraft.lexserverapi;

import java.util.logging.Logger;

public interface Server {
	/**
	 * Name of Minecraft Server Software (eg. CanaryMod, Glowstone)
	 * @return the name of the Minecraft server software in use.
	 */
	public String getName();
	
	/**
	 * Version of Minecraft Server Software (eg. 1.2.5)
	 * @return the version of the Minecraft server software in use.
	 */
	public String getVersion();
	
	/**
	 * Version of the LexServerAPI (eg. 1.3.8)
	 * @return the version of the current LexServerAPI.
	 */
	public String getAPIVersion();
	
	/**
     * Current logger
     *
     * @return the logger associated with this server
     */
    public Logger getLogger();
}
