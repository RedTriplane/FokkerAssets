
package com.jfixby.r3.fokker.assets.api.shader;

import com.jfixby.scarabei.api.assets.ID;

public interface FokkerShaderComponent {

	public FokkerShaderPackageReader packageReader ();

	public FokkerShader obtain (ID assetID);

}
