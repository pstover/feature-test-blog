package org.webpieces.app.example1.business;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.webpieces.app.example1.remoteclients.TweetSearchService;
import org.webpieces.app.example1.routes.SearchRequest;
import org.webpieces.app.mock.MockTweetSearchService;

import static org.junit.Assert.assertEquals;

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
    List<Integer> results = tweetIdSearch.query(new SearchRequest("asdf", 4));

    assertEquals(results, Arrays.asList(1, 2, 3));
  }
}
