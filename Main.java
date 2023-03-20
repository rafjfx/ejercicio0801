public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(20);
        persona.setNombre("JOSE");
        persona.setTelefono("12345678");
        System.out.println(
                "Nombre: "+persona.getNombre()+
                " Edad: "+persona.getEdad()+
                " Tel: "+persona.getTelefono());
    }
}
class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

}