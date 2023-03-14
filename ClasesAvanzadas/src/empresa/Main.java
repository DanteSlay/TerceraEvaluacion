package empresa;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Programador programador = new Programador();
        programador.setNombre("A. Arenal");
        programador.setAñoNacimiento(1985);
        programador.setDirección("Pobladura del Valle, S/N");
        programador.setFechaInicio(LocalDate.of(2017,3,8)); // si queremos poner el día actual escribiríamos LocalDate.now()
        //programador.setFechaInicio(LocalDate.parse("2017-3-8")); // también lo podemos poner así
        String[] lenguajes = {"Java", "JavaScript", "Python"};
        programador.setLenguajes(lenguajes);

        System.out.println(programador.getNombre() +
                 " - " + programador.getDirección() +
                 " - " + programador.getAñoNacimiento() +
                " - " + programador.getFechaInicio() +
                " - " + Arrays.toString(programador.getLenguajes()));

    }
}
