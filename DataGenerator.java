public class DataGenerator {
    public DataGenerator(){}

    public int[] generateDataSet(int size){
        int[] data = new int[size];

        for (int i = 0; i < size; i++){
            data[i] = (int)(Math.random()*100000); //random int from 0 to 99999 inclusive
        }

        return data;
    }
}
