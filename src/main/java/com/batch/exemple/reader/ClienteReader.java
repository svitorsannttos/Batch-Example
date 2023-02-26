package com.batch.exemple.reader;

import com.batch.exemple.domain.dto.ClienteDTO;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.builder.MultiResourceItemReaderBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

@Configuration
public class ClienteReader {

    @Value(value = "dados/clientes*.csv")
    private Resource[] resources;

    @Value(value = "dados/clientes")
    private Resource resource;

    @Bean
    public FlatFileItemReader<ClienteDTO> clienteReaderConfig(){
        return new FlatFileItemReaderBuilder<ClienteDTO>()
                .name("Cliente-Reader")
                .resource(resource).linesToSkip(1)
                .delimited()
                .delimiter(";")
                .names(colunas)
                .targetType(ClienteDTO.class)
                .build();
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Bean
    public MultiResourceItemReader multiClienteReaderConfig() {
        return new MultiResourceItemReaderBuilder<>()
                .name("Multiplos-Cliente-Reader")
                .resources(resources)
                .delegate(clienteReaderConfig())
                .build();
    }

    private String colunas[] = {"nome", "data_de_nascimento", "sexo", "renda"};
}
