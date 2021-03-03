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
     * Si el promedio de beats es menor a 90 o mayor a 160 se considera un ritmo anormal
     *
     * @param number El numero del plan a verificar
     * @return Plan: El nuevo plan creado en caso de necesitarlo, de lo contrario null.
     */
    public Plan checkHeart(long number) {

       Plan p = findPlan(number);
       double result = p.averageBeats();
       if (p.averageBeats()<Plan.MIN_BEATS || p.averageBeats()>Plan.MAX_BEATS) {
           addPlan(new Plan("Heart Care",p.getCyclist()));
           return p;
       }
        return null;
       }





    public void addPlan(Plan plan) {

        this.plans.add(plan);
    }

    public int countPlans() {
        return this.plans.size();
    }


    /**
     *
     * Encuentra un plan por su id.
     *
     * Si el plan no existe retorna null.
     * @param number
     * @return
     */
    public Plan findPlan(long number) {
        for (Plan p:plans) {
            if (p.getNumber() == number){
                return p;
            }
        }
        return null;
    }


}
