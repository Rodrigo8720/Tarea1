public class Contador
{
  String Nombre;
  int edad;
  String sexo;
  String Profesion;
  String Cargo;
  
 public Contador(){
     this.Nombre = Nombre;
     this.edad = edad;
     this.sexo = sexo;
     this.Profesion = Profesion;
     this.Cargo = Cargo;
    }
 public String Saludar(){
      Nombre = "rodrigo luis";
      Cargo = "directro financiero";
      String Saludar;
      
      Saludar = "Hola mi nombre es " + Nombre + " y soy el " + Cargo;
      
      return Saludar;
    }

    
 public int Sumar(int Num1, int Num2){
     int Sumar;
     
     Sumar = Num1 + Num2;
     
     return Sumar;
    }
    public int Restar(int Num1, int Num2){
     int Restar;
     
    Restar = Num1 - Num2;
      
     return Restar;
    }
    public int Multiplicar(int Num1, int Num2){
     int Multiplicar;
     
     Multiplicar = Num1 * Num2;
      
     return Multiplicar;
    }
    public int Dividir(int Num1, int Num2){
     int Dividir;
     
     Dividir = Num1 / Num2;
      
     return Dividir;
    }
}
