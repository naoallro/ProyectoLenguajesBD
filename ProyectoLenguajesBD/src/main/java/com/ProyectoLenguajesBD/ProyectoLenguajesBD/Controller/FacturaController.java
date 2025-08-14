/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.ProyectoLenguajesBD.ProyectoLenguajesBD.Controller;


import com.ProyectoLenguajesBD.ProyectoLenguajesBD.domain.Factura;
import com.ProyectoLenguajesBD.ProyectoLenguajesBD.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/facturas")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @GetMapping("/")
    public String listar(Model model) {
        model.addAttribute("facturas", facturaService.getFacturas());
        return "facturas/lista";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("factura", new Factura());
        return "facturas/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(Factura factura) {
        facturaService.save(factura);
        return "redirect:/facturas/";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable("id") Long id, Model model) {
        model.addAttribute("factura", facturaService.getFactura(id));
        return "facturas/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Long id) {
        facturaService.delete(id);
        return "redirect:/facturas/";
    }
}
