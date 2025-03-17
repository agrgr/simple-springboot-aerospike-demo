package com.aerospike.demo.simplespringbootaerospikedemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.aerospike.config.AerospikeConnectionSettings;
import org.springframework.data.aerospike.config.AerospikeDataSettings;

@SpringBootApplication
@Slf4j
public class SimpleSpringbootAerospikeDemoApplication implements ApplicationRunner {

	@Autowired
	AerospikeDataSettings aerospikeDataSettings;

	@Autowired
	AerospikeConnectionSettings aerospikeConnectionSettings;

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringbootAerospikeDemoApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		log.info("AerospikeDataSettings scan enabled {}", aerospikeDataSettings.isScansEnabled());
		log.info("AerospikeDataSettings create indexes enabled {}", aerospikeDataSettings.isCreateIndexesOnStartup());
		log.info("AerospikeDataSettings create indexes enabled {}", aerospikeDataSettings.isCreateIndexesOnStartup());
		log.info("AerospikeDataSettings  index cache refresh seconds {}", aerospikeDataSettings.getIndexCacheRefreshSeconds());
		log.info("AerospikeDataSettings  queryMaxRecords {}", aerospikeDataSettings.getQueryMaxRecords());
		log.info("AerospikeDataSettings  queryMaxRecords {}", aerospikeDataSettings.getNamespace());
		log.info("AerospikeConnectionSettings  namespace {}", aerospikeConnectionSettings.getHosts());
	}
}
