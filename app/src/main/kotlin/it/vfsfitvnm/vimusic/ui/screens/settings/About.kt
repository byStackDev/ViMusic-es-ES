package it.vfsfitvnm.vimusic.ui.screens.settings

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import it.vfsfitvnm.vimusic.LocalPlayerAwareWindowInsets
import it.vfsfitvnm.vimusic.ui.components.themed.Header
import it.vfsfitvnm.vimusic.ui.styling.LocalAppearance
import it.vfsfitvnm.vimusic.utils.center
import it.vfsfitvnm.vimusic.utils.secondary

@ExperimentalAnimationApi
@Composable
fun About() {
    val (colorPalette, typography) = LocalAppearance.current
    val uriHandler = LocalUriHandler.current

    Column(
        modifier = Modifier
            .background(colorPalette.background0)
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(
                LocalPlayerAwareWindowInsets.current
                    .only(WindowInsetsSides.Vertical + WindowInsetsSides.End)
                    .asPaddingValues()
            )
    ) {
        Header(title = "Acerca de") {
            BasicText(
                text = "v0.5.4 by vfsfitvnm",
                style = typography.s.secondary
            )

        }

        SettingsEntryGroupText(title = "SOCIAL")

        SettingsEntry(
            title = "GitHub",
            text = "Ver el código fuente",
            onClick = {
                uriHandler.openUri("https://github.com/vfsfitvnm/ViMusic")
            }
        )

        SettingsEntryGroupText(title = "SOLUCIÓN DE PROBLEMAS")

        SettingsEntry(
            title = "Reportar un problema",
            text = "Serás redirigido a GitHub",
            onClick = {
                uriHandler.openUri("https://github.com/vfsfitvnm/ViMusic/issues/new?assignees=&labels=bug&template=bug_report.yaml")
            }
        )

        SettingsEntry(
            title = "Solicite una característica o sugiera una idea",
            text = "Serás redirigido a GitHub",
            onClick = {
                uriHandler.openUri("https://github.com/vfsfitvnm/ViMusic/issues/new?assignees=&labels=enhancement&template=feature_request.yaml")
            }
        )
        SettingsGroupSpacer()
        BasicText(
            text = "Esta versión de la aplicación ha sido modificada y adaptada al idioma español. Basada en la versión original de vfsfitvnm. Esta versión modifica el contenido y no está afiliada con el desarrollador oficial. ¡Disfruta de la experiencia en español! \uD83C\uDF10",
            style = typography.s.secondary.center,
        )
        Header (title = "byStackDev"){
            BasicText(
                text = "versión 0.1.0",
                style = typography.s.secondary
            )
        }
        SettingsEntry(
            title = "GitHub",
            text = "Ver perfil",
            onClick = {
                uriHandler.openUri("https://github.com/byStackDev")
            }
        )
    }

}
