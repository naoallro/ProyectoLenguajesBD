/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.ProyectoLenguajesBD.ProyectoLenguajesBD.Controller;


import com.ProyectoLenguajesBD.ProyectoLenguajesBD.domain.Proveedor;
import com.ProyectoLenguajesBD.ProyectoLenguajesBD.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/proveedores")
public class ProveedorController {

    @Autowired
    private ProveedorService proveedorService;

    @GetMapping("/")
    public String listar(Model model) {
        model.addAttribute("proveedores", proveedorService.getProveedores());
        return "proveedores/lista";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("proveedor", new Proveedor());
        return "proveedores/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(Proveedor proveedor) {
        proveedorService.save(proveedor);
        return "redirect:/proveedores/";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable("id") Long id, Model model) {
        model.addAttribute("proveedor", proveedorService.getProveedor(id));
        return "proveedores/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Long id) {
        proveedorService.delete(id);
        return "redirect:/proveedores/";
    }
}