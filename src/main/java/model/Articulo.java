package model;

import java.util.ArrayList;
import java.util.List;

public class Articulo {
    private String id;
    private String marca;
    private String nombre;
    private String descripcion;
    private List<Presentacion> presentaciones;
    private Subcategoria subcategoria;

    public Articulo(String id, String marca, String nombre, String descripcion, Subcategoria subcategoria) {
        this.id = id;
        this.marca = marca;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.subcategoria = subcategoria;
        this.presentaciones = new ArrayList<>();
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public List<Presentacion> getPresentaciones() { return presentaciones; }
    public Subcategoria getSubcategoria() { return subcategoria; }

    public void agregarPresentacion(Presentacion presentacion) {
        this.presentaciones.add(presentacion);
    }

    public boolean eliminarArticulo(){
        return presentaciones.isEmpty();
    }

}
