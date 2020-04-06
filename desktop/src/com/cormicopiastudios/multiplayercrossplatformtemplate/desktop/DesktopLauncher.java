package com.cormicopiastudios.multiplayercrossplatformtemplate.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.cormicopiastudios.multiplayercrossplatformtemplate.MultiplayerCrossPlatformTemplate;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new MultiplayerCrossPlatformTemplate(), config);
	}
}
