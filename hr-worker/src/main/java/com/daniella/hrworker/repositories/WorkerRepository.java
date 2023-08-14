package com.daniella.hrworker.repositories;

import com.daniella.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository <Worker, Long> {

}
