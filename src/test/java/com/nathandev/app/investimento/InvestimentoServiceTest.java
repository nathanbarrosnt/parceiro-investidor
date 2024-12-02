package com.nathandev.app.investimento;

import com.nathandev.app.domain.investimento.InvestimentoDto;
import com.nathandev.app.domain.investimento.TipoInvestimento;
import com.nathandev.app.domain.service.InvestimentoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class InvestimentoServiceTest {

    @Autowired
    private InvestimentoService investimentoService;


    @Nested
    class Dado_um_cdb {
        private InvestimentoDto cdb;

        @BeforeEach
        void setUp() {
            cdb = InvestimentoDto.builder()
                    .aporte(BigDecimal.valueOf(5000))
                    .percentual(BigDecimal.valueOf(25))
                    .tipoInvestimento(TipoInvestimento.CDB)
                    .build();
        }

        @Nested
        class Quando_calcular {
            private BigDecimal valorCalculado;

            @BeforeEach
            void setUp() {
                valorCalculado = investimentoService.calcularInvestimento(cdb);
            }

            @Test
            void Entao_deve_calcular_corretamente() {
                assertEquals(new BigDecimal("1250.00"), valorCalculado);
            }
        }
    }
}
