public class Main {
    public static void main(String[] args) {
        Auto myAuto = new Auto();
        myAuto.AddPort();
        System.out.println(myAuto.portsNumber);
        int res = suma(1,2,3);
        System.out.println(res);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;

    };
};
class Auto {

    public int portsNumber = 4;

    public void AddPort() {
        this.portsNumber ++;
        }
    }

