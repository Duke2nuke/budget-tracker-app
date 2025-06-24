package entities;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class FinancialAdvisor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "financialAdvisor")
    private List<Client> clients = new ArrayList<>();

    public FinancialAdvisor() {}

    public FinancialAdvisor(List<Client> clients) {
        this.clients = clients;
    }

    public Long getId() {
        return id;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
} 