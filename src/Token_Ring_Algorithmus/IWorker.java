package Token_Ring_Algorithmus;



/**
 * Created by Simon on 06.12.2014.
 */
public interface IWorker {

    public void sendToken();

    public void haveToken();

    public void reciveToken(boolean token);

    public void doTask();

    public void setID(int id);

    public int getID();

    public void setNextWorker(Worker worker);

    public void setResource(Resource resource);

    public void printRelationship();



}
