@echo off
title Calculadora

:menu
cls
echo ****************************************
echo **                                    **
echo **      CALCULADORA PERSONAL 	      **
echo **                                    **
echo ****************************************
echo .
echo .
echo ****************MENU********************
echo ****************************************
echo ** 1. Suma                            ** 
echo ** 2. Resta                           ** 
echo ** 3. Multiplicacion                  ** 
echo ** 4. Division                        ** 
echo ** 5. Datos del programador           ** 
echo ** 6. Abrir Google                    ** 
echo ** 7. Salir                          ** 
echo ****************************************
echo ****************************************
set /p opcion=Seleccione una opcion (1-7):

if "%opcion%"=="1" goto suma
if "%opcion%"=="2" goto resta
if "%opcion%"=="3" goto multiplicacion
if "%opcion%"=="4" goto division
if "%opcion%"=="5" goto creditos
if "%opcion%"=="6" goto abrir_google
if "%opcion%"=="7" goto salir

echo Opcion no valida. Por favor, seleccione una opcion valida.
pause
goto menu

:suma
cls
echo *******************
echo **     SUMAR     **
echo *******************
set /p num1=Ingrese el primer número: 
set /p num2=Ingrese el segundo número: 
set /a resultado=%num1%+%num2%
echo Resultado: %resultado%
pause
goto menu

:resta
cls
echo *******************
echo **     RESTAR    **
echo *******************
set /p num1=Ingrese el primer número: 
set /p num2=Ingrese el segundo número: 
set /a resultado=%num1%-%num2%
echo Resultado: %resultado%
pause
goto menu

:multiplicacion
cls
echo ***************************
echo **    MULTIPLICACION    **
echo ***************************
set /p num1=Ingrese el primer número: 
set /p num2=Ingrese el segundo número: 
set /a resultado=%num1%*%num2%
echo Resultado: %resultado%
pause
goto menu

:division
cls
echo ***********************
echo **     DIVISION      **
echo ***********************
set /p num1=Ingrese el numerador: 
set /p num2=Ingrese el denominador: 
set /a resultado=%num1%/%num2%
echo Resultado: %resultado%
pause
goto menu

:creditos
cls
echo Datos del programador
echo **********************************
echo Nombre: Esteban Fernandez Gonzalez
echo Email: jfg0010@alu.medac.es
echo **********************************
pause
goto menu

:abrir_google
cls
echo Abriendo Google en 5 segundos...
timeout /t 5 >nul
start  "www.google.es"
echo Google abierto. Presione una tecla para continuar.
pause
goto menu

:salir
cls
echo Gracias por usar la calculadora.
pause
