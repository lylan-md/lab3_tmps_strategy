import java.util.ArrayList;

public interface CallsStorage {
    boolean addCall(Call call);
    boolean deleteCall(Call call);
    ArrayList<Call> getCalls(int msisdn);
}
