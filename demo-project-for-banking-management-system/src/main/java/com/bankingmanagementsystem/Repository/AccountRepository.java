package com.bankingmanagementsystem.Repository;

import com.bankingmanagementsystem.Entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Accounts, Long> {
}
