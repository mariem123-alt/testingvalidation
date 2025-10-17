package com.artofcode.artofcodebck.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Set;
import com.artofcode.artofcodebck.user.User;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Club implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clubId;
    private String name;
    private String president;
    private String objective;
    private String activities;
    private String fileName; // Chemin de l'image
    @ManyToOne
    private User user;
}
