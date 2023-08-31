public class Slytherin extends Hogwarts{
    private int trickiness;
    private int determination;
    private int  ambition;
    private int resourcefullness;
    private int powerLust;

    public static void compareSlytherinStudent(Slytherin firstStudent, Slytherin secondStudent){
        int firstStatsCounter = firstStudent.getTrickiness() + firstStudent.getDetermination() + firstStudent.getAmbition()+ firstStudent.getResourcefullness()+ firstStudent.getPowerLust();
        int secondStatsCounter = secondStudent.getTrickiness() + secondStudent.getDetermination() + secondStudent.getAmbition() + secondStudent.getResourcefullness() + secondStudent.getPowerLust();
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
                "Хитрость: " + trickiness +
                ", Решительность: " + determination +
                ", Амбициозность:" + ambition +
                ", Находчивость: " + resourcefullness +
                ", Жажда власти:" + powerLust +
                '}';
    }

    public Slytherin(int magicOutput, int magicRange, String name, int trickiness, int determination, int ambition, int resourcefullness, int powerLust) {
        super(magicOutput, magicRange, name);
        if (trickiness<0 || determination<0 || ambition<0 || resourcefullness < 0 || powerLust <0){
            throw new RuntimeException("Значение характеристик должно быть положительным");
        } else{
        this.trickiness = trickiness;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefullness = resourcefullness;
        this.powerLust = powerLust;}
    }

    public int getTrickiness() {
        return trickiness;
    }

    public void setTrickiness(int trickiness) {
        if(trickiness<0){
            throw new RuntimeException("Значение характеристик должно быть положительным");
        } else
        this.trickiness = trickiness;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        if(determination<0){
            throw new RuntimeException("Значение характеристик должно быть положительным");
        } else
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        if(ambition<0){
            throw new RuntimeException("Значение характеристик должно быть положительным");
        } else
        this.ambition = ambition;
    }

    public int getResourcefullness() {
        return resourcefullness;
    }

    public void setResourcefullness(int resourcefullness) {
        if(resourcefullness<0){
            throw new RuntimeException("Значение характеристик должно быть положительным");
        } else
        this.resourcefullness = resourcefullness;
    }

    public int getPowerLust() {
        return powerLust;
    }

    public void setPowerLust(int powerLust) {
        if(powerLust<0){
            throw new RuntimeException("Значение характеристик должно быть положительным");
        } else
        this.powerLust = powerLust;
    }
}
