package com.artofcode.artofcodebck.Repositories;

import com.artofcode.artofcodebck.Entities.Club;
import com.artofcode.artofcodebck.Entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IClubRepository extends JpaRepository<Club,Long> {
}
