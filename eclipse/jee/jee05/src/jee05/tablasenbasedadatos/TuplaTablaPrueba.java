package jee05.tablasenbasedadatos;

public class TuplaTablaPrueba {
  private boolean convertidoConExito = false;
  private int id;
  private String a;
  private String b;
  private String c;
  private int d;
  private boolean e;
  private char f;
  
  public TuplaTablaPrueba() {
  }

  public boolean esConvertidoConExito() {
    return convertidoConExito;
  }

  public void setConvertidoConExito(boolean convertidoConExito) {
    this.convertidoConExito = convertidoConExito;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getA() {
    return a;
  }

  public void setA(String a) {
    this.a = a;
  }

  public String getB() {
    return b;
  }

  public void setB(String b) {
    this.b = b;
  }

  public String getC() {
    return c;
  }

  public void setC(String c) {
    this.c = c;
  }

  public int getD() {
    return d;
  }

  public void setD(int d) {
    this.d = d;
  }

  public boolean isE() {
    return e;
  }

  public void setE(boolean e) {
    this.e = e;
  }

  public char getF() {
    return f;
  }

  public void setF(char f) {
    this.f = f;
  }
}
