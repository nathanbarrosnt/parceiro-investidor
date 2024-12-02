package com.nathandev.app.domain.calculo.impl;

import com.nathandev.app.domain.calculo.CalculadoraInvestimento;
import com.nathandev.app.domain.investimento.InvestimentoDto;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Component
public class CdbCalculadoraInvestimento implements CalculadoraInvestimento {

    @Override
    public BigDecimal calcular(InvestimentoDto investimentoDto) {
        return investimentoDto.getAporte()
                .multiply(investimentoDto.getPercentual()
                        .divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_EVEN));
    }
}
