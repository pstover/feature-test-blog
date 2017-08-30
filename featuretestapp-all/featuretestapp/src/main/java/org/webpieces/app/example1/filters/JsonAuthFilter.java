package org.webpieces.app.example1.filters;

import java.util.concurrent.CompletableFuture;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.webpieces.app.example1.business.AuthenticationService;
import org.webpieces.app.example1.exception.AuthenticationException;
import org.webpieces.router.api.actions.Action;
import org.webpieces.router.api.dto.MethodMeta;
import org.webpieces.router.api.routing.RouteFilter;
import org.webpieces.util.filters.Service;

@Singleton
public class JsonAuthFilter extends RouteFilter<Void> {
  private final AuthenticationService authenticationService;

  @Inject
  public JsonAuthFilter(AuthenticationService authenticationService) {
    this.authenticationService = authenticationService;
  }

  @Override
  public void initialize(Void initialConfig) {
  }

  @Override
  public CompletableFuture<Action> filter(MethodMeta meta, Service<MethodMeta, Action> nextFilter) {
    if (!authenticationService.validCredentials(meta.getCtx())) {
      throw new AuthenticationException("Bad credentials!");
    } else {
      return nextFilter.invoke(meta);
    }
  }
}
