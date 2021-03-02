package entities;

import java.util.ArrayList;
import java.util.List;

public class MasterTraining {

    private List<Plan> plans;
    private List<Cyclist> cyclists;

    public MasterTraining() {
        this.plans = new ArrayList<>();
        this.cyclists = new ArrayList<>();
    }

    /**
     * Determina para un plan específico el rendimiento del corazón del ciclista.
     * Si el corazón presenta latidos irregulares, crea un nuevo plan de tipo “Heart Care” para dicho ciclista.
     *
     * @param number El numero del plan a verificar
     * @return Plan: El nuevo plan creado en caso de necesitarlo, de lo contrario null.
     */
    public Plan checkHeart(long number) {

       int result = findPlan(number).averageBeats();
       if (result<90 || result >160) {

           return new Plan("HeartCare",new Cyclist());

       }
        return null;
    }

    public void addPlan(Plan plan) {

        this.plans.add(plan);
    }

    public int countPlans() {
        return this.plans.size();
    }

    public Plan findPlan(long number) {
        for (Plan p:plans) {
            if (p.getNumber() == number){
                return p;
            }
        }
        return null;
    }


}
