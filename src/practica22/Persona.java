package practica22;

/* @author tavohm */
public class Persona {
  // atributos
  private String nombre;
  private String apellido;
  private double peso;
  private double estatura;
  private int edad;
  
  // constructores
  public Persona(){}
  
  public Persona(String nom, String ap, double peso, double estatura){
    this.nombre=nom;
    this.apellido=ap;
    this.peso=peso;
    this.estatura=estatura;
  }
  
  public Persona(String nom, String ap){
    this.nombre=nom;
    this.apellido=ap;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public double getEstatura() {
    return estatura;
  }

  public void setEstatura(double estatura) {
    this.estatura = estatura;
  }

  public int getEdad(int año) {
    return this.edad=2019-año;
  }

  @Override
  public String toString() {
    return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", peso=" + peso + ", estatura=" + estatura + ", edad=" + edad + '}';
  }
 

}
