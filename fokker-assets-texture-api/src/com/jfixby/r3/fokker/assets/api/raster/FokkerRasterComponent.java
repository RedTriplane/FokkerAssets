
package com.jfixby.r3.fokker.assets.api.raster;

import com.jfixby.scarabei.api.assets.ID;

public interface FokkerRasterComponent {

	public FokkerRasterPackageReader packageReader ();

	public FokkerRasterHandler obtain (ID assetID);

}
