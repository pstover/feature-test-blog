package org.webpieces.app.example1.business.remoteclients;

import org.webpieces.app.example1.business.model.User;

public interface UserSearchService {
  User lookup(String userId);
}
