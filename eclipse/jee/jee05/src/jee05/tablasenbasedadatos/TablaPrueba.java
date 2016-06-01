package jee05.tablasenbasedadatos;

import java.util.ArrayList;

public class TablaPrueba{
  private ArrayList<TuplaTablaPrueba> tuplas;
  private boolean convertidaConExito = false;
  
  public TablaPrueba() {
    tuplas = new ArrayList<TuplaTablaPrueba>();
  }
  
  public boolean esConvertidaConExito() {
    return convertidaConExito;
  }
  
  public void setConvertidaConExito(boolean convertidaConExito) {
    this.convertidaConExito = convertidaConExito;
  }
  public boolean guardarTupla(TuplaTablaPrueba tupla) {
    return tuplas.add(tupla);
  }
  
  public TuplaTablaPrueba obtenerTuplaEnIndice(int indice) {
    return tuplas.get(indice);
  }
  
  public int obtenerCantidadDetuplas() {
    return tuplas.size();
  }
}
