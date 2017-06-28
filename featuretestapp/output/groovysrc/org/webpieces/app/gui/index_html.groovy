package org.webpieces.app.gui

import org.webpieces.ctx.api.Current

class index_html extends org.webpieces.templating.impl.GroovyTemplateSuperclass {
  public Object run() {
    use(org.webpieces.templating.impl.source.GroovyExtensions) {
      __out.print("<!DOCTYPE html>\n"); //htmlLine 0:2  groovyLine=8
      __out.print("<html lang=\"en\">\n"); //htmlLine 2:3  groovyLine=9
      __out.print("\n"); //htmlLine 3:4  groovyLine=10
      __out.print("    <head>\n"); //htmlLine 4:5  groovyLine=11
      __out.print("\n"); //htmlLine 5:6  groovyLine=12
      __out.print("        <meta charset=\"utf-8\">\n"); //htmlLine 6:7  groovyLine=13
      __out.print("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n"); //htmlLine 7:8  groovyLine=14
      __out.print("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n"); //htmlLine 8:9  groovyLine=15
      __out.print("        <title>Webpieces - Re-usable pieces of a webserver</title>\n"); //htmlLine 9:10  groovyLine=16
      __out.print("\n"); //htmlLine 10:11  groovyLine=17
      __out.print("        <!-- CSS -->\n"); //htmlLine 11:12  groovyLine=18
      __out.print("        <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800\">\n"); //htmlLine 12:13  groovyLine=19
      __out.print("        <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Dosis:300,400,500,600,700\">\n"); //htmlLine 13:14  groovyLine=20
      __out.print("        \n"); //htmlLine 14:15  groovyLine=21
      __out.print("        "); //htmlLine 15:15  groovyLine=22
enterExpression('at org.webpieces.app.gui.index.html(index.html:15)'); //htmlLine 15:15  groovyLine=23
_attrs4 = [href:'assets/primesTheme/assets/bootstrap/css/bootstrap.min.css']; //htmlLine 15:15  groovyLine=24
exitExpression(); //htmlLine 15:15  groovyLine=25

runTag('stylesheet', _attrs4, null, 'at org.webpieces.app.gui.index.html(index.html:15)'); //htmlLine 15:15  groovyLine=27

enterExpression('at org.webpieces.app.gui.index.html(index.html:16)'); //htmlLine 16:16  groovyLine=29
_attrs5 = [href:'assets/primesTheme/assets/font-awesome/css/font-awesome.min.css']; //htmlLine 16:16  groovyLine=30
exitExpression(); //htmlLine 16:16  groovyLine=31

runTag('stylesheet', _attrs5, null, 'at org.webpieces.app.gui.index.html(index.html:16)'); //htmlLine 16:16  groovyLine=33

enterExpression('at org.webpieces.app.gui.index.html(index.html:17)'); //htmlLine 17:17  groovyLine=35
_attrs6 = [href:'assets/primesTheme/assets/elegant-icons/css/elegant-icons.min.css']; //htmlLine 17:17  groovyLine=36
exitExpression(); //htmlLine 17:17  groovyLine=37

runTag('stylesheet', _attrs6, null, 'at org.webpieces.app.gui.index.html(index.html:17)'); //htmlLine 17:17  groovyLine=39

enterExpression('at org.webpieces.app.gui.index.html(index.html:18)'); //htmlLine 18:18  groovyLine=41
_attrs7 = [href:'assets/primesTheme/assets/ionicons/css/ionicons.min.css']; //htmlLine 18:18  groovyLine=42
exitExpression(); //htmlLine 18:18  groovyLine=43

runTag('stylesheet', _attrs7, null, 'at org.webpieces.app.gui.index.html(index.html:18)'); //htmlLine 18:18  groovyLine=45

enterExpression('at org.webpieces.app.gui.index.html(index.html:19)'); //htmlLine 19:19  groovyLine=47
_attrs8 = [href:'assets/primesTheme/assets/owl-carousel/owl.carousel.css']; //htmlLine 19:19  groovyLine=48
exitExpression(); //htmlLine 19:19  groovyLine=49

runTag('stylesheet', _attrs8, null, 'at org.webpieces.app.gui.index.html(index.html:19)'); //htmlLine 19:19  groovyLine=51

enterExpression('at org.webpieces.app.gui.index.html(index.html:20)'); //htmlLine 20:20  groovyLine=53
_attrs9 = [href:'assets/primesTheme/assets/owl-carousel/owl.theme.css']; //htmlLine 20:20  groovyLine=54
exitExpression(); //htmlLine 20:20  groovyLine=55

runTag('stylesheet', _attrs9, null, 'at org.webpieces.app.gui.index.html(index.html:20)'); //htmlLine 20:20  groovyLine=57

enterExpression('at org.webpieces.app.gui.index.html(index.html:21)'); //htmlLine 21:21  groovyLine=59
_attrs10 = [href:'assets/primesTheme/assets/cubeportfolio/css/cubeportfolio.min.css']; //htmlLine 21:21  groovyLine=60
exitExpression(); //htmlLine 21:21  groovyLine=61

runTag('stylesheet', _attrs10, null, 'at org.webpieces.app.gui.index.html(index.html:21)'); //htmlLine 21:21  groovyLine=63

enterExpression('at org.webpieces.app.gui.index.html(index.html:22)'); //htmlLine 22:22  groovyLine=65
_attrs11 = [href:'assets/primesTheme/assets/css/style.css']; //htmlLine 22:22  groovyLine=66
exitExpression(); //htmlLine 22:22  groovyLine=67

runTag('stylesheet', _attrs11, null, 'at org.webpieces.app.gui.index.html(index.html:22)'); //htmlLine 22:22  groovyLine=69

      __out.print("            <!--Colors-->\n"); //htmlLine 24:25  groovyLine=71
      __out.print("            <!-- <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/primesTheme/assets/css/colors/red.css\"> -->\n"); //htmlLine 25:26  groovyLine=72
      __out.print("            <!-- <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/primesTheme/assets/css/colors/orange.css\"> -->\n"); //htmlLine 26:27  groovyLine=73
      __out.print("            <!-- <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/primesTheme/assets/css/colors/green.css\"> -->\n"); //htmlLine 27:28  groovyLine=74
      __out.print("            <!-- <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/primesTheme/assets/css/colors/lime.css\"> -->\n"); //htmlLine 28:29  groovyLine=75
      __out.print("            <!-- <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/primesTheme/assets/css/colors/brown.css\"> -->\n"); //htmlLine 29:30  groovyLine=76
      __out.print("            <!-- <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/primesTheme/assets/css/colors/blue.css\"> -->\n"); //htmlLine 30:31  groovyLine=77
      __out.print("            <!-- <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/primesTheme/assets/css/colors/yellow.css\"> -->\n"); //htmlLine 31:32  groovyLine=78
      __out.print("             <!-- <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/primesTheme/assets/css/colors/purple.css\"> -->\n"); //htmlLine 32:33  groovyLine=79
      __out.print("\n"); //htmlLine 33:34  groovyLine=80
      __out.print("\n"); //htmlLine 34:35  groovyLine=81
      __out.print("    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\n"); //htmlLine 35:36  groovyLine=82
      __out.print("        <!--[if lt IE 9]>\n"); //htmlLine 36:37  groovyLine=83
      __out.print("            <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n"); //htmlLine 37:38  groovyLine=84
      __out.print("            <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n"); //htmlLine 38:39  groovyLine=85
      __out.print("        <![endif]-->\n"); //htmlLine 39:40  groovyLine=86
      __out.print("\n"); //htmlLine 40:41  groovyLine=87
      __out.print("\n"); //htmlLine 41:42  groovyLine=88
      __out.print("    </head>\n"); //htmlLine 42:43  groovyLine=89
      __out.print("\n"); //htmlLine 43:44  groovyLine=90
      __out.print("    <body data-spy=\"scroll\" data-offset=\"80\">\n"); //htmlLine 44:45  groovyLine=91
      __out.print("         <div class=\"navbar navbar-default navbar-fixed-top menu-top\" role=\"navigation\">\n"); //htmlLine 45:46  groovyLine=92
      __out.print("            <div class=\"container\">\n"); //htmlLine 46:47  groovyLine=93
      __out.print("                <div class=\"navbar-header\">\n"); //htmlLine 47:48  groovyLine=94
      __out.print("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n"); //htmlLine 48:49  groovyLine=95
      __out.print("                        <span class=\"sr-only\">Toggle navigation</span>\n"); //htmlLine 49:50  groovyLine=96
      __out.print("                        <span class=\"icon-bar\"></span>\n"); //htmlLine 50:51  groovyLine=97
      __out.print("                        <span class=\"icon-bar\"></span>\n"); //htmlLine 51:52  groovyLine=98
      __out.print("                        <span class=\"icon-bar\"></span>\n"); //htmlLine 52:53  groovyLine=99
      __out.print("                    </button>\n"); //htmlLine 53:54  groovyLine=100
      __out.print("                    <a class=\"navbar-brand\" href=\"#home\"><i class=\"fa fa-star-half-o\"></i> WEBPIECES</a>\n"); //htmlLine 54:55  groovyLine=101
      __out.print("                </div>\n"); //htmlLine 55:56  groovyLine=102
      __out.print("                <div class=\"navbar-collapse collapse\">\n"); //htmlLine 56:57  groovyLine=103
      __out.print("                    <ul class=\"nav navbar-nav navbar-right\">\n"); //htmlLine 57:58  groovyLine=104
      __out.print("                        <li><a href=\"#home\">Home</a></li>\n"); //htmlLine 58:59  groovyLine=105
      __out.print("                        <li><a href=\"#examples-section\">Examples</a></li>\n"); //htmlLine 59:60  groovyLine=106
      __out.print("                        <li><a href=\"#features-section\">Features</a></li>\n"); //htmlLine 60:61  groovyLine=107
      __out.print("\n"); //htmlLine 61:62  groovyLine=108
      __out.print("                        <li><a href=\"#portfolio-section\">Portfolio</a></li>\n"); //htmlLine 62:63  groovyLine=109
      __out.print("                        <li><a href=\"#pricing-section\">Free</a></li>\n"); //htmlLine 63:64  groovyLine=110
      __out.print("                        <li><a href=\"#contact-section\">Contact</a></li>\n"); //htmlLine 64:65  groovyLine=111
      __out.print("                    </ul>\n"); //htmlLine 65:66  groovyLine=112
      __out.print("                </div> \n"); //htmlLine 66:67  groovyLine=113
      __out.print("            </div>\n"); //htmlLine 67:68  groovyLine=114
      __out.print("        </div> \n"); //htmlLine 68:69  groovyLine=115
      __out.print("\n"); //htmlLine 69:70  groovyLine=116
      __out.print("        <!-- Top content -->\n"); //htmlLine 70:71  groovyLine=117
      __out.print("        <div id=\"home\" class=\"parallax top-content\" data-stellar-background-ratio=\"0.3\">\n"); //htmlLine 71:72  groovyLine=118
      __out.print("            <div class=\"inner-bg\">\n"); //htmlLine 72:73  groovyLine=119
      __out.print("                <div class=\"container\">\n"); //htmlLine 73:74  groovyLine=120
      __out.print("                    <div class=\"row\">\n"); //htmlLine 74:75  groovyLine=121
      __out.print("\n"); //htmlLine 75:76  groovyLine=122
      __out.print("			<div class=\"col-md-10 col-md-offset-1 top-description\">\n"); //htmlLine 76:77  groovyLine=123
      __out.print("				\n"); //htmlLine 77:78  groovyLine=124
      __out.print("				<h2 class=\"text-center\">\n"); //htmlLine 78:79  groovyLine=125
      __out.print("				Build your <strong>Business</strong> with <strong>Webpieces</strong></h2>\n"); //htmlLine 79:80  groovyLine=126
      __out.print("				\n"); //htmlLine 80:81  groovyLine=127
      __out.print("					\n"); //htmlLine 81:82  groovyLine=128
      __out.print("		<p>Webpieces Webserver is the most swappable platform on the market.  You can override any\n"); //htmlLine 82:83  groovyLine=129
      __out.print("			 piece of the webserver so it is the first platform to allow you to customize every corner for your needs</p>\n"); //htmlLine 83:84  groovyLine=130
      __out.print("		                            <div class=\"top-button\">\n"); //htmlLine 84:85  groovyLine=131
      __out.print("                            	<a class=\"btn btn-top btn-lg\" href=\"#examples-section\">Examples</a>\n"); //htmlLine 85:86  groovyLine=132
      __out.print("                            	<a class=\"btn btn-top-white btn-lg\" href=\"#features-section\">Features</a>\n"); //htmlLine 86:87  groovyLine=133
      __out.print("                            </div>\n"); //htmlLine 87:88  groovyLine=134
      __out.print("	\n"); //htmlLine 88:89  groovyLine=135
      __out.print("					</div>\n"); //htmlLine 89:90  groovyLine=136
      __out.print("                            </div>\n"); //htmlLine 90:91  groovyLine=137
      __out.print("	\n"); //htmlLine 91:92  groovyLine=138
      __out.print("					</div>\n"); //htmlLine 92:93  groovyLine=139
      __out.print("\n"); //htmlLine 93:94  groovyLine=140
      __out.print("			\n"); //htmlLine 94:95  groovyLine=141
      __out.print("				</div>\n"); //htmlLine 95:96  groovyLine=142
      __out.print("			</div>\n"); //htmlLine 96:97  groovyLine=143
      __out.print("\n"); //htmlLine 97:98  groovyLine=144
      __out.print("        <!-- Features -->\n"); //htmlLine 98:99  groovyLine=145
      __out.print("        <div id=\"examples-section\" class=\"features-container\">\n"); //htmlLine 99:100  groovyLine=146
      __out.print("	        <div class=\"container\">\n"); //htmlLine 100:101  groovyLine=147
      __out.print("	            <div class=\"row\">\n"); //htmlLine 101:102  groovyLine=148
      __out.print("	                <div class=\"col-sm-12 features\">\n"); //htmlLine 102:103  groovyLine=149
      __out.print("	                    <h3>Examples</h3>\n"); //htmlLine 103:104  groovyLine=150
      __out.print("	                    <p>Three highlights but there is way more than just this</p>\n"); //htmlLine 104:105  groovyLine=151
      __out.print("\n"); //htmlLine 105:106  groovyLine=152
      __out.print("	                </div>\n"); //htmlLine 106:107  groovyLine=153
      __out.print("	            </div>\n"); //htmlLine 107:108  groovyLine=154
      __out.print("	            <div class=\"row\">\n"); //htmlLine 108:109  groovyLine=155
      __out.print("	                <div class=\"col-sm-4 features-box\">\n"); //htmlLine 109:110  groovyLine=156
      __out.print("	                	<div class=\"icon\">\n"); //htmlLine 110:111  groovyLine=157
      __out.print("	                		<i class=\"icon ion-ios-lightbulb-outline\"></i>\n"); //htmlLine 111:112  groovyLine=158
      __out.print("	                	</div>\n"); //htmlLine 112:113  groovyLine=159
      __out.print("	                    <h4>CRUD</h4>\n"); //htmlLine 113:114  groovyLine=160
      __out.print("	                    <p>\n"); //htmlLine 114:115  groovyLine=161
      __out.print("	                    	The basic crud example but when you dig into the code you will find it doesn't take much code.\n"); //htmlLine 115:116  groovyLine=162
      __out.print("	                    </p>\n"); //htmlLine 116:117  groovyLine=163
      __out.print("                            	<a class=\"btn btn-features btn-lg\" href=\"\"> Learn More</a>\n"); //htmlLine 117:118  groovyLine=164
      __out.print("\n"); //htmlLine 118:119  groovyLine=165
      __out.print("	                </div>\n"); //htmlLine 119:120  groovyLine=166
      __out.print("	                <div class=\"col-sm-4 features-box\">\n"); //htmlLine 120:121  groovyLine=167
      __out.print("	                	<div class=\"icon\">\n"); //htmlLine 121:122  groovyLine=168
      __out.print("	                		<i class=\"icon ion-ios-flame-outline\"></i>\n"); //htmlLine 122:123  groovyLine=169
      __out.print("	                	</div>\n"); //htmlLine 123:124  groovyLine=170
      __out.print("	                    <h4>Ajax CRUD</h4>\n"); //htmlLine 124:125  groovyLine=171
      __out.print("	                    <p>\n"); //htmlLine 125:126  groovyLine=172
      __out.print("	                    	Advanced CRUD example that has to deal with advanced use cases of being logged out when invoking javascript but thankfully we do the heavy lifting\n"); //htmlLine 126:127  groovyLine=173
      __out.print("\n"); //htmlLine 127:128  groovyLine=174
      __out.print("	                    </p>\n"); //htmlLine 128:129  groovyLine=175
      __out.print("                            	<a class=\"btn btn-features btn-lg\" href=\"\"> Learn More</a>\n"); //htmlLine 129:130  groovyLine=176
      __out.print("\n"); //htmlLine 130:131  groovyLine=177
      __out.print("	                </div>\n"); //htmlLine 131:132  groovyLine=178
      __out.print("	                <div class=\"col-sm-4 features-box\">\n"); //htmlLine 132:133  groovyLine=179
      __out.print("	                	<div class=\"icon\">\n"); //htmlLine 133:134  groovyLine=180
      __out.print("	                		<i class=\"icon ion-ios-flask-outline\"></i>\n"); //htmlLine 134:135  groovyLine=181
      __out.print("	                	</div>\n"); //htmlLine 135:136  groovyLine=182
      __out.print("	                    <h4>Tags</h4>\n"); //htmlLine 136:137  groovyLine=183
      __out.print("	                    <p>\n"); //htmlLine 137:138  groovyLine=184
      __out.print("	                    	An assortment of tags with ability to create your own as well.  \n"); //htmlLine 138:139  groovyLine=185
      __out.print("\n"); //htmlLine 139:140  groovyLine=186
      __out.print("	                    </p>\n"); //htmlLine 140:141  groovyLine=187
      __out.print("                            	<a class=\"btn btn-features btn-lg\" href=\"\"> Learn More</a>\n"); //htmlLine 141:142  groovyLine=188
      __out.print("\n"); //htmlLine 142:143  groovyLine=189
      __out.print("	                </div>\n"); //htmlLine 143:144  groovyLine=190
      __out.print("	            </div>\n"); //htmlLine 144:145  groovyLine=191
      __out.print("	        </div>\n"); //htmlLine 145:146  groovyLine=192
      __out.print("        </div>\n"); //htmlLine 146:147  groovyLine=193
      __out.print("        \n"); //htmlLine 147:148  groovyLine=194
      __out.print("        \n"); //htmlLine 148:149  groovyLine=195
      __out.print("        <!-- Services -->\n"); //htmlLine 149:150  groovyLine=196
      __out.print("\n"); //htmlLine 150:151  groovyLine=197
      __out.print("        <div id=\"features-section\" class=\"services-container\">\n"); //htmlLine 151:152  groovyLine=198
      __out.print("	        <div class=\"container\">\n"); //htmlLine 152:153  groovyLine=199
      __out.print("	            <div class=\"row\">\n"); //htmlLine 153:154  groovyLine=200
      __out.print("\n"); //htmlLine 154:155  groovyLine=201
      __out.print("	                <div class=\"col-sm-12 services\">\n"); //htmlLine 155:156  groovyLine=202
      __out.print("	                    <h3>Features</h3>\n"); //htmlLine 156:157  groovyLine=203
      __out.print("	                    <p>Four highlights but there is way more than just this.</p>\n"); //htmlLine 157:158  groovyLine=204
      __out.print("				</div>\n"); //htmlLine 158:159  groovyLine=205
      __out.print("			</div>\n"); //htmlLine 159:160  groovyLine=206
      __out.print("			</div>\n"); //htmlLine 160:161  groovyLine=207
      __out.print("\n"); //htmlLine 161:162  groovyLine=208
      __out.print("\n"); //htmlLine 162:163  groovyLine=209
      __out.print("	        <div class=\"container\">\n"); //htmlLine 163:164  groovyLine=210
      __out.print("	            <div class=\"row\">\n"); //htmlLine 164:165  groovyLine=211
      __out.print("\n"); //htmlLine 165:166  groovyLine=212
      __out.print("				<div class=\"col-lg-6 col-sm-6\">\n"); //htmlLine 166:167  groovyLine=213
      __out.print("                        <div class=\"services-icon-wrap clearfix\">\n"); //htmlLine 167:168  groovyLine=214
      __out.print("                            <div class=\"left-side-icon\">\n"); //htmlLine 168:169  groovyLine=215
      __out.print("                                <i class=\"ion-ios-loop\"></i>\n"); //htmlLine 169:170  groovyLine=216
      __out.print("\n"); //htmlLine 170:171  groovyLine=217
      __out.print("						</div>\n"); //htmlLine 171:172  groovyLine=218
      __out.print("                            <div class=\"services-text-right\">\n"); //htmlLine 172:173  groovyLine=219
      __out.print("\n"); //htmlLine 173:174  groovyLine=220
      __out.print("						<h5>Developer Server Mode</h5>\n"); //htmlLine 174:175  groovyLine=221
      __out.print("						\n"); //htmlLine 175:176  groovyLine=222
      __out.print("<p>Much like ruby development, refactor your code like crazy and never restart your webserver.  Also, without restarting you can place and remove breakpoints in your debugger and they keep working as long as you don't delete that line.</p>\n"); //htmlLine 176:177  groovyLine=223
      __out.print("                            </div>\n"); //htmlLine 177:178  groovyLine=224
      __out.print("                        </div> \n"); //htmlLine 178:179  groovyLine=225
      __out.print("					\n"); //htmlLine 179:180  groovyLine=226
      __out.print("                        <div class=\"services-icon-wrap clearfix\">\n"); //htmlLine 180:181  groovyLine=227
      __out.print("                            <div class=\"left-side-icon\">\n"); //htmlLine 181:182  groovyLine=228
      __out.print("                                <i class=\"ion-social-buffer-outline\"></i>\n"); //htmlLine 182:183  groovyLine=229
      __out.print("\n"); //htmlLine 183:184  groovyLine=230
      __out.print("						</div>\n"); //htmlLine 184:185  groovyLine=231
      __out.print("                            <div class=\"services-text-right\">\n"); //htmlLine 185:186  groovyLine=232
      __out.print("\n"); //htmlLine 186:187  groovyLine=233
      __out.print("						<h5>Browser caching that works</h5>\n"); //htmlLine 187:188  groovyLine=234
      __out.print("<p>Other webservers have issues like when updating a *.js file, some customers don't get the update breaking their app.  Webpieces solves that issue by modifying urls to have a hash in the url so if you change the javascript we force the update to all customers.</p>\n"); //htmlLine 188:189  groovyLine=235
      __out.print("                            </div>\n"); //htmlLine 189:190  groovyLine=236
      __out.print("                        </div> \n"); //htmlLine 190:191  groovyLine=237
      __out.print("                            </div>\n"); //htmlLine 191:192  groovyLine=238
      __out.print("\n"); //htmlLine 192:193  groovyLine=239
      __out.print("				<div class=\"col-lg-6 col-sm-6\">\n"); //htmlLine 193:194  groovyLine=240
      __out.print("                        <div class=\"services-icon-wrap clearfix\">\n"); //htmlLine 194:195  groovyLine=241
      __out.print("                            <div class=\"left-side-icon\">\n"); //htmlLine 195:196  groovyLine=242
      __out.print("                                <i class=\"ion-social-windows-outline\"></i>\n"); //htmlLine 196:197  groovyLine=243
      __out.print("\n"); //htmlLine 197:198  groovyLine=244
      __out.print("						</div>\n"); //htmlLine 198:199  groovyLine=245
      __out.print("                            <div class=\"services-text-right\">\n"); //htmlLine 199:200  groovyLine=246
      __out.print("\n"); //htmlLine 200:201  groovyLine=247
      __out.print("						<h5>Tooling Provided</h5>\n"); //htmlLine 201:202  groovyLine=248
      __out.print("<p>We provide you with the gradle build files.  We provide you with code coverage, and free \n"); //htmlLine 202:203  groovyLine=249
      __out.print("checking for bad patterns in your code.  We provide you with a build that builds a zip file with \n"); //htmlLine 203:204  groovyLine=250
      __out.print("your app and webserver that you can upload to production.  We provide you with log4jdbc and an \n"); //htmlLine 204:205  groovyLine=251
      __out.print("inmemory database out of the box to see if you have 1+n query issues.  We have clickable \n"); //htmlLine 205:206  groovyLine=252
      __out.print("log statements.</p>\n"); //htmlLine 206:207  groovyLine=253
      __out.print("                            </div>\n"); //htmlLine 207:208  groovyLine=254
      __out.print("                        </div> \n"); //htmlLine 208:209  groovyLine=255
      __out.print("					\n"); //htmlLine 209:210  groovyLine=256
      __out.print("                        <div class=\"services-icon-wrap clearfix\">\n"); //htmlLine 210:211  groovyLine=257
      __out.print("                            <div class=\"left-side-icon\">\n"); //htmlLine 211:212  groovyLine=258
      __out.print("                                <i class=\"ion-ios-reload\"></i>\n"); //htmlLine 212:213  groovyLine=259
      __out.print("\n"); //htmlLine 213:214  groovyLine=260
      __out.print("						</div>\n"); //htmlLine 214:215  groovyLine=261
      __out.print("                            <div class=\"services-text-right\">\n"); //htmlLine 215:216  groovyLine=262
      __out.print("\n"); //htmlLine 216:217  groovyLine=263
      __out.print("						<h5>Feature Testable</h5>\n"); //htmlLine 217:218  groovyLine=264
      __out.print("<p>One of the best hidden gems.  This server is NOT tested with single class tests but instead is tested in terms of what YOU use.  This also has the added benefit that we can refactor to create new features without the drag of needing to change unit tests</p>\n"); //htmlLine 218:219  groovyLine=265
      __out.print("\n"); //htmlLine 219:220  groovyLine=266
      __out.print("                            </div>\n"); //htmlLine 220:221  groovyLine=267
      __out.print("                        </div> \n"); //htmlLine 221:222  groovyLine=268
      __out.print("\n"); //htmlLine 222:223  groovyLine=269
      __out.print("				</div>\n"); //htmlLine 223:224  groovyLine=270
      __out.print("			</div>\n"); //htmlLine 224:225  groovyLine=271
      __out.print("		</div>\n"); //htmlLine 225:226  groovyLine=272
      __out.print("		</div>\n"); //htmlLine 226:227  groovyLine=273
      __out.print("\n"); //htmlLine 227:228  groovyLine=274
      __out.print("	<!-- VIDEO SECTION -->\n"); //htmlLine 228:229  groovyLine=275
      __out.print("	<div id=\"video\" class=\"video-container\">\n"); //htmlLine 229:230  groovyLine=276
      __out.print("		<!--video iframe-->\n"); //htmlLine 230:231  groovyLine=277
      __out.print("		<div class=\"video\">\n"); //htmlLine 231:232  groovyLine=278
      __out.print("			<iframe frameborder=\"0\" height=\"281\" src=\"http://player.vimeo.com/video/163694555?title=0&amp;byline=0&amp;portrait=0&amp;color=ffffff&amp;autoplay=0\" width=\"640\"></iframe>\n"); //htmlLine 232:233  groovyLine=279
      __out.print("		</div>\n"); //htmlLine 233:234  groovyLine=280
      __out.print("	</div>\n"); //htmlLine 234:235  groovyLine=281
      __out.print("	<!-- VIDEO SECTION -->\n"); //htmlLine 235:236  groovyLine=282
      __out.print("\n"); //htmlLine 236:237  groovyLine=283
      __out.print("        <div id=\"portfolio-section\" class=\"portfolio-container\">\n"); //htmlLine 237:238  groovyLine=284
      __out.print("	        <div class=\"container\">\n"); //htmlLine 238:239  groovyLine=285
      __out.print("	            <div class=\"row\">\n"); //htmlLine 239:240  groovyLine=286
      __out.print("	                <div class=\"col-sm-12 portfolio\">\n"); //htmlLine 240:241  groovyLine=287
      __out.print("\n"); //htmlLine 241:242  groovyLine=288
      __out.print("	                    <h3>Portfolio</h3>\n"); //htmlLine 242:243  groovyLine=289
      __out.print("	                    <p>Ut lobortis auctor est, quis ornare orci tristique vel. Pellentesque sit amet ultricies nisl.</p>\n"); //htmlLine 243:244  groovyLine=290
      __out.print("\n"); //htmlLine 244:245  groovyLine=291
      __out.print("	            </div>\n"); //htmlLine 245:246  groovyLine=292
      __out.print("	            </div>\n"); //htmlLine 246:247  groovyLine=293
      __out.print("\n"); //htmlLine 247:248  groovyLine=294
      __out.print("\n"); //htmlLine 248:249  groovyLine=295
      __out.print("\n"); //htmlLine 249:250  groovyLine=296
      __out.print("    <div class=\"clearfix\">\n"); //htmlLine 250:251  groovyLine=297
      __out.print("\n"); //htmlLine 251:252  groovyLine=298
      __out.print("        <div id=\"js-filters-lightbox-gallery2\" class=\"cbp-l-filters-button cbp-l-filters-center\">\n"); //htmlLine 252:253  groovyLine=299
      __out.print("            <div data-filter=\"*\" class=\"cbp-filter-item-active cbp-filter-item\">All</div>\n"); //htmlLine 253:254  groovyLine=300
      __out.print("            <div data-filter=\".graphic\" class=\"cbp-filter-item\">Graphic</div>\n"); //htmlLine 254:255  groovyLine=301
      __out.print("            <div data-filter=\".logos\" class=\"cbp-filter-item\">Logo</div>\n"); //htmlLine 255:256  groovyLine=302
      __out.print("            <div data-filter=\".motion\" class=\"cbp-filter-item\">Motion</div>\n"); //htmlLine 256:257  groovyLine=303
      __out.print("        </div>\n"); //htmlLine 257:258  groovyLine=304
      __out.print("    </div>\n"); //htmlLine 258:259  groovyLine=305
      __out.print("\n"); //htmlLine 259:260  groovyLine=306
      __out.print("    <div id=\"js-grid-lightbox-gallery\" class=\"cbp\">\n"); //htmlLine 260:261  groovyLine=307
      __out.print("        <div class=\"cbp-item web-design graphic print motion\">\n"); //htmlLine 261:262  groovyLine=308
      __out.print("            <a href=\"assets/primesTheme/ajax-lightbox-gallery/project1.html\" class=\"cbp-caption cbp-singlePageInline\" data-title=\"World Clock Widget\" rel=\"nofollow\">\n"); //htmlLine 262:263  groovyLine=309
      __out.print("                <div class=\"cbp-caption-defaultWrap\">\n"); //htmlLine 263:264  groovyLine=310
      __out.print("									<img src=\"assets/primesTheme/assets/img/portfolio/1.jpg\" alt=\"\">\n"); //htmlLine 264:265  groovyLine=311
      __out.print("                </div>\n"); //htmlLine 265:266  groovyLine=312
      __out.print("                <div class=\"cbp-caption-activeWrap\">\n"); //htmlLine 266:267  groovyLine=313
      __out.print("                    <div class=\"cbp-l-caption-alignLeft\">\n"); //htmlLine 267:268  groovyLine=314
      __out.print("                        <div class=\"cbp-l-caption-body\">\n"); //htmlLine 268:269  groovyLine=315
      __out.print("                            <div class=\"cbp-l-caption-title\">World Clock Widget</div>\n"); //htmlLine 269:270  groovyLine=316
      __out.print("                        </div>\n"); //htmlLine 270:271  groovyLine=317
      __out.print("                    </div>\n"); //htmlLine 271:272  groovyLine=318
      __out.print("                </div>\n"); //htmlLine 272:273  groovyLine=319
      __out.print("            </a>\n"); //htmlLine 273:274  groovyLine=320
      __out.print("        </div>\n"); //htmlLine 274:275  groovyLine=321
      __out.print("        <div class=\"cbp-item web-design logos identity graphic\">\n"); //htmlLine 275:276  groovyLine=322
      __out.print("            <a href=\"assets/primesTheme/ajax-lightbox-gallery/project2.html\" class=\"cbp-caption cbp-singlePageInline\" data-title=\"Bolt UI\" rel=\"nofollow\">\n"); //htmlLine 276:277  groovyLine=323
      __out.print("                <div class=\"cbp-caption-defaultWrap\">\n"); //htmlLine 277:278  groovyLine=324
      __out.print("									<img src=\"assets/primesTheme/assets/img/portfolio/2.jpg\" alt=\"\">\n"); //htmlLine 278:279  groovyLine=325
      __out.print("                </div>\n"); //htmlLine 279:280  groovyLine=326
      __out.print("                <div class=\"cbp-caption-activeWrap\">\n"); //htmlLine 280:281  groovyLine=327
      __out.print("                    <div class=\"cbp-l-caption-alignLeft\">\n"); //htmlLine 281:282  groovyLine=328
      __out.print("                        <div class=\"cbp-l-caption-body\">\n"); //htmlLine 282:283  groovyLine=329
      __out.print("                            <div class=\"cbp-l-caption-title\">Bolt UI</div>\n"); //htmlLine 283:284  groovyLine=330
      __out.print("                        </div>\n"); //htmlLine 284:285  groovyLine=331
      __out.print("                    </div>\n"); //htmlLine 285:286  groovyLine=332
      __out.print("                </div>\n"); //htmlLine 286:287  groovyLine=333
      __out.print("            </a>\n"); //htmlLine 287:288  groovyLine=334
      __out.print("        </div>\n"); //htmlLine 288:289  groovyLine=335
      __out.print("        <div class=\"cbp-item graphic print identity\">\n"); //htmlLine 289:290  groovyLine=336
      __out.print("            <a href=\"assets/primesTheme/ajax-lightbox-gallery/project3.html\" class=\"cbp-caption cbp-singlePageInline\" data-title=\"WhereTO App\" rel=\"nofollow\">\n"); //htmlLine 290:291  groovyLine=337
      __out.print("                <div class=\"cbp-caption-defaultWrap\">\n"); //htmlLine 291:292  groovyLine=338
      __out.print("									<img src=\"assets/primesTheme/assets/img/portfolio/3.jpg\" alt=\"\">\n"); //htmlLine 292:293  groovyLine=339
      __out.print("                </div>\n"); //htmlLine 293:294  groovyLine=340
      __out.print("                <div class=\"cbp-caption-activeWrap\">\n"); //htmlLine 294:295  groovyLine=341
      __out.print("                    <div class=\"cbp-l-caption-alignLeft\">\n"); //htmlLine 295:296  groovyLine=342
      __out.print("                        <div class=\"cbp-l-caption-body\">\n"); //htmlLine 296:297  groovyLine=343
      __out.print("                            <div class=\"cbp-l-caption-title\">WhereTO App</div>\n"); //htmlLine 297:298  groovyLine=344
      __out.print("                        </div>\n"); //htmlLine 298:299  groovyLine=345
      __out.print("                    </div>\n"); //htmlLine 299:300  groovyLine=346
      __out.print("                </div>\n"); //htmlLine 300:301  groovyLine=347
      __out.print("            </a>\n"); //htmlLine 301:302  groovyLine=348
      __out.print("        </div>\n"); //htmlLine 302:303  groovyLine=349
      __out.print("        <div class=\"cbp-item web-design motion logos\">\n"); //htmlLine 303:304  groovyLine=350
      __out.print("            <a href=\"assets/primesTheme/ajax-lightbox-gallery/project4.html\" class=\"cbp-caption cbp-singlePageInline\" data-title=\"iDevices\" rel=\"nofollow\">\n"); //htmlLine 304:305  groovyLine=351
      __out.print("                <div class=\"cbp-caption-defaultWrap\">\n"); //htmlLine 305:306  groovyLine=352
      __out.print("									<img src=\"assets/primesTheme/assets/img/portfolio/4.jpg\" alt=\"\">\n"); //htmlLine 306:307  groovyLine=353
      __out.print("                </div>\n"); //htmlLine 307:308  groovyLine=354
      __out.print("                <div class=\"cbp-caption-activeWrap\">\n"); //htmlLine 308:309  groovyLine=355
      __out.print("                    <div class=\"cbp-l-caption-alignLeft\">\n"); //htmlLine 309:310  groovyLine=356
      __out.print("                        <div class=\"cbp-l-caption-body\">\n"); //htmlLine 310:311  groovyLine=357
      __out.print("                            <div class=\"cbp-l-caption-title\">iDevices</div>\n"); //htmlLine 311:312  groovyLine=358
      __out.print("                        </div>\n"); //htmlLine 312:313  groovyLine=359
      __out.print("                    </div>\n"); //htmlLine 313:314  groovyLine=360
      __out.print("                </div>\n"); //htmlLine 314:315  groovyLine=361
      __out.print("            </a>\n"); //htmlLine 315:316  groovyLine=362
      __out.print("        </div>\n"); //htmlLine 316:317  groovyLine=363
      __out.print("        <div class=\"cbp-item identity graphic print\">\n"); //htmlLine 317:318  groovyLine=364
      __out.print("            <a href=\"assets/primesTheme/ajax-lightbox-gallery/project5.html\" class=\"cbp-caption cbp-singlePageInline\" data-title=\"Seemple* Music for iPad\" rel=\"nofollow\">\n"); //htmlLine 318:319  groovyLine=365
      __out.print("                <div class=\"cbp-caption-defaultWrap\">\n"); //htmlLine 319:320  groovyLine=366
      __out.print("									<img src=\"assets/primesTheme/assets/img/portfolio/5.jpg\" alt=\"\">\n"); //htmlLine 320:321  groovyLine=367
      __out.print("                </div>\n"); //htmlLine 321:322  groovyLine=368
      __out.print("                <div class=\"cbp-caption-activeWrap\">\n"); //htmlLine 322:323  groovyLine=369
      __out.print("                    <div class=\"cbp-l-caption-alignLeft\">\n"); //htmlLine 323:324  groovyLine=370
      __out.print("                        <div class=\"cbp-l-caption-body\">\n"); //htmlLine 324:325  groovyLine=371
      __out.print("                            <div class=\"cbp-l-caption-title\">Seemple* Music for iPad</div>\n"); //htmlLine 325:326  groovyLine=372
      __out.print("                        </div>\n"); //htmlLine 326:327  groovyLine=373
      __out.print("                    </div>\n"); //htmlLine 327:328  groovyLine=374
      __out.print("                </div>\n"); //htmlLine 328:329  groovyLine=375
      __out.print("            </a>\n"); //htmlLine 329:330  groovyLine=376
      __out.print("        </div>\n"); //htmlLine 330:331  groovyLine=377
      __out.print("        <div class=\"cbp-item motion print logos web-design\">\n"); //htmlLine 331:332  groovyLine=378
      __out.print("            <a href=\"assets/primesTheme/ajax-lightbox-gallery/project6.html\" class=\"cbp-caption cbp-singlePageInline\" data-title=\"Remind~Me Widget\" rel=\"nofollow\">\n"); //htmlLine 332:333  groovyLine=379
      __out.print("                <div class=\"cbp-caption-defaultWrap\">\n"); //htmlLine 333:334  groovyLine=380
      __out.print("									<img src=\"assets/primesTheme/assets/img/portfolio/6.jpg\" alt=\"\">\n"); //htmlLine 334:335  groovyLine=381
      __out.print("                </div>\n"); //htmlLine 335:336  groovyLine=382
      __out.print("                <div class=\"cbp-caption-activeWrap\">\n"); //htmlLine 336:337  groovyLine=383
      __out.print("                    <div class=\"cbp-l-caption-alignLeft\">\n"); //htmlLine 337:338  groovyLine=384
      __out.print("                        <div class=\"cbp-l-caption-body\">\n"); //htmlLine 338:339  groovyLine=385
      __out.print("                            <div class=\"cbp-l-caption-title\">Remind~Me Widget</div>\n"); //htmlLine 339:340  groovyLine=386
      __out.print("                        </div>\n"); //htmlLine 340:341  groovyLine=387
      __out.print("                    </div>\n"); //htmlLine 341:342  groovyLine=388
      __out.print("                </div>\n"); //htmlLine 342:343  groovyLine=389
      __out.print("            </a>\n"); //htmlLine 343:344  groovyLine=390
      __out.print("        </div>\n"); //htmlLine 344:345  groovyLine=391
      __out.print("        <div class=\"cbp-item graphic logos\">\n"); //htmlLine 345:346  groovyLine=392
      __out.print("            <a href=\"assets/primesTheme/ajax-lightbox-gallery/project7.html\" class=\"cbp-caption cbp-singlePageInline\" data-title=\"Workout Buddy\" rel=\"nofollow\">\n"); //htmlLine 346:347  groovyLine=393
      __out.print("                <div class=\"cbp-caption-defaultWrap\">\n"); //htmlLine 347:348  groovyLine=394
      __out.print("									<img src=\"assets/primesTheme/assets/img/portfolio/7.jpg\" alt=\"\">\n"); //htmlLine 348:349  groovyLine=395
      __out.print("                </div>\n"); //htmlLine 349:350  groovyLine=396
      __out.print("                <div class=\"cbp-caption-activeWrap\">\n"); //htmlLine 350:351  groovyLine=397
      __out.print("                    <div class=\"cbp-l-caption-alignLeft\">\n"); //htmlLine 351:352  groovyLine=398
      __out.print("                        <div class=\"cbp-l-caption-body\">\n"); //htmlLine 352:353  groovyLine=399
      __out.print("                            <div class=\"cbp-l-caption-title\">Workout Buddy</div>\n"); //htmlLine 353:354  groovyLine=400
      __out.print("                        </div>\n"); //htmlLine 354:355  groovyLine=401
      __out.print("                    </div>\n"); //htmlLine 355:356  groovyLine=402
      __out.print("                </div>\n"); //htmlLine 356:357  groovyLine=403
      __out.print("            </a>\n"); //htmlLine 357:358  groovyLine=404
      __out.print("        </div>\n"); //htmlLine 358:359  groovyLine=405
      __out.print("        <div class=\"cbp-item identity print logos motion\">\n"); //htmlLine 359:360  groovyLine=406
      __out.print("            <a href=\"assets/primesTheme/ajax-lightbox-gallery/project8.html\" class=\"cbp-caption cbp-singlePageInline\" data-title=\"Digital Menu\" rel=\"nofollow\">\n"); //htmlLine 360:361  groovyLine=407
      __out.print("                <div class=\"cbp-caption-defaultWrap\">\n"); //htmlLine 361:362  groovyLine=408
      __out.print("									<img src=\"assets/primesTheme/assets/img/portfolio/8.jpg\" alt=\"\">\n"); //htmlLine 362:363  groovyLine=409
      __out.print("                </div>\n"); //htmlLine 363:364  groovyLine=410
      __out.print("                <div class=\"cbp-caption-activeWrap\">\n"); //htmlLine 364:365  groovyLine=411
      __out.print("                    <div class=\"cbp-l-caption-alignLeft\">\n"); //htmlLine 365:366  groovyLine=412
      __out.print("                        <div class=\"cbp-l-caption-body\">\n"); //htmlLine 366:367  groovyLine=413
      __out.print("                            <div class=\"cbp-l-caption-title\">Digital Menu</div>\n"); //htmlLine 367:368  groovyLine=414
      __out.print("                        </div>\n"); //htmlLine 368:369  groovyLine=415
      __out.print("                    </div>\n"); //htmlLine 369:370  groovyLine=416
      __out.print("                </div>\n"); //htmlLine 370:371  groovyLine=417
      __out.print("            </a>\n"); //htmlLine 371:372  groovyLine=418
      __out.print("        </div>\n"); //htmlLine 372:373  groovyLine=419
      __out.print("        <div class=\"cbp-item identity motion web-design\">\n"); //htmlLine 373:374  groovyLine=420
      __out.print("            <a href=\"assets/primesTheme/ajax-lightbox-gallery/project9.html\" class=\"cbp-caption cbp-singlePageInline\" data-title=\"Holiday Selector\" rel=\"nofollow\">\n"); //htmlLine 374:375  groovyLine=421
      __out.print("                <div class=\"cbp-caption-defaultWrap\">\n"); //htmlLine 375:376  groovyLine=422
      __out.print("									<img src=\"assets/primesTheme/assets/img/portfolio/9.jpg\" alt=\"\">\n"); //htmlLine 376:377  groovyLine=423
      __out.print("                </div>\n"); //htmlLine 377:378  groovyLine=424
      __out.print("                <div class=\"cbp-caption-activeWrap\">\n"); //htmlLine 378:379  groovyLine=425
      __out.print("                    <div class=\"cbp-l-caption-alignLeft\">\n"); //htmlLine 379:380  groovyLine=426
      __out.print("                        <div class=\"cbp-l-caption-body\">\n"); //htmlLine 380:381  groovyLine=427
      __out.print("                            <div class=\"cbp-l-caption-title\">Holiday Selector</div>\n"); //htmlLine 381:382  groovyLine=428
      __out.print("                        </div>\n"); //htmlLine 382:383  groovyLine=429
      __out.print("                    </div>\n"); //htmlLine 383:384  groovyLine=430
      __out.print("                </div>\n"); //htmlLine 384:385  groovyLine=431
      __out.print("            </a>\n"); //htmlLine 385:386  groovyLine=432
      __out.print("        </div>\n"); //htmlLine 386:387  groovyLine=433
      __out.print("    </div>\n"); //htmlLine 387:388  groovyLine=434
      __out.print("\n"); //htmlLine 388:389  groovyLine=435
      __out.print("    <div id=\"js-loadMore-lightbox-gallery\" class=\"cbp-l-loadMore-button\">\n"); //htmlLine 389:390  groovyLine=436
      __out.print("        <a href=\"assets/primesTheme/ajax-lightbox-gallery/loadMore.html\" class=\"cbp-l-loadMore-link\" rel=\"nofollow\">\n"); //htmlLine 390:391  groovyLine=437
      __out.print("            <span class=\"cbp-l-loadMore-defaultText\">Load More</span>\n"); //htmlLine 391:392  groovyLine=438
      __out.print("            <span class=\"cbp-l-loadMore-loadingText\">Loading...</span>\n"); //htmlLine 392:393  groovyLine=439
      __out.print("            <span class=\"cbp-l-loadMore-noMoreLoading\">No More Works</span>\n"); //htmlLine 393:394  groovyLine=440
      __out.print("        </a>\n"); //htmlLine 394:395  groovyLine=441
      __out.print("    </div>\n"); //htmlLine 395:396  groovyLine=442
      __out.print("\n"); //htmlLine 396:397  groovyLine=443
      __out.print("    </div>\n"); //htmlLine 397:398  groovyLine=444
      __out.print("\n"); //htmlLine 398:399  groovyLine=445
      __out.print("\n"); //htmlLine 399:400  groovyLine=446
      __out.print("			</div>\n"); //htmlLine 400:401  groovyLine=447
      __out.print("		</div>\n"); //htmlLine 401:402  groovyLine=448
      __out.print("	</div>\n"); //htmlLine 402:403  groovyLine=449
      __out.print("\n"); //htmlLine 403:404  groovyLine=450
      __out.print("\n"); //htmlLine 404:405  groovyLine=451
      __out.print("        <!-- Fact -->\n"); //htmlLine 405:406  groovyLine=452
      __out.print("\n"); //htmlLine 406:407  groovyLine=453
      __out.print("        <div id=\"fact-container\" class=\"fact-container\">\n"); //htmlLine 407:408  groovyLine=454
      __out.print("	        <div class=\"container\">\n"); //htmlLine 408:409  groovyLine=455
      __out.print("            <div class=\"row\">\n"); //htmlLine 409:410  groovyLine=456
      __out.print("	                <div class=\"col-sm-3 fact-box\">\n"); //htmlLine 410:411  groovyLine=457
      __out.print("	                	<div class=\"icon\">\n"); //htmlLine 411:412  groovyLine=458
      __out.print("	                		<i class=\"icon ion-ios-alarm-outline\"></i>\n"); //htmlLine 412:413  groovyLine=459
      __out.print("	                	</div>\n"); //htmlLine 413:414  groovyLine=460
      __out.print("	                    <h4>1754</h4>\n"); //htmlLine 414:415  groovyLine=461
      __out.print("	                    <h5>hours worked</h5>\n"); //htmlLine 415:416  groovyLine=462
      __out.print("\n"); //htmlLine 416:417  groovyLine=463
      __out.print("	                </div>\n"); //htmlLine 417:418  groovyLine=464
      __out.print("	                <div class=\"col-sm-3 fact-box\">\n"); //htmlLine 418:419  groovyLine=465
      __out.print("	                	<div class=\"icon\">\n"); //htmlLine 419:420  groovyLine=466
      __out.print("	                		<i class=\"icon ion-social-dropbox-outline\"></i>\n"); //htmlLine 420:421  groovyLine=467
      __out.print("	                	</div>\n"); //htmlLine 421:422  groovyLine=468
      __out.print("	                    <h4>300</h4>\n"); //htmlLine 422:423  groovyLine=469
      __out.print("	                    <h5>Finished projects</h5>\n"); //htmlLine 423:424  groovyLine=470
      __out.print("\n"); //htmlLine 424:425  groovyLine=471
      __out.print("	                </div>\n"); //htmlLine 425:426  groovyLine=472
      __out.print("	                <div class=\"col-sm-3 fact-box\">\n"); //htmlLine 426:427  groovyLine=473
      __out.print("	                	<div class=\"icon\">\n"); //htmlLine 427:428  groovyLine=474
      __out.print("	                		<i class=\"icon ion-ios-cloud-download-outline\"></i>\n"); //htmlLine 428:429  groovyLine=475
      __out.print("	                	</div>\n"); //htmlLine 429:430  groovyLine=476
      __out.print("	                    <h4>842</h4>\n"); //htmlLine 430:431  groovyLine=477
      __out.print("	                    <h5>downloads</h5>\n"); //htmlLine 431:432  groovyLine=478
      __out.print("\n"); //htmlLine 432:433  groovyLine=479
      __out.print("	                </div>\n"); //htmlLine 433:434  groovyLine=480
      __out.print("	                <div class=\"col-sm-3 fact-box\">\n"); //htmlLine 434:435  groovyLine=481
      __out.print("	                	<div class=\"icon\">\n"); //htmlLine 435:436  groovyLine=482
      __out.print("	                		<i class=\"icon ion-ios-person-outline\"></i>\n"); //htmlLine 436:437  groovyLine=483
      __out.print("	                	</div>\n"); //htmlLine 437:438  groovyLine=484
      __out.print("	                    <h4>910</h4>\n"); //htmlLine 438:439  groovyLine=485
      __out.print("	                    <h5>happy customers</h5>\n"); //htmlLine 439:440  groovyLine=486
      __out.print("\n"); //htmlLine 440:441  groovyLine=487
      __out.print("	                </div>\n"); //htmlLine 441:442  groovyLine=488
      __out.print("</div>\n"); //htmlLine 442:443  groovyLine=489
      __out.print("</div>\n"); //htmlLine 443:444  groovyLine=490
      __out.print("</div>\n"); //htmlLine 444:445  groovyLine=491
      __out.print("</div>\n"); //htmlLine 445:446  groovyLine=492
      __out.print("\n"); //htmlLine 446:447  groovyLine=493
      __out.print("        <!-- Pricing -->\n"); //htmlLine 447:448  groovyLine=494
      __out.print("\n"); //htmlLine 448:449  groovyLine=495
      __out.print("        <div id=\"pricing-section\" class=\"pricing-container\">\n"); //htmlLine 449:450  groovyLine=496
      __out.print("	        <div class=\"container\">\n"); //htmlLine 450:451  groovyLine=497
      __out.print("	            <div class=\"row\">\n"); //htmlLine 451:452  groovyLine=498
      __out.print("	                <div class=\"col-sm-12 pricing\">\n"); //htmlLine 452:453  groovyLine=499
      __out.print("	                    <h3>Choose the package</h3>\n"); //htmlLine 453:454  groovyLine=500
      __out.print("	                    <p>Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.</p>\n"); //htmlLine 454:455  groovyLine=501
      __out.print("				</div>\n"); //htmlLine 455:456  groovyLine=502
      __out.print("			</div>\n"); //htmlLine 456:457  groovyLine=503
      __out.print("			<div class=\"row\">\n"); //htmlLine 457:458  groovyLine=504
      __out.print("				<div class=\"col-md-4 toLeft\">\n"); //htmlLine 458:459  groovyLine=505
      __out.print("					<div class=\"price-column\">\n"); //htmlLine 459:460  groovyLine=506
      __out.print("						<h2>Standard</h2>\n"); //htmlLine 460:461  groovyLine=507
      __out.print("						<h3><span>From</span> \$0<span>.00 per month</span></h3>\n"); //htmlLine 461:462  groovyLine=508
      __out.print("						<ul>\n"); //htmlLine 462:463  groovyLine=509
      __out.print("							<li>Vestibulum est magna</li>\n"); //htmlLine 463:464  groovyLine=510
      __out.print("							<li>Mauris auctor massa libero</li>\n"); //htmlLine 464:465  groovyLine=511
      __out.print("							<li>Praesent magna tortor</li>\n"); //htmlLine 465:466  groovyLine=512
      __out.print("							<li>Cras et fermentum massa</li>\n"); //htmlLine 466:467  groovyLine=513
      __out.print("						<li><button type=\"button\" class=\"btn btn-top btn-lg\">Purchase</button></li>\n"); //htmlLine 467:468  groovyLine=514
      __out.print("						</ul>\n"); //htmlLine 468:469  groovyLine=515
      __out.print("					</div>\n"); //htmlLine 469:470  groovyLine=516
      __out.print("				</div>\n"); //htmlLine 470:471  groovyLine=517
      __out.print("				<div class=\"col-md-4 toIn\">\n"); //htmlLine 471:472  groovyLine=518
      __out.print("					<div class=\"price-column large\">\n"); //htmlLine 472:473  groovyLine=519
      __out.print("						<h2>Premium</h2>\n"); //htmlLine 473:474  groovyLine=520
      __out.print("						<h3><span>From</span> \$0<span>.00 per month</span></h3>\n"); //htmlLine 474:475  groovyLine=521
      __out.print("						<ul>\n"); //htmlLine 475:476  groovyLine=522
      __out.print("							<li>Vestibulum est magna</li>\n"); //htmlLine 476:477  groovyLine=523
      __out.print("							<li>Mauris auctor massa libero</li>\n"); //htmlLine 477:478  groovyLine=524
      __out.print("							<li>Praesent magna tortor</li>\n"); //htmlLine 478:479  groovyLine=525
      __out.print("							<li>Cras et fermentum massa</li>\n"); //htmlLine 479:480  groovyLine=526
      __out.print("						<li><button type=\"button\" class=\"btn btn-top btn-lg\">Purchase</button></li>\n"); //htmlLine 480:481  groovyLine=527
      __out.print("						</ul>\n"); //htmlLine 481:482  groovyLine=528
      __out.print("					</div>\n"); //htmlLine 482:483  groovyLine=529
      __out.print("				</div>\n"); //htmlLine 483:484  groovyLine=530
      __out.print("				<div class=\"col-md-4 toRight\">\n"); //htmlLine 484:485  groovyLine=531
      __out.print("					<div class=\"price-column\">\n"); //htmlLine 485:486  groovyLine=532
      __out.print("						<h2>Ultimate</h2>\n"); //htmlLine 486:487  groovyLine=533
      __out.print("						<h3><span>From</span> \$0<span>.00 per month</span></h3>\n"); //htmlLine 487:488  groovyLine=534
      __out.print("						<ul>\n"); //htmlLine 488:489  groovyLine=535
      __out.print("							<li>Vestibulum est magna</li>\n"); //htmlLine 489:490  groovyLine=536
      __out.print("							<li>Mauris auctor massa libero</li>\n"); //htmlLine 490:491  groovyLine=537
      __out.print("							<li>Praesent magna tortor</li>\n"); //htmlLine 491:492  groovyLine=538
      __out.print("							<li>Cras et fermentum massa</li>\n"); //htmlLine 492:493  groovyLine=539
      __out.print("						<li><button type=\"button\" class=\"btn btn-top btn-lg\">Purchase</button></li>\n"); //htmlLine 493:494  groovyLine=540
      __out.print("						</ul>\n"); //htmlLine 494:495  groovyLine=541
      __out.print("\n"); //htmlLine 495:496  groovyLine=542
      __out.print("					</div>\n"); //htmlLine 496:497  groovyLine=543
      __out.print("				</div>\n"); //htmlLine 497:498  groovyLine=544
      __out.print("			</div>\n"); //htmlLine 498:499  groovyLine=545
      __out.print("			\n"); //htmlLine 499:500  groovyLine=546
      __out.print("					</div>\n"); //htmlLine 500:501  groovyLine=547
      __out.print("	\n"); //htmlLine 501:502  groovyLine=548
      __out.print("		</div>\n"); //htmlLine 502:503  groovyLine=549
      __out.print("\n"); //htmlLine 503:504  groovyLine=550
      __out.print("\n"); //htmlLine 504:505  groovyLine=551
      __out.print("   \n"); //htmlLine 505:506  groovyLine=552
      __out.print("                <!-- Testimonials -->\n"); //htmlLine 506:507  groovyLine=553
      __out.print("        <div class=\"container\">\n"); //htmlLine 507:508  groovyLine=554
      __out.print("            <div class=\"row\">\n"); //htmlLine 508:509  groovyLine=555
      __out.print("                <div class=\"col-sm-12 testimonials\">\n"); //htmlLine 509:510  groovyLine=556
      __out.print("                    <h3>What our customers have to say...</h3>\n"); //htmlLine 510:511  groovyLine=557
      __out.print("\n"); //htmlLine 511:512  groovyLine=558
      __out.print("                    <div class=\"col-md-12 text-center\">\n"); //htmlLine 512:513  groovyLine=559
      __out.print("                        <div id=\"testimonial-carousel\" class=\"owl-carousel owl-spaced\">\n"); //htmlLine 513:514  groovyLine=560
      __out.print("                            <div>\n"); //htmlLine 514:515  groovyLine=561
      __out.print("									<img src=\"assets/primesTheme/assets/img/testimonials/1.jpg\" alt=\"\" class=\"img-responsive img-thumbnail\" />\n"); //htmlLine 515:516  groovyLine=562
      __out.print("\n"); //htmlLine 516:517  groovyLine=563
      __out.print("                                <h4>\n"); //htmlLine 517:518  groovyLine=564
      __out.print("                                    Pellentesque sit amet augue a mi luctus laoreet ut nec velit. Morbi in fermentum elit. Curabitur pellentesque neque eget diam posuere porta. Aliquam imperdiet nulla id scelerisque auctor. Proin egestas mauris vel arcu bibendum ornare. \n"); //htmlLine 518:519  groovyLine=565
      __out.print("                                </h4>\n"); //htmlLine 519:520  groovyLine=566
      __out.print("                                <p>-Diana Rosswert</p>\n"); //htmlLine 520:521  groovyLine=567
      __out.print("                            </div>\n"); //htmlLine 521:522  groovyLine=568
      __out.print("                            <div>\n"); //htmlLine 522:523  groovyLine=569
      __out.print("									<img src=\"assets/primesTheme/assets/img/testimonials/2.jpg\" alt=\"\" class=\"img-responsive img-thumbnail\" />\n"); //htmlLine 523:524  groovyLine=570
      __out.print("\n"); //htmlLine 524:525  groovyLine=571
      __out.print("                                <h4>\n"); //htmlLine 525:526  groovyLine=572
      __out.print("                                    Pellentesque sit amet augue a mi luctus laoreet ut nec velit. Morbi in fermentum elit. Curabitur pellentesque neque eget diam posuere porta. Aliquam imperdiet nulla id scelerisque auctor. Proin egestas mauris vel arcu bibendum ornare. \n"); //htmlLine 526:527  groovyLine=573
      __out.print("                                </h4>\n"); //htmlLine 527:528  groovyLine=574
      __out.print("                                <p>-Diana Rosswert</p>\n"); //htmlLine 528:529  groovyLine=575
      __out.print("                            </div>\n"); //htmlLine 529:530  groovyLine=576
      __out.print("                            <div>\n"); //htmlLine 530:531  groovyLine=577
      __out.print("									<img src=\"assets/primesTheme/assets/img/testimonials/3.jpg\" alt=\"\" class=\"img-responsive img-thumbnail\" />\n"); //htmlLine 531:532  groovyLine=578
      __out.print("\n"); //htmlLine 532:533  groovyLine=579
      __out.print("                                <h4>\n"); //htmlLine 533:534  groovyLine=580
      __out.print("                                    Pellentesque sit amet augue a mi luctus laoreet ut nec velit. Morbi in fermentum elit. Curabitur pellentesque neque eget diam posuere porta. Aliquam imperdiet nulla id scelerisque auctor. Proin egestas mauris vel arcu bibendum ornare. \n"); //htmlLine 534:535  groovyLine=581
      __out.print("                                </h4>\n"); //htmlLine 535:536  groovyLine=582
      __out.print("                                <p>-Diana Rosswert</p>\n"); //htmlLine 536:537  groovyLine=583
      __out.print("                            </div>\n"); //htmlLine 537:538  groovyLine=584
      __out.print("                        </div>\n"); //htmlLine 538:539  groovyLine=585
      __out.print("                    </div>\n"); //htmlLine 539:540  groovyLine=586
      __out.print("                </div>\n"); //htmlLine 540:541  groovyLine=587
      __out.print("            </div>\n"); //htmlLine 541:542  groovyLine=588
      __out.print("            </div>\n"); //htmlLine 542:543  groovyLine=589
      __out.print("\n"); //htmlLine 543:544  groovyLine=590
      __out.print("\n"); //htmlLine 544:545  groovyLine=591
      __out.print("        <!-- Contact us -->\n"); //htmlLine 545:546  groovyLine=592
      __out.print("        <div id=\"contact-section\" class=\"contact-container\">\n"); //htmlLine 546:547  groovyLine=593
      __out.print("\n"); //htmlLine 547:548  groovyLine=594
      __out.print("            <div class=\"inner-contact\">\n"); //htmlLine 548:549  groovyLine=595
      __out.print("        <div class=\"container\">\n"); //htmlLine 549:550  groovyLine=596
      __out.print("            <div class=\"row\">\n"); //htmlLine 550:551  groovyLine=597
      __out.print("                <div class=\"col-sm-12 contact\">\n"); //htmlLine 551:552  groovyLine=598
      __out.print("                    <h3>Contact Us</h3>\n"); //htmlLine 552:553  groovyLine=599
      __out.print("                    <p>\n"); //htmlLine 553:554  groovyLine=600
      __out.print("                    	Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi pharetra odio ac felis iaculis cursus aliquet quis orci. Nunc id lorem ut mi euismod accumsan. \n"); //htmlLine 554:555  groovyLine=601
      __out.print("                    </p>\n"); //htmlLine 555:556  groovyLine=602
      __out.print("                </div>\n"); //htmlLine 556:557  groovyLine=603
      __out.print("            </div>\n"); //htmlLine 557:558  groovyLine=604
      __out.print("            <div class=\"row\">\n"); //htmlLine 558:559  groovyLine=605
      __out.print("                <div class=\"col-sm-7 form-group contact-form\">\n"); //htmlLine 559:560  groovyLine=606
      __out.print("                    <h4>Send Message</h4>\n"); //htmlLine 560:561  groovyLine=607
      __out.print("                    <form method=\"post\" action=\"assets/primesTheme/assets/contact.php\">\n"); //htmlLine 561:562  groovyLine=608
      __out.print("                        <input type=\"text\" name=\"email\" placeholder=\"Email\" class=\"form-control contact-email\">\n"); //htmlLine 562:563  groovyLine=609
      __out.print("                        <input type=\"text\" name=\"subject\" placeholder=\"Subject\" class=\"form-control contact-subject\">\n"); //htmlLine 563:564  groovyLine=610
      __out.print("                        <textarea name=\"message\" class=\"form-control\" placeholder=\"Message\"></textarea>\n"); //htmlLine 564:565  groovyLine=611
      __out.print("                        <button type=\"submit\" class=\"btn btn-contact\">Submit</button>\n"); //htmlLine 565:566  groovyLine=612
      __out.print("                    </form>\n"); //htmlLine 566:567  groovyLine=613
      __out.print("                </div>\n"); //htmlLine 567:568  groovyLine=614
      __out.print("                <div class=\"col-sm-5 contact-address contact-about\">\n"); //htmlLine 568:569  groovyLine=615
      __out.print("                    <h4>About Us</h4>\n"); //htmlLine 569:570  groovyLine=616
      __out.print("                    <p>Fusce at leo eros. Morbi mauris arcu, eleifend sit amet turpis ac, porta luctus neque. Etiam ultricies ac augue a venenatis. Quisque aliquam odio eu magna sodales, vel interdum erat suscipit. Mauris ut porttitor tellus. Integer ac bibendum lectus. Quisque interdum aliquam felis vel volutpat. Vivamus commodo felis quis dui pharetra, ac venenatis magna lacinia. Vestibulum quis dignissim nibh. Duis vitae felis orci. Aliquam porta interdum feugiat. Ut ac varius nibh. Nullam est nisl, sagittis sed risus vel, facilisis commodo tortor. Suspendisse suscipit tellus vitae tellus porta rutrum. Proin ac orci auctor, consequat dolor nec, scelerisque nisl.</p>\n"); //htmlLine 570:571  groovyLine=617
      __out.print("                    <h4>Address</h4>\n"); //htmlLine 571:572  groovyLine=618
      __out.print("                    <p><i class=\"fa fa-map-marker\"></i>13 Brant Street, Burlington, Ontario, Canada</p>\n"); //htmlLine 572:573  groovyLine=619
      __out.print("                    <p><i class=\"fa fa-phone\"></i>Phone: 0011 222 335 7773</p>\n"); //htmlLine 573:574  groovyLine=620
      __out.print("\n"); //htmlLine 574:575  groovyLine=621
      __out.print("                </div>\n"); //htmlLine 575:576  groovyLine=622
      __out.print("            </div>\n"); //htmlLine 576:577  groovyLine=623
      __out.print("          </div>\n"); //htmlLine 577:578  groovyLine=624
      __out.print("        </div>\n"); //htmlLine 578:579  groovyLine=625
      __out.print("        </div>\n"); //htmlLine 579:580  groovyLine=626
      __out.print("\n"); //htmlLine 580:581  groovyLine=627
      __out.print("        \n"); //htmlLine 581:582  groovyLine=628
      __out.print("	<!-- footer -->\n"); //htmlLine 582:583  groovyLine=629
      __out.print("	<div id=\"footer\">\n"); //htmlLine 583:584  groovyLine=630
      __out.print("	<h3>Follow Us!</h3>\n"); //htmlLine 584:585  groovyLine=631
      __out.print("	<p>Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Suspendisse suscipit tellus vitae tellus porta rutrum. Aliquam imperdiet nulla id scelerisque auctor.</p>\n"); //htmlLine 585:586  groovyLine=632
      __out.print("	<div class=\"follow-us\">\n"); //htmlLine 586:587  groovyLine=633
      __out.print("                        <a href=\"#\" class=\"social-icon\"><i class=\"fa fa-facebook\"></i></a>\n"); //htmlLine 587:588  groovyLine=634
      __out.print("                        <a href=\"#\" class=\"social-icon\"><i class=\"fa fa-twitter\"></i></a>\n"); //htmlLine 588:589  groovyLine=635
      __out.print("                        <a href=\"#\" class=\"social-icon\"><i class=\"fa fa-linkedin\"></i></a>\n"); //htmlLine 589:590  groovyLine=636
      __out.print("                        <a href=\"#\" class=\"social-icon\"><i class=\"fa fa-pinterest\"></i></a>\n"); //htmlLine 590:591  groovyLine=637
      __out.print("                        <a href=\"#\" class=\"social-icon\"><i class=\"fa fa-google-plus\"></i></a>\n"); //htmlLine 591:592  groovyLine=638
      __out.print("		</div>\n"); //htmlLine 592:593  groovyLine=639
      __out.print("	</div>\n"); //htmlLine 593:594  groovyLine=640
      __out.print("	<!-- footer 2 -->\n"); //htmlLine 594:595  groovyLine=641
      __out.print("	<div id=\"footer2\">\n"); //htmlLine 595:596  groovyLine=642
      __out.print("		<div class=\"container\">\n"); //htmlLine 596:597  groovyLine=643
      __out.print("			<div class=\"row\">\n"); //htmlLine 597:598  groovyLine=644
      __out.print("				<div class=\"col-sm-12\">\n"); //htmlLine 598:599  groovyLine=645
      __out.print("				<div class=\"copyright\">&copy;primes\n"); //htmlLine 599:600  groovyLine=646
      __out.print("							<script type=\"text/javascript\">\n"); //htmlLine 600:601  groovyLine=647
      __out.print("							//<![CDATA[\n"); //htmlLine 601:602  groovyLine=648
      __out.print("								var d = new Date()\n"); //htmlLine 602:603  groovyLine=649
      __out.print("								document.write(d.getFullYear())\n"); //htmlLine 603:604  groovyLine=650
      __out.print("								//]]>\n"); //htmlLine 604:605  groovyLine=651
      __out.print("								</script>\n"); //htmlLine 605:606  groovyLine=652
      __out.print("							  - <a href=\"http://themebootstrap.net/\">themebootstrap.net</a>\n"); //htmlLine 606:607  groovyLine=653
      __out.print("						</div>\n"); //htmlLine 607:608  groovyLine=654
      __out.print("						</div>\n"); //htmlLine 608:609  groovyLine=655
      __out.print("					</div>\n"); //htmlLine 609:610  groovyLine=656
      __out.print("				</div>\n"); //htmlLine 610:611  groovyLine=657
      __out.print("					</div>\n"); //htmlLine 611:612  groovyLine=658
      __out.print("        \n"); //htmlLine 612:613  groovyLine=659
      __out.print("        <!-- Javascript -->\n"); //htmlLine 613:614  groovyLine=660
      __out.print("        "); //htmlLine 614:614  groovyLine=661
enterExpression('at org.webpieces.app.gui.index.html(index.html:614)'); //htmlLine 614:614  groovyLine=662
_attrs12 = [src:'assets/primesTheme/assets/js/jquery-1.10.2.min.js']; //htmlLine 614:614  groovyLine=663
exitExpression(); //htmlLine 614:614  groovyLine=664

runTag('script', _attrs12, null, 'at org.webpieces.app.gui.index.html(index.html:614)'); //htmlLine 614:614  groovyLine=666

enterExpression('at org.webpieces.app.gui.index.html(index.html:615)'); //htmlLine 615:615  groovyLine=668
_attrs13 = [src:'assets/primesTheme/assets/bootstrap/js/bootstrap.min.js']; //htmlLine 615:615  groovyLine=669
exitExpression(); //htmlLine 615:615  groovyLine=670

runTag('script', _attrs13, null, 'at org.webpieces.app.gui.index.html(index.html:615)'); //htmlLine 615:615  groovyLine=672

enterExpression('at org.webpieces.app.gui.index.html(index.html:617)'); //htmlLine 617:617  groovyLine=674
_attrs14 = [src:'assets/primesTheme/assets/js/jquery.easing.1.3.min.js']; //htmlLine 617:617  groovyLine=675
exitExpression(); //htmlLine 617:617  groovyLine=676

runTag('script', _attrs14, null, 'at org.webpieces.app.gui.index.html(index.html:617)'); //htmlLine 617:617  groovyLine=678

enterExpression('at org.webpieces.app.gui.index.html(index.html:618)'); //htmlLine 618:618  groovyLine=680
_attrs15 = [src:'assets/primesTheme/assets/js/jquery.stellar.min.js']; //htmlLine 618:618  groovyLine=681
exitExpression(); //htmlLine 618:618  groovyLine=682

runTag('script', _attrs15, null, 'at org.webpieces.app.gui.index.html(index.html:618)'); //htmlLine 618:618  groovyLine=684

enterExpression('at org.webpieces.app.gui.index.html(index.html:619)'); //htmlLine 619:619  groovyLine=686
_attrs16 = [src:'assets/primesTheme/assets/owl-carousel/owl.carousel.min.js']; //htmlLine 619:619  groovyLine=687
exitExpression(); //htmlLine 619:619  groovyLine=688

runTag('script', _attrs16, null, 'at org.webpieces.app.gui.index.html(index.html:619)'); //htmlLine 619:619  groovyLine=690

enterExpression('at org.webpieces.app.gui.index.html(index.html:620)'); //htmlLine 620:620  groovyLine=692
_attrs17 = [src:'assets/primesTheme/assets/cubeportfolio/js/jquery.cubeportfolio.min.js']; //htmlLine 620:620  groovyLine=693
exitExpression(); //htmlLine 620:620  groovyLine=694

runTag('script', _attrs17, null, 'at org.webpieces.app.gui.index.html(index.html:620)'); //htmlLine 620:620  groovyLine=696

enterExpression('at org.webpieces.app.gui.index.html(index.html:621)'); //htmlLine 621:621  groovyLine=698
_attrs18 = [src:'assets/primesTheme/assets/js/cube.js']; //htmlLine 621:621  groovyLine=699
exitExpression(); //htmlLine 621:621  groovyLine=700

runTag('script', _attrs18, null, 'at org.webpieces.app.gui.index.html(index.html:621)'); //htmlLine 621:621  groovyLine=702

enterExpression('at org.webpieces.app.gui.index.html(index.html:622)'); //htmlLine 622:622  groovyLine=704
_attrs19 = [src:'assets/primesTheme/assets/js/script.js']; //htmlLine 622:622  groovyLine=705
exitExpression(); //htmlLine 622:622  groovyLine=706

runTag('script', _attrs19, null, 'at org.webpieces.app.gui.index.html(index.html:622)'); //htmlLine 622:622  groovyLine=708

enterExpression('at org.webpieces.app.gui.index.html(index.html:623)'); //htmlLine 623:623  groovyLine=710
_attrs20 = [src:'assets/primesTheme/assets/js/main.js']; //htmlLine 623:623  groovyLine=711
exitExpression(); //htmlLine 623:623  groovyLine=712

runTag('script', _attrs20, null, 'at org.webpieces.app.gui.index.html(index.html:623)'); //htmlLine 623:623  groovyLine=714

      __out.print("    </body>\n"); //htmlLine 625:626  groovyLine=716
      __out.print("\n"); //htmlLine 626:627  groovyLine=717
      __out.print("</html>\n"); //htmlLine 627:628  groovyLine=718
      __out.print("\n"); //htmlLine 628:629  groovyLine=719
      __out.print(""); //htmlLine 629:629  groovyLine=720
    }
  }
}
