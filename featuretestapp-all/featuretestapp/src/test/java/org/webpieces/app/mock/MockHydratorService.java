package org.webpieces.app.mock;

import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.ImmutableMap;

import org.webpieces.app.example1.remoteclients.HydratorService;
import org.webpieces.app.example1.model.Tweet;

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
