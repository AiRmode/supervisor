package com.supervisor.repository;

import com.supervisor.entity.IssueJPA;
import org.springframework.data.repository.CrudRepository;

public interface IssueRepository extends CrudRepository<IssueJPA, String> {
}
