/**
 * @author danushka
 * 3/26/2020
 */
public class ExportingTask implements Runnable {
    private ObjectPool<ExportingProcess> pool;
    private int threadNo;

    public ExportingTask(ObjectPool<ExportingProcess> pool, int threadNo) {
        this.pool = pool;
        this.threadNo = threadNo;
    }

    public void run() {
        ExportingProcess exportingProcess = pool.borrowObject();

        System.out.println("Thread " + threadNo + ": Object with process No " +
                exportingProcess.getProcessId() + " was borrowed");
        
        pool.returnObject(exportingProcess);

        System.out.println("Thread " + threadNo + ": Object with process No " +
                exportingProcess.getProcessId() + " was returned");
    }
}
