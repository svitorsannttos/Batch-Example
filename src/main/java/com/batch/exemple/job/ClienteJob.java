package com.batch.exemple.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableBatchProcessing
@Configuration
public class ClienteJob {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Bean
    public Job clienteJobConfig(Step clienteStepConfig) {
        return jobBuilderFactory
                .get("Cliente-Job-Config")
                .start(clienteStepConfig)
                .incrementer(new RunIdIncrementer())
                .build();
    }

}
