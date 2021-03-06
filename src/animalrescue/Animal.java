package animalrescue;

abstract class Animal {
    private   int varsta;
    private double greutate;
    private String rasa;
    private String nume;
    private String culoareOchi;
    private int inaltime;

    public int getInaltime() {
        return inaltime;
    }

    public void setInaltime(int inaltime) {
        this.inaltime = inaltime;
    }

    public void setVarsta(int varsta){
        this.varsta = varsta;
    }
    public int getVarsta(){
        return varsta;
    }

    public void setGreutate(double greutate){
        this.greutate = greutate;
    }
    public double getGreutate(){
        return greutate;
    }

    public void setRasa(String rasa){
        this.rasa = rasa;
    }
    public String getRasa(){
        return rasa;
    }

    public void setNume(String nume){
        this.nume = nume;
    }
    public String getNume(){
        return nume;
    }


    public void setCuloareOchi(String culoareOchi){
        this.culoareOchi = culoareOchi;
    }
    public String getCuloareOchi(){
        return culoareOchi;
    }



    //metode
   abstract void eat();
   abstract void sleep();
   abstract void waking();





}
