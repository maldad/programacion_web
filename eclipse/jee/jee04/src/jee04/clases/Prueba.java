package jee04.clases;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jee04.utilidades.Conversion;
import jee04.utilidades.Log;
import jee04.utilidades.ParametroHttp;

public final class Prueba {
    public static final void metodoPorDefault(HttpServletRequest request, 
    		HttpServletResponse response){
         Log.println("Prueba.metodoPorDefault()  HEY THERE!");
    }

    public static final void validaciones(HttpServletRequest request, 
    		HttpServletResponse response){
       Log.println("Prueba.validaciones()", "VALIDACIONES!"); 

       //Log.println("llave1 es >" + ParametroHttp.deGET(request, "llave1") + "<");
       String llave1 = ParametroHttp.deGET(request, "llave1");
       String llave2 = ParametroHttp.deGET(request, "llave2");
       //cuando se quiere asignar algun parametro por default
       int x = Conversion.deStringAint(llave1, 100);
       boolean y = Conversion.deStringAboolean(llave2);
       Log.println("x es",">" + x + "<");
       Log.println("y es",">" + y + "<");
    }
}
