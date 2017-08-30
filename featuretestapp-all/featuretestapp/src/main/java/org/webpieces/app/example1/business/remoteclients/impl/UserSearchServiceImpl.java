package org.webpieces.app.example1.business.remoteclients.impl;

import org.webpieces.app.example1.business.model.User;
import org.webpieces.app.example1.business.remoteclients.UserSearchService;

public class UserSearchServiceImpl implements UserSearchService {
  @Override
  public User lookup(String userId) {
    return new User("Patrick", "Patrick Stover");
  }
}
