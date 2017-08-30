package org.webpieces.app.base;

import org.webpieces.app.example1.business.remoteclients.HydratorService;
import org.webpieces.app.example1.business.remoteclients.TweetSearchService;
import org.webpieces.app.example1.business.remoteclients.UserSearchService;
import org.webpieces.app.example1.business.remoteclients.impl.HydratorServiceImpl;
import org.webpieces.app.example1.business.remoteclients.impl.TweetSearchServiceImpl;
import org.webpieces.app.example1.business.remoteclients.impl.UserSearchServiceImpl;

import com.google.inject.Binder;
import com.google.inject.Module;

public class GuiceModule implements Module {

  //This is where you would put the guice bindings you need though generally if done
  //right, you won't have much in this file.

  //If you need more Guice Modules as you want to scale, just modify FeatureTestAppMeta which returns
  //the list of all the Guice Modules in your application
  @Override
  public void configure(Binder binder) {
    binder.bind(TweetSearchService.class).to(TweetSearchServiceImpl.class);

    binder.bind(HydratorService.class).to(HydratorServiceImpl.class);

    binder.bind(UserSearchService.class).to(UserSearchServiceImpl.class);
  }
}
