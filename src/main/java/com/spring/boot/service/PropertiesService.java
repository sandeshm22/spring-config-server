package com.spring.boot.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.ConfigProperties;
import com.spring.boot.ConfigPropertiesRepository;

@RestController
@RequestMapping("/api")
public class PropertiesService {

	@Autowired
	private ConfigPropertiesRepository<ConfigProperties, Integer> repository;

	@GetMapping("/props")
	public Iterable<ConfigProperties> getAll() {
		return repository.findAll();
	}

	@GetMapping("/props/{application}")
	public Iterable<ConfigProperties> get(@PathVariable() String application) {
		return repository.findByApplication(application);
	}

	@GetMapping("/props/{application}/{profile}")
	public Iterable<ConfigProperties> get(@PathVariable() String application, @PathVariable() String profile) {
		return repository.findByApplicationAndProfile(application, profile);
	}

	@GetMapping("/props/{application}/{profile}/{label}")
	public Iterable<ConfigProperties> get(@PathVariable() String application, @PathVariable() String profile,
			@PathVariable() String label) {
		return repository.findByApplicationAndProfileAndLabel(application, profile, label);
	}

	@GetMapping("/props/{application}/{profile}/{label}/{key}")
	public Iterable<ConfigProperties> get(@PathVariable() String application, @PathVariable() String profile,
			@PathVariable() String label, @PathVariable() String key) {
		return repository.findByApplicationAndProfileAndLabelAndKey(application, profile, label, key);
	}

	@PostMapping("/props")
	public ConfigProperties create(@Valid @RequestBody ConfigProperties insuranceConfigProperties) {
		return repository.save(insuranceConfigProperties);
	}
}