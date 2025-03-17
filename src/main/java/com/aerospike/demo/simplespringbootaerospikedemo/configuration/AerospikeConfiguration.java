package com.aerospike.demo.simplespringbootaerospikedemo.configuration;

import com.aerospike.demo.simplespringbootaerospikedemo.repositories.AerospikeUserRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.aerospike.config.AbstractAerospikeDataConfiguration;
import org.springframework.data.aerospike.repository.config.EnableAerospikeRepositories;

@Configuration
@EnableAerospikeRepositories(basePackageClasses = AerospikeUserRepository.class)
public class AerospikeConfiguration extends AbstractAerospikeDataConfiguration {
//
//    @Override
//    protected Collection<Host> getHosts() {
//        return Collections.singleton(new Host(aerospikeConfigurationProperties.getHost(), aerospikeConfigurationProperties.getPort()));
//    }
//
//    @Override
//    protected String nameSpace() {
//        return aerospikeConfigurationProperties.getNamespace();
//    }
}

