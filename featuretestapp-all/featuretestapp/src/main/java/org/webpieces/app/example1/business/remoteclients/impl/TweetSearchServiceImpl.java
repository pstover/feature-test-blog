package org.webpieces.app.example1.business.remoteclients.impl;

import org.webpieces.app.example1.business.remoteclients.TweetSearchService;

import java.util.ArrayList;
import java.util.List;

public class TweetSearchServiceImpl implements TweetSearchService {
  @Override
  public List<Integer> query(String queryString) {
    List<Integer> list = new ArrayList<>();
    list.add(56);
    list.add(72);
    return list;
  }
}
