package com.example.laliga_api.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "points")
public class TeamPoints {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String teamName;
    private int points;
    private int matchesPlayed;
    private int wins;
    private int draws;
    private int losses;

    //Dodanie druzyny do tabeli LaLiga
//    {
//        "teamName": "Celta Vigo",
//            "points": 0,
//            "matchesPlayed": 0,
//            "wins": 0,
//            "draws": 0,
//            "losses": 0
//    }
}
