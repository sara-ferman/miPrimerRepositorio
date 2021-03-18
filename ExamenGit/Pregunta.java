public class Pregunta(){
    private String enunciados;
    private double puntuacionMaxima;


    public void Pregunta(){

    }

    public void Pregunta(String enunciados, double puntuacionMaxima){
        this.enunciados=enunciados;
        this.puntuacionMaxima=puntuacionMaxima;
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