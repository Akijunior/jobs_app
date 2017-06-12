import java.util.Calendar;

public class Candidatura {

    private Calendar data;
    private enum statusCandidatura;

    public Candidatura(Calendar data) {
        this.data = data;
    }


    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }
}
