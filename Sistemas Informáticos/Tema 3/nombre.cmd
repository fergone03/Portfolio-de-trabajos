@echo off
title nombre
echo Dime tu nombre
set /p nom= 
echo.
echo Tu nombre es %nom%
echo.
echo Dime tu edad
set /p edad=
echo Dime la edad de jubilacion
set /p jubilacion=
set /a calculo=%jubilacion%-%edad%
echo te queda para jubilarte %calculo% anos.
pause
