package com.example.springthymeleaf.repository;

import com.example.springthymeleaf.entity.PedidoEntidade;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PedidoRepository {

    /* public List<PedidoEntidade> lista = new ArrayList();*/

    public List<PedidoEntidade> getAll() {

        return Arrays.asList(new PedidoEntidade(1L, "Celular", BigDecimal.valueOf(33.00), LocalDate.now(), "A21S"),new PedidoEntidade(2L, "Celular", BigDecimal.valueOf(45.00), LocalDate.now(), "Iphone XXL"),new PedidoEntidade(3L, "Celular", BigDecimal.valueOf(33.00), LocalDate.now(), "Iphone PP"));


    }


}
