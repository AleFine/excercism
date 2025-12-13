public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }
    public int remainingMinutesInOven(int min){
        int minRem = expectedMinutesInOven() - min;
        return minRem;
    }
    public int preparationTimeInMinutes(int layers){
        return layers*2;
    }
    public int totalTimeInMinutes(int layers, int time){
        int timePerLayer = preparationTimeInMinutes(layers);
        int timeInOven = time;
        return timePerLayer+timeInOven;
    }
}
