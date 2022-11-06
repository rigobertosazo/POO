
package poo;


public class Main {
   
    public static void main(String[] args) 
    {
         //Instanciando la clase Persona
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        
        persona1.nombre = "Juan Lopez";
        persona1.telefono = 57845875;
        persona1.mostrarDatos();
        
        System.out.println("----------------------------");
        
        persona2.nombre = "Javier Garcia";
        persona2.telefono = 47745875;
        persona2.mostrarDatos();
    }   
}
