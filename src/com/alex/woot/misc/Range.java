package com.alex.woot.misc;

/**
 * Class used to depict a DID range
 */
public class Range
	{
	private final int start;
    private final int end;
 
    public static Range fromEnd(int end)
    	{
        final char[] chars = String.valueOf(end).toCharArray();
        for (int i=chars.length-1; i>=0;i--)
        	{
            if (chars[i] == '9')
            	{
                chars[i] = '0';
            	}
            else
            	{
                chars[i] = '0';
                break;
            	}
        	}
 
        return new Range(Integer.parseInt(String.valueOf(chars)), end);
    	}
 
    public static Range fromStart(int start)
    	{
        final char[] chars = String.valueOf(start).toCharArray();
        for (int i=chars.length-1; i>=0;i--)
        	{
            if (chars[i]=='0')
            	{
                chars[i] = '9';
            	}
            else
            	{
                chars[i] = '9';
                break;
            	}
        	}
 
        return new Range(start, Integer.parseInt(String.valueOf(chars)));
    	}
 
    public static Range join(Range a, Range b)
    	{
        return new Range(a.start, b.end);
    	}
 
    private Range(int start, int end)
    	{
        this.start = start;
        this.end = end;
    	}
 
    public int getStart()
    	{
        return start;
    	}
 
    public int getEnd()
    	{
        return end;
    	}
 
    public boolean overlaps(Range r)
    	{
        return end > r.start && r.end > start;
    	}
 
    @Override
    public String toString()
    	{
        return String.format("Range{start=%d, end=%d}", start, end);
    	}
 
    public String toRegex()
    	{
        String startStr = String.valueOf(getStart());
        String endStr = String.valueOf(getEnd());
 
        final StringBuilder result = new StringBuilder();
 
        for (int pos = 0; pos < startStr.length(); pos++)
        	{
            if (startStr.charAt(pos) == endStr.charAt(pos))
            	{
                result.append(startStr.charAt(pos));
            	}
            else
            	{
            	if((startStr.charAt(pos) == '0') && (endStr.charAt(pos) == '9'))
            		{
            		result.append('X');
            		}
            	else
            		{
            		result.append('[')
                    .append(startStr.charAt(pos))
                    .append('-')
                    .append(endStr.charAt(pos))
                    .append(']');
            		}
            	}
        	}
        return result.toString();
    	}
    
    /*2018*//*From Another guy and modified by RATEL Alexandre 8)*/
	}

