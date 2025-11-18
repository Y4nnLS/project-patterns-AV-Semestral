package Q5;

public class Q5Main {

    public static void main(String[] args) {
        Runnable task = () -> {
            LoggerSingleton logger = LoggerSingleton.getInstance();
            logger.info("Thread " + Thread.currentThread().getName() + " iniciando processamento.");
            try {
                Thread.sleep((long) (Math.random() * 500));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            logger.audit("Thread " + Thread.currentThread().getName() + " finalizou processamento.");
        };

        Thread t1 = new Thread(task, "T1");
        Thread t2 = new Thread(task, "T2");
        Thread t3 = new Thread(task, "T3");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        LoggerSingleton logger = LoggerSingleton.getInstance();
        logger.error("Aplicação encerrando após execução de múltiplas threads.");
    }
}
