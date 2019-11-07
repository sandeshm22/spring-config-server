package com.spring.boot;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.config.server.environment.JdbcEnvironmentRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigPropertiesRepository<T, ID> extends CrudRepository<ConfigProperties, Integer>  {
	public List<T> findByApplication(String application);

	public List<T> findByApplicationAndProfile(String application, String profile);

	public List<T> findByApplicationAndProfileAndLabel(String application, String profile, String label);

	public List<T> findByApplicationAndProfileAndLabelAndKey(String application, String profile, String label,
			String key);

	public Optional<T> findOneByApplicationAndProfileAndLabelAndKey(String application, String profile,
			String label, String key);
	

}
