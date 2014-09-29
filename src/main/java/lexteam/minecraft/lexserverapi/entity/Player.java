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
package lexteam.minecraft.lexserverapi.entity;

/**
 * The player class.
 * @author Jamie Mansfield (https://github.com/lexware)
 */
public interface Player extends Entity {
    /**
     * Gets the players username
     * @return the player's username
     */
    public String getName();

    /**
     * Gets the player's display name.
     * @return the player's display name
     */
    public String getDisplayName();
    
    /**
     * Sets the player's display name.
     * @param displayName
     */
    public void setDisplayName(String displayName);
    
    /**
     * Checks if the player is an OP.
     * @return true, if the player is an OP, false if the player is not an OP
     */
    public boolean isOP();
}
