public class Machine {
    int coffeeVol;
    int waterVol;
    int milkVol;
    int coffee;
    int water;
    int milk;

    Machine(int coffeeVol, int waterVol, int milkVol){
        this.coffeeVol = coffeeVol;
        this.waterVol = waterVol;
        this.milkVol = milkVol;
        coffee = 0;
        water = 0;
        milk = 0;
    }

    protected void check(){
        System.out.println(coffee + " " + water + " "+ milk);
    }

    protected int addCoffee(int N){
        coffee += N;
        if (coffee >  coffeeVol){
            return coffee = coffeeVol;
        } else return coffee;
    }

    protected int addWater(int N){
        water += N;
        if (water > waterVol){
            return water = waterVol;
        } else return water;
    }

    protected int addMilk(int N){
        milk += N;
        if (milk > milkVol){
            return milk = milkVol;
        } else return milk;
    }

    protected void ristretto (int N) {
        if (N <= 10){
            System.out.println("Маленький объем заказа");
        }else if ( coffee < 0.5 * N){
            System.out.println("Недостаточно кофе");
        }else if ( water < 0.5 * N){
            System.out.println("Недостаточно воды");
        }else {
            coffee = (int) (coffee - (0.5 * N));
            water = (int) (water - 0.5 * N);
            System.out.println(coffee + " " + water + " "+ milk);
        }
    }

    protected void espresso (int N) {
        if (N <= 10){
            System.out.println("Маленький объем заказа");
        }else if ( coffee < 0.3 * N){
            System.out.println("Недостаточно кофе");
        }else if ( water < 0.7 * N){
            System.out.println("Недостаточно воды");
        }else {
            coffee = (int) (coffee - (0.3 * N));
            water = (int) (water - 0.7 * N);
            System.out.println(coffee + " " + water + " "+ milk);
        }
    }

    protected void lungo (int N) {
        if (N <= 10){
            System.out.println("Маленький объем заказа");
        }else if ( coffee < 0.15 * N){
            System.out.println("Недостаточно кофе");
        }else if ( water < 0.85 * N){
            System.out.println("Недостаточно воды");
        }else {
            coffee = (int) (coffee - (0.15 * N));
            water = (int) (water - 0.85 * N);
            System.out.println(coffee + " " + water + " "+ milk);
        }
    }

    protected void cappuccino (int N) {
        if (N <= 10){
            System.out.println("Маленький объем заказа");
        }else if ( coffee < 0.15 * N){
            System.out.println("Недостаточно кофе");
        }else if ( water < 0.4 * N){
            System.out.println("Недостаточно воды");
        }else if ( milk < 0.45 * N) {
            System.out.println("Недостаточно молока");
        } else {
            coffee = (int) (coffee - (0.15 * N));
            water = (int) (water - 0.4 * N);
            milk = (int) (milk - 0.45 * N);
            System.out.println(coffee + " " + water + " "+ milk);
        }
    }

    protected void latte (int N) {
        if (N <= 10){
            System.out.println("Маленький объем заказа");
        }else if ( coffee < 0.1 * N){
            System.out.println("Недостаточно кофе");
        }else if ( water < 0.3 * N){
            System.out.println("Недостаточно воды");
        }else if ( milk < 0.6 * N) {
            System.out.println("Недостаточно молока");
        } else {
            coffee = (int) (coffee - (0.1 * N));
            water = (int) (water - 0.3 * N);
            milk = (int) (milk - 0.6 * N);
            System.out.println(coffee + " " + water + " "+ milk);
        }
    }
}
