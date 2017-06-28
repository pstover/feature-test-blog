package org.webpieces.app.example1

import org.webpieces.ctx.api.Current

class jsonIndex_html extends org.webpieces.templating.impl.GroovyTemplateSuperclass {
  public Object run() {
    use(org.webpieces.templating.impl.source.GroovyExtensions) {
      __out.print("This is the basic /json start page."); //htmlLine 0:1  groovyLine=8
    }
  }
}
