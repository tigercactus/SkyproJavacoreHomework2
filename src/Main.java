
public class Main {
    public static void main(String[] args) {
        Hogwarts firstHogsStudent = new Hogwarts(44,33, "Гарри Поттер");
        Hogwarts secondHogsStudent = new Hogwarts(88,56, "Гермиона Грейнджер");
        Hogwarts.compareStudents(firstHogsStudent,secondHogsStudent);

        Gryffindor firstStudent = new Gryffindor(44,33, "Гарри Поттер",76,111,99);
        Gryffindor secondStudent = new Gryffindor(88, 56, "Гермиона Грейнджер", 66,65,57 );
        Gryffindor thirdStudent = new Gryffindor(33,78,"Рон Уизли", 44, 33, 45);

        Hufflepuff forthStudent = new Hufflepuff(66,56,"Захария Смит",65,45,45);
        Hufflepuff fifthStudent = new Hufflepuff(66,65,"Седрик Диггори",76,45,54);
        Hufflepuff sixthStudent = new Hufflepuff(60,54, "Джастин Финч-Флетчли", 54, 43, 65);
        Ravenclaw seventhStudent = new Ravenclaw(86,45,"Чжоу Чанг", 45,78,67,100);
        Ravenclaw eightStudent = new Ravenclaw(34,45, "Падма Патил",65,43,21,76);
        Ravenclaw ninthStudent = new Ravenclaw(54,87,"Маркус Белби", 78,32,46,67);
        Slytherin tenthStudent = new Slytherin(99,67,"Драко Малфой", 87,67,98,65,66);
        Slytherin eleventhStudent = new Slytherin(45,65, "Грэхэм Монтегю", 56,65,34,67,34);
        Slytherin twelfthStudent = new Slytherin(65,21, "Грегори Гойл", 43,56,21,32,34);
        thirdStudent.setBravery(67);
        Gryffindor.compareGryffindorStudent(firstStudent,secondStudent);
        Hufflepuff.compareHufflepuffStudent(forthStudent,fifthStudent);
        Ravenclaw.compareRawenclawStudent(seventhStudent, eightStudent);
        Slytherin.compareSlytherinStudent(tenthStudent, eleventhStudent);
        System.out.println(firstStudent);
        System.out.println(secondStudent);
        System.out.println(thirdStudent);
        System.out.println(eightStudent);
        }

    }
