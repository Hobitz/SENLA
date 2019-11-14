import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Z6TZ {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size of your backpack: ");
        Double bag =Double.parseDouble(bf.readLine());
        System.out.print("Enter how many item you have: ");
        int itemCount =Integer.parseInt(bf.readLine());
        Item[] itemArray = new Item[itemCount];
        Item Item;
        double weightSoFar = 0;
        double valueSoFar = 0;
        int CurrentItem =0;
        for (int i = 0; i<itemCount;i++)
        {
            Item = new Item();
            int number = i+1;
            System.out.print("Enter the item name, number: ["+number+"]- ");
            String name = bf.readLine();
            Item.setName(name);
            System.out.print("Enter the item weight, number: ["+number+"]- ");
            double weight = Double.parseDouble(bf.readLine());
            Item.setWeight(weight);
            System.out.print("Enter the value item, number: ["+number+"]- " );
            Double value = Double.parseDouble(bf.readLine());
            Item.setValue(value);
            itemArray[i] = Item;
        }
        System.out.println("----------------------------------------------");
        System.out.println("All available items:");
        System.out.println("----------------------------------------------");
        for (int i = itemCount - 1 ; i >= 0 ;i--) {
            int maxIndex = 0;
            for (int j = 0; j <= i; j++) {
                if ((itemArray[j].getValue() / itemArray[j].getWeight() < (itemArray[maxIndex].getValue() / itemArray[maxIndex].getWeight()))) {
                    maxIndex = j;
                }
                if (maxIndex != i){
                    Item index = itemArray[maxIndex];
                    itemArray[maxIndex] = itemArray[i];
                    itemArray[i]=index;
                while (CurrentItem < itemArray.length && weightSoFar != bag) {
                        if (weightSoFar + itemArray[CurrentItem].getWeight() < bag) {

                            valueSoFar += itemArray[CurrentItem].getValue();
                            weightSoFar += itemArray[CurrentItem].getWeight();
                        } else{
                            valueSoFar += ((bag - weightSoFar) / itemArray[CurrentItem].getWeight()) * itemArray[CurrentItem].getValue();
                            weightSoFar = bag;
                        }
                        CurrentItem++;
                    }
                }
            }
        }
        System.out.println("All things sorted from the maximum value factor to the minimum");
        System.out.println(Arrays.toString(itemArray));
        System.out.println("The maximum value of the backpack," +
                " with the weight of the backpack in "
                +bag+
                " will be equal to "+valueSoFar);
    }
}
class Item {
    private double weight;
    private double value;
    private String name;
    public double getWeight(){
        return weight;
    }
    public double getValue(){
        return value;
    }
    public String getName(){
        return name;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public void setValue(double value){
        this.value = value;
    }
    public void setName(String name){
        this.name = name;
    }
    public String toString(){
        return ("(Weight:"+weight+",Value:"+value+",Names:"+name+")");
    }
}
