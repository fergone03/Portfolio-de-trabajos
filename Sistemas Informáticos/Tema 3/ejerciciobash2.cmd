@echo off
COLOR 07
Dir * cmd
md Daw
xcopy * cmd Daw
CD Daw
Dir * cmd > listas.txt
cd ..
TREE /F
