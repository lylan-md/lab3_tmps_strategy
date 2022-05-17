public class Main {
    public static void main(String[] args) {
        CallCenterService callCenterService = new CallCenterService(new RedisCallStorage());

        callCenterService.registerCall(1652810070, 68000001, "2022-05-17 08:55:12", 10);
        callCenterService.registerCall(1652810071, 68000013, "2022-05-17 08:56:33", 5);
        callCenterService.registerCall(1652810072, 68000001, "2022-05-17 08:57:55", 30);

        System.out.println(callCenterService.getCallsCount(68000001));

        callCenterService.archiveCalls(68000001);
    }
}
