package org.webpieces.app.example1.business.remoteclients.impl;

import org.webpieces.app.example1.business.model.Tweet;
import org.webpieces.app.example1.business.remoteclients.HydratorService;

public class HydratorServiceImpl implements HydratorService {
  @Override
  public Tweet hydrate(Integer tweetId) {

    //return fake tweet
    return new Tweet("user"+tweetId, "some text"+tweetId);
  }
}
