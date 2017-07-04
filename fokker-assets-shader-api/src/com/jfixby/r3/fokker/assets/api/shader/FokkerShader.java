
package com.jfixby.r3.fokker.assets.api.shader;

import com.jfixby.scarabei.api.ComponentInstaller;
import com.jfixby.scarabei.api.assets.ID;

public class FokkerShader {

	static private ComponentInstaller<FokkerShaderComponent> componentInstaller = new ComponentInstaller<FokkerShaderComponent>(
		"FokkerShader");

	public static final void installComponent (final FokkerShaderComponent component_to_install) {
		componentInstaller.installComponent(component_to_install);
	}

	public static final FokkerShaderComponent invoke () {
		return componentInstaller.invokeComponent();
	}

	public static final FokkerShaderComponent component () {
		return componentInstaller.getComponent();
	}

	public static final FokkerShaderHandler obtain (final ID assetID) {
		return componentInstaller.getComponent().obtain(assetID);

	}

}
