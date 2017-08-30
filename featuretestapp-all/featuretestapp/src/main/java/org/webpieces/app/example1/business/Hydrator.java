package org.webpieces.app.example1.business;

import javax.inject.Inject;

import org.webpieces.app.example1.business.model.Tweet;
import org.webpieces.app.example1.business.remoteclients.HydratorService;

//public class HydratorImpl implements Hydrator {
public class Hydrator {
  @Inject
  private HydratorService hydratorService;

//  @Override
  public Tweet hydrate(Integer tweetId) {
    return hydratorService.hydrate(tweetId);
  }
}
