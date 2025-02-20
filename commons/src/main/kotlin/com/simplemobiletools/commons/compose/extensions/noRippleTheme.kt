package com.simplemobiletools.commons.compose.extensions

import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material3.RippleConfiguration
import androidx.compose.ui.graphics.Color

//@OptIn(ExperimentalMaterial3Api::class)
internal fun noRippleTheme() =
    RippleConfiguration(
        color = Color.Unspecified,
        rippleAlpha = RippleAlpha(
            pressedAlpha = 0f,
            focusedAlpha = 0f,
            draggedAlpha = 0f,
            hoveredAlpha = 0f
        )
    )
