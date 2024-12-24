package model;

public class Presentacion {
    private int id;
    private String unidad;
    private int cantipacidad; //cantidad/capacidad
    private Articulo articulo;

    public Presentacion(int id, String unidad, int cantipacidad, Articulo articulo) {
        this.id = id;
        this.unidad = unidad;
        this.cantipacidad = cantipacidad;
        this.articulo = articulo;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getUnidad() { return unidad; }
    public void setUnidad(String unidad) { this.unidad = unidad; }
    public int getCantipacidad() { return cantipacidad; }
    public void setCantipacidad(int cantipacidad) { this.cantipacidad = cantipacidad; }
    public Articulo getArticulo() { return articulo; }
}
