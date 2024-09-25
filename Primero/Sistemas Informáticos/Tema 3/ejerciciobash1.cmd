@echo off
COLOR 07
echo CREAMOS UN ARCHIVO POR LOTES PARA CALCULAR LA MEDIA DE 2 O MÁS NÚMEROS
pause

:principal
set /p num=INTRODUCE LA CANTIDAD DE NÚMEROS PARA CALCULAR LA MEDIA:
set /a contador=0
set /a acumula=0
set /a numero=0

if %num% lss 2 (goto error) else (goto continua)

:continua
set /a contador+=1
set /p numero=INTRODUCE EL NÚMERO %contador%: 
set /a acumula+=numero

if %contador% lss %num% goto continua else goto calculo

:calculo
CLS
set /a resultado=%acumula% / %num%
set /a resto=%acumula% %% %num%
set /a decimal=(%acumula% - resultado * num) * 10
COLOR 07
echo =====================================
echo = EL RESULTADO ES %resultado%,%decimal% =
echo =====================================
echo.
echo.
goto salida

:error
CLS
@echo TENÍAS QUE INTRODUCIR 2 O MÁS NÚMEROS
goto principal

:salida
@echo PULSA UNA TECLA PARA SALIR
PAUSE > nul
exit
