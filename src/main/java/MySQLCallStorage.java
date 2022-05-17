import java.util.ArrayList;

public class MySQLCallStorage implements CallsStorage {
    @Override
    public boolean addCall(Call call) {
        // TODO: Add logic of MySQL call insert
        return true;
    }

    @Override
    public boolean deleteCall(Call call) {
        // TODO: Add logic of MySQL call delete
        return true;
    }

    @Override
    public ArrayList<Call> getCalls(int msisdn) {
        // TODO: Add logic of MySQL calls retrieve
        return new ArrayList<>();
    }
}
