package com.ine5418.email.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ine5418.email.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, UUID> {
}
