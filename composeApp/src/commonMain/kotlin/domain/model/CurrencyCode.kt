package domain.model

import org.jetbrains.compose.resources.DrawableResource
import todoapp.composeapp.generated.resources.Res
import todoapp.composeapp.generated.resources.compose_multiplatform

enum class CurrencyCode(
  val country: String,
  val flag: DrawableResource
) {
  AED(country = "United Arab Emirate", flag = Res.drawable.compose_multiplatform),
  AFN(country = "Afghanistan", flag = Res.drawable.compose_multiplatform),
  ALL(country = "Albania", flag = Res.drawable.compose_multiplatform),
}