package org.webpieces.app.example1

import org.webpieces.ctx.api.Current

class search_html extends org.webpieces.templating.impl.GroovyTemplateSuperclass {
  public Object run() {
    use(org.webpieces.templating.impl.source.GroovyExtensions) {
if (tweets) { //htmlLine 1:1  groovyLine=8

      __out.print("  Here are your tweets: "); //htmlLine 2:2  groovyLine=10

       enterExpression('at org.webpieces.app.example1.search.html(search.html:2)'); //htmlLine 2:2  groovyLine=12
       __out.print(useFormatter(tweets)); //htmlLine 2:2  groovyLine=13
       exitExpression(); //htmlLine 2:2  groovyLine=14

      __out.print("\n"); //htmlLine 2:3  groovyLine=16
} //htmlLine 3:3  groovyLine=17

 else { //htmlLine 4:4  groovyLine=19

      __out.print("  No tweets found!\n"); //htmlLine 5:6  groovyLine=21
} //htmlLine 6:6  groovyLine=22

      __out.print("\n"); //htmlLine 7:8  groovyLine=24
if (users) { //htmlLine 8:8  groovyLine=25

      __out.print("  Here are your users: "); //htmlLine 9:9  groovyLine=27

       enterExpression('at org.webpieces.app.example1.search.html(search.html:9)'); //htmlLine 9:9  groovyLine=29
       __out.print(useFormatter(users)); //htmlLine 9:9  groovyLine=30
       exitExpression(); //htmlLine 9:9  groovyLine=31

      __out.print("\n"); //htmlLine 9:10  groovyLine=33
} //htmlLine 10:10  groovyLine=34

 else { //htmlLine 11:11  groovyLine=36

      __out.print("  No users found!\n"); //htmlLine 12:13  groovyLine=38
} //htmlLine 13:13  groovyLine=39

      __out.print(""); //htmlLine 14:14  groovyLine=41
    }
  }
}
