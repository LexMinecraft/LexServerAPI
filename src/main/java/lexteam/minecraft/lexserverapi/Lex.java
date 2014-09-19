/**
 * This file is part of LexServerAPI, a Minecraft server API, licensed under the MIT License (MIT).
 *
 * Copyright (c) Lexteam <https://github.com/Lexteam>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
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
	 * @param the server you wish to use.
	 */
	public void setServer(Server server) {
		if (Lex.server != null) {
            throw new UnsupportedOperationException("The server was already set!");
        }
		Lex.server = server;
		server.getLogger().info("This server if running the server software, " + server.getName() + " " + server.getVersion() + " with LexServerAPI version " + server.getAPIVersion());
	}
}
