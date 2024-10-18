package controllers;

import DTO.VehiculoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.VehiculoService;
import java.util.List;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {

    @Autowired
    private VehiculoService vehiculoService;

    @GetMapping
    public List<VehiculoDTO> getAllVehiculos() {
        return vehiculoService.getAllVehiculos();
    }

    @GetMapping("/{id}")
    public VehiculoDTO getVehiculoById(@PathVariable long id) {
        return vehiculoService.getVehiculoById(id);
    }

    @PostMapping
    public VehiculoDTO postVehiculo(@RequestBody VehiculoDTO vehiculoDTO) {
        return vehiculoService.postVehiculo(vehiculoDTO);
    }

    @PutMapping("/{id}")
    public VehiculoDTO putVehiculo(@PathVariable long id, @RequestBody VehiculoDTO vehiculoDTO) {
        return vehiculoService.putVehiculo(id, vehiculoDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteVehiculo(@PathVariable long id) {
        vehiculoService.deleteVehiculo(id);
    }
}
