package week03;

// Queue simulation
// Priority Queue
// There is an ATM and N people want to use it.
// Each person comes to the ATM at a specific time A[i] (number of minutes from the opening time) and intends to use it in D[i] minutes.
// The array A has been sorted.
// What is the maximum and average waiting time?
public class P3 {
    public static void main(String[] args) {
        QueueApplication.eventSimulation();
    }
}

class QueueApplication {
    static class Event {
        int arrival;
        int duration;

        public Event(int a, int d) {
            arrival = a;
            duration = d;
        }
    }

    static void eventSimulation() {
        ArrayQueue<Event> events = new ArrayQueue<Event>();
        events.enQueue(new Event(0, 5));
        events.enQueue(new Event(3, 3));
        events.enQueue(new Event(4, 4));
        events.enQueue(new Event(100, 4));

        int n = events.size();

        int nextAvailableTime = 0;
        int totalWaiting = 0;
        int maxWaitingTime = 0;

        while (!events.isEmpty()) {
            Event evt = events.peekFront();
            events.deQueue();
            nextAvailableTime = Math.max(nextAvailableTime, evt.arrival);
            int waitingTime = nextAvailableTime - evt.arrival;
            maxWaitingTime = Math.max(maxWaitingTime, waitingTime);
            totalWaiting += waitingTime;
            nextAvailableTime = nextAvailableTime + evt.duration;
        }

        System.out.printf("Max waiting time %d, total waiting time %d and average waiting time %.2f\n", maxWaitingTime, totalWaiting, 1.0 * totalWaiting / n);
    }
}
