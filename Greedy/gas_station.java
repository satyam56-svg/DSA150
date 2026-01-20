public class gas_station {
    public static int sum(int arr[]) {
        int s=0;
        for(int i=0; i<arr.length; i++) {
            s+=arr[i];
        }
        return s;
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        if(sum(gas)<sum(cost)) {
            return -1;
        }
        int n=gas.length;
        int tank=0;
        int start=0;
        for(int i=0; i<n; i++) {
            tank+=gas[i]-cost[i];
            if(tank<0) {
                start=i+1;
                tank=0;
            }
        }
        return start;
    }
    
    public static void main(String[] args) {
        int gas[] = {1,2,3,4,5};
        int cost[] = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas, cost));
    }
}

// to find: Starting gas station index from which we can complete the circuit.

// steps:
// 1. Check if total gas is less than total cost. If yes, return -1.
// 2. Initialize tank and start index.
// 3. Traverse through each gas station, updating the tank with gas - cost.
// 4. If tank becomes negative, update start index and reset tank.
// 5. Return the start index as the result.