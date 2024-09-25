@echo off
if "%~1"=="" goto :error
if "%~2"=="" goto :error
if "%~3"=="" goto :error

set valor1=%~1
set valor2=%~2
set valor3=%~3

echo Comparando valores...
echo.

if "%valor1%"=="%valor2%" (
    echo %valor1% es igual a %valor2%
) else (
    echo %valor1% no es igual a %valor2%
)

if "%valor1%"=="%valor3%" (
    echo %valor1% es igual a %valor3%
) else (
    echo %valor1% no es igual a %valor3%
)

if "%valor2%"=="%valor3%" (
    echo %valor2% es igual a %valor3%
) else (
    echo %valor2% no es igual a %valor3%
)

goto :end

:error
echo Por favor, proporciona tres valores como parámetros.

:end
pause
