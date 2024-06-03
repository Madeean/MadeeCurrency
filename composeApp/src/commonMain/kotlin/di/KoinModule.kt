package di

import androidx.compose.ui.text.font.FontVariation.Settings
import data.local.PreferencesImpl
import data.remote.api.CurrencyApiServiceImpl
import domain.CurrencyApiService
import domain.PreferencesRepository
import org.koin.core.context.startKoin
import org.koin.dsl.module

val appModule = module{
  single { Settings() }
  single<PreferencesRepository> {PreferencesImpl(settings = get())}
  single<CurrencyApiService> {CurrencyApiServiceImpl(preferencesRepository = get())}
}

fun initializeKoin(){
  startKoin {
    modules(appModule)
  }
}