package org.webpieces.app.example1.mock;

import org.webpieces.app.example1.business.AuthenticationService;
import org.webpieces.ctx.api.RequestContext;

public class MockAuthenticationService extends AuthenticationService {
    private boolean response;

    public void setResponse(boolean response) {
        this.response = response;
    }

    public boolean validCredentials(RequestContext requestContext) {
        return response;
    }
}
