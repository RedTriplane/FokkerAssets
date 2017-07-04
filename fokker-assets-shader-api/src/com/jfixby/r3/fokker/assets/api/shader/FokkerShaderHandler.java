
package com.jfixby.r3.fokker.assets.api.shader;

public interface FokkerShaderHandler {

	com.badlogic.gdx.graphics.glutils.ShaderProgram getGdxShaderProgram ();

	boolean isOverlay ();

	void applyParameters (ShaderParameters params);

	void setOpacity (double opacity);

}
