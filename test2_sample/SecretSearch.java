package test2_sample;

public class SecretSearch {
    double XA;
    double YA;
    double VA;
    double XB;
    double YB;
    double VB;

    public SecretSearch(double XA, double YA, double VA, double XB, double YB, double VB) {
        this.XA = XA;
        this.YA = YA;
        this.VA = VA;
        this.XB = XB;
        this.YB = YB;
        this.VB = VB;
    }

    public double timeFromA(double XZ) {
        double length = Math.sqrt((XA - XZ) * (XA - XZ) + YA * YA);
        return length / VA;
    }

    private double timeFromB(double XZ) {
        double length = Math.sqrt((XB - XZ) * (XB - XZ) + YB * YB);
        return length / VB;
    }

    public double pointC() {
        double eps = 0.0000001;
        double minX = XA;
        double maxX = XB;
        while (maxX - minX > eps) {
            double mid = (maxX + minX) / 2;
            double tA = timeFromA(mid);
            double tB = timeFromB(mid);
            if (tA < tB) {
                minX = mid;
            } else {
                maxX = mid;
            }
        }
        return maxX;
    }

    public static void main(String[] args) {
        SecretSearch test = new SecretSearch(-1, 1, 1, 1, -1, 0.5);
        System.out.println(test.timeFromA(0));
        System.out.println(test.pointC());
    }
}
