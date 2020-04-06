package com.cormicopiastudios.multiplayercrossplatformtemplate;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.cormicopiastudios.multiplayercrossplatformtemplate.MultiplayerCrossPlatformTemplate;

public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		initialize(new MultiplayerCrossPlatformTemplate(), config);
	}
}
