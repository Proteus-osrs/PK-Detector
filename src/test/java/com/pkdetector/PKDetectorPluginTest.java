package com.pkdetector;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class PKDetectorPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(PKDetectorPlugin.class);
		RuneLite.main(args);
	}
}