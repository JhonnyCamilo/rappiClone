package com.ubosque.deliveryservices.model;

public class Store {

    private Integer id;

    private String name;

    private String direccion;

    private String geolocalizacion;
    
    private Integer telefono ;
    
    private Integer celular ;
    
    private String pagina ;

    private String productos ;
    
    private String logoUrl;
    
    private String foto;

    public Store() {

    }

    public Store(Integer id, String name, String direccion, String geolocalizacion, Integer telefono, Integer celular, String pagina, String productos, String logoUrl, String foto) {
        this.id = id;
        this.name = name;
        this.direccion = direccion;
        this.geolocalizacion = geolocalizacion;
        this.telefono = telefono;
        this.celular = celular;
        this.pagina = pagina;
        this.productos = productos;
        this.logoUrl = logoUrl;
        this.foto = foto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGeolocalizacion() {
        return geolocalizacion;
    }

    public void setGeolocalizacion(String geolocalizacion) {
        this.geolocalizacion = geolocalizacion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    



 
    
 
}
