package services;

import DTO.VehiculoDTO;
import models.Vehiculo;
import mappers.VehiculoMapper;
import repositories.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import exceptions.VehiculoNotFoundException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VehiculoService {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    public List<VehiculoDTO> getAllVehiculos() {
        return vehiculoRepository.findAll().stream()
                .map(VehiculoMapper::toDTO)
                .collect(Collectors.toList());
    }

    public VehiculoDTO getVehiculoById(long id) {
        Vehiculo vehiculo = vehiculoRepository.findById(id)
                .orElseThrow(() -> new VehiculoNotFoundException("Vehículo con ID " + id + " no encontrado."));
        return VehiculoMapper.toDTO(vehiculo);
    }

    public VehiculoDTO postVehiculo(VehiculoDTO vehiculoDTO) {
        Vehiculo vehiculo = VehiculoMapper.toEntity(vehiculoDTO);
        Vehiculo savedVehiculo = vehiculoRepository.save(vehiculo);
        return VehiculoMapper.toDTO(savedVehiculo);
    }

    public VehiculoDTO putVehiculo(long id, VehiculoDTO vehiculoDTO) {
        Vehiculo existingVehiculo = vehiculoRepository.findById(id)
                .orElseThrow(() -> new VehiculoNotFoundException("Vehículo con ID " + id + " no encontrado."));

        Vehiculo vehiculoToUpdate = VehiculoMapper.toEntity(vehiculoDTO);
        vehiculoToUpdate.setIdVehiculo(id);
        Vehiculo updatedVehiculo = vehiculoRepository.save(vehiculoToUpdate);
        return VehiculoMapper.toDTO(updatedVehiculo);
    }

    public void deleteVehiculo(long id) {
        vehiculoRepository.deleteById(id);
    }
}
