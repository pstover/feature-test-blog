package org.webpieces.app.example1.filters;

import java.util.concurrent.CompletableFuture;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.webpieces.app.example1.business.AuthenticationService;
import org.webpieces.httpparser.api.dto.KnownStatusCode;
import org.webpieces.router.api.actions.Action;
import org.webpieces.router.api.actions.RenderContent;
import org.webpieces.router.api.dto.MethodMeta;
import org.webpieces.router.api.routing.RouteFilter;
import org.webpieces.util.filters.Service;

import static org.webpieces.plugins.json.JacksonCatchAllFilter.MIME_TYPE;

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
      byte[] content = new byte[0];
      return CompletableFuture.completedFuture(
          new RenderContent(content, KnownStatusCode.HTTP_401_UNAUTHORIZED.getCode(), KnownStatusCode.HTTP_401_UNAUTHORIZED.getReason(), MIME_TYPE));
    } else {
      return nextFilter.invoke(meta);
    }
  }
}
