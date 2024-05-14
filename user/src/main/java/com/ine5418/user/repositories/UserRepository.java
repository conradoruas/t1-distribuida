package com.ine5418.user.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ine5418.user.models.UserModel;

public interface UserRepository extends JpaRepository<UserModel, UUID> {
}
