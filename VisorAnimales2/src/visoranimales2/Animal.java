/*
    Joaquin Montero. 2 DAM. DI --> T3 AppVisorAnimales
    Lista de animales con "ListView", al pulsar sobre texto
    de un animal despliega la imagen de dicho animal.
    En lugar de mostrar una representación del String de Animales (es decir, su nombre)
    mostrará una imagen.
 */

package visoranimales2;

/**
 *
 * @author joaquin
 */
public class Animal 
{
    // Atributos
    private String nombre;  // Nombre de animal
    private String imagenMiniatura; // Ruta a la imagen en miniatura del animal
    private String imagenGrande;  // Ruta a la imagen grande del animal.
    
    
    // Constructores ( 3 parametros )  
    public Animal( String nombre, String imagenMiniatura, String imagenGrande )
    {
        this.nombre = nombre;
        this.imagenMiniatura = imagenMiniatura;
        this.imagenGrande = imagenGrande;
    }
    
    // Getter y Setter creados automaticamente por NetBeans como dice enunciado
public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagenMiniatura() {
        return imagenMiniatura;
    }

    public void setImagenMiniatura(String imagenMiniatura) {
        this.imagenMiniatura = imagenMiniatura;
    }

    public String getImagenGrande() {
        return imagenGrande;
    }

    public void setImagenGrande(String imagenGrande) {
        this.imagenGrande = imagenGrande;
    }
    
    // Metodo toString
    @Override
    public String toString() {
        return nombre;
    }
      
    
}
