package com.example.springthymeleaf.controller;

import com.example.springthymeleaf.entity.PedidoEntidade;
import com.example.springthymeleaf.repository.PedidoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/pedidos")
public class PedidoController {

    @GetMapping("/listar")
    public String listar(Model model){
        PedidoRepository repository = new PedidoRepository();

        List<PedidoEntidade> todosPedidos = repository.getAll();

        model.addAttribute("pedidos",todosPedidos);

        return "listar-pedidos";
    }

}
