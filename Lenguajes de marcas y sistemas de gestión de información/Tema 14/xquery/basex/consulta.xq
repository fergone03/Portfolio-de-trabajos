<html>
  <head>
  <style>
  table&#123;
  background-color:black;
  float:left;
  margin-left: 10%;
  &#125;
  .chonky:nth-child(odd)&#123;
        background-color: rgb(181,207,214);
  
      &#125;
      .chonky:nth-child(even)&#123;
        background-color: rgb(16,140,150);
        
      &#125; 
     .row:nth-child(odd)&#123;
        background-color: rgb(16,140,150);
        color : black;
        text-align:center
      &#125;
      
   .row:nth-child(even)&#123;
      background-color: rgb(181,207,214);
        color : black;
      text-align:center
      &#125;
      .titulo1&#123;
        background-color:rgb(81,76,117);
        color: rgb(255,255,255);
        &#125; 
            .fotolot&#123;
       width:5%;
        &#125;
      td&#123;
        padding: 5px;        
      &#125; 
         .titulo2&#123;
       background-color:rgb(81,76,117);
        color: rgb(255,255,255);
        &#125; 
         .paco&#123;
          width: 25%;
           &#125; 
            #uno&#123;
          background-color: orange;
           &#125; 
                 #X&#123;
          background-color: orange;
           &#125; 
           .furbo&#123;
                 margin-left:-70%;
                 margin-top:5%;
                 
            &#125; 
                 #dos&#123;
          background-color: orange;
           &#125; 
  </style>
  </head>
  <body>
    <div>
    <table>
    <tr> <th colspan = "5" class="titulo1">Resultados de la jornada</th></tr>
    {
    for $x in //evento
    return
    <tr class="chonky">
    <td><img src="{$x/escudoLocal}"/></td>
    <td>{$x/equipolocal}</td>
    <td>{$x/resultadolocal}-{$x/resultadovisitante}</td>
    <td>{$x/equipovisitante}</td>
    <td><img src="{$x/escudoVisitante}"/></td>
    </tr>
    }
    </table>
    </div>   
    <div>
    <table>
    <tr>
    <th colspan="9" class="titulo1"> <img src="estadio.jpeg" style="width: 30%"/>Clasificacion en la jornada 17</th>
    </tr>
    <tr style="background-color:orange">
    <th class="titulo">Equipo</th>
    <th class="titulo">Puntos</th>
    <th class="titulo">PJ</th>
    <th class="titulo">PG</th>
    <th class="titulo">PP</th>
    <th class="titulo">PE</th>
    <th class="titulo">GF</th>
    <th class="titulo">GC</th>
    </tr>
    {
    for $x in //team
    return
    <tr class="row">
    <td>{$x/rank}.{$x/name}</td>
    <td>{$x//points}</td>
    <td>{$x/played}</td>
    <td>{$x/won}</td>
    <td>{$x/lost}</td>
    <td>{$x/drawn}</td>
    <td>{$x/goals_scored}</td>
    <td>{$x/goals_conceded}</td>
    </tr>
    }
    </table>
    </div>
     <div>
    <table class="paco">
    <tr> <th colspan = "9" class="titulo2"> <img src="lot.png" class="fotolot"/>Temporada: 2019_20 Jornada:38</th></tr>
    {
      
        for $x at $i in //evento
        return  
        <tr class="row"> 
          <td>{$i}</td>
          <td><img src="{$x/escudoLocal}"/></td>
          <td>{$x/equipolocal}</td>
          <td>{$x/resultadolocal} - {$x/resultadovisitante}</td>
          <td>{$x/equipovisitante}</td>
          <td><img src="{$x/escudoVisitante}"/></td>
          {
          if ($x/resultadolocal>$x/resultadovisitante) then 
          (<td id="uno">1</td>,
          <td>X</td>,
          <td>2</td>)
          else if ($x/resultadolocal=$x/resultadovisitante) then
          (<td>1</td>,
          <td id="X">X</td>,
          <td>2</td>)
          else if ($x/resultadovisitante>$x/resultadolocal) then
          (<td>1</td>,
          <td>X</td>,
          <td id="dos">2</td>)
        }
        </tr>
         }
    </table>
    </div>
     <img src="futbolista.png" class="furbo"/>
  </body>
</html>