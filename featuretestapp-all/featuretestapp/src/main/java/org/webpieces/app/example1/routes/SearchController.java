package org.webpieces.app.example1.routes;

import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.webpieces.app.example1.business.Hydrator;
import org.webpieces.app.example1.business.TweetIdSearch;
import org.webpieces.app.example1.business.UserSearch;
import org.webpieces.app.example1.model.Tweet;
import org.webpieces.app.example1.model.User;
import org.webpieces.plugins.json.Jackson;

@Singleton
public class SearchController {
  @Inject
  private UserSearch userSearch;

  @Inject
  private TweetIdSearch tweetIdSearch;

  @Inject
  private Hydrator hydrator;


  @Jackson
  public SearchResponse index() {
    return new SearchResponse(null, null);
  }

  public SearchResponse search(@Jackson SearchRequest request) {
    List<Integer> tweetIds = tweetIdSearch.query(request);

    List<Tweet> tweets = tweetIds.stream()
        .map(tweetId -> hydrator.hydrate(tweetId))
        .collect(Collectors.toList());

    List<User> users = tweets.stream()
        .map(Tweet::getFromUser)
        .distinct()
        .map(userSearch::lookup)
        .collect(Collectors.toList());

    return new SearchResponse(tweets, users);
  }
}
