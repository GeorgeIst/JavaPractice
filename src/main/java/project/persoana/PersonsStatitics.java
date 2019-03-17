package project.persoana;

public class PersonsStatitics {

    private Person[] persons;

    public PersonsStatitics(Person[] persons) {
        this.persons = persons;
    }

    public int oldestWoman() {
        int max = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getSex().equals("F")) {
                if (max <= persons[i].getVarsta()) {
                    max = persons[i].getVarsta();
                }
            }
        }
        return max;

    }

    public int oldestMan() {
        int max = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getSex().equals("M")) {
                if (max <= persons[i].getVarsta()) {
                    max = persons[i].getVarsta();
                }
            }
        }
        return max;

    }

    public int womenCount() {
        int counter = 0;
        for (Person x : persons) {
            if (x.getSex().equals("F")) {
                counter++;
            }
        }
        return counter;
    }

    public int manCount() {
        int counter = 0;
        //for(int x = 0; x < persons.length; x++)
        for (Person x : persons) {
            if (x.getSex().equals("M")) {
                counter++;
            }
        }
        return counter;
    }

    public int averageManAge() {
        int suma = 0;
        int counter = 0;
        for (Person x : persons) {
            if (x.getSex().equals("M")) {
                suma += x.getVarsta();
                counter++;


            }

        }
        return suma / counter;
    }

    public int averageWomanAge() {
        int suma = 0;
        int counter = 0;
        for (Person x : persons) {
            if (x.getSex().equals("F")) {
                suma += x.getVarsta();
                counter++;

            }

        }
        return suma / counter;
    }

    public int numberOfMarriedPeople() {
        int counter = 0;
        for(int i = 0; i<persons.length; i++){
            if(persons[i].getStareCivila().equals("Casatorit")){
                counter++;
            }
        }return counter;

    }
}
