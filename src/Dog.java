public class Dog {
   private   int varsta;
     private double greutate;
    private String rasa;
    private String nume;
    private String culoareOchi;


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




    public void alearga(){
        System.out.println("Catelul alearga. Pazea");

    }
    public void mananca(){
        System.out.println("Momentan, mananca niste purina");
    }
    public void latra(){
        System.out.println("Ham!");
    }
    public void daDinCoada(){
        System.out.println("Cainele da din coada");
    }
    public void doarme(){
        System.out.println("momentan cainele doarme");

    }
    public void adulmeca(){
        System.out.println("Cainele adulmeca mirosul");
    }
}
