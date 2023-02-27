public class App {
    public static void main(String[] args) throws Exception {
        Cachorro Lilo = new Cachorro("Lilo");
        Lilo.description();

        System.out.println("Execução terminada");
    }
}

class Cachorro {
    private String race;
    private float size;
    private String color;
    private int age;
    private String name;
    private String sex;
    private float weight;
    private float thristMeter;
    private boolean hasVaccine;
    private float imc;

    public Cachorro (String name) {
        this.name = name;
        this.size = 0.50f;
        this.sex = "Feminino";
        this.weight = 10f;
        this.imc = weight / (size * size);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } if (imc > 18.5 & imc <= 25) {
            System.out.println("Peso normal");
        } if (imc > 30) {
            System.out.println("Obeso");
        } if (imc > 25 & imc <= 30) {
            System.out.println("Acima do peso");
        }
    }

    public Cachorro (String race, float size, int age, String name, String sex, float weight, boolean hasVaccine, int birth) {
        this.race = "Vira-lata";
        this.size = size;
        this.age = 2023 - birth;
        this.name = name;
        this.sex = sex;
        this.weight = weight;
        this.hasVaccine = hasVaccine;
    }

    public void description() {
        System.out.println("Essa é a " + this.name + ". Ela tem a altura de " + this.size * 100 + " cm" + " e é do sexo " + this.sex + "da raça" + this.race);
        System.out.println(this.imc);
    }
}