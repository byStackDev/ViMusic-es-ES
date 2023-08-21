package it.vfsfitvnm.vimusic.enums

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import it.vfsfitvnm.vimusic.ui.styling.LocalAppearance

enum class ThumbnailRoundness {
    Ninguno,
    Ligero,
    Medio,
    Intenso;

    fun shape(): Shape {
        return when (this) {
            Ninguno -> RectangleShape
            Ligero -> RoundedCornerShape(2.dp)
            Medio -> RoundedCornerShape(4.dp)
            Intenso -> RoundedCornerShape(8.dp)
        }
    }
}
