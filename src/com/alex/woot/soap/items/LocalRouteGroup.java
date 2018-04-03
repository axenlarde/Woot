package com.alex.woot.soap.items;

import com.alex.woot.misc.BasicItem;
import com.alex.woot.misc.CollectionTools;

/**
 * Class used to store a local route group value
 * @author Alexandre
 *
 */
public class LocalRouteGroup extends BasicItem
	{
	/**
	 * Variables
	 */
	private String name, value;
	
	public LocalRouteGroup(String name, String value)
		{
		super();
		this.name = name;
		this.value = value;
		}

	@Override
	public void resolve() throws Exception
		{
		name = CollectionTools.getRawValue(name, this, true);
		value = CollectionTools.getRawValue(value, this, true);
		}

	public String getName()
		{
		return name;
		}

	public void setName(String name)
		{
		this.name = name;
		}

	public String getValue()
		{
		return value;
		}

	public void setValue(String value)
		{
		this.value = value;
		}
	
	
	/*2018*//*Alexandre RATEL 8)*/
	}
