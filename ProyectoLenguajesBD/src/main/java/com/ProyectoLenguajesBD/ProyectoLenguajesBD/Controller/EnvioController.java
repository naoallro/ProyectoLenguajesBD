/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.ProyectoLenguajesBD.ProyectoLenguajesBD.Controller;
import com.ProyectoLenguajesBD.ProyectoLenguajesBD.domain.Envio;
import com.ProyectoLenguajesBD.ProyectoLenguajesBD.service.EnvioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/envios")
public class EnvioController {

    @Autowired
    private EnvioService envioService;

    @GetMapping("/")
    public String listar(Model model) {
        model.addAttribute("envios", envioService.getEnvios());
        return "envios/lista";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("envio", new Envio());
        return "envios/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(Envio envio) {
        envioService.save(envio);
        return "redirect:/envios/";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable("id") Long id, Model model) {
        model.addAttribute("envio", envioService.getEnvio(id));
        return "envios/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Long id) {
        envioService.delete(id);
        return "redirect:/envios/";
    }
}
