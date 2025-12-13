public class Lasagna {
    
    
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        System.out.print("40");
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int min){
        int minRem = expectedMinutesInOven() - min;
        System.out.print(minRem);
        return minRem;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        return layers*2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int time){
        int timePerLayer = preparationTimeInMinutes(layers);
        int timeInOven = time;
        return timePerLayer+timeInOven;
        
    }
}
