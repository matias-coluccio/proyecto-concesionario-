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
    String color;  // Campo agregado para el color

    public Vehiculo() {
    }

    public Vehiculo(long idVehiculo, String imagenes, String marca, String modelo, int anio, int kilometros, String combustible, String motor, String transmision, String segmento, String descripcion, int cantidadDePuertas, String color) {
        this.idVehiculo = idVehiculo;
        this.imagenes = imagenes;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometros = kilometros;
        this.combustible = combustible;
        this.motor = motor;
        this.transmision = transmision;
        this.segmento = segmento;
        this.descripcion = descripcion;
        this.cantidadDePuertas = cantidadDePuertas;
        this.color = color;
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
}
