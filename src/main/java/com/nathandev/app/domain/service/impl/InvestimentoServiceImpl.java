package com.nathandev.app.domain.service.impl;

import com.nathandev.app.domain.investimento.InvestimentoDto;
import com.nathandev.app.domain.service.InvestimentoService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class InvestimentoServiceImpl implements InvestimentoService {

    @Override
    public BigDecimal calcularInvestimento(InvestimentoDto investimentoDto) {
        return investimentoDto.getTipoInvestimento().getCalculadoraInvestimento().calcular(investimentoDto);
    }
}
