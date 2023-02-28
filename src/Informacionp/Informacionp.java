
package Informacion;

/**
 *
 * @author samuel0rtiz
 * 
 * programa java
 */

public class Informacionp{

    String nombre = "Samue",
           apellido_paterno = "Oritz",
           apellido_materno = "Martinez";
    int numero_de_cuenta = 2271083;
    String semestre_en_el_que_curso = "2do";
    String hobbies = "Tocar trompeta";
    int edad= 18;
    String fecha_nacimiento="18/05/2004";
    
    
    public void Informacion(){        
        System.out.println("El nombre completo de la persona es: " + nombre +" "+ apellido_paterno +" "+ apellido_materno );
        System.out.println("Su edad es: " + edad +" años ");
        System.out.println("Su fecha de nacimiento es: " + fecha_nacimiento);
        System.out.println("Su pasatiempo es: " + hobbies);
        System.out.println("Semestre que alcualmente cursa"+semestre_en_el_que_curso);
        System.out.println("El numero de cuenta del alunmno es :"+numero_de_cuenta);
    }
    
    public static void main(String[] args) {
        Informacionp informacion= new Informacionp();
        informacion.Informacion();
                
    }   
}
