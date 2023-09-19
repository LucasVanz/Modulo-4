package Aula2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Vacinas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a data da primeira dose da vacina (dd/MM/yyyy): ");
        LocalDate dataDose = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Primeira dose: " + dataDose.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Segunda dose: " + dataDose.plusMonths(1).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Terceira dose: " + dataDose.plusMonths(2).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
