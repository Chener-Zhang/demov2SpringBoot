package com.example.demo.Configuration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@Configuration
@EnableJpaAuditing
public class AuditingConfig {
//we will useit for createdBy and updatedBy

    //EnableJpaAuditing ----sending----- >
    //EntityListeners----receive ----<

    @Bean
    public AuditorAware<String> auditorProvider(){
        //todo use spring security to getC urrent user
        return ()-> Optional.ofNullable("System(chener/kamal)");
    }



}


