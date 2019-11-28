Alumno 1
$ git colne https://github.com/mgi007/miguelg.gi
creamos  repositorio lo clonamos e introducimos el material de trabajo
$ git status

añadimos los archivos
$git add .

$ git commit -m" primer commit"
$ git push

alumno2
$ git colne https://github.com/mgi007/miguelg.g
creamos  repositorio lo clonamos e introducimos el material de trabajo
$ git status

añadimos los archivos
$git add .

$ git commit -m" segundo commit"
$ git push

Alumno 1 
baja los nuevos cambios 
$ git pull https://github.com/mgi007/miguelg.gi
 
y cambia el mismo archivo que el alumno 2 y lo sube

$ git status

$ git add .
$ git commit -m "comit para el conflicto "



Alumno 2

clono el repositorio de la pagina de miguel a mi repositorio local
$ git clone https://github.com/mgi007/miguelg.git
$cd miguelg

dos ficheros implementados/modificados nuevos

$ git status 
faltan por aññadir
$git add .

primer commit
$ git commit -m "rapapapa"

$git push 

buscamos el conflicto modificando ambos a la vez el mismo archivo



nuevos ficheros bajados cambios a local

$ git pull https://github.com/mgi007/miguelg.git

ceamos nueva rama y nos situamos en ella
$ git branch desarrollo

$ git checkout desarrollo

$ git status 

añadimos los nuevos cambios

$ git add .

$ git commit -m "colision resuelta"


$ git push 

encontramos el conflicto 

 ! [rejected]        master -> master (non-fast-forward)
error: failed to push some refs to 'https://github.com/mgi007/miguelg.git'
hint: Updates were rejected because the tip of your current branch is behind
hint: its remote counterpart. Integrate the remote changes (e.g.
hint: 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.

tratamos el problema para solucionarlo 

cambiamos a la rama master

$ git checkout master

$ git add .

merge de la rama para unir cambios
$ git merge desarollo

$ git commit -m "comentando el merge"

$git push https://github.com/mgi007/miguelg.git