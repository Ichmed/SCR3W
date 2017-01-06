package com.ichmed.scr3w.util.math;

public class Vector implements Comparable<Vector>
{
	float x, y;

	public Vector()
	{
		x = 0;
		y = 0;
	}

	public Vector(float x, float y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Vector(Vector v)
	{
		this.x = v.x;
		this.y = v.y;
	}

	public Vector add(Vector a, Vector b)
	{
		return new Vector(a.x + b.x, a.y + b.y);
	}

	public Vector sub(Vector a, Vector b)
	{
		return new Vector(a.x - b.x, a.y - b.y);
	}

	/*
	 * Compares a vector and a length and returns values conforming with compareTo but not the actual difference in length
	 */
	public int compareTo(float f)
	{
		float l = (x * x + y * y) - f;
		return l < 0 ? -1 : l > 0 ? 1 : 0;
	}

	@Override
	/*
	 * (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 * Compares two vectors and returns values conforming with compareTo but not the actual difference in length
	 */
	public int compareTo(Vector v)
	{
		return compareTo(v.x * v.x + v.y * v.y);
	}
	
	/*
	 * Returns the length of the vector
	 */
	public float getLength()
	{
		return (float) Math.sqrt(this.x * this.x + this.y * this.y);
	}
	
	/*
	 * Returns the difference in length between two vectors
	 * If you only need to know if one vector is longer than another use compareTo instead because it uses less computational power
	 */
	public float compareLength(Vector v)
	{
		return this.getLength() - v.getLength();
	}
}
