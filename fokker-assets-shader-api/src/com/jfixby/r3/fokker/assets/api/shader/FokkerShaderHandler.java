
package com.jfixby.r3.fokker.assets.api.shader;

import com.jfixby.scarabei.api.geometry.Rectangle;

public interface FokkerShaderHandler {

	com.badlogic.gdx.graphics.glutils.ShaderProgram getGdxShaderProgram ();

	boolean isOverlay ();

	Rectangle shape ();

	void setupValues ();

}
