package entities;

import jakarta.persistence.*;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Portfolio() {}

    public Portfolio(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
} 