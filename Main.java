import java.util.Arrays;
public class Main {
  
  public static String formGradeString(int[] grades){
    String gradeString = "";
    for (int grade: grades){
      if (grade>=90){
        gradeString += "A";
      }else if (grade>= 80){
        gradeString += "B";
      }else if (grade>= 70){
        gradeString += "C";
      }else if (grade>= 60){
        gradeString += "D";
      }else{
        gradeString += "F";
      }
    }
    return gradeString; 
  }



  public static String valedictorianName(String [] names, double [] GPAs){
    int highestIndex = 0;
    for (int i = 0; i<GPAs.length;i++){
      if (GPAs[i]>GPAs[highestIndex]){
        highestIndex = i;
      }
    }
    return names[highestIndex];
  }


public static int[] longestPlateau(int [] nums){
  int prevNum = -1;
  int startIndex;
  int greatestIndex = 0;
  int greatestlength = 0;
  int repeatLength;
  for (int i = 0; i<nums.length;i++){
    if (nums[i] == prevNum){
      int index = (i-1);
      repeatLength = 0;
      startIndex = index;
      while((index<nums.length) && nums[index] == nums[i-1]){
        repeatLength+= 1;
        index ++;
      }
      if (index>nums.length){
        index --;
      }
      if (repeatLength>greatestlength && nums[startIndex]>nums[startIndex-1] && nums[startIndex]>nums[startIndex+repeatLength]){
        greatestlength = repeatLength;
        greatestIndex = startIndex;
      }
    }
  
  prevNum = nums[i];
  }
  int [] returnArray = {greatestlength,greatestIndex};
  return returnArray;
  
}




  public static void main(String[] args) {
    int [] nums = {62,79,99,50};
    System.out.println(formGradeString(nums));
    String [] valedictorians = {"emily", "albert", "sophie", "phillip", "ophelia"};
    double [] grades = {0.223,3.538,3.237,1.437,1.162};
    System.out.println(valedictorianName(valedictorians,grades));
    int [] numList = {0, 1, 1, 1, 1, 0, 3, 3, 2, 2};
    System.out.println(Arrays.toString(longestPlateau(numList)));
  }
}
