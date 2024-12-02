package com.nathandev.app.domain.investimento;

import com.nathandev.app.core.context.ApplicationContextProvider;
import com.nathandev.app.domain.calculo.CalculadoraInvestimento;
import com.nathandev.app.domain.calculo.impl.CdbCalculadoraInvestimento;

public enum TipoInvestimento {

    CDB(CdbCalculadoraInvestimento.class);

    private final Class<? extends CalculadoraInvestimento> calculadoraInvestimento;

    TipoInvestimento(Class<? extends CalculadoraInvestimento> calculadoraInvestimento) {
        this.calculadoraInvestimento = calculadoraInvestimento;
    }

    public CalculadoraInvestimento getCalculadoraInvestimento() {
        return ApplicationContextProvider.getBean(this.calculadoraInvestimento);
    }
}
