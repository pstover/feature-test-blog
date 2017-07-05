package org.webpieces.app.example1.business;

import org.junit.Before;
import org.junit.Test;
import org.webpieces.app.example1.remoteclients.TweetSearchService;
import org.webpieces.app.example1.routes.SearchRequest;
import org.webpieces.app.mock.MockTweetSearchService;

public class TestTweetIdSearch {
  private TweetIdSearch tweetIdSearch;

  @Before
  public void setup() {
    TweetSearchService mockTweetSearchService = new MockTweetSearchService();
    tweetIdSearch = new TweetIdSearch(mockTweetSearchService);
  }

  @Test
  public void testQuery() {
//    tweetIdSearch.query("{ `query`: `asdf`, `maxResults`: 4 }"
//        .replace("`", "\""));
    tweetIdSearch.query(new SearchRequest("asdf", 4));
  }
}
