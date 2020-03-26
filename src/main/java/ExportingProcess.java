/**
 * @author danushka
 * 3/26/2020
 */
public class ExportingProcess {
    private long processId;

    public ExportingProcess(long processId) {
        this.processId = processId;

        System.out.println("Object with process No " + processId + " was created");
    }

    public long getProcessId() {
        return processId;
    }
}
