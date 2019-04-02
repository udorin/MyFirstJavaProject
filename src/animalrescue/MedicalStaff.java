package animalrescue;

import animalrescue.Human;

public class MedicalStaff extends Human {


    public void doctorulConsulta(){
        System.out.println("doctorul consulta");
    }
    public void doctorulVindeca(){
        System.out.println("doctorul vindeca");
    }


    @Override
    void sleep() {
        System.out.println("I am sleeping");

    }

    @Override
    void run() {
        System.out.println("I am running now");

    }

    @Override
    void sit() {
        System.out.println("just sit");

    }





}
