@echo off

:principio
cls
set cantjugador=0
set numeromaximo=21

echo Bienvenido al 21!

:quierescartas
echo Quieres cartas?
set /p decision=Si/No :

if "%decision%" == "Si" (
    goto darcartas
) else if "%decision%" == "No" (
    goto nomascartas
) else (
    echo Por favor pon "Si" o "No"
    goto quierescartas
)

:darcartas
set /a "carta=%random% %% 10 + 1"
echo La carta es %carta%
set /a cantjugador+=carta
set /a "resultadototal=cantjugador"
echo Tu resultado es: %resultadototal%
goto pedircartas

:pedircartas
if %resultadototal% leq %numeromaximo% (
    goto quierescartas
) else (
    goto hasperdido
)

:hasperdido
cls
echo Has perdido!
echo Quieres volver a jugar? Si/No
set /p volver=

if "%volver%" == "Si" (
    goto principio
) else (
    exit
)

:nomascartas
set numerosmaquina=0

echo Te has quedado con %cantjugador%
echo Turno de la maquina
pause
goto cartasdemaquina

:cartasdemaquina
set /a "cartamaquina=%random% %% 10 + 1"
set /a "numerosmaquina+=cartamaquina"
set /a "resultadototalmaquina=numerosmaquina"
goto calculomaquina

:maquinitapierde 
echo La maquina saca %cartamaquina%
echo Su puntuación es de %numerosmaquina%
echo La maquina ha perdido!
goto quieresvolverajugar

:quieresvolverajugar
pause
cls
echo Se ha acabado el juego 
echo ¿Quieres volver a jugar?
set /p Volver=Si/No

if "%volver%" == "Si" (
    cls
    goto principio
) else if "%volver%" == "No" (
    exit
) 

:calculomaquina
if %numerosmaquina% leq %cantjugador% (
    echo La maquina saca %cartamaquina%
    echo Ahora tiene %numerosmaquina%
    goto cartasdemaquina
) else if %numerosmaquina% gtr %numeromaximo% (
    goto maquinitapierde
) else if %numerosmaquina% gtr %cantjugador% (
    echo La maquina tiene %numerosmaquina%
    echo La maquina gana!
    goto quieresvolverajugar
)
