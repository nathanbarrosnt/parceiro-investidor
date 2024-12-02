package com.nathandev.app.domain.calculo;

import com.nathandev.app.domain.investimento.InvestimentoDto;

import java.math.BigDecimal;

public interface CalculadoraInvestimento {

    BigDecimal calcular(InvestimentoDto investimentoDto);
}
