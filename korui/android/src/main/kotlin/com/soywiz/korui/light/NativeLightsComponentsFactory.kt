package com.soywiz.korui.light

actual object NativeLightsComponentsFactory : LightComponentsFactory {
	actual override fun create(): LightComponents = AndroidLightComponents()
}
