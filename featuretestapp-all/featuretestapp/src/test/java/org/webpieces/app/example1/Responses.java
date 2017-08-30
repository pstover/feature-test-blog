package org.webpieces.app.example1;

import com.google.common.collect.ImmutableMap;
import org.webpieces.app.example1.business.model.Tweet;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Responses {
    public static Map<Integer, Tweet> createTweetResponseMap() {
        return ImmutableMap.of(
                1, new Tweet("pstover", "tweeting"),
                2, new Tweet("dhiller", "test1"),
                3, new Tweet("dhiller", "test2"));
    }

    public static List<Integer> createBasicTweetIdListResponse() {
        return Arrays.asList(1, 2, 3);
    }
}
