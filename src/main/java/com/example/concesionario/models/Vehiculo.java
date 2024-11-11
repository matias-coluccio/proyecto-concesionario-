package com.example.concesionario.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import jakarta.validation.constraints.NotNull;
@Table(name = "vehiculos")
@Entity
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vehiculo")
    private long idVehiculo;

    @Column(name = "imagenes", nullable = false)
    @NotNull
    private String imagenes;

    @Column(name = "marca", length = 100, nullable = false)
    @Size(max = 100)
    @NotNull
    private String marca;

    @Column(name = "modelo", length = 100, nullable = false)
    @NotNull
    private String modelo;

    @Column(name = "anio", nullable = false)
    @Min(1900)
    @NotNull
    private int anio;

    @Column(name = "kilometros", nullable = false)
    @Min(0)
    @NotNull
    private int kilometros;

    @Column(name = "combustible", length = 100, nullable = false)
    @NotNull
    private String combustible;

    @Column(name = "motor", length = 100, nullable = false)
    @NotNull
    private String motor;

    @Column(name = "transmision", length = 100, nullable = false)
    @NotNull
    private String transmision;

    @Column(name = "segmento", length = 100, nullable = false)
    @NotNull
    private String segmento;

    @Column(name = "descripcion", length = 500, nullable = false)
    @NotNull
    private String descripcion;

    @Column(name = "cantidadDePuertas", nullable = false)
    @Min(0)
    @Max(5)
    @NotNull
    private int cantidadDePuertas;

    @Column(name = "color", length = 100, nullable = false)
    @NotNull
    private String color;

    @Column(name = "tipo", length = 100, nullable = false)
    @NotNull
    private String tipo; // usado o nuevo

    @Column(name = "precio", nullable = false)
    @Min(0)
    @NotNull
    private long precio;

    @Column(name = "traccion", length = 100, nullable = false)
    @NotNull
    private String traccion; // delantera, trasera o 4x4

    @Column(name = "potencia", length = 100, nullable = false)
    @NotNull
    private String potencia;
// 200 cv


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
