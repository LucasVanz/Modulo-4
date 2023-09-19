package Aula2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;

public class FusoHorarios {
    public static void main(String[] args) {
        List<String> datasStrings = new ArrayList<>();
        List<LocalDate> datasFormatadas = new ArrayList<>();
        datasStrings.add("2023-08-10");
        datasStrings.add("2022-05-20");
        datasStrings.add("2021-11-30");
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        for (int i = 0; i < datasStrings.size(); i++){
            datasFormatadas.add(LocalDate.parse(datasStrings.get(i), formatoData));
        }


        List<LocalDate> datas = new ArrayList<>();
        DateTimeFormatter formatoData2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        datas.add(LocalDate.of(2023,8,10));
        datas.add(LocalDate.of(2022,5,20));
        datas.add(LocalDate.of(2021,11,30));

        for (int i = 0; i < datas.size(); i++){
            System.out.println(datas.get(i).format(formatoData2));
        }


        ZonedDateTime fusos = ZonedDateTime.now();
        System.out.println(ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Europe/Paris")));
        System.out.println(ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("America/New_York")));
        System.out.println(ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Tokyo")));
    }
}
