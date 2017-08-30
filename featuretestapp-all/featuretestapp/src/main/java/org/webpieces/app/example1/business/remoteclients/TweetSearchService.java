package org.webpieces.app.example1.business.remoteclients;

import java.util.List;

public interface TweetSearchService {
  List<Integer> query(String queryString);
}
