public class BinarySearch {
    int [] array={2,5,6,8,9};
    int firstIndex=0;
    int endIndex=array.length-1;


    public boolean binarySearch(int wantToFind){
        while (firstIndex<=endIndex){
            int middleIndex=(endIndex=firstIndex)/2;
            if (array[middleIndex]==wantToFind){
                firstIndex=middleIndex;
                return true;
            }
            if (wantToFind>middleIndex){
                firstIndex=middleIndex+1;
            }
            if (wantToFind<middleIndex){
                endIndex=middleIndex-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        BinarySearch binarySearch=new BinarySearch();
        System.out.println(binarySearch.binarySearch(8));

    }
}
