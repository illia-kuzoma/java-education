package com.wellnessliving.lesson3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Emmanuel Macron", 45, Arrays.asList(
                        new Grade("Economics", 85),
                        new Grade("Politics", 92),
                        new Grade("History", 78),
                        new Grade("Philosophy", 88)),
                        "École Nationale", new Address("Paris", "Champs-Élysées")),

                new Student("François Hollande", 59, Arrays.asList(
                        new Grade("Economics", 72),
                        new Grade("Politics", 80),
                        new Grade("History", 65),
                        new Grade("Philosophy", 85)),
                        "École Normale Supérieure", new Address("Paris", "Saint-Germain")),

                new Student("Nicolas Sarkozy", 68, Arrays.asList(
                        new Grade("Economics", 75),
                        new Grade("Politics", 84),
                        new Grade("History", 81),
                        new Grade("Law", 86)),
                        "University of Paris", new Address("Paris", "Elysée Palace")),

                new Student("Joe Biden", 81, Arrays.asList(
                        new Grade("Law", 70),
                        new Grade("Politics", 65),
                        new Grade("History", 85),
                        new Grade("Public Speaking", 90)),
                        "University of Delaware", new Address("Washington", "Pennsylvania Ave")),

                new Student("Barack Obama", 62, Arrays.asList(
                        new Grade("Law", 95),
                        new Grade("Politics", 85),
                        new Grade("Public Speaking", 98),
                        new Grade("History", 92)),
                        "Harvard University", new Address("Washington", "Capitol Hill")),

                new Student("Donald Trump", 77, Arrays.asList(
                        new Grade("Economics", 88),
                        new Grade("Politics", 70),
                        new Grade("History", 65),
                        new Grade("Real Estate", 90)),
                        "University of Pennsylvania", new Address("Washington", "Trump Tower")),

                new Student("Xi Jinping", 70, Arrays.asList(
                        new Grade("History", 95),
                        new Grade("Economics", 80),
                        new Grade("Politics", 88),
                        new Grade("Military Strategy", 90)),
                        "Tsinghua University", new Address("Beijing", "Tiananmen Square")),

                new Student("Hu Jintao", 81, Arrays.asList(
                        new Grade("History", 85),
                        new Grade("Economics", 78),
                        new Grade("Politics", 89),
                        new Grade("Military Strategy", 84)),
                        "Beijing Institute of Technology", new Address("Beijing", "Forbidden City")),

                new Student("Jiang Zemin", 96, Arrays.asList(
                        new Grade("History", 70),
                        new Grade("Economics", 82),
                        new Grade("Politics", 75),
                        new Grade("Engineering", 95)),
                        "Shanghai Jiao Tong University", new Address("Beijing", "Zhongnanhai")),

                new Student("Olaf Scholz", 65, Arrays.asList(
                        new Grade("Economics", 88),
                        new Grade("Politics", 75),
                        new Grade("History", 70),
                        new Grade("Law", 80)),
                        "University of Hamburg", new Address("Berlin", "Unter den Linden")),

                new Student("Angela Merkel", 69, Arrays.asList(
                        new Grade("Physics", 95),
                        new Grade("Politics", 85),
                        new Grade("Economics", 90),
                        new Grade("History", 88)),
                        "Leipzig University", new Address("Berlin", "Brandenburg Gate")),

                new Student("Gerhard Schröder", 79, Arrays.asList(
                        new Grade("Law", 85),
                        new Grade("Politics", 80),
                        new Grade("Economics", 75),
                        new Grade("History", 85)),
                        "University of Göttingen", new Address("Berlin", "Reichstag")),

                new Student("Andrzej Duda", 51, Arrays.asList(
                        new Grade("Law", 50),
                        new Grade("Politics", 78),
                        new Grade("History", 85),
                        new Grade("International Relations", 82)),
                        "Jagiellonian University", new Address("Warsaw", "Krakowskie Przedmieście")),

                new Student("Bronisław Komorowski", 71, Arrays.asList(
                        new Grade("Law", 70),
                        new Grade("Politics", 75),
                        new Grade("History", 60),
                        new Grade("Public Speaking", 85)),
                        "University of Warsaw", new Address("Warsaw", "Presidential Palace")),

                new Student("Lech Kaczyński", 61, Arrays.asList(
                        new Grade("Law", 65),
                        new Grade("Politics", 70),
                        new Grade("History", 72),
                        new Grade("Economics", 68)),
                        "University of Gdańsk", new Address("Warsaw", "Piłsudski Square")),

                new Student("Recep Tayyip Erdoğan", 69, Arrays.asList(
                        new Grade("Economics", 90),
                        new Grade("History", 85),
                        new Grade("Politics", 92),
                        new Grade("Religious Studies", 88)),
                        "Marmara University", new Address("Ankara", "Atatürk Boulevard")),

                new Student("Abdullah Gül", 73, Arrays.asList(
                        new Grade("Economics", 75),
                        new Grade("History", 80),
                        new Grade("Politics", 65),
                        new Grade("Religious Studies", 70)),
                        "Istanbul University", new Address("Ankara", "Kızılay Square")),

                new Student("Ahmet Necdet Sezer", 82, Arrays.asList(
                        new Grade("Law", 85),
                        new Grade("Politics", 70),
                        new Grade("History", 88),
                        new Grade("Economics", 80)),
                        "Ankara University", new Address("Ankara", "Cankaya Mansion")),

                new Student("Volodymyr Zelensky", 45, Arrays.asList(
                        new Grade("Law", 80),
                        new Grade("Politics", 95),
                        new Grade("History", 85),
                        new Grade("International Relations", 88)),
                        "Kyiv National University", new Address("Kyiv", "Bankova Street")),

                new Student("Petro Poroshenko", 58, Arrays.asList(
                        new Grade("Economics", 88),
                        new Grade("Politics", 90),
                        new Grade("Law", 85),
                        new Grade("History", 82)),
                        "Taras Shevchenko University", new Address("Kyiv", "Khreshchatyk")),

                new Student("Viktor Yanukovych", 73, Arrays.asList(
                        new Grade("Law", 60),
                        new Grade("Politics", 70),
                        new Grade("Economics", 72),
                        new Grade("History", 65)),
                        "Donetsk National University", new Address("Kyiv", "Independence Square"))
        );

        System.out.println("Top 3 students from Paris:");
        List<StudentRecord> topGradesParis = students.stream()
                .filter(student -> "Paris".equals(student.getAddress().getCity()))
                .flatMap(student -> student.getGrades().stream()
                        .map(grade -> new StudentRecord(student.getName(), student.getSchool(), grade.getSubject(), grade.getScore()))
                )
                .sorted(Comparator.comparingDouble(StudentRecord::score).reversed())
                .limit(3)
                .toList();

        topGradesParis.forEach(record ->
                System.out.println(record.studentName() + ", " + record.school() + ", " + record.subject() + ", " + record.score())
        );

        System.out.println("\nTop 3 students from Washington:");
        List<StudentRecord> topGradesWashington = students.stream()
                .filter(student -> "Washington".equals(student.getAddress().getCity()))
                .flatMap(student -> student.getGrades().stream()
                        .map(grade -> new StudentRecord(student.getName(), student.getSchool(), grade.getSubject(), grade.getScore()))
                )
                .sorted(Comparator.comparingDouble(StudentRecord::score).reversed())
                .limit(3)
                .toList();

        topGradesWashington.forEach(record ->
                System.out.println(record.studentName() + ", " + record.school() + ", " + record.subject() + ", " + record.score())
        );

        System.out.println("\nTop 3 students from Kyiv:");
        List<StudentRecord> topGradesKyiv = students.stream()
                .filter(student -> "Kyiv".equals(student.getAddress().getCity()))
                .flatMap(student -> student.getGrades().stream()
                        .map(grade -> new StudentRecord(student.getName(), student.getSchool(), grade.getSubject(), grade.getScore()))
                )
                .sorted(Comparator.comparingDouble(StudentRecord::score).reversed())
                .limit(3)
                .toList();

        topGradesKyiv.forEach(record ->
                System.out.println(record.studentName() + ", " + record.school() + ", " + record.subject() + ", " + record.score())
        );
    }
}
