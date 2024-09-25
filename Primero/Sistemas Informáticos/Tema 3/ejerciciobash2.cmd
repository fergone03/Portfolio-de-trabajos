@echo off
COLOR 07

REM Verificar si se proporcionan dos parámetros
if "%1"=="" (
    echo Error: Falta la extensión del archivo.
    goto :fin
)

if "%2"=="" (
    echo Error: Falta el nombre del directorio.
    goto :fin
)

REM Obtener parámetros
set "extension=%1"
set "nombre_directorio=%2"

REM Listar archivos con la extensión indicada
echo Listando archivos con la extensión %extension%:
dir *.%extension%

REM Crear el directorio
md "%nombre_directorio%"

REM Copiar archivos al directorio creado
echo Copiando archivos al directorio %nombre_directorio%:
xcopy *.%extension% "%nombre_directorio%"

REM Listar archivos copiados y exportar a listar.txt
echo Listando archivos copiados:
dir "%nombre_directorio%" > listar.txt

REM Mostrar listar.txt
echo Contenido de listar.txt:
type listar.txt

REM Ir al directorio de partida y mostrar el árbol de directorios
cd ..
echo Árbol de directorios con la opción /F:
tree /F

:fin
