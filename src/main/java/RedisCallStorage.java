import java.util.ArrayList;

public class RedisCallStorage implements CallsStorage {
    @Override
    public boolean addCall(Call call) {
        // TODO: Add logic of redis call insert
        return true;
    }

    @Override
    public boolean deleteCall(Call call) {
        // TODO: Add logic of redis call delete
        return true;
    }

    @Override
    public ArrayList<Call> getCalls(int msisdn) {
        // TODO: Add logic of redis calls retrieve
        return new ArrayList<>();
    }
}
