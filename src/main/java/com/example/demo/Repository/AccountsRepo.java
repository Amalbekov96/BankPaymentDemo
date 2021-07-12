package com.example.demo.Repository;

import com.example.demo.Model.Accounts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepo extends CrudRepository<Accounts, Long> {
}
