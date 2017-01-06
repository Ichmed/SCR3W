package com.ichmed.scr3w.util;

import com.ichmed.scr3w.util.math.Vector;

public interface IPosition
{
	/*
	 * Returns the position of this object, should use new Vector(Vector v) an not return the actual position instance
	 */
	public Vector getPosition();
}
