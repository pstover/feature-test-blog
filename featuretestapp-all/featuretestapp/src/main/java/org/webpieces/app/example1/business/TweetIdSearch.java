package org.webpieces.app.example1.business;

import java.util.List;

import javax.inject.Inject;

import org.webpieces.app.example1.business.remoteclients.TweetSearchService;
import org.webpieces.app.example1.SearchRequest;

public class TweetIdSearch {
  private TweetSearchService tweetSearchService;

  @Inject
  public TweetIdSearch(TweetSearchService tweetSearchService) {
    this.tweetSearchService = tweetSearchService;
  }

  public List<Integer> query(SearchRequest request) {
    return tweetSearchService.query(request.getQuery());
  }
}
