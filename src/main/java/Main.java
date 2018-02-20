import io.opencensus.contrib.grpc.metrics.RpcViews;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        RpcViews.registerAllCumulativeViews();

        Thread.sleep(Long.MAX_VALUE);
    }
}
