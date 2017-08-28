package org.webpieces.app.example1;

import static org.webpieces.ctx.api.HttpMethod.GET;

import org.webpieces.router.api.routing.ScopedRoutes;

public class JsonRoutes extends ScopedRoutes {
  @Override
  protected String getScope() {
    return "/json";
  }

  @Override
  protected boolean isHttpsOnlyRoutes() {
    return false;
  }

  @Override
  protected void configure() {
    addContentRoute(GET, "/", "SearchController.index");
    addContentRoute(GET, "/search", "SearchController.search");
  }
}
