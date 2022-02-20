package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "flight_numb")
    private int flightNumb;
    private Date time;
    @Column(name = "flight_status")
    private int flightStatus;
    @Column(name = "terminal_id")
    private int terminalId;
    @Column(name = "avialine_id")
    private int avialineId;
    @Column(name = "craft_id")
    private int craftId;
    @Column(name = "gate_id")
    private int gateId;
}
