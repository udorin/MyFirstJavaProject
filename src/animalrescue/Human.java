package animalrescue;

public abstract class Human {
    private  int varsta;
    private double inaltime;
    private String culoareOchi;
    private String culoarePar;
    private double greutate;
    private String nume;
    private String sex;

    public void setVarsta(int varsta){
        this.varsta = varsta;
    }
    public int getVarsta(){
        return varsta;
    }

    public void setInaltime(double inaltime){
        this.inaltime = inaltime;
    }
    public double getInaltime(){
        return inaltime;
    }

    public void setCuloareOchi(String culoareOchi){
        this.culoareOchi = culoareOchi;
    }
    public String getCuloareOchi(){
        return culoareOchi;
    }

    public void setCuloarePar(String culoarePar){
        this.culoarePar = culoarePar;
    }
    public String getCuloarePar(){
        return culoarePar;
    }

    public void setGreutate(double greutate){
        this.greutate = greutate;
    }
    public double getGreutate(){
        return greutate;
    }

    public void setNume(String nume){
        this.nume = nume;
    }
    public String getNume(){
        return nume;
    }

    public void setSex(String sex){
        this.sex = sex;
    }
    public String getSex(){
        return sex;
    }



    abstract void sleep();

   abstract void run();
    abstract void sit();




}
