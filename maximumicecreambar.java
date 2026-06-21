class maximumicecreambar {
    public int maxIceCream(int[] costs, int coins) {
        int maxCost = 0;

        for(int cost : costs){
            maxCost = Math.max(maxCost, cost);
        }
        int[] freq = new int[maxCost + 1];

        for(int cost : costs){
            freq[cost]++;
        }

        int count = 0;


        for(int price  = 1; price <= maxCost; price++){

            if(freq[price] == 0){
                continue;
            }

            int canBuy = coins / price;

            int buy = Math.min(canBuy, freq[price]);

            count += buy;

            coins -= buy * price;

            if(coins < price){

            }
        }
        return count;
    }
    public static void main(String[] args){
        maximumicecreambar solution = new maximumicecreambar();
        int[] costs = {1, 3, 2, 4, 1};
        int coins = 7;
        int maxIceCreams = solution.maxIceCream(costs, coins);
        System.out.println("The maximum number of ice creams that can be bought is: " + maxIceCreams);
    }
}