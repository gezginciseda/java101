public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    void run(){
        if(isCheck()){
            while(this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("==== New Round ====");

                if (firstToAttack() == true) {
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }
                } else {
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }
                    printScore();
                }
            }
        } else {
            System.out.println("Athletes' weights do not match! ");
        }
    }

    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2
                .weight <= maxWeight);
    }

    boolean isWin(){
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " won ! ");
            return true;
        }

        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " won ! ");
            return true;
        }

        return false;
    }

    public void printScore() {
        System.out.println(this.f1.name + " Health : " + this.f1.health);
        System.out.println(this.f2.name + " Health : " + this.f2.health);
    }

    public boolean firstToAttack () {
        int number = (int)(Math.random()*10);
        if (number <= 5) {
            return true;
        }
        return false;

    }
}
