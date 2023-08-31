public class Gryffindor extends Hogwarts {
    private int nobleness;
    private int honesty;
    private int bravery;

    public static void compareGryffindorStudent(Gryffindor firstStudent, Gryffindor secondStudent){
        int firstStatsCounter = firstStudent.getNobleness() + firstStudent.getHonesty() + firstStudent.getBravery();
        int secondStatsCounter = secondStudent.getNobleness() + secondStudent.getHonesty() + secondStudent.getBravery();
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
                "Благородство: " + nobleness +
                ", Честь: " + honesty +
                ", Храбрость: " + bravery ;
    }

    public Gryffindor(int magicOutput, int magicRange, String name, int nobleness, int honesty, int bravery) {
        super(magicOutput, magicRange, name);
        if (nobleness<0 || honesty<0 || bravery<0){
            throw new RuntimeException("Значение характеристик должно быть положительным");
        } else{

        this.nobleness = nobleness;
        this.honesty = honesty;
        this.bravery = bravery;}

    }



    public int getNobleness() {
        return nobleness;
    }

    public void setNobleness(int nobleness) {
        if(nobleness<0){
            throw new RuntimeException("Значение характеристик должно быть положительным");
        } else
        this.nobleness = nobleness;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        if(honesty<0){
            throw new RuntimeException("Значение характеристик должно быть положительным");
        }
        this.honesty = honesty;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        if(bravery<0){
            throw new RuntimeException("Значение характеристик должно быть положительным");
        }
        this.bravery = bravery;
    }
}


