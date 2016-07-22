package io.pivotal.dao;

import io.pivotal.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by pradeep on 22/07/16.
 */
public interface GreetingRepository extends JpaRepository<Greeting, Integer>{
}
