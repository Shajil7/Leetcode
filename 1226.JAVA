import java.util.concurrent.Semaphore;

class DiningPhilosophers {
    Semaphore[] fork = new Semaphore[5];

    public DiningPhilosophers() {
        for (int i = 0; i < 5; i++) fork[i] = new Semaphore(1);
    }

    public void wantsToEat(int p, Runnable pl, Runnable pr, Runnable eat,
                           Runnable ul, Runnable ur) throws InterruptedException {
        int l = p, r = (p + 1) % 5;
        if (p % 2 == 0) {
            fork[l].acquire(); fork[r].acquire();
        } else {
            fork[r].acquire(); fork[l].acquire();
        }
        pl.run(); pr.run(); eat.run();
        ul.run(); ur.run();
        fork[l].release(); fork[r].release();
    }
}
