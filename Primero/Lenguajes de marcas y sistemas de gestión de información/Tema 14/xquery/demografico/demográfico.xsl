<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet 
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    version="1.0">
    <xsl:output method="html" indent="yes"/>
    
    <xsl:template match="/datos_demograficos">
        <html>
            <head>
                <title>Demográfico 4.0</title>
                <style>
                    caption{
                    text-shadow: 1px 1px 2px black;
                    
                    }
                    th {
                    border: 1px solid orange;
                    color: red;
                    background-color: yellow;
                    }                    
                    td {
                    border: 2px solid orange;                    
                    background-color: gray;
                    }
                    .blanco {
                    color: white;
                    }
                    .verde {
                    color: green;
                    }
                    .azul {
                    color: blue;
                    }
                    table {
                    border: 2px solid orange;
                    box-shadow: 10px 10px 10px black;
                    }
                </style>
            </head>
            <body>
                <table>
                    <caption>Tabla de población en España</caption>
                    <tr>
                        <th>COMUNIDAD</th>
                        <th>POBLACIÓN</th>
                        <th>HOMBRES</th>
                        <th>MUJERES</th>
                    </tr>
                    <xsl:apply-templates select="pais/comunidad"/>
                </table>
            </body>
        </html>
    </xsl:template>
    
    <xsl:template match="comunidad">
        <tr>
            <td><xsl:value-of select="@nombre"/></td>
            <td>
                <xsl:variable name="poblacion" select="poblacion"/>
                <xsl:choose>
                    <xsl:when test="$poblacion &lt; 300000">
                        <span class="blanco"><xsl:value-of select="$poblacion"/></span>
                    </xsl:when>
                    <xsl:when test="$poblacion &gt;= 300000 and $poblacion &lt;= 500000">
                        <span class="verde"><xsl:value-of select="$poblacion"/></span>
                    </xsl:when>
                    <xsl:otherwise>
                        <span class="azul"><xsl:value-of select="$poblacion"/></span>
                    </xsl:otherwise>
                </xsl:choose>
            </td>
            <td>
                <xsl:variable name="hombres" select="hombres"/>
                <xsl:choose>
                    <xsl:when test="$hombres &lt; 300000">
                        <span class="blanco"><xsl:value-of select="$hombres"/></span>
                    </xsl:when>
                    <xsl:when test="$hombres &gt;= 300000 and $hombres &lt;= 500000">
                        <span class="verde"><xsl:value-of select="$hombres"/></span>
                    </xsl:when>
                    <xsl:otherwise>
                        <span class="azul"><xsl:value-of select="$hombres"/></span>
                    </xsl:otherwise>
                </xsl:choose>             
            </td>
            <td>
                <xsl:variable name="mujeres" select="mujeres"/>
                <xsl:choose>
                    <xsl:when test="$mujeres &lt; 300000">
                        <span class="blanco"><xsl:value-of select="$mujeres"/></span>
                    </xsl:when>
                    <xsl:when test="$mujeres &gt;= 300000 and $mujeres &lt;= 500000">
                        <span class="verde"><xsl:value-of select="$mujeres"/></span>
                    </xsl:when>
                    <xsl:otherwise>
                        <span class="azul"><xsl:value-of select="$mujeres"/></span>
                    </xsl:otherwise>
                </xsl:choose>     
            </td>
        </tr>
    </xsl:template>
</xsl:stylesheet>