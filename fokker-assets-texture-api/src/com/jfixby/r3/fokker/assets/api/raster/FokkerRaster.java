
package com.jfixby.r3.fokker.assets.api.raster;

import com.jfixby.scarabei.api.ComponentInstaller;
import com.jfixby.scarabei.api.assets.ID;

public class FokkerRaster {

	static private ComponentInstaller<FokkerRasterComponent> componentInstaller = new ComponentInstaller<FokkerRasterComponent>(
		"FokkerRaster");

	public static final void installComponent (final FokkerRasterComponent component_to_install) {
		componentInstaller.installComponent(component_to_install);
	}

	public static final FokkerRasterComponent invoke () {
		return componentInstaller.invokeComponent();
	}

	public static final FokkerRasterComponent component () {
		return componentInstaller.getComponent();
	}

	public static final FokkerRasterHandler obtain (final ID assetID) {
		return componentInstaller.getComponent().obtain(assetID);

	}

}
