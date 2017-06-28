package org.webpieces.app.gui

import org.webpieces.ctx.api.Current

class notFound_html extends org.webpieces.templating.impl.GroovyTemplateSuperclass {
  public Object run() {
    use(org.webpieces.templating.impl.source.GroovyExtensions) {
      __out.print("<html>\n"); //htmlLine 0:2  groovyLine=8
      __out.print("  <head>\n"); //htmlLine 2:3  groovyLine=9
      __out.print("  </head>\n"); //htmlLine 3:4  groovyLine=10
      __out.print("  <body>\n"); //htmlLine 4:5  groovyLine=11
      __out.print("       Your page was not found\n"); //htmlLine 5:6  groovyLine=12
      __out.print("  </body>\n"); //htmlLine 6:7  groovyLine=13
      __out.print("</html>"); //htmlLine 7:7  groovyLine=14
    }
  }
}
