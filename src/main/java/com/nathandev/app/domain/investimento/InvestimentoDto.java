package com.nathandev.app.domain.investimento;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
@Builder
public class InvestimentoDto {

    private BigDecimal aporte;
    private BigDecimal percentual;
    private TipoInvestimento tipoInvestimento;
}
