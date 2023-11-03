@echo off
chcp 65001 > nul
cls
echo Este es el juego del 21
echo ¿Quieres cartas?
set /a "puntuacion=0"

set /p respuesta=

if /i "%respuesta%"=="si" (
    :buclejugador
    set /a "carta=%random% %% 10 + 1"
    echo Sacaste una carta con valor %carta%.
    set /a "puntuacion+=carta"
    echo Tu puntuación actual es: %puntuacion%

    if %puntuacion% gtr 21 (
        echo ¡Te has pasado de 21! Has perdido.
        goto fin
    ) else (
        echo ¿Quieres otra carta?
        set /p respuesta=
        if /i "%respuesta%"=="si" (
            goto buclejugador
        ) else if /i "%respuesta%"=="no" (
            echo Has decidido no jugar. Tu puntuación es: %puntuacion%
            goto fin
        ) else (
            echo Respuesta no válida. Debes responder "si" o "no".
            goto fin
        )
    }
) else if /i "%respuesta%"=="no" (
    echo Has decidido no jugar. Tu puntuación es: %puntuacion%
    goto fin
) else (
    echo Respuesta no válida. Debes responder "si" o "no".
    goto fin
)

:fin
echo Gracias por jugar. Tu puntuación final es: %puntuacion%
