package Aula1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class EventosEspeciais {
    public LocalDate aniversario(){
        return LocalDate.of(2004, Month.FEBRUARY, 6);
    }

    public LocalTime horaNascimento(){
        return LocalTime.of(12, 30);
    }

    public LocalDateTime nascimento(){
        return LocalDateTime.of(aniversario(), horaNascimento());
    }
}
