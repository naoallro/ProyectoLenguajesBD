/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.ProyectoLenguajesBD.ProyectoLenguajesBD.Controller;

import com.ProyectoLenguajesBD.ProyectoLenguajesBD.domain.Pedido;
import com.ProyectoLenguajesBD.ProyectoLenguajesBD.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/")
    public String listar(Model model) {
        model.addAttribute("pedidos", pedidoService.getPedidos());
        return "pedidos/lista";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("pedido", new Pedido());
        return "pedidos/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(Pedido pedido) {
        pedidoService.save(pedido);
        return "redirect:/pedidos/";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable("id") Long id, Model model) {
        model.addAttribute("pedido", pedidoService.getPedido(id));
        return "pedidos/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Long id) {
        pedidoService.delete(id);
        return "redirect:/pedidos/";
    }
}