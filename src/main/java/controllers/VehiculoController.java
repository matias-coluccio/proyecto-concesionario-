package controllers;

import models.Vehiculo;
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
    public List<Vehiculo>getAllVehiculos()
    {
        return vehiculoService.getAllVehiculos();
    }

    @GetMapping("/{id}")
    public  Vehiculo getVehiculoById(@PathVariable long id)
    {
        return vehiculoService.getVehiculoById(id);
    }

    @PostMapping
    public Vehiculo postVehiculo(@RequestBody Vehiculo vehiculo)
    {
        return vehiculoService.postVehiculo(vehiculo);
    }

    @PutMapping("/{id}")
    public Vehiculo putVehiculo(@PathVariable long id,@RequestBody Vehiculo vehiculo)
    {
        return vehiculoService.putVehiculo(id,vehiculo);
    }

    @DeleteMapping("/{id}")
    public void deleteVehiculo(@PathVariable long id)
    {
        vehiculoService.deleteVehiculo(id);
    }




}
