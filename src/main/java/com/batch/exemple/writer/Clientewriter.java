package com.batch.exemple.writer;

import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Clientewriter {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Bean
    public ItemWriter clienteWriterConfig() {
        return items -> items.forEach(System.out::println);
    }

}
