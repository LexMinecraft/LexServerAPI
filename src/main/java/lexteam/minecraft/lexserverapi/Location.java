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

/**
 * Introducing a 3-dimensional position in a world
 * @author Jamie Mansfield (https://github.com/lexware)
 */
public interface Location {
    /**
     * The x position.
     * @return the x position.
     */
    public int getX();
    
    /**
     * The y position.
     * @return the y position
     */
    public int getY();
    
    /**
     * The z position.
     * @return the z position
     */
    public int getZ();
    
    /**
     * Set the x position.
     * @param x The x position
     */
    public void setX(int x);
    
    /**
     * Set the y position.
     * @param y The y position
     */
    public void setY(int y);
    
    /**
     * Set the z position.
     * @param z The z position
     */
    public void setZ(int z);
}
