package presentation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.koin.getScreenModel
import presentation.component.HomeHeader
import ui.theme.surfaceColor

class HomeScreen : Screen {
  @Composable
  override fun Content() {
    val viewModel: HomeViewModel = getScreenModel()
    val rateStatus by viewModel.rateStatus

    Column(
      modifier = Modifier
        .fillMaxSize()
        .background(surfaceColor)
    ) {
      HomeHeader(
        status = rateStatus,
        onRateRefresh = {
          viewModel.sendEvent(HomeUiEvent.RefreshRates)
        }
      )
    }
  }
}
