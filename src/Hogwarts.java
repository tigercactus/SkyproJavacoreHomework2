public class Hogwarts {
    private int magicOutput;
    private int magicRange;
    private String  name;

    public static void compareStudents(Hogwarts firstStudent, Hogwarts secondStudent){
        int firstCounter = firstStudent.getMagicOutput()+ firstStudent.getMagicRange();
        int secondCounter = secondStudent.getMagicOutput() + secondStudent.getMagicRange();
        if(firstCounter>secondCounter){
            System.out.println("Относительно общешкольных требований характеристики ученика " + firstStudent.getName() + " лучше, чем характеристики ученика " + secondStudent.getName());
        } else if(firstCounter<secondCounter){
            System.out.println("Относительно общешкольных требований характеристики ученика " + secondStudent.getName() + " лучше, чем характеристики ученика " + firstStudent.getName());
        } else {
            System.out.println("Относительно общешкольных требований характеристики ученика " + firstStudent.getName() + " равны характеристикам ученика " + secondStudent.getName());
        }


    }


    @Override
    public String toString() {
        return "Параметры ученика по имени " +name+
                ": Мощность магии " + magicOutput +
                ", Дальность трансгрессии: " + magicRange  +
                ", ";
    }

    public Hogwarts(int magicOutput, int magicRange, String name) {
        if (magicOutput<0 || magicOutput>100){
            throw new RuntimeException("Значение поля должно быть в диапазоне от 0 до 100");}
        else if (magicRange<0 ||magicRange>100){
            throw new RuntimeException("Значение поля должно быть в диапазоне от 0 до 100");}
        else{
        this.magicOutput = magicOutput;
        this.magicRange = magicRange;
        this.name = name;}
    }

    public int getMagicOutput() {
        return magicOutput;
    }

    public void setMagicOutput(int magicOutput) {
        if(magicOutput<0 || magicOutput>100){
            throw new RuntimeException("Значение поля должно быть в диапазоне от 0 до 100");
        }
        this.magicOutput = magicOutput;
    }

    public int getMagicRange() {
        return magicRange;
    }

    public void setMagicRange(int magicRange) {
        if (magicRange<0 ||magicRange>100){
            throw new RuntimeException("Значение поля должно быть в диапазоне от 0 до 100");
        }
        this.magicRange = magicRange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


