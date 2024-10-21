package mappers;

import DTO.VehiculoDTO;
import models.Vehiculo;

public class VehiculoMapper {

    public static VehiculoDTO toDTO(Vehiculo vehiculo) {
        VehiculoDTO dto = new VehiculoDTO();
        dto.setIdVehiculo(vehiculo.getIdVehiculo());
        dto.setImagenes(vehiculo.getImagenes());
        dto.setMarca(vehiculo.getMarca());
        dto.setModelo(vehiculo.getModelo());
        dto.setAnio(vehiculo.getAnio());
        dto.setKilometros(vehiculo.getKilometros());
        dto.setCombustible(vehiculo.getCombustible());
        dto.setMotor(vehiculo.getMotor());
        dto.setTransmision(vehiculo.getTransmision());
        dto.setSegmento(vehiculo.getSegmento());
        dto.setDescripcion(vehiculo.getDescripcion());
        dto.setCantidadDePuertas(vehiculo.getCantidadDePuertas());
        dto.setColor(vehiculo.getColor());
        dto.setTipo(vehiculo.getTipo());
        dto.setPrecio(vehiculo.getPrecio());
        dto.setTraccion(vehiculo.getTraccion());
        dto.setPotencia(vehiculo.getPotencia());
        return dto;
    }

    public static Vehiculo toEntity(VehiculoDTO dto) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setIdVehiculo(dto.getIdVehiculo());
        vehiculo.setImagenes(dto.getImagenes());
        vehiculo.setMarca(dto.getMarca());
        vehiculo.setModelo(dto.getModelo());
        vehiculo.setAnio(dto.getAnio());
        vehiculo.setKilometros(dto.getKilometros());
        vehiculo.setCombustible(dto.getCombustible());
        vehiculo.setMotor(dto.getMotor());
        vehiculo.setTransmision(dto.getTransmision());
        vehiculo.setSegmento(dto.getSegmento());
        vehiculo.setDescripcion(dto.getDescripcion());
        vehiculo.setCantidadDePuertas(dto.getCantidadDePuertas());
        vehiculo.setColor(dto.getColor());
        vehiculo.setTipo(dto.getTipo());
        vehiculo.setPrecio(dto.getPrecio());
        vehiculo.setTraccion(dto.getTraccion());
        vehiculo.setPotencia(dto.getPotencia());
        return vehiculo;
    }
}
