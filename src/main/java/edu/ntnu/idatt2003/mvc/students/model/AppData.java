package edu.ntnu.idatt2003.mvc.students.model;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * AppData.java - "Programmering i Java", 4.utgave - 2009-07-01
 * <p>
 * Klasse som inneholder data for applikasjonen.
 */
public class AppData {

    private AppData() {
        throw new IllegalStateException("AppData class");
    }

    /**
     * Metode som returnerer en liste med studenter.
     *
     * @return data
     */
    public static List<Student> getData() {
        List<Student> data = new ArrayList<>();

		data.add(new Student("Odd Even", "Primtallet",LocalDate.of(1990, Month.JANUARY, 5),"M",7000,"Trondheim", "Tondelag"));
		data.add(new Student("Huppasahn", "DelFinito",LocalDate.of(1992, Month.APRIL, 15),"F",7000,"Trondheim", "Trondelag"));
		data.add(new Student("Hans", "Olav",LocalDate.of(1995, Month.MARCH, 20),"M",7000,"Trondheim", "Trondelag"));
		data.add(new Student("Marthe", "Johansen",LocalDate.of(1991, Month.AUGUST, 12),"F",7000,"Trondheim", "Trondelag"));

        return data;
    }
}
