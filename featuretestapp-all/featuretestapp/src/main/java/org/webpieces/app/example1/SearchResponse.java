package org.webpieces.app.example1;

import java.util.List;

import org.webpieces.app.example1.business.model.Tweet;
import org.webpieces.app.example1.business.model.User;

/**
 * Created by pstover on 4/26/17.
 */
public class SearchResponse {
  private List<Tweet> tweets;
  private List<User> users;

  SearchResponse(List<Tweet> tweets, List<User> users) {
    this.tweets = tweets;
    this.users = users;
  }

  public List<Tweet> getTweets() {
    return tweets;
  }

  public List<User> getUsers() {
    return users;
  }
}
