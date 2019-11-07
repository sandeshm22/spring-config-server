package com.spring.boot;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.config.server.environment.JdbcEnvironmentProperties;
import org.springframework.cloud.config.server.environment.JdbcEnvironmentRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@SpringBootApplication
@EnableJpaRepositories
@EnableConfigServer
public class SpringBootConfigServerApplication {
	/*
	 * @Autowired private JdbcTemplate template;
	 */

	public static void main(String[] args) {
		SpringApplication.run(SpringBootConfigServerApplication.class, args);
	}
	
	/*
	 * @Bean public JdbcEnvironmentRepository jdbcEnvironmentRepository() { String
	 * sql =
	 * "SELECT KEY, VAL from PROPERTIES where APPLICATION=? and PROFILE=? and LABEL=?"
	 * ; JdbcEnvironmentProperties props = new JdbcEnvironmentProperties();
	 * props.setOrder(1); props.setSql(sql); return new
	 * JdbcEnvironmentRepository(template, props); }
	 */
	/*
	 * @Bean public JdbcTemplate jdbcTemplate() { return new
	 * JdbcTemplate(dataSource); }
	 * 
	 * @Bean public DataSource dataSource() {
	 * 
	 * HikariConfig config = new HikariConfig(properties); return new
	 * HikariDataSource(configuration) }
	 */
}
