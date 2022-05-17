import java.util.ArrayList;

public class CallCenterService {
    private CallsStorage callsStorage;

    public CallCenterService(CallsStorage callsStorage) {
        this.callsStorage = callsStorage;
    }

    public boolean registerCall(long callId, int msisdn, String callDateTime, int callDuration) {
        Call call = new Call();
        call.callId = callId;
        call.msisdn = msisdn;
        call.callDateTime = callDateTime;
        call.callDuration = callDuration;
        return this.callsStorage.addCall(call);
    }

    public int getCallsCount(int msisdn) {
        ArrayList<Call> calls = this.callsStorage.getCalls(msisdn);
        return calls.size();
    }

    public boolean archiveCalls(int msisdn) {
        ArrayList<Call> calls = this.callsStorage.getCalls(msisdn);

        for (Call call: calls) {
            // TODO: Add some archive logic
            this.callsStorage.deleteCall(call);
        }

        return true;
    }
}
