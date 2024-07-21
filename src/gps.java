import java.util.ArrayList;
import java.util.List;

public class gps implements observable{

    private int position ;
    private  String precision;
    private List<observer> observers = new ArrayList<observer>();



    public  gps(){

    }

    public int getPosition() {
        return position;
    }

    public String getPrecision() {
        return precision;
    }
    public  void  notifyObservers() {
        for (observer o : observers) {
            o.update(this);
        }
    }

        public void setMesure(int position, String precision) {
        this.precision = precision;
        this.position = position;
        notifyObservers();

    }

  public void addObserver(observer obs){
       observers.add(obs);
  }
  public void removeObserver(observer obs){
        observers.remove(obs);

  }


}
