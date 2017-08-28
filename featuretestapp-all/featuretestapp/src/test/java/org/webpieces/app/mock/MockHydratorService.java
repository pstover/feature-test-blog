package org.webpieces.app.mock;

import java.util.Map;

import org.webpieces.app.example1.business.remoteclients.HydratorService;
import org.webpieces.app.example1.business.model.Tweet;

public class MockHydratorService implements HydratorService {
  private Map<Integer, Tweet> tweets;

  public void setResponseMap(Map<Integer, Tweet> tweetResponses) {
    tweets = tweetResponses;
  }

  @Override
  public Tweet hydrate(Integer tweetId) {
    return tweets.get(tweetId);
  }
}
