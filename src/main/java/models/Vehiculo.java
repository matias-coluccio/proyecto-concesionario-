package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
public class Vehiculo {
    @Id
    long idVehiculo;

    @NotNull
    String imagenes;

    @Size(max = 50)
    String marca;

    @NotNull
    String modelo;

    @Min(1900)
    @Max(2024)
    int anio;

    @Min(0)
    int kilometros;

    @NotNull
    String combustible;

    @NotNull
    String motor;

    @NotNull
    String transmision;

    @NotNull
    String segmento;

    @NotNull
    String descripcion;

    @Min(2)
    @Max(5)
    int cantidadDePuertas;

    @NotNull
    String color;

    @NotNull
    String tipo; // usado o nuevo

    @Min(0)
    long precio;

    @NotNull
    String traccion; // delantera trasera o 4x4

    @NotNull
    String potencia; // 200 cv

    public Vehiculo() {
    }

    public Vehiculo(int anio, int cantidadDePuertas, String color, String combustible, String descripcion, long idVehiculo, String imagenes, int kilometros, String marca, String modelo, String motor, String potencia, long precio, String segmento, String tipo, String traccion, String transmision) {
        this.anio = anio;
        this.cantidadDePuertas = cantidadDePuertas;
        this.color = color;
        this.combustible = combustible;
        this.descripcion = descripcion;
        this.idVehiculo = idVehiculo;
        this.imagenes = imagenes;
        this.kilometros = kilometros;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.potencia = potencia;
        this.precio = precio;
        this.segmento = segmento;
        this.tipo = tipo;
        this.traccion = traccion;
        this.transmision = transmision;
    }

    // Getters y setters

    public long getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(long idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getImagenes() {
        return imagenes;
    }

    public void setImagenes(String imagenes) {
        this.imagenes = imagenes;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidadDePuertas() {
        return cantidadDePuertas;
    }

    public void setCantidadDePuertas(int cantidadDePuertas) {
        this.cantidadDePuertas = cantidadDePuertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }
}
