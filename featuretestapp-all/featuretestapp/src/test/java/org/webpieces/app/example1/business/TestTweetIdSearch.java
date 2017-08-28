package org.webpieces.app.example1.business;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.webpieces.app.example1.SearchRequest;
import org.webpieces.app.example1.util.Responses;
import org.webpieces.app.mock.MockTweetSearchService;

import static org.junit.Assert.assertEquals;

public class TestTweetIdSearch {
  private TweetIdSearch tweetIdSearch;

  @Before
  public void setup() {
    MockTweetSearchService mockTweetSearchService = new MockTweetSearchService();
    mockTweetSearchService.setResponse(Responses.createBasicTweetIdListResponse());

    tweetIdSearch = new TweetIdSearch(mockTweetSearchService);
  }

  @Test
  public void testQuery() {
    List<Integer> results = tweetIdSearch.query(new SearchRequest("asdf", 4));

    assertEquals(Arrays.asList(1, 2, 3), results);
  }
}
