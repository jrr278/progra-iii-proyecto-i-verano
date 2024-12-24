package model;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    // definicion de la clase
    //atributos
    private String id;
    private String nombre;
    private String descripcion;
    private List<Subcategoria> subcategorias;

    //metodos
    public Categoria(String id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.subcategorias = new ArrayList<>(); //lista tipo arreglo
    }

    //getters y setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public List<Subcategoria> getSubcategorias() { return subcategorias; }

    public void agregarSubcategoria(Subcategoria subcategoria) {
        this.subcategorias.add(subcategoria);
    }

    public boolean eliminarCategoria(){
        return subcategorias.isEmpty();
    }
}
