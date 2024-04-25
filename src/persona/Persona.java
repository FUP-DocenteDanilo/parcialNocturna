
package persona;


public class Persona {

    //Declarar los atributos Clase Persona
    private String nombre;
    private int edad;
    private String nacionalidad;

    public Persona(String nombre, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
    
    public void Presentarse(){
        System.out.println("Soy "+nombre+ ", tengo "+edad+" años y vivo en "+nacionalidad);
    
    }
    public static void main(String[] args) {
        // Instanciar la Clase Persona
        Persona persona = new Persona("Pepito",38,"Colombia");
        Persona persona1 = new Persona("Pedro",18,"Argentina");
        persona.Presentarse();
        persona1.Presentarse();
    }
    
}
