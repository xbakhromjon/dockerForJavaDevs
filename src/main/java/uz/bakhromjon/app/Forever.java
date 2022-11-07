
/**
 * @author : Bakhromjon Khasanboyev
 * @since : 07/11/22, Mon, 14:29
 **/

import lombok.extern.java.Log;

@Log
public class Forever {
    public static void main(String[] args) throws InterruptedException {
        log.info("Run Forever using lombok");
        Thread.currentThread().join();
    }
}
