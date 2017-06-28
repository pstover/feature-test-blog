@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  featuretestapp startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Add default JVM options here. You can also use JAVA_OPTS and FEATURETESTAPP_OPTS to pass JVM options to this script.
cd %APP_HOME%
echo running from %APP_HOME%
set DEFAULT_JVM_OPTS="-Dlogback.configurationFile=config/logback.xml"

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto init

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto init

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:init
@rem Get command-line arguments, handling Windows variants

if not "%OS%" == "Windows_NT" goto win9xME_args
if "%@eval[2+2]" == "4" goto 4NT_args

:win9xME_args
@rem Slurp the command line arguments.
set CMD_LINE_ARGS=
set _SKIP=2

:win9xME_args_slurp
if "x%~1" == "x" goto execute

set CMD_LINE_ARGS=%*
goto execute

:4NT_args
@rem Get arguments from the 4NT Shell from JP Software
set CMD_LINE_ARGS=%$

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\featuretestapp.jar;%APP_HOME%\lib\javax.inject-1.jar;%APP_HOME%\lib\guice-4.0.jar;%APP_HOME%\lib\slf4j-api-1.7.21.jar;%APP_HOME%\lib\logback-classic-1.1.7.jar;%APP_HOME%\lib\http-webserver-1.9.80.jar;%APP_HOME%\lib\hibernate-plugin-1.9.80.jar;%APP_HOME%\lib\json-jackson-plugin-1.9.80.jar;%APP_HOME%\lib\h2-1.4.192.jar;%APP_HOME%\lib\commons-lang3-3.5.jar;%APP_HOME%\lib\aopalliance-1.0.jar;%APP_HOME%\lib\guava-16.0.1.jar;%APP_HOME%\lib\logback-core-1.1.7.jar;%APP_HOME%\lib\joda-time-2.9.4.jar;%APP_HOME%\lib\http-frontend2-1.9.80.jar;%APP_HOME%\lib\http-templating-1.9.80.jar;%APP_HOME%\lib\http-router-1.9.80.jar;%APP_HOME%\lib\hibernate-core-5.2.3.Final.jar;%APP_HOME%\lib\log4jdbc-1.2.jar;%APP_HOME%\lib\jackson-mapper-asl-1.9.13.jar;%APP_HOME%\lib\http1_1-parser-1.9.80.jar;%APP_HOME%\lib\core-asyncserver-1.9.80.jar;%APP_HOME%\lib\http2-engine-1.9.80.jar;%APP_HOME%\lib\http2-translations-1.9.80.jar;%APP_HOME%\lib\groovy-all-2.4.6.jar;%APP_HOME%\lib\commons-beanutils-1.9.2.jar;%APP_HOME%\lib\core-util-1.9.80.jar;%APP_HOME%\lib\http-shared-1.9.80.jar;%APP_HOME%\lib\guice-multibindings-4.0.jar;%APP_HOME%\lib\core-datawrapper-1.9.80.jar;%APP_HOME%\lib\jboss-logging-3.3.0.Final.jar;%APP_HOME%\lib\hibernate-jpa-2.1-api-1.0.0.Final.jar;%APP_HOME%\lib\javassist-3.20.0-GA.jar;%APP_HOME%\lib\antlr-2.7.7.jar;%APP_HOME%\lib\geronimo-jta_1.1_spec-1.1.1.jar;%APP_HOME%\lib\jandex-2.0.0.Final.jar;%APP_HOME%\lib\classmate-1.3.0.jar;%APP_HOME%\lib\dom4j-1.6.1.jar;%APP_HOME%\lib\hibernate-commons-annotations-5.0.1.Final.jar;%APP_HOME%\lib\cdi-api-1.1.jar;%APP_HOME%\lib\jackson-core-asl-1.9.13.jar;%APP_HOME%\lib\core-channelmanager2-1.9.80.jar;%APP_HOME%\lib\http2-hpack-1.9.80.jar;%APP_HOME%\lib\core-statemachine-1.9.80.jar;%APP_HOME%\lib\commons-logging-1.1.1.jar;%APP_HOME%\lib\commons-collections-3.2.1.jar;%APP_HOME%\lib\el-api-2.2.jar;%APP_HOME%\lib\jboss-interceptors-api_1.1_spec-1.0.0.Beta1.jar;%APP_HOME%\lib\jsr250-api-1.0.jar;%APP_HOME%\lib\metrics-core-3.1.0.jar;%APP_HOME%\lib\core-ssl-1.9.80.jar;%APP_HOME%\lib\hpack-v1.0.1.jar;%APP_HOME%\lib\http2-parser-1.9.80.jar

@rem Execute featuretestapp
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %FEATURETESTAPP_OPTS%  -classpath "%CLASSPATH%" org.webpieces.app.Server %CMD_LINE_ARGS%

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable FEATURETESTAPP_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%FEATURETESTAPP_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
