// Generated by Dagger (https://dagger.dev).
package com.aptivist.challengeapis.core.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvidesOkHttpClientFactory implements Factory<OkHttpClient> {
  private final Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider;

  public NetworkModule_ProvidesOkHttpClientFactory(
      Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider) {
    this.httpLoggingInterceptorProvider = httpLoggingInterceptorProvider;
  }

  @Override
  public OkHttpClient get() {
    return providesOkHttpClient(httpLoggingInterceptorProvider.get());
  }

  public static NetworkModule_ProvidesOkHttpClientFactory create(
      Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider) {
    return new NetworkModule_ProvidesOkHttpClientFactory(httpLoggingInterceptorProvider);
  }

  public static OkHttpClient providesOkHttpClient(HttpLoggingInterceptor httpLoggingInterceptor) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.providesOkHttpClient(httpLoggingInterceptor));
  }
}
