package com.example;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class YamaColorblindHelper
{
	public static void main(String[] args) throws Exception
	{
        ExternalPluginManager.loadBuiltin(com.example.yamacolorblindhelper.YamaColorblindHelperPlugin.class);
        RuneLite.main(args);
	}
}