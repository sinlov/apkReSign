@echo off
set PATH=%CD%;%PATH%;
java -jar "%~dp0\ResignAPK-release-1.2.2.jar" %1 %2
