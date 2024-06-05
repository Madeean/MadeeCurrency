package di

import com.russhwolf.settings.Settings
import data.local.PreferencesImpl
import data.remote.api.CurrencyApiServiceImpl
import domain.CurrencyApiService
import domain.PreferencesRepository
import org.koin.core.context.startKoin
import org.koin.dsl.module
import presentation.screen.HomeViewModel


val appModule = module {
  single { Settings() }
  single<PreferencesImpl> {PreferencesImpl(get())}
  single<PreferencesRepository> { PreferencesImpl(get()) }
  single<CurrencyApiServiceImpl> { CurrencyApiServiceImpl(preferencesRepository = get()) }
  single<CurrencyApiService> {CurrencyApiServiceImpl(get())}
  factory{
    println("Creating HomeViewModel")
    HomeViewModel(get(), get())
  }
}

fun initializeKoin() {
  startKoin {
    modules(appModule)
  }
}