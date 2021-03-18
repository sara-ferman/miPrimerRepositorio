public class Pregunta(){
    private String enunciados;


    public void Pregunta(){

    }

    public Pregunta(String enunciados){
        this.enunciados=enunciados;
    }

    public String getEnunciados(){
        return enunciados;
    }

    public void setEnunciados(String enunciados){
        this.enunciados=enunciados;
    }

    public double getPuntuacionMaxima(){
        return puntuacionMaxima;
    }

    public void setPuntuacionMaxima(double puntuacionMaxima){
        this.puntuacionMaxima=puntuacionMaxima;
    }

}