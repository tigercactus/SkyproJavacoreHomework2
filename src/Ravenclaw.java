public class Ravenclaw extends Hogwarts{
    private int intelligence;
    private int wisdom;
    private int smartness;
    private int creativity;

    public static void compareRawenclawStudent(Ravenclaw firstStudent, Ravenclaw secondStudent){
        int firstStatsCounter = firstStudent.getIntelligence() + firstStudent.getWisdom() + firstStudent.getSmartness()+ firstStudent.getCreativity();
        int secondStatsCounter = secondStudent.getIntelligence() + secondStudent.getWisdom() + secondStudent.getSmartness() + secondStudent.getCreativity();
        if(firstStatsCounter>secondStatsCounter){
            System.out.println("Относительно требований факультета характеристики ученика " + firstStudent.getName() + " лучше, чем характеристики ученика " + secondStudent.getName());
        } else if(firstStatsCounter<secondStatsCounter){
            System.out.println("Относительно требований факультета характеристики ученика " + secondStudent.getName() + " лучше, чем характеристики ученика " + firstStudent.getName());
        } else {
            System.out.println("Относительно требований факультета характеристики ученика " + firstStudent.getName() + " равны характеристикам ученика " + secondStudent.getName());
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "Ум: " + intelligence +
                ", Мудрость: " + wisdom +
                ", Остроумие: " + smartness +
                ", Креативность: " + creativity;
    }

    public Ravenclaw(int magicOutput, int magicRange, String name, int intelligence, int wisdom, int smartness, int creativity) {
        super(magicOutput, magicRange, name);
        if (intelligence<0 || wisdom<0 || smartness<0 || creativity < 0){
            throw new RuntimeException("Значение характеристик должно быть положительным");
        } else{
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.smartness = smartness;
        this.creativity = creativity;}
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        if(intelligence<0){
            throw new RuntimeException("Значение характеристик должно быть положительным");
        } else
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        if(wisdom<0){
            throw new RuntimeException("Значение характеристик должно быть положительным");
        } else
        this.wisdom = wisdom;
    }

    public int getSmartness() {
        return smartness;
    }

    public void setSmartness(int smartness) {
        if(smartness<0){
            throw new RuntimeException("Значение характеристик должно быть положительным");
        } else
        this.smartness = smartness;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        if(creativity<0){
            throw new RuntimeException("Значение характеристик должно быть положительным");
        } else
        this.creativity = creativity;
    }
}
