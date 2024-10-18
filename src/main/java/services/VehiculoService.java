package services;

import models.Vehiculo;
import repositories.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VehiculoService {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    public List<Vehiculo> getAllVehiculos() {
        return vehiculoRepository.findAll();
    }

    public Vehiculo getVehiculoById(long id) {
        return vehiculoRepository.findById( id).orElse(null);
    }

    public Vehiculo postVehiculo(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    public Vehiculo putVehiculo(long id, Vehiculo vehiculo) {
        Vehiculo existingVehiculo = vehiculoRepository.findById(id).orElse(null);
        if (existingVehiculo != null) {
            existingVehiculo.setMarca(vehiculo.getMarca());
            existingVehiculo.setImagenes(vehiculo.getImagenes());
            existingVehiculo.setModelo(vehiculo.getModelo());
            existingVehiculo.setAnio(vehiculo.getAnio());
            existingVehiculo.setKilometros(vehiculo.getKilometros());
            existingVehiculo.setCombustible(vehiculo.getCombustible());
            existingVehiculo.setMotor(vehiculo.getMotor());
            existingVehiculo.setTransmision(vehiculo.getTransmision());
            existingVehiculo.setSegmento(vehiculo.getSegmento());
            existingVehiculo.setDescripcion(vehiculo.getDescripcion());
            existingVehiculo.setCantidadDePuertas(vehiculo.getCantidadDePuertas());
            return vehiculoRepository.save(existingVehiculo);
        }
        return null;
    }

    public void deleteVehiculo(long id) {
        vehiculoRepository.deleteById(id);
    }
}
