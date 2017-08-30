package org.webpieces.app.example1.business.remoteclients;

import org.webpieces.app.example1.business.model.Tweet;

public interface HydratorService {
  Tweet hydrate(Integer tweetId);
}
