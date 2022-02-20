package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int number;
    @Column(name = "flight_id")
    private int flightId;
    private int seat;
    @Column(name = "passanger_id")
    private int passangerId;
    @Column(name = "ticket_staus")
    private int ticketStaus;
    }
