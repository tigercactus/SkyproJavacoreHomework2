public class Hufflepuff extends Hogwarts{
    private int hardworkingStat;
    private int loyalty;
    private int honesty;
    public static void compareHufflepuffStudent(Hufflepuff firstStudent, Hufflepuff secondStudent){
        int firstStatsCounter = firstStudent.getHardworkingStat() + firstStudent.getLoyalty() + firstStudent.getHonesty();
        int secondStatsCounter = secondStudent.getHardworkingStat() + secondStudent.getHonesty() + secondStudent.getLoyalty();
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
                "Трудолюбие: " + hardworkingStat +
                ", Верность: " + loyalty +
                ", Честность: " + honesty;
    }

    public Hufflepuff(int magicOutput, int magicRange, String name, int hardworkingStat, int loyalty, int honesty) {
        super(magicOutput, magicRange, name);
        if (hardworkingStat<0 || loyalty<0 || honesty<0){
            throw new RuntimeException("Значение характеристик должно быть положительным");
        } else{
        this.hardworkingStat = hardworkingStat;
        this.loyalty = loyalty;
        this.honesty = honesty;}
    }

    public int getHardworkingStat() {
        return hardworkingStat;
    }

    public void setHardworkingStat(int hardworkingStat) {
        if(hardworkingStat<0){
            throw new RuntimeException("Значение характеристик должно быть положительным");
        } else
        this.hardworkingStat = hardworkingStat;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        if(loyalty<0){
            throw new RuntimeException("Значение характеристик должно быть положительным");
        } else
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        if(honesty<0){
            throw new RuntimeException("Значение характеристик должно быть положительным");
        } else
        this.honesty = honesty;
    }
}
