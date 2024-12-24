package model;

import java.util.ArrayList;
import java.util.List;

public class Subcategoria {
    private String id;
    private String nombre;
    private String descripcion;
    private Categoria categoria;
    private List<Articulo> articulos;

    public Subcategoria(String id, String nombre, String descripcion, Categoria categoria) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.articulos = new ArrayList<>();
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public Categoria getCategoria() { return categoria; }
    public List<Articulo> getArticulos() { return articulos; }

    public void agregarArticulo(Articulo articulo) {
        this.articulos.add(articulo);
    }

    public boolean eliminarSubcategoria(){
        return articulos.isEmpty();
    }
}
