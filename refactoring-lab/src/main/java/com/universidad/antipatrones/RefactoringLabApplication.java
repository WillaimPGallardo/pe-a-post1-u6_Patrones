package com.universidad.antipatrones;

import com.universidad.antipatrones.model.Libro;
import com.universidad.antipatrones.model.Socio;
import com.universidad.antipatrones.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RefactoringLabApplication implements CommandLineRunner {

    private final CatalogoLibros catalogo;
    private final RegistroSocios registro;
    private final ServicioPrestamos prestamos;
    private final GeneradorReportes reportes;

    public RefactoringLabApplication(CatalogoLibros catalogo,
                                     RegistroSocios registro,
                                     ServicioPrestamos prestamos,
                                     GeneradorReportes reportes) {
        this.catalogo = catalogo;
        this.registro = registro;
        this.prestamos = prestamos;
        this.reportes = reportes;
    }

    public static void main(String[] args) {
        SpringApplication.run(RefactoringLabApplication.class, args);
    }

    @Override
    public void run(String... args) {

        catalogo.agregar(new Libro("L01", "Clean Code", "Robert Martin"));
        catalogo.agregar(new Libro("L02", "Design Patterns", "GoF"));

        registro.registrar(new Socio("S01", "Carlos", "carlos@mail.com"));

        prestamos.prestar("L01", "S01");

        reportes.imprimirReporteCompleto();

        prestamos.devolver("L01");

        reportes.imprimirReporteCompleto();
    }
}