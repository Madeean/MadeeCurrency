package domain.model

import currencyapp3.composeapp.generated.resources.Res
import currencyapp3.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.DrawableResource

enum class CurrencyCode(
  val country: String,
  val flag: DrawableResource
) {
  AED(country = "United Arab Emirate", flag = Res.drawable.compose_multiplatform),
  AFN(country = "Afghanistan", flag = Res.drawable.compose_multiplatform),
  ALL(country = "Albania", flag = Res.drawable.compose_multiplatform),
}