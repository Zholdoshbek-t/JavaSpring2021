import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        Comparator<Ticket> costComparator = new Comparator<Ticket>() {
            @Override
            public int compare(Ticket o1, Ticket o2) {
                if(o1.getCost() > o2.getCost()) {
                    return 1;
                } else if(o1.getCost() < o2.getCost()) {
                    return -1;
                } else {
                    if(o1.isVIP() && !o2.isVIP()) {
                        return 1;
                    } else if(!o1.isVIP() && o2.isVIP()) {
                        return -1;
                    }
                    return 0;
                }
            }
        };
        PriorityQueue<Ticket> costPriorityQueue = new PriorityQueue<>(costComparator);
        costPriorityQueue.add(new Ticket(500, false));
        costPriorityQueue.add(new Ticket(200, true));
        costPriorityQueue.add(new Ticket(800, false));
        costPriorityQueue.add(new Ticket(200, false));
        costPriorityQueue.add(new Ticket(500, true));
        costPriorityQueue.add(new Ticket(400, false));
        costPriorityQueue.add(new Ticket(400, true));
        while(!costPriorityQueue.isEmpty()) {
            System.out.println(costPriorityQueue.poll());
        }
        System.out.println("------------------");
        Comparator<Ticket> vipComparator = new Comparator<Ticket>() {
            @Override
            public int compare(Ticket o1, Ticket o2) {
                if(o1.isVIP() && !o2.isVIP()) {
                    return 1;
                } else if(!o1.isVIP() && o2.isVIP()) {
                    return -1;
                } else {
                    if(o1.getCost() > o2.getCost()) {
                        return 1;
                    } else if(o1.getCost() < o2.getCost()) {
                        return -1;
                    }
                    return 0;
                }
            }
        };
        PriorityQueue<Ticket> vipPriorityQueue = new PriorityQueue<>(vipComparator);
        vipPriorityQueue.add(new Ticket(500, false));
        vipPriorityQueue.add(new Ticket(300, true));
        vipPriorityQueue.add(new Ticket(800, false));
        vipPriorityQueue.add(new Ticket(200, false));
        vipPriorityQueue.add(new Ticket(500, true));
        vipPriorityQueue.add(new Ticket(400, false));
        vipPriorityQueue.add(new Ticket(390, true));
        while(!vipPriorityQueue.isEmpty()) {
            System.out.println(vipPriorityQueue.poll());
        }
    }
}
