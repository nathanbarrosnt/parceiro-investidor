package com.nathandev.app.domain.service;

import com.nathandev.app.domain.investimento.InvestimentoDto;

import java.math.BigDecimal;

public interface InvestimentoService {

    BigDecimal calcularInvestimento(InvestimentoDto investimentoDto);
}
