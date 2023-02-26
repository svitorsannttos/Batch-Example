package com.batch.exemple.step;

import com.batch.exemple.domain.dto.ClienteDTO;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClienteStep {

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Bean
    public Step clienteStepConfig(
            MultiResourceItemReader<ClienteDTO> multiClienteReaderConfig,
            ItemWriter clienteWriterConfig) {
        return stepBuilderFactory
                .get("Cliente-Step")
                .chunk(2)
                .reader(multiClienteReaderConfig)
                .writer(clienteWriterConfig)
                .build();
    }

}
